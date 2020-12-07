package net.lukeiscoding.forge.opitemsmod.items;

import net.lukeiscoding.forge.opitemsmod.registry.RegisterItemGroups;
import net.minecraft.item.Item;

public class MaterialItemBase extends Item {

    public MaterialItemBase() {
        super(new Item.Properties().group(RegisterItemGroups.OP_MATERIALS_TAB));
    }
}
