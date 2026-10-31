package net.yasseee.inventory.item.types;

public enum ToolType {
    HOE(0.7),
    SHOVEL(1.6),
    SWORD(1.0),
    AXE(1.4),
    PICKAXE(2),
    SPEAR(1.0),
    NULL(0);

    private double multiplier;
    public double getMultiplier() {
        return multiplier;
    }

    ToolType(double multiplier) {
        this.multiplier = multiplier;
    }

}
