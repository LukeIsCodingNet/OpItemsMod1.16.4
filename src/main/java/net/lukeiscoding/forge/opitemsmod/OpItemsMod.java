package net.lukeiscoding.forge.opitemsmod;

import net.lukeiscoding.forge.opitemsmod.blocks.blockitems.RegisterBlockItems;
import net.lukeiscoding.forge.opitemsmod.registry.RegisterBlocks;
import net.lukeiscoding.forge.opitemsmod.registry.RegisterItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OpItemsMod.MOD_ID)
public class OpItemsMod {

    // create a string to reference the mod id
    public static final String MOD_ID = "opitemsmod";

    // get a logger
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public OpItemsMod() {
        // register the event listeners
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        // call the registryInit method from the RegisterItems class
        RegisterItems.registryInit();

        // call the registerBlocks method from the RegisterBlocks class
        RegisterBlocks.registerBlocks();

        // call the registerBlockItems method from RegisterBlockItems
        RegisterBlockItems.registerBlockItems();

        // register the mod to the forge event bus
        MinecraftForge.EVENT_BUS.register(this);
    }

    // register event listeners

    // the event listener while the client is initializing
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Op Items Mod has been initialized!");
    }

    // the event listener for the client
    private void clientSetup(final FMLClientSetupEvent event) {
    }
}
