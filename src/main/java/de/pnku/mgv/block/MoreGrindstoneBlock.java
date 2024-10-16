package de.pnku.mgv.block;

import de.pnku.mgv.MoreGrindstoneVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;

public class MoreGrindstoneBlock extends GrindstoneBlock {
    public final String grindstoneWoodType;
    public final String grindstoneStoneType;

    public MoreGrindstoneBlock(MapColor colour, String grindstoneWoodType, Block planks, String grindstoneStoneType, Block stone, String id) {
        super(Properties.ofFullCopy(Blocks.GRINDSTONE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreGrindstoneVariants.asId(grindstoneWoodType + "_" + grindstoneStoneType + "_grindstone"))));
        this.grindstoneWoodType = grindstoneWoodType;
        this.grindstoneStoneType = grindstoneStoneType;
    }

    public MoreGrindstoneBlock(MapColor colour, SoundType sound, String grindstoneWoodType, Block planks, String grindstoneStoneType, Block stone, String id) {
        super(Properties.ofFullCopy(Blocks.GRINDSTONE).mapColor(colour).setId(ResourceKey.create(Registries.BLOCK, MoreGrindstoneVariants.asId(grindstoneWoodType + "_" + grindstoneStoneType + "_grindstone"))).sound(sound));
        this.grindstoneWoodType = grindstoneWoodType;
        this.grindstoneStoneType = grindstoneStoneType;
    }
}