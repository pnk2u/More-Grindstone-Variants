package com.pnku.mgv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.pnku.mgv.init.MgvBlockInit;
import com.pnku.mgv.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MgvPoiTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> weaponsmithEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .getHolder(PoiTypes.WEAPONSMITH).get();

        PoiType weaponsmithPoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.get(PoiTypes.WEAPONSMITH);

        List<BlockState> weaponsmithBlockStates = new ArrayList<BlockState>(weaponsmithPoiType.matchingStates);

        for (Block block : MgvBlockInit.more_grindstones) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, weaponsmithEntry);
            }

            weaponsmithBlockStates.addAll(blockStates);
        }

        weaponsmithPoiType.matchingStates = ImmutableSet.copyOf(weaponsmithBlockStates);
    }
}