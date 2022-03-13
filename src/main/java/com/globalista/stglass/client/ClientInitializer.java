package com.globalista.stglass.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

import static com.globalista.stglass.block.ModBlocks.*;

public class ClientInitializer {

    public static void initializeClient() {
        if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            BlockRenderLayerMap.INSTANCE.putBlock(BLACK_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(BLUE_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(BROWN_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(CYAN_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(GRAY_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(GREEN_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(LIGHT_BLUE_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(LIGHT_GRAY_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(LIME_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(MAGENTA_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(PINK_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(PURPLE_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(RED_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(WHITE_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(YELLOW_STAINED_TINTED_GLASS, RenderLayer.getTranslucent());

        }
    }

}
