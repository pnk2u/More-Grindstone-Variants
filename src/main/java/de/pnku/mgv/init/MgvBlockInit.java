package de.pnku.mgv.init;

import de.pnku.mgv.MoreGrindstoneVariants;
import de.pnku.mgv.block.MoreGrindstoneBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class MgvBlockInit {
    public static final MoreGrindstoneBlock OAK_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WOOD, "oak", OAK_PLANKS, "stone", STONE_SLAB, "oak_grindstone");
    public static final MoreGrindstoneBlock PALE_OAK_GRINDSTONE = new MoreGrindstoneBlock(MapColor.QUARTZ, "pale_oak", PALE_OAK_PLANKS, "stone", STONE_SLAB, "pale_oak_grindstone");
    public static final MoreGrindstoneBlock SPRUCE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.PODZOL, "spruce", SPRUCE_PLANKS, "stone", STONE_SLAB, "spruce_grindstone");
    public static final MoreGrindstoneBlock BIRCH_GRINDSTONE = new MoreGrindstoneBlock(MapColor.SAND, "birch", BIRCH_PLANKS, "stone", STONE_SLAB, "birch_grindstone");
    public static final MoreGrindstoneBlock JUNGLE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.DIRT, "jungle", JUNGLE_PLANKS, "stone", STONE_SLAB, "jungle_grindstone");
    public static final MoreGrindstoneBlock ACACIA_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_ORANGE, "acacia", ACACIA_PLANKS, "stone", STONE_SLAB, "acacia_grindstone");
    public static final MoreGrindstoneBlock MANGROVE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_RED, "mangrove", MANGROVE_PLANKS, "stone", STONE_SLAB, "mangrove_grindstone");
    public static final MoreGrindstoneBlock CHERRY_GRINDSTONE = new MoreGrindstoneBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD,"cherry", CHERRY_PLANKS, "stone", STONE_SLAB, "cherry_grindstone");
    public static final MoreGrindstoneBlock BAMBOO_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD,"bamboo", BAMBOO_PLANKS, "stone", STONE_SLAB, "bamboo_grindstone");
    public static final MoreGrindstoneBlock CRIMSON_GRINDSTONE = new MoreGrindstoneBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD,"crimson", CRIMSON_PLANKS, "stone", STONE_SLAB, "crimson_grindstone");
    public static final MoreGrindstoneBlock WARPED_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD,"warped", WARPED_PLANKS, "stone", STONE_SLAB, "warped_grindstone");
    public static final MoreGrindstoneBlock OAK_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WOOD, "oak", OAK_PLANKS, "sandstone", SANDSTONE_SLAB, "oak_sandstone_grindstone");
    public static final MoreGrindstoneBlock PALE_OAK_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.QUARTZ, "pale_oak", PALE_OAK_PLANKS, "sandstone", SANDSTONE_SLAB, "pale_oak_sandstone_grindstone");
    public static final MoreGrindstoneBlock DARK_OAK_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_BROWN, "dark_oak", DARK_OAK_PLANKS, "sandstone", SANDSTONE_SLAB, "dark_oak_sandstone_grindstone");
    public static final MoreGrindstoneBlock SPRUCE_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.PODZOL, "spruce", SPRUCE_PLANKS, "sandstone", SANDSTONE_SLAB, "spruce_sandstone_grindstone");
    public static final MoreGrindstoneBlock BIRCH_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.SAND, "birch", BIRCH_PLANKS, "sandstone", SANDSTONE_SLAB, "birch_sandstone_grindstone");
    public static final MoreGrindstoneBlock JUNGLE_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.DIRT, "jungle", JUNGLE_PLANKS, "sandstone", SANDSTONE_SLAB, "jungle_sandstone_grindstone");
    public static final MoreGrindstoneBlock ACACIA_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_ORANGE, "acacia", ACACIA_PLANKS, "sandstone", SANDSTONE_SLAB, "acacia_sandstone_grindstone");
    public static final MoreGrindstoneBlock MANGROVE_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_RED, "mangrove", MANGROVE_PLANKS, "sandstone", SANDSTONE_SLAB, "mangrove_sandstone_grindstone");
    public static final MoreGrindstoneBlock CHERRY_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD,"cherry", CHERRY_PLANKS, "sandstone", SANDSTONE_SLAB, "cherry_sandstone_grindstone");
    public static final MoreGrindstoneBlock BAMBOO_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD,"bamboo", BAMBOO_PLANKS, "sandstone", SANDSTONE_SLAB, "bamboo_sandstone_grindstone");
    public static final MoreGrindstoneBlock CRIMSON_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD,"crimson", CRIMSON_PLANKS, "sandstone", SANDSTONE_SLAB, "crimson_sandstone_grindstone");
    public static final MoreGrindstoneBlock WARPED_SANDSTONE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD,"warped", WARPED_PLANKS, "sandstone", SANDSTONE_SLAB, "warped_sandstone_grindstone");
    public static final MoreGrindstoneBlock OAK_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WOOD, "oak", OAK_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "oak_deepslate_grindstone");
    public static final MoreGrindstoneBlock PALE_OAK_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.QUARTZ, "pale_oak", PALE_OAK_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "pale_oak_deepslate_grindstone");
    public static final MoreGrindstoneBlock DARK_OAK_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_BROWN, "dark_oak", DARK_OAK_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "dark_oak_deepslate_grindstone");
    public static final MoreGrindstoneBlock SPRUCE_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.PODZOL, "spruce", SPRUCE_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "spruce_deepslate_grindstone");
    public static final MoreGrindstoneBlock BIRCH_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.SAND, "birch", BIRCH_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "birch_deepslate_grindstone");
    public static final MoreGrindstoneBlock JUNGLE_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.DIRT, "jungle", JUNGLE_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "jungle_deepslate_grindstone");
    public static final MoreGrindstoneBlock ACACIA_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_ORANGE, "acacia", ACACIA_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "acacia_deepslate_grindstone");
    public static final MoreGrindstoneBlock MANGROVE_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_RED, "mangrove", MANGROVE_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "mangrove_deepslate_grindstone");
    public static final MoreGrindstoneBlock CHERRY_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD,"cherry", CHERRY_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "cherry_deepslate_grindstone");
    public static final MoreGrindstoneBlock BAMBOO_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD,"bamboo", BAMBOO_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "bamboo_deepslate_grindstone");
    public static final MoreGrindstoneBlock CRIMSON_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD,"crimson", CRIMSON_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "crimson_deepslate_grindstone");
    public static final MoreGrindstoneBlock WARPED_DEEPSLATE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD,"warped", WARPED_PLANKS, "deepslate", POLISHED_DEEPSLATE_SLAB, "warped_deepslate_grindstone");
    public static final MoreGrindstoneBlock OAK_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WOOD, "oak", OAK_PLANKS, "basalt", BASALT, "oak_basalt_grindstone");
    public static final MoreGrindstoneBlock PALE_OAK_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.QUARTZ, "pale_oak", PALE_OAK_PLANKS, "basalt", BASALT, "pale_oak_basalt_grindstone");
    public static final MoreGrindstoneBlock DARK_OAK_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_BROWN, "dark_oak", DARK_OAK_PLANKS, "basalt", BASALT, "dark_oak_basalt_grindstone");
    public static final MoreGrindstoneBlock SPRUCE_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.PODZOL, "spruce", SPRUCE_PLANKS, "basalt", BASALT, "spruce_basalt_grindstone");
    public static final MoreGrindstoneBlock BIRCH_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.SAND, "birch", BIRCH_PLANKS, "basalt", BASALT, "birch_basalt_grindstone");
    public static final MoreGrindstoneBlock JUNGLE_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.DIRT, "jungle", JUNGLE_PLANKS, "basalt", BASALT, "jungle_basalt_grindstone");
    public static final MoreGrindstoneBlock ACACIA_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_ORANGE, "acacia", ACACIA_PLANKS, "basalt", BASALT, "acacia_basalt_grindstone");
    public static final MoreGrindstoneBlock MANGROVE_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_RED, "mangrove", MANGROVE_PLANKS, "basalt", BASALT, "mangrove_basalt_grindstone");
    public static final MoreGrindstoneBlock CHERRY_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD,"cherry", CHERRY_PLANKS, "basalt", BASALT, "cherry_basalt_grindstone");
    public static final MoreGrindstoneBlock BAMBOO_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD,"bamboo", BAMBOO_PLANKS, "basalt", BASALT, "bamboo_basalt_grindstone");
    public static final MoreGrindstoneBlock CRIMSON_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD,"crimson", CRIMSON_PLANKS, "basalt", BASALT, "crimson_basalt_grindstone");
    public static final MoreGrindstoneBlock WARPED_BASALT_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD,"warped", WARPED_PLANKS, "basalt", BASALT, "warped_basalt_grindstone");
    public static final MoreGrindstoneBlock OAK_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WOOD, "oak", OAK_PLANKS, "granite", GRANITE_SLAB, "oak_granite_grindstone");
    public static final MoreGrindstoneBlock PALE_OAK_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.QUARTZ, "pale_oak", PALE_OAK_PLANKS, "granite", GRANITE_SLAB, "pale_oak_granite_grindstone");
    public static final MoreGrindstoneBlock DARK_OAK_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_BROWN, "dark_oak", DARK_OAK_PLANKS, "granite", GRANITE_SLAB, "dark_oak_granite_grindstone");
    public static final MoreGrindstoneBlock SPRUCE_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.PODZOL, "spruce", SPRUCE_PLANKS, "granite", GRANITE_SLAB, "spruce_granite_grindstone");
    public static final MoreGrindstoneBlock BIRCH_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.SAND, "birch", BIRCH_PLANKS, "granite", GRANITE_SLAB, "birch_granite_grindstone");
    public static final MoreGrindstoneBlock JUNGLE_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.DIRT, "jungle", JUNGLE_PLANKS, "granite", GRANITE_SLAB, "jungle_granite_grindstone");
    public static final MoreGrindstoneBlock ACACIA_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_ORANGE, "acacia", ACACIA_PLANKS, "granite", GRANITE_SLAB, "acacia_granite_grindstone");
    public static final MoreGrindstoneBlock MANGROVE_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_RED, "mangrove", MANGROVE_PLANKS, "granite", GRANITE_SLAB, "mangrove_granite_grindstone");
    public static final MoreGrindstoneBlock CHERRY_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD,"cherry", CHERRY_PLANKS, "granite", GRANITE_SLAB, "cherry_granite_grindstone");
    public static final MoreGrindstoneBlock BAMBOO_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD,"bamboo", BAMBOO_PLANKS, "granite", GRANITE_SLAB, "bamboo_granite_grindstone");
    public static final MoreGrindstoneBlock CRIMSON_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD,"crimson", CRIMSON_PLANKS, "granite", GRANITE_SLAB, "crimson_granite_grindstone");
    public static final MoreGrindstoneBlock WARPED_GRANITE_GRINDSTONE = new MoreGrindstoneBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD,"warped", WARPED_PLANKS, "granite", GRANITE_SLAB, "warped_granite_grindstone");

    public static final List<Block> more_grindstones = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_GRINDSTONE);
        registerBlock(PALE_OAK_GRINDSTONE);
        registerBlock(SPRUCE_GRINDSTONE);
        registerBlock(BIRCH_GRINDSTONE);
        registerBlock(JUNGLE_GRINDSTONE);
        registerBlock(ACACIA_GRINDSTONE);
        registerBlock(MANGROVE_GRINDSTONE);
        registerBlock(CHERRY_GRINDSTONE);
        registerBlock(BAMBOO_GRINDSTONE);
        registerBlock(CRIMSON_GRINDSTONE);
        registerBlock(WARPED_GRINDSTONE);
        registerBlock(OAK_SANDSTONE_GRINDSTONE);
        registerBlock(PALE_OAK_SANDSTONE_GRINDSTONE);
        registerBlock(DARK_OAK_SANDSTONE_GRINDSTONE);
        registerBlock(SPRUCE_SANDSTONE_GRINDSTONE);
        registerBlock(BIRCH_SANDSTONE_GRINDSTONE);
        registerBlock(JUNGLE_SANDSTONE_GRINDSTONE);
        registerBlock(ACACIA_SANDSTONE_GRINDSTONE);
        registerBlock(MANGROVE_SANDSTONE_GRINDSTONE);
        registerBlock(CHERRY_SANDSTONE_GRINDSTONE);
        registerBlock(BAMBOO_SANDSTONE_GRINDSTONE);
        registerBlock(CRIMSON_SANDSTONE_GRINDSTONE);
        registerBlock(WARPED_SANDSTONE_GRINDSTONE);
        registerBlock(OAK_DEEPSLATE_GRINDSTONE);
        registerBlock(PALE_OAK_DEEPSLATE_GRINDSTONE);
        registerBlock(DARK_OAK_DEEPSLATE_GRINDSTONE);
        registerBlock(SPRUCE_DEEPSLATE_GRINDSTONE);
        registerBlock(BIRCH_DEEPSLATE_GRINDSTONE);
        registerBlock(JUNGLE_DEEPSLATE_GRINDSTONE);
        registerBlock(ACACIA_DEEPSLATE_GRINDSTONE);
        registerBlock(MANGROVE_DEEPSLATE_GRINDSTONE);
        registerBlock(CHERRY_DEEPSLATE_GRINDSTONE);
        registerBlock(BAMBOO_DEEPSLATE_GRINDSTONE);
        registerBlock(CRIMSON_DEEPSLATE_GRINDSTONE);
        registerBlock(WARPED_DEEPSLATE_GRINDSTONE);
        registerBlock(OAK_BASALT_GRINDSTONE);
        registerBlock(PALE_OAK_BASALT_GRINDSTONE);
        registerBlock(DARK_OAK_BASALT_GRINDSTONE);
        registerBlock(SPRUCE_BASALT_GRINDSTONE);
        registerBlock(BIRCH_BASALT_GRINDSTONE);
        registerBlock(JUNGLE_BASALT_GRINDSTONE);
        registerBlock(ACACIA_BASALT_GRINDSTONE);
        registerBlock(MANGROVE_BASALT_GRINDSTONE);
        registerBlock(CHERRY_BASALT_GRINDSTONE);
        registerBlock(BAMBOO_BASALT_GRINDSTONE);
        registerBlock(CRIMSON_BASALT_GRINDSTONE);
        registerBlock(WARPED_BASALT_GRINDSTONE);
        registerBlock(OAK_GRANITE_GRINDSTONE);
        registerBlock(PALE_OAK_GRANITE_GRINDSTONE);
        registerBlock(DARK_OAK_GRANITE_GRINDSTONE);
        registerBlock(SPRUCE_GRANITE_GRINDSTONE);
        registerBlock(BIRCH_GRANITE_GRINDSTONE);
        registerBlock(JUNGLE_GRANITE_GRINDSTONE);
        registerBlock(ACACIA_GRANITE_GRINDSTONE);
        registerBlock(MANGROVE_GRANITE_GRINDSTONE);
        registerBlock(CHERRY_GRANITE_GRINDSTONE);
        registerBlock(BAMBOO_GRANITE_GRINDSTONE);
        registerBlock(CRIMSON_GRANITE_GRINDSTONE);
        registerBlock(WARPED_GRANITE_GRINDSTONE);

    }

    private static void registerBlock(MoreGrindstoneBlock grindstone) {
        Registry.register(BuiltInRegistries.BLOCK, MoreGrindstoneVariants.asId(grindstone.grindstoneWoodType + "_" + grindstone.grindstoneStoneType + "_grindstone"), grindstone);
        more_grindstones.add(grindstone);
    }

}