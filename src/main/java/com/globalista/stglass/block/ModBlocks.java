package com.globalista.stglass.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.TintedGlassBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

import static com.globalista.stglass.block.BlockRegister.registerBlock;

public class ModBlocks {

    public static void callBlocks() {
        System.out.println("Registering STGlass blocks...");
    }

    public static final Block BLACK_STAINED_TINTED_GLASS = registerBlock("black_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block BLUE_STAINED_TINTED_GLASS = registerBlock("blue_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block BROWN_STAINED_TINTED_GLASS = registerBlock("brown_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block CYAN_STAINED_TINTED_GLASS = registerBlock("cyan_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block GRAY_STAINED_TINTED_GLASS = registerBlock("gray_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block GREEN_STAINED_TINTED_GLASS = registerBlock("green_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block LIGHT_BLUE_STAINED_TINTED_GLASS = registerBlock("light_blue_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block LIGHT_GRAY_STAINED_TINTED_GLASS = registerBlock("light_gray_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block LIME_STAINED_TINTED_GLASS = registerBlock("lime_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block MAGENTA_STAINED_TINTED_GLASS = registerBlock("magenta_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block ORANGE_STAINED_TINTED_GLASS = registerBlock("orange_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block PINK_STAINED_TINTED_GLASS = registerBlock("pink_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block PURPLE_STAINED_TINTED_GLASS = registerBlock("purple_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block RED_STAINED_TINTED_GLASS = registerBlock("red_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block WHITE_STAINED_TINTED_GLASS = registerBlock("white_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);
    public static final Block YELLOW_STAINED_TINTED_GLASS = registerBlock("yellow_stained_tinted_glass", new TintedGlassBlock(FabricBlockSettings.of(Material.GLASS).strength(0.3f,0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS)), ItemGroup.DECORATIONS);

}
