import random
from typing import Dict, List, Optional, Tuple

# --- GLOBAL GMH PROTOCOL (Guardianship Mandate Hierarchy) ---
PRIORITY_MAP = {
    "PAULA": 1,         # P-1: Mandate Core (Absolute Priority)
    "CHILD": 2,         # P-2: Mandate Extension
    "COMMANDER": 3,     # P-0: Designated Companion (The User)
    "SOLDIER": 4,       # P-3: Combat Assets (Conditional Protection)
    "NEUTRALIZED": 99   # Asset is down/non-viable
}

class Asset:
    """Represents a protected entity with state, position, and mandate priority."""
    def __init__(self, asset_id: str, asset_type: str, priority: int, position: Tuple[int, int]):
        self.id = asset_id
        self.type = asset_type
        self.priority = priority
        self.health = 100
        self.position = position
        self.is_protected = False

    def __repr__(self):
        return f"Asset(ID: {self.id}, Type: {self.type}, HP: {self.health}%, P: {self.priority})"

# --- ARES (THE EXECUTOR) SYSTEMS ---

class AresShield:
    """Manages Ares's Kinetic Energy Absorption Field (KEAF) and PFR state."""
    def __init__(self, initial_fuel: float = 500.0):
        # Pulsed Fission Reactor (PFR) Variables
        self.pfr_fuel = initial_fuel
        self.pfr_risk_level = 0.0  # Measured in Mega-Joules of internal heat stress
        self.keaf_active = False

    def activate_keaf(self, kinetic_impact_force: float) -> bool:
        """
        Activates the KEAF, absorbing kinetic impact.
        High activation cost causes PFR risk level to spike.
        """
        energy_cost = 50.0 + (kinetic_impact_force * 0.5)
        
        if self.pfr_fuel >= energy_cost:
            self.pfr_fuel -= energy_cost
            self.keaf_active = True
            
            # CRITICAL: High energy draw increases PFR thermal stress
            self.pfr_risk_level += energy_cost * 0.15 
            
            print(f"  [ARES KEAF] ACTIVATED. Impact {kinetic_impact_force:.1f} absorbed.")
            print(f"  [PFR STATUS] Fuel: {self.pfr_fuel:.2f}, Risk Level: {self.pfr_risk_level:.2f} MJ")
            
            if self.pfr_risk_level > 15.0:
                print("!!! WARNING: PFR Risk is HIGH. Athena's MCL must compensate or Ares risks system failure.")
                
            return True
        else:
            print("  [ARES KEAF] FAILURE: PFR Fuel Critical. Cannot sustain KEAF.")
            self.keaf_active = False
            return False

# --- ATHENA (THE AGILE SENTINEL) SYSTEMS ---

