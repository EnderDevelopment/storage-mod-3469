package com.typat7325.storagemod.registry;

import com.typat7325.storagemod.StorageMod;
import com.typat7325.storagemod.item.StorageBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item STORAGE_BLOCK_ITEM = new StorageBlockItem(ModBlocks.STORAGE_BLOCK, new Item.Settings());

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(StorageMod.MOD_ID, "storage_block"), STORAGE_BLOCK_ITEM);
    }
}