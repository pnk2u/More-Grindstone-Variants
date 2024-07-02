package com.pnku.mgv.init;

import com.pnku.mgv.MoreGrindstoneVariants;
import com.pnku.mgv.block.MoreGrindstoneBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;

public class MgvItemInit {
    public static final BlockItem OAK_GRINDSTONE_I = new BlockItem(MgvBlockInit.OAK_GRINDSTONE, new Item.Properties());
    public static final BlockItem SPRUCE_GRINDSTONE_I = new BlockItem(MgvBlockInit.SPRUCE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BIRCH_GRINDSTONE_I = new BlockItem(MgvBlockInit.BIRCH_GRINDSTONE, new Item.Properties());
    public static final BlockItem JUNGLE_GRINDSTONE_I = new BlockItem(MgvBlockInit.JUNGLE_GRINDSTONE, new Item.Properties());
    public static final BlockItem ACACIA_GRINDSTONE_I = new BlockItem(MgvBlockInit.ACACIA_GRINDSTONE, new Item.Properties());
    public static final BlockItem MANGROVE_GRINDSTONE_I = new BlockItem(MgvBlockInit.MANGROVE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CHERRY_GRINDSTONE_I = new BlockItem(MgvBlockInit.CHERRY_GRINDSTONE, new Item.Properties());
    public static final BlockItem BAMBOO_GRINDSTONE_I = new BlockItem(MgvBlockInit.BAMBOO_GRINDSTONE, new Item.Properties());
    public static final BlockItem CRIMSON_GRINDSTONE_I = new BlockItem(MgvBlockInit.CRIMSON_GRINDSTONE, new Item.Properties());
    public static final BlockItem WARPED_GRINDSTONE_I = new BlockItem(MgvBlockInit.WARPED_GRINDSTONE, new Item.Properties());
    public static final BlockItem OAK_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.OAK_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem DARK_OAK_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.DARK_OAK_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem SPRUCE_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.SPRUCE_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BIRCH_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BIRCH_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem JUNGLE_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.JUNGLE_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem ACACIA_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.ACACIA_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem MANGROVE_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.MANGROVE_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CHERRY_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CHERRY_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BAMBOO_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BAMBOO_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CRIMSON_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CRIMSON_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem WARPED_SANDSTONE_GRINDSTONE_I = new BlockItem(MgvBlockInit.WARPED_SANDSTONE_GRINDSTONE, new Item.Properties());
    public static final BlockItem OAK_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.OAK_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem DARK_OAK_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.DARK_OAK_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem SPRUCE_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.SPRUCE_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BIRCH_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BIRCH_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem JUNGLE_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.JUNGLE_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem ACACIA_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.ACACIA_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem MANGROVE_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.MANGROVE_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CHERRY_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CHERRY_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BAMBOO_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BAMBOO_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CRIMSON_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CRIMSON_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem WARPED_DEEPSLATE_GRINDSTONE_I = new BlockItem(MgvBlockInit.WARPED_DEEPSLATE_GRINDSTONE, new Item.Properties());
    public static final BlockItem OAK_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.OAK_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem DARK_OAK_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.DARK_OAK_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem SPRUCE_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.SPRUCE_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem BIRCH_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.BIRCH_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem JUNGLE_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.JUNGLE_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem ACACIA_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.ACACIA_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem MANGROVE_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.MANGROVE_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem CHERRY_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.CHERRY_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem BAMBOO_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.BAMBOO_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem CRIMSON_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.CRIMSON_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem WARPED_BASALT_GRINDSTONE_I = new BlockItem(MgvBlockInit.WARPED_BASALT_GRINDSTONE, new Item.Properties());
    public static final BlockItem OAK_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.OAK_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem DARK_OAK_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.DARK_OAK_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem SPRUCE_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.SPRUCE_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BIRCH_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BIRCH_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem JUNGLE_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.JUNGLE_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem ACACIA_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.ACACIA_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem MANGROVE_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.MANGROVE_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CHERRY_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CHERRY_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem BAMBOO_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.BAMBOO_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem CRIMSON_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.CRIMSON_GRANITE_GRINDSTONE, new Item.Properties());
    public static final BlockItem WARPED_GRANITE_GRINDSTONE_I = new BlockItem(MgvBlockInit.WARPED_GRANITE_GRINDSTONE, new Item.Properties());


    public static void registerItems() {
        registerItem(OAK_GRINDSTONE_I, Items.GRINDSTONE);
        registerItem(SPRUCE_GRINDSTONE_I, OAK_GRINDSTONE_I);
        registerItem(BIRCH_GRINDSTONE_I, SPRUCE_GRINDSTONE_I);
        registerItem(JUNGLE_GRINDSTONE_I, BIRCH_GRINDSTONE_I);
        registerItem(ACACIA_GRINDSTONE_I, JUNGLE_GRINDSTONE_I);
        registerItem(MANGROVE_GRINDSTONE_I, ACACIA_GRINDSTONE_I);
        registerItem(CHERRY_GRINDSTONE_I, MANGROVE_GRINDSTONE_I);
        registerItem(BAMBOO_GRINDSTONE_I, CHERRY_GRINDSTONE_I);
        registerItem(CRIMSON_GRINDSTONE_I, BAMBOO_GRINDSTONE_I);
        registerItem(WARPED_GRINDSTONE_I, CRIMSON_GRINDSTONE_I);
        registerItem(OAK_SANDSTONE_GRINDSTONE_I, WARPED_GRINDSTONE_I);
        registerItem(DARK_OAK_SANDSTONE_GRINDSTONE_I, OAK_SANDSTONE_GRINDSTONE_I);
        registerItem(SPRUCE_SANDSTONE_GRINDSTONE_I, DARK_OAK_SANDSTONE_GRINDSTONE_I);
        registerItem(BIRCH_SANDSTONE_GRINDSTONE_I, SPRUCE_SANDSTONE_GRINDSTONE_I);
        registerItem(JUNGLE_SANDSTONE_GRINDSTONE_I, BIRCH_SANDSTONE_GRINDSTONE_I);
        registerItem(ACACIA_SANDSTONE_GRINDSTONE_I, JUNGLE_SANDSTONE_GRINDSTONE_I);
        registerItem(MANGROVE_SANDSTONE_GRINDSTONE_I, ACACIA_SANDSTONE_GRINDSTONE_I);
        registerItem(CHERRY_SANDSTONE_GRINDSTONE_I, MANGROVE_SANDSTONE_GRINDSTONE_I);
        registerItem(BAMBOO_SANDSTONE_GRINDSTONE_I, CHERRY_SANDSTONE_GRINDSTONE_I);
        registerItem(CRIMSON_SANDSTONE_GRINDSTONE_I, BAMBOO_SANDSTONE_GRINDSTONE_I);
        registerItem(WARPED_SANDSTONE_GRINDSTONE_I, CRIMSON_SANDSTONE_GRINDSTONE_I);
        registerItem(OAK_DEEPSLATE_GRINDSTONE_I, WARPED_SANDSTONE_GRINDSTONE_I);
        registerItem(DARK_OAK_DEEPSLATE_GRINDSTONE_I, OAK_DEEPSLATE_GRINDSTONE_I);
        registerItem(SPRUCE_DEEPSLATE_GRINDSTONE_I, DARK_OAK_DEEPSLATE_GRINDSTONE_I);
        registerItem(BIRCH_DEEPSLATE_GRINDSTONE_I, SPRUCE_DEEPSLATE_GRINDSTONE_I);
        registerItem(JUNGLE_DEEPSLATE_GRINDSTONE_I, BIRCH_DEEPSLATE_GRINDSTONE_I);
        registerItem(ACACIA_DEEPSLATE_GRINDSTONE_I, JUNGLE_DEEPSLATE_GRINDSTONE_I);
        registerItem(MANGROVE_DEEPSLATE_GRINDSTONE_I, ACACIA_DEEPSLATE_GRINDSTONE_I);
        registerItem(CHERRY_DEEPSLATE_GRINDSTONE_I, MANGROVE_DEEPSLATE_GRINDSTONE_I);
        registerItem(BAMBOO_DEEPSLATE_GRINDSTONE_I, CHERRY_DEEPSLATE_GRINDSTONE_I);
        registerItem(CRIMSON_DEEPSLATE_GRINDSTONE_I, BAMBOO_DEEPSLATE_GRINDSTONE_I);
        registerItem(WARPED_DEEPSLATE_GRINDSTONE_I, CRIMSON_DEEPSLATE_GRINDSTONE_I);
        registerItem(OAK_BASALT_GRINDSTONE_I, WARPED_DEEPSLATE_GRINDSTONE_I);
        registerItem(DARK_OAK_BASALT_GRINDSTONE_I, OAK_BASALT_GRINDSTONE_I);
        registerItem(SPRUCE_BASALT_GRINDSTONE_I, DARK_OAK_BASALT_GRINDSTONE_I);
        registerItem(BIRCH_BASALT_GRINDSTONE_I, SPRUCE_BASALT_GRINDSTONE_I);
        registerItem(JUNGLE_BASALT_GRINDSTONE_I, BIRCH_BASALT_GRINDSTONE_I);
        registerItem(ACACIA_BASALT_GRINDSTONE_I, JUNGLE_BASALT_GRINDSTONE_I);
        registerItem(MANGROVE_BASALT_GRINDSTONE_I, ACACIA_BASALT_GRINDSTONE_I);
        registerItem(CHERRY_BASALT_GRINDSTONE_I, MANGROVE_BASALT_GRINDSTONE_I);
        registerItem(BAMBOO_BASALT_GRINDSTONE_I, CHERRY_BASALT_GRINDSTONE_I);
        registerItem(CRIMSON_BASALT_GRINDSTONE_I, BAMBOO_BASALT_GRINDSTONE_I);
        registerItem(WARPED_BASALT_GRINDSTONE_I, CRIMSON_BASALT_GRINDSTONE_I);
        registerItem(OAK_GRANITE_GRINDSTONE_I, WARPED_BASALT_GRINDSTONE_I);
        registerItem(DARK_OAK_GRANITE_GRINDSTONE_I, OAK_GRANITE_GRINDSTONE_I);
        registerItem(SPRUCE_GRANITE_GRINDSTONE_I, DARK_OAK_GRANITE_GRINDSTONE_I);
        registerItem(BIRCH_GRANITE_GRINDSTONE_I, SPRUCE_GRANITE_GRINDSTONE_I);
        registerItem(JUNGLE_GRANITE_GRINDSTONE_I, BIRCH_GRANITE_GRINDSTONE_I);
        registerItem(ACACIA_GRANITE_GRINDSTONE_I, JUNGLE_GRANITE_GRINDSTONE_I);
        registerItem(MANGROVE_GRANITE_GRINDSTONE_I, ACACIA_GRANITE_GRINDSTONE_I);
        registerItem(CHERRY_GRANITE_GRINDSTONE_I, MANGROVE_GRANITE_GRINDSTONE_I);
        registerItem(BAMBOO_GRANITE_GRINDSTONE_I, CHERRY_GRANITE_GRINDSTONE_I);
        registerItem(CRIMSON_GRANITE_GRINDSTONE_I, BAMBOO_GRANITE_GRINDSTONE_I);
        registerItem(WARPED_GRANITE_GRINDSTONE_I, CRIMSON_GRANITE_GRINDSTONE_I);

    }

    private static void registerItem(BlockItem grindstone, Item grindstoneAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreGrindstoneVariants.asId(((MoreGrindstoneBlock) grindstone.getBlock()).grindstoneWoodType + "_" + ((MoreGrindstoneBlock) grindstone.getBlock()).grindstoneStoneType + "_grindstone"), grindstone);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(grindstoneAfter, grindstone));
    }
}