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
            new BlockItem(RegisterBlocks.RUBY_ORE.get(), new Item.Properties().group(RegisterItemGroups.OP_BLOCKS_TAB))
    );
}