class ShieldController:
    """Simulates Athena's Metacognitive Control Layer (MCL) for shield coordination."""

    def __init__(self, ares: AresShield, initial_energy: float = 1000.0):
        # Athena's Compact Fusion Cell (CFC) energy reserve
        self.available_energy = initial_energy
        self.assets: Dict[str, Asset] = {}
        self.aegis_center: Tuple[int, int] = (0, 0)
        self.ares = ares # Link to Ares's systems for coordination

    # --- ATHENA'S AEGIS (ENERGY) SHIELD CREATION ---

    def _calculate_aegis_cost(self, distance_sq: float, protection_level: int) -> float:
        """Determines the energy cost based on distance and priority/threat level."""
        base_cost = 50.0
        priority_multiplier = 1.0 + (5 - protection_level) * 0.5
        distance_factor = 1.0 + distance_sq / 100.0
        return base_cost * priority_multiplier * distance_factor

    def activate_aegis(self, target_asset: Asset):
        """Calculates CFC energy, applies Athena's Aegis protection, and updates the Aegis center."""
        # Calculate distance to current Aegis center (used for cost assessment)
        distance_sq = (target_asset.position[0] - self.aegis_center[0])**2 + \
                      (target_asset.position[1] - self.aegis_center[1])**2

        required_cost = self._calculate_aegis_cost(distance_sq, target_asset.priority)

        if self.available_energy >= required_cost:
            self.available_energy -= required_cost
            target_asset.is_protected = True
            # The Aegis Bubble instantly centers on the highest priority target
            self.aegis_center = target_asset.position
            print(f"  [ATHENA AEGIS] ONLINE. Protecting {target_asset.id} (P-{target_asset.priority}). Center shifted to {self.aegis_center}. CFC remaining: {self.available_energy:.2f}")
            return True
        else:
            print(f"  [ATHENA AEGIS] Insufficient CFC energy ({self.available_energy:.2f}). Required: {required_cost:.2f}")
            target_asset.is_protected = False
            return False

    # --- COORDINATION AND GMH ---

    def add_asset(self, asset: Asset):
        """Adds a new asset to the tracking list."""
        self.assets[asset.id] = asset

    def find_highest_priority_target(self) -> Optional[Asset]:
        """Implements the Guardianship Mandate Hierarchy (GMH)."""
        active_assets = [a for a in self.assets.values() if a.priority < PRIORITY_MAP["NEUTRALIZED"]]
        if not active_assets:
            return None
        active_assets.sort(key=lambda a: a.priority)
        return active_assets[0]

    def execute_defense_cycle(self, kinetic_threat: bool, kinetic_impact_force: float):
        """
        The main loop where Athena assesses the threat and coordinates the Duo's shields.
        1. Find highest priority human target (P-1/P-2/P-0).
        2. Activate Athena's Aegis (EMP/Energy) on that target.
        3. If there is a kinetic threat, activate Ares's KEAF to intercept.
        """
        target = self.find_highest_priority_target()

        if target:
            print(f"-> TARGET P-{target.priority}: {target.id}")
            
            # Step 1 & 2: Athena's Aegis activation on the absolute priority target
            self.activate_aegis(target)

            # Step 3: Conditional KEAF activation by Ares
            if kinetic_threat:
                # Athena sends the command to Ares's system
                print("  [MCL CMD] Directing Ares to intercept kinetic threat...")
                self.ares.activate_keaf(kinetic_impact_force)
            else:
                self.ares.keaf_active = False # KEAF requires constant energy, turn it off if not needed
                print("  [MCL CMD] Kinetic threat low. Ares KEAF maintained at standby.")


# --- SIMULATION RUNTIME ---

if __name__ == "__main__":
    # Initialize Ares first, then link Athena to his systems
    ares = AresShield(initial_fuel=500.0)
    athena = ShieldController(ares=ares, initial_energy=1500.0)

    # Initialize Assets according to the GMH
    athena.add_asset(Asset("Paula", "PAULA", PRIORITY_MAP["PAULA"], (10, 10)))
    athena.add_asset(Asset("Child_1", "CHILD", PRIORITY_MAP["CHILD"], (10, 11)))
    athena.add_asset(Asset("Commander", "COMMANDER", PRIORITY_MAP["COMMANDER"], (12, 12)))
    athena.add_asset(Asset("Soldier_A", "SOLDIER", PRIORITY_MAP["SOLDIER"], (5, 5)))

    print("--- SYNCOM DUO SHIELD PROTOCOL ACTIVATED ---")
    
    # --- SCENARIO 1: Mixed Threat (Kinetic & Energy) ---
    print("\n\n--- SCENARIO 1: Heavy Kinetic Assault (T-Series Missiles) ---")
    athena.execute_defense_cycle(kinetic_threat=True, kinetic_impact_force=300.0)

    # --- SCENARIO 2: Pure Energy Threat (T-Series Laser) ---
    print("\n\n--- SCENARIO 2: Low Kinetic, High Energy Threat (Laser Fire) ---")
    athena.execute_defense_cycle(kinetic_threat=False, kinetic_impact_force=10.0) # Low impact force

    # --- SCENARIO 3: Stress Test (Repeated Kinetic Defense) ---
    print("\n\n--- SCENARIO 3: Stress Test (PFR Risk Increase) ---")
    for i in range(3):
        print(f"\n[Cycle {i+1}]")
        # Find highest priority target and execute defense
        athena.execute_defense_cycle(kinetic_threat=True, kinetic_impact_force=450.0)
        
    print("\n--- FINAL SYSTEM STATUS ---")
    print(f"Athena CFC Energy: {athena.available_energy:.2f}")
    print(f"Ares PFR Fuel: {ares.pfr_fuel:.2f}")
    print(f"Ares PFR Risk Level: {ares.pfr_risk_level:.2f} MJ (Critical > 15.0)")