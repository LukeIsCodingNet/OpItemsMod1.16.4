package net.lukeiscoding.forge.opitemsmod.blocks.blockitems;

import net.lukeiscoding.forge.opitemsmod.OpItemsMod;
import net.lukeiscoding.forge.opitemsmod.registry.RegisterBlocks;
import net.lukeiscoding.forge.opitemsmod.registry.RegisterItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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

public class RegisterBlockItems {

    // create a new differed register to register block items
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpItemsMod.MOD_ID);

    // create a method to call in the main class to register block items
    public static void registerBlockItems() {
        BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = BLOCK_ITEMS.register("ruby_block", () ->
            new BlockItem(RegisterBlocks.RUBY_BLOCK.get(), new Item.Properties().group(RegisterItemGroups.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> RUBY_ORE_ITEM = BLOCK_ITEMS.register("ruby_ore", () ->
            new BlockItem(RegisterBlocks.RUBY_ORE.get(), new Item.Properties().group(RegisterItemGroups.OP_ORES_TAB))
    );

    public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = BLOCK_ITEMS.register("bronze_block", () ->
            new BlockItem(RegisterBlocks.BRONZE_BLOCK.get(), new Item.Properties().group(RegisterItemGroups.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> BRONZE_ORE_ITEM = BLOCK_ITEMS.register("bronze_ore", () ->
            new BlockItem(RegisterBlocks.BRONZE_ORE.get(), new Item.Properties().group(RegisterItemGroups.OP_ORES_TAB))
    );

    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = BLOCK_ITEMS.register("steel_block", () ->
            new BlockItem(RegisterBlocks.STEEL_BLOCK.get(), new Item.Properties().group(RegisterItemGroups.OP_BLOCKS_TAB))
    );

    public static final RegistryObject<Item> STEEL_ORE_ITEM = BLOCK_ITEMS.register("steel_ore", () ->
            new BlockItem(RegisterBlocks.STEEL_ORE.get(), new Item.Properties().group(RegisterItemGroups.OP_ORES_TAB))
    );
}
