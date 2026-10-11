package com.typat7325.storagemod.registry;

import com.typat7325.storagemod.StorageMod;
import com.typat7325.storagemod.block.StorageBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block STORAGE_BLOCK = new StorageBlock(AbstractBlock.Settings.of(Material.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(StorageMod.MOD_ID, "storage_block"), STORAGE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(StorageMod.MOD_ID, "storage_block"), new BlockItem(STORAGE_BLOCK, new Item.Settings()));
    }
}