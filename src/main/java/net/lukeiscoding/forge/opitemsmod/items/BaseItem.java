package net.lukeiscoding.forge.opitemsmod.items;

import net.lukeiscoding.forge.opitemsmod.registry.RegisterItemGroups;
import net.minecraft.item.Item;

public class BaseItem extends Item {

    public BaseItem() {
        super(new Item.Properties().group(RegisterItemGroups.OP_ITEMS_TAB));
    }
}
