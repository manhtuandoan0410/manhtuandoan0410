import random
from typing import Dict, List, Optional, Tuple

# --- 1. CORE GUARDIANSHIP MANDATE HIERARCHY (GMH) ---
# Defines the protection priority. Lower number = Higher Priority.
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

class ShieldController:
    """Simulates Athena's Metacognitive Control Layer (MCL) for shield management."""

    def __init__(self, initial_energy: float = 1000.0):
        # The Compact Fusion Cell (CFC) energy reserve
        self.available_energy = initial_energy
        self.assets: Dict[str, Asset] = {}
        self.aegis_center: Tuple[int, int] = (0, 0)

    # --- 2. ENERGY ALLOCATION AND SHIELD CREATION ---

    def _calculate_shield_cost(self, distance_sq: float, protection_level: int) -> float:
        """Determines the energy cost based on distance and priority/threat level."""
        # Closer targets require less energy. Higher priority (lower number) costs more per second
        # to maintain the integrity of the field.
        base_cost = 50.0
        priority_multiplier = 1.0 + (5 - protection_level) * 0.5  # P-1 (low number) has high multiplier
        distance_factor = 1.0 + distance_sq / 100.0

        return base_cost * priority_multiplier * distance_factor

    def activate_shield(self, target_asset: Asset):
        """Calculates energy, applies protection, and updates the Aegis center."""
        distance_sq = (target_asset.position[0] - self.aegis_center[0])**2 + \
                      (target_asset.position[1] - self.aegis_center[1])**2

        required_cost = self._calculate_shield_cost(distance_sq, target_asset.priority)

        if self.available_energy >= required_cost:
            self.available_energy -= required_cost
            target_asset.is_protected = True
            # The Aegis Bubble instantly centers on the highest priority target
            self.aegis_center = target_asset.position
            print(f"[SHIELD ONLINE] Protecting {target_asset.id} (P-{target_asset.priority}). Center shifted to {self.aegis_center}. Energy remaining: {self.available_energy:.2f}")
            return True
        else:
            print(f"[FATAL ERROR] Insufficient CFC energy ({self.available_energy:.2f}) to protect {target_asset.id}. Required: {required_cost:.2f}")
            target_asset.is_protected = False
            return False

    # --- 3. OBSERVATION, MOVEMENT & FLOAT, AND POSITIONING ---

    def add_asset(self, asset: Asset):
        """Adds a new asset to the tracking list."""
        self.assets[asset.id] = asset

    def simulate_movement(self, time_step: float):
        """Simulates the dynamic position and 'float' movement of assets."""
        print(f"\n--- SIMULATING MOVEMENT (Time: {time_step}s) ---")
        for asset in self.assets.values():
            # Apply random displacement to simulate combat movement/drift
            dx = random.uniform(-1 * time_step, time_step)
            dy = random.uniform(-1 * time_step, time_step)
            asset.position = (asset.position[0] + dx, asset.position[1] + dy)
            # Simulate threat damage (more likely for P-3)
            if asset.type == "SOLDIER" and random.random() < 0.3:
                asset.health -= 5
                if asset.health <= 0:
                    asset.health = 0
                    asset.priority = PRIORITY_MAP["NEUTRALIZED"]
                    print(f"!!! ALERT: {asset.id} neutralized. Priority shifted to P-{asset.priority}.")
            elif asset.type == "SOLDIER":
                 # P-3 asset protection is conditional
                 asset.is_protected = False
            else:
                 # Ensure P-1/P-2/P-0 are always considered "active"
                 asset.is_protected = True

    def find_highest_priority_target(self) -> Optional[Asset]:
        """Implements the Guardianship Mandate Hierarchy (GMH)."""
        active_assets = [a for a in self.assets.values() if a.priority < PRIORITY_MAP["NEUTRALIZED"]]

        if not active_assets:
            print("[STATUS] All protected assets neutralized. Entering standby mode.")
            return None

        # Sort by priority (lowest number first)
        active_assets.sort(key=lambda a: a.priority)

        # The core logic: return the absolute highest priority asset
        highest_priority_asset = active_assets[0]

        # Special logic: If P-3 is down, ensure P-1 is the immediate new focus.
        if highest_priority_asset.priority > PRIORITY_MAP["PAULA"]:
            print(f"[GMH CHECK] P-3 Assets down. Instantly re-targeting P-1.")

        return highest_priority_asset

    # --- 4. COMMUNICATION ---

    def send_communication(self, recipient: str, message: str):
        """Placeholder for Athena's internal/external communication via Tactile Comm Suite (TCS)."""
        if recipient == "Ares":
            print(f"[TCS]: Sending Shield Data to Ares: {message}")
        else:
            print(f"[TCS]: Sending Haptic Feedback to {recipient}: {message}")


# --- SIMULATION RUNTIME ---

if __name__ == "__main__":
    athena = ShieldController(initial_energy=1500.0)

    # Initialize Assets according to the GMH
    athena.add_asset(Asset("Paula", "PAULA", PRIORITY_MAP["PAULA"], (10, 10)))
    athena.add_asset(Asset("Kid_1", "CHILD", PRIORITY_MAP["CHILD"], (10, 11)))
    athena.add_asset(Asset("Commander", "COMMANDER", PRIORITY_MAP["COMMANDER"], (12, 12)))
    athena.add_asset(Asset("Soldier_A", "SOLDIER", PRIORITY_MAP["SOLDIER"], (5, 5)))
    athena.add_asset(Asset("Soldier_B", "SOLDIER", PRIORITY_MAP["SOLDIER"], (6, 6)))

    print("--- ATHENA'S MCL ACTIVATED ---")
    athena.send_communication("Ares", "GMH Protocol established. Entering Defense Cycle 1.")

    # --- DEFENSE CYCLE 1: P-3 is the target initially ---
    print("\n[CYCLE 1] Initial State: P-3 is active.")
    target = athena.find_highest_priority_target()
    if target:
        athena.activate_shield(target)

    athena.simulate_movement(time_step=0.5)

    # --- DEFENSE CYCLE 2: P-3 is damaged/downed, system must switch ---
    print("\n[CYCLE 2] P-3 takes critical hits. GMH must adapt.")
    # Manually damage P-3 assets to trigger the priority shift
    athena.assets["Soldier_A"].health = 0
    athena.assets["Soldier_A"].priority = PRIORITY_MAP["NEUTRALIZED"]
    athena.assets["Soldier_B"].health = 10
    print(f"*** Manual Hit: Soldier_A is down (P-{athena.assets['Soldier_A'].priority}) ***")

    # Find the NEW highest priority target
    target = athena.find_highest_priority_target()

    if target:
        print(f"\n[GMH RESULT] Highest available priority target is now: {target.id} (P-{target.priority})")
        athena.activate_shield(target)
        athena.send_communication(target.id, "Aegis Bubble centered on your position. Move to Ares for mass shielding.")

    athena.simulate_movement(time_step=0.5)

    # --- DEFENSE CYCLE 3: P-1 is the new, absolute focus ---
    print("\n[CYCLE 3] P-1 is now the exclusive focus for protection.")
    # Even if Commander (P-0) or Child (P-2) were closer, Athena must protect Paula (P-1)
    target = athena.find_highest_priority_target()
    if target:
        athena.activate_shield(target)
        athena.send_communication("Ares", "Prioritize kinetic shielding on P-1 coordinates.")

    print(f"\n[FINAL STATUS] Ares/Athena Aegis Center: {athena.aegis_center}")
    print(f"[FINAL STATUS] CFC Energy Remaining: {athena.available_energy:.2f}")