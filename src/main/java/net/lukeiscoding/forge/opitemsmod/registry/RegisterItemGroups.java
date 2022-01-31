package net.lukeiscoding.forge.opitemsmod.registry;

import net.lukeiscoding.forge.opitemsmod.blocks.blockitems.RegisterBlockItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/*
Copyright (C) 2022  Luke Is Coding

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

public class RegisterItemGroups {

    public static final ItemGroup OP_ITEMS_TAB = new ItemGroup("op_items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterItems.RUBY.get());
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

    public static final ItemGroup OP_ORES_TAB = new ItemGroup("op_ores_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegisterBlockItems.RUBY_ORE_ITEM.get());
        }
    };
}
