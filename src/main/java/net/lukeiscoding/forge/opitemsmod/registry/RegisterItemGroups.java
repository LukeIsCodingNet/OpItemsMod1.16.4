package net.lukeiscoding.forge.opitemsmod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RegisterItemGroups {

    public static final ItemGroup OP_ITEMS_TAB = new ItemGroup("op_items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.TEST_ITEM.get());
        }
    };

    public static final ItemGroup OP_SWORDS_TAB = new ItemGroup("op_swords_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.DRAGON_SLAYER.get());
        }
    };

    public static final ItemGroup OP_MATERIALS_TAB = new ItemGroup("op_materials_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.EMERALD_NUGGET.get());
        }
    };

    public static final ItemGroup OP_AXES_TAB = new ItemGroup("op_axes_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.EMERALD_AXE.get());
        }
    };

    public static final ItemGroup OP_PICKAXES_TAB = new ItemGroup("op_pickaxes_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.EMERALD_PICKAXE.get());
        }
    };
}
