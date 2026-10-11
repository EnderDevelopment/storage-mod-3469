package com.typat7325.storagemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageMod implements ModInitializer {
    public static final String MOD_ID = "storagemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Storage Mod");
        // Initialize mod components here
    }

    public void onEnable() {
        LOGGER.info("Enabling Storage Mod");
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }

    public void onDisable() {
        LOGGER.info("Disabling Storage Mod");
        // Disable mod components here
    }

    public void onStop() {
        LOGGER.info("Stopping Storage Mod");
        // Stop mod components here
    }
}