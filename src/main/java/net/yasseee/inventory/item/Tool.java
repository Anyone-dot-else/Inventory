package net.yasseee.inventory.item;

import net.yasseee.inventory.item.types.ItemCategory;
import net.yasseee.inventory.item.types.MaterialType;
import net.yasseee.inventory.item.types.ToolType;

public class Tool extends Item {

    protected MaterialType material = MaterialType.NULL;
    protected ToolType toolType = ToolType.NULL;
    public int durability = (int) (material.getDurability() * toolType.getMultiplier());
    public final int power = (int) (material.getMultiplier() * 10);

    public Tool(String id, String name, int maxStack, MaterialType material,
                ToolType type, String description) {
        super(id, name, maxStack, ItemCategory.TOOL, description);
        this.material = material;
        this.toolType = type;
    }

    public void use() {
        durability -= 1;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Max stack: " +  maxStack + " | Material: " +
                material.name() + " | Tool type: " + toolType.name() + " | Description:" +
                description + ".";
    }
}
