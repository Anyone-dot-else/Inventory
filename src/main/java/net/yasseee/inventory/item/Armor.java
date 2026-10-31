package net.yasseee.inventory.item;

import net.yasseee.inventory.item.types.ItemCategory;
import net.yasseee.inventory.item.types.MaterialType;

public class Armor extends Item {

    public enum ArmorType {
        BOOTS, LEGGINGS, CHESTPLATE, HELMET, SHIELD
    }

    public final int power;
    public final MaterialType material;
    public final ArmorType type;

    public Armor(String id, String name, int maxStack, MaterialType material, ArmorType type, String description) {
        super (id, name, maxStack, ItemCategory.ARMOR, description);
        this.power = 0;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString () {
        return "Name: " + name + " | Max stack: " + maxStack + " | Protects: " + power +
                " | Is made of: " + material + " | Covers: " + type +
                " HP | Description: " + description;
    }
}
