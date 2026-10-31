package net.yasseee.inventory.item.types;

public enum MaterialType {
    WOOD(0.3, 50),
    STONE(0.5, 100),
    IRON(1.0, 250),
    GOLD(1.4, 150),
    DIAMOND(2.0, 500),
    NULL(0, 0);

    private double multiplier;
    private double durability;

    MaterialType(double multiplier, double durability) {
        this.multiplier = multiplier;
        this.durability = durability;
    }

    public double getMultiplier() {
        return multiplier;
    }
    public double getDurability() {
        return durability;
    }

    public String getInfo() {
        return "Multiplier: " + multiplier + " | Durability: " + durability + ".";
    }
}
