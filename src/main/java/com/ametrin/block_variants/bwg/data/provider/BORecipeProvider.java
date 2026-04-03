package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOBlockFamilies;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import java.util.concurrent.CompletableFuture;

public final class BORecipeProvider extends ExtendedRecipeProvider {

    private RecipeOutput output;
    public BORecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, BlockVariantsBWGIntegration.MOD_ID, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        this.output = output;

        var featureflagSet = FeatureFlagSet.of(FeatureFlags.VANILLA);
        for (var family : BOBlockFamilies.LOG_FAMILIES) {
            generateRecipes(output, family, featureflagSet);
        }

        for (var family : BOBlockFamilies.WOOD_FAMILIES) {
            generateRecipes(output, family, featureflagSet);
        }

        wallFenceFenceGate(BOWoodBlocks.ASPEN_WOOD_WALL.get(), BOWoodBlocks.ASPEN_WOOD_FENCE.get(), BOWoodBlocks.ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.BAOBAB_WOOD_WALL.get(), BOWoodBlocks.BAOBAB_WOOD_FENCE.get(), BOWoodBlocks.BAOBAB_WOOD_FENCE_GATE.get(), BWGWood.BAOBAB.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_BAOBAB_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_BAOBAB_WOOD_FENCE_GATE.get(), BWGWood.BAOBAB.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.BLUE_ENCHANTED_WOOD_WALL.get(), BOWoodBlocks.BLUE_ENCHANTED_WOOD_FENCE.get(), BOWoodBlocks.BLUE_ENCHANTED_WOOD_FENCE_GATE.get(), BWGWood.BLUE_ENCHANTED.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_FENCE_GATE.get(), BWGWood.BLUE_ENCHANTED.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.CIKA_WOOD_WALL.get(), BOWoodBlocks.CIKA_WOOD_FENCE.get(), BOWoodBlocks.CIKA_WOOD_FENCE_GATE.get(), BWGWood.CIKA.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_CIKA_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_CIKA_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_CIKA_WOOD_FENCE_GATE.get(), BWGWood.CIKA.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.CYPRESS_WOOD_WALL.get(), BOWoodBlocks.CYPRESS_WOOD_FENCE.get(), BOWoodBlocks.CYPRESS_WOOD_FENCE_GATE.get(), BWGWood.CYPRESS.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_CYPRESS_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_CYPRESS_WOOD_FENCE_GATE.get(), BWGWood.CYPRESS.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.EBONY_WOOD_WALL.get(), BOWoodBlocks.EBONY_WOOD_FENCE.get(), BOWoodBlocks.EBONY_WOOD_FENCE_GATE.get(), BWGWood.EBONY.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_EBONY_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_EBONY_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_EBONY_WOOD_FENCE_GATE.get(), BWGWood.EBONY.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.FIR_WOOD_WALL.get(), BOWoodBlocks.FIR_WOOD_FENCE.get(), BOWoodBlocks.FIR_WOOD_FENCE_GATE.get(), BWGWood.FIR.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_FIR_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_FIR_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get(), BWGWood.FIR.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.FLORUS_WOOD_WALL.get(), BOWoodBlocks.FLORUS_WOOD_FENCE.get(), BOWoodBlocks.FLORUS_WOOD_FENCE_GATE.get(), BWGWood.FLORUS.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_FLORUS_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_FLORUS_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_FLORUS_WOOD_FENCE_GATE.get(), BWGWood.FLORUS.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.GREEN_ENCHANTED_WOOD_WALL.get(), BOWoodBlocks.GREEN_ENCHANTED_WOOD_FENCE.get(), BOWoodBlocks.GREEN_ENCHANTED_WOOD_FENCE_GATE.get(), BWGWood.GREEN_ENCHANTED.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_FENCE_GATE.get(), BWGWood.GREEN_ENCHANTED.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.HOLLY_WOOD_WALL.get(), BOWoodBlocks.HOLLY_WOOD_FENCE.get(), BOWoodBlocks.HOLLY_WOOD_FENCE_GATE.get(), BWGWood.HOLLY.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_HOLLY_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_HOLLY_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_HOLLY_WOOD_FENCE_GATE.get(), BWGWood.HOLLY.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.IRONWOOD_WOOD_WALL.get(), BOWoodBlocks.IRONWOOD_WOOD_FENCE.get(), BOWoodBlocks.IRONWOOD_WOOD_FENCE_GATE.get(), BWGWood.IRONWOOD.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_FENCE_GATE.get(), BWGWood.IRONWOOD.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.JACARANDA_WOOD_WALL.get(), BOWoodBlocks.JACARANDA_WOOD_FENCE.get(), BOWoodBlocks.JACARANDA_WOOD_FENCE_GATE.get(), BWGWood.JACARANDA.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE.get(), BWGWood.JACARANDA.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.MAHOGANY_WOOD_WALL.get(), BOWoodBlocks.MAHOGANY_WOOD_FENCE.get(), BOWoodBlocks.MAHOGANY_WOOD_FENCE_GATE.get(), BWGWood.MAHOGANY.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE.get(), BWGWood.MAHOGANY.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.MAPLE_WOOD_WALL.get(), BOWoodBlocks.MAPLE_WOOD_FENCE.get(), BOWoodBlocks.MAPLE_WOOD_FENCE_GATE.get(), BWGWood.MAPLE.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_MAPLE_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE.get(), BWGWood.MAPLE.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.PALM_WOOD_WALL.get(), BOWoodBlocks.PALM_WOOD_FENCE.get(), BOWoodBlocks.PALM_WOOD_FENCE_GATE.get(), BWGWood.PALM.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_PALM_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_PALM_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE.get(), BWGWood.PALM.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.PINE_WOOD_WALL.get(), BOWoodBlocks.PINE_WOOD_FENCE.get(), BOWoodBlocks.PINE_WOOD_FENCE_GATE.get(), BWGWood.PINE.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_PINE_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_PINE_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE.get(), BWGWood.PINE.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_WALL.get(), BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_FENCE.get(), BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE.get(), BWGWood.RAINBOW_EUCALYPTUS.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE.get(), BWGWood.RAINBOW_EUCALYPTUS.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.REDWOOD_WOOD_WALL.get(), BOWoodBlocks.REDWOOD_WOOD_FENCE.get(), BOWoodBlocks.REDWOOD_WOOD_FENCE_GATE.get(), BWGWood.REDWOOD.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE.get(), BWGWood.REDWOOD.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.SAKURA_WOOD_WALL.get(), BOWoodBlocks.SAKURA_WOOD_FENCE.get(), BOWoodBlocks.SAKURA_WOOD_FENCE_GATE.get(), BWGWood.SAKURA.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_SAKURA_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_SAKURA_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_SAKURA_WOOD_FENCE_GATE.get(), BWGWood.SAKURA.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.SKYRIS_WOOD_WALL.get(), BOWoodBlocks.SKYRIS_WOOD_FENCE.get(), BOWoodBlocks.SKYRIS_WOOD_FENCE_GATE.get(), BWGWood.SKYRIS.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_SKYRIS_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_SKYRIS_WOOD_FENCE_GATE.get(), BWGWood.SKYRIS.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.SPIRIT_WOOD_WALL.get(), BOWoodBlocks.SPIRIT_WOOD_FENCE.get(), BOWoodBlocks.SPIRIT_WOOD_FENCE_GATE.get(), BWGWood.SPIRIT.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_SPIRIT_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_SPIRIT_WOOD_FENCE_GATE.get(), BWGWood.SPIRIT.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.WHITE_MANGROVE_WOOD_WALL.get(), BOWoodBlocks.WHITE_MANGROVE_WOOD_FENCE.get(), BOWoodBlocks.WHITE_MANGROVE_WOOD_FENCE_GATE.get(), BWGWood.WHITE_MANGROVE.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_FENCE_GATE.get(), BWGWood.WHITE_MANGROVE.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.WILLOW_WOOD_WALL.get(), BOWoodBlocks.WILLOW_WOOD_FENCE.get(), BOWoodBlocks.WILLOW_WOOD_FENCE_GATE.get(), BWGWood.WILLOW.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_WILLOW_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE.get(), BWGWood.WILLOW.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.WITCH_HAZEL_WOOD_WALL.get(), BOWoodBlocks.WITCH_HAZEL_WOOD_FENCE.get(), BOWoodBlocks.WITCH_HAZEL_WOOD_FENCE_GATE.get(), BWGWood.WITCH_HAZEL.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_FENCE_GATE.get(), BWGWood.WITCH_HAZEL.strippedLogStem(), false);

        wallFenceFenceGate(BOWoodBlocks.ZELKOVA_WOOD_WALL.get(), BOWoodBlocks.ZELKOVA_WOOD_FENCE.get(), BOWoodBlocks.ZELKOVA_WOOD_FENCE_GATE.get(), BWGWood.ZELKOVA.logstem(), false);
        wallFenceFenceGate(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_FENCE_GATE.get(), BWGWood.ZELKOVA.strippedLogStem(), false);
    }

//    public void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material) {
//        stairs(stairs, material, false);
//        slab(slab, material, false);
//        wall(wall, material, false);
//        fence(fence, material);
//        fenceGate(fenceGate, material);
//    }
//
//    public void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
//        stairs(stair, material, hasStonecutting);
//        slab(slab, material, hasStonecutting);
//    }

    public void wallFenceFenceGate(WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, boolean hasStonecutting) {
        wall(output, wall, material, hasStonecutting);
        fence(output, fence, material);
        fenceGate(output, fenceGate, material);
    }
}
