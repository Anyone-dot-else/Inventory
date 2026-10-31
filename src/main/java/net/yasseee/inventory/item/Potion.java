package net.yasseee.inventory.item;

public class Potion extends Item {

    public final int power;

    public Potion (String id, String name, int maxStack, String description, int power) {
        super (id, name, maxStack, ItemCategory.POTION, description);
        this.power = power;
    }

    @Override
    public String toString () {
        if (power > 0) {
            return "Name: " + name + " | Max stack: " + maxStack + " | Healing: " + power +
                    " HP | Description: " + description;
        } else {
            return "Name: " + name + " | Max stack: " + maxStack + " | Damage: " + power +
                    " HP | Description: " + description;
        }
    }
}
