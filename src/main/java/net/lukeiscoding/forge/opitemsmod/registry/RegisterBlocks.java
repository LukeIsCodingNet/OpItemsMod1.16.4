package net.lukeiscoding.forge.opitemsmod.registry;

import net.lukeiscoding.forge.opitemsmod.OpItemsMod;
import net.lukeiscoding.forge.opitemsmod.blocks.RubyBlock;
import net.lukeiscoding.forge.opitemsmod.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterBlocks {

    // create a deferred register for blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpItemsMod.MOD_ID);

    // create a method to register blocks in the main class
    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // blocks...
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
}
