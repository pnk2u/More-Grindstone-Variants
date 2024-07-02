package com.pnku.mgv;

import com.pnku.mgv.init.MgvBlockInit;
import com.pnku.mgv.init.MgvItemInit;
import com.pnku.mgv.poi.MgvPoiTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreGrindstoneVariants implements ModInitializer {
    public static final String MODID = "lolmgv";

    @Override
    public void onInitialize() {
        MgvBlockInit.registerBlocks();
        MgvItemInit.registerItems();
        MgvPoiTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}