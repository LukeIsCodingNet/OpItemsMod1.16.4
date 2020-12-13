package net.lukeiscoding.forge.opitemsmod.registry;

import net.lukeiscoding.forge.opitemsmod.blocks.blockitems.RegisterBlockItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RegisterItemGroups {

    public static final ItemGroup OP_ITEMS_TAB = new ItemGroup("op_items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.TEST_ITEM.get());
        }
    };

    public static final ItemGroup OP_SWORDS_TAB = new ItemGroup("op_swords_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.DRAGON_SLAYER.get());
        }
    };

    public static final ItemGroup OP_MATERIALS_TAB = new ItemGroup("op_materials_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.EMERALD_NUGGET.get());
        }
    };

    public static final ItemGroup OP_AXES_TAB = new ItemGroup("op_axes_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.EMERALD_AXE.get());
        }
    };

    public static final ItemGroup OP_PICKAXES_TAB = new ItemGroup("op_pickaxes_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.EMERALD_PICKAXE.get());
        }
    };

    public static final ItemGroup OP_BLOCKS_TAB = new ItemGroup("op_blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterBlockItems.RUBY_BLOCK_ITEM.get());
        }
    };
}
