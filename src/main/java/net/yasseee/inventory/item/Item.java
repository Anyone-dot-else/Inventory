package net.yasseee.inventory.item;

import net.yasseee.inventory.item.types.ItemCategory;

public class Item {

    public final String id;
    public final String name;
    public final int maxStack;
    public final String description;

    public final ItemCategory category;

    public Item(String id, String name, int maxStack, ItemCategory category, String description) {
        this.id = id;
        this.name = name;
        this.maxStack = maxStack;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Stacks: " + maxStack + " | Description: " + description;
    }
}
