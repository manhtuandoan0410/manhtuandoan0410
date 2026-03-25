import random
from typing import Dict, List, Optional, Tuple

# ==============================================================================
# 1. SHARED GLOBAL SYSTEM DEFINITIONS
# ==============================================================================

# Guardianship Mandate Hierarchy (GMH): Dictates target priority (Lower number = higher priority)
PRIORITY_MAP = {
    "PAULA": 1,         # P-1: Mandate Core (Absolute Priority)
    "CHILD": 2,         # P-2: Mandate Extension
    "COMMANDER": 3,     # P-0: Designated Companion (The User)
    "SOLDIER": 4,       # P-3: Combat Assets (Conditional Protection)
    "NEUTRALIZED": 99   # Asset is down/non-viable
}

# Ares's Pulsed Fission Reactor (PFR) threshold for requesting maintenance/cooling
PFR_RISK_THRESHOLD = 15.0 # Measured in Mega-Joules (MJ) of internal heat stress

class Asset:
    """
    Represents a protected entity or an enemy target with state and GMH priority.
    This class is fundamental and shared across both units' targeting systems.
    """
    def __init__(self, asset_id: str, asset_type: str, priority: int, position: Tuple[int, int], health: float = 100.0):
        self.id = asset_id
        self.type = asset_type
        self.priority = priority
        self.health = health
        self.position = position
        self.is_protected = False

    def __repr__(self):
        return f"Asset(ID: {self.id}, Type: {self.type}, HP: {self.health:.1f}%, P: {self.priority})"


# ==============================================================================
# 2. ARES (THE EXECUTOR) SYSTEMS
#    Role: Brute Force, Kinetic Defense, High-Risk Operation via PFR
# ==============================================================================

class AresExecutor:
    """Manages Ares's Pulsed Fission Reactor (PFR), KEAF, and Weapons Systems."""
    def __init__(self, initial_fuel: float = 500.0):
        self.pfr_fuel = initial_fuel
        self.pfr_risk_level = 0.0  # Volatile state; managed by Athena
        self.keaf_active = False

    # --- DEFENSE: Kinetic Energy Absorption Field (KEAF) ---
    def activate_keaf(self, kinetic_impact_force: float) -> bool:
        """KEAF stops physical projectiles. Consumes PFR fuel and spikes PFR risk."""
        energy_cost = 50.0 + (kinetic_impact_force * 0.5)
        
        if self.pfr_fuel >= energy_cost:
            self.pfr_fuel -= energy_cost
            self.keaf_active = True
            
            # High energy draw CRITICALLY increases PFR thermal stress
            self.pfr_risk_level += energy_cost * 0.15 
            
            return True
        else:
            self.keaf_active = False
            return False

    # --- ATTACK: Fusion Scatter Cannon (FSC) ---
    def fire_fusion_cannon(self, target: Asset) -> float:
        """Primary offensive weapon. Consumes PFR fuel and generates PFR risk."""
        
        if self.pfr_fuel < 30.0:
            return 0.0 # Cannot fire
        
        fuel_consumed = 35.0
        risk_generated = 4.0
        
        self.pfr_fuel -= fuel_consumed
        self.pfr_risk_level += risk_generated
        
        damage_output = random.uniform(50.0, 75.0) 
        target.health = max(0.0, target.health - damage_output)
        
        return damage_output

    # --- SACRIFICE PROTOCOL (P-0) ---
    def execute_p0_sacrifice(self):
        """Deliberately overcharges the PFR for absolute defense at the cost of function."""
        
        fuel_drained = self.pfr_fuel * 0.95 
        self.pfr_fuel -= fuel_drained
        
        # Spike risk to maximum, ensuring system failure but ultimate defense
        self.pfr_risk_level = 50.0 
        print("!!! ARES P-0: KINETIC SHIELDING AT MAXIMUM. Ares Executor is functionally compromised.")

    # --- COMMUNICATION & DIAGNOSTICS (Call for Repair) ---
    def check_status(self) -> str:
        """Ares reports his immediate PFR status to Athena's MCL for maintenance."""
        if self.pfr_risk_level >= PFR_RISK_THRESHOLD:
            return "MAINTENANCE_REQUEST"
        elif self.pfr_fuel < 50.0:
            return "LOW_FUEL_ALERT"
        return "OPERATIONAL"