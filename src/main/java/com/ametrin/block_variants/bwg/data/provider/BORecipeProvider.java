package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BORecipeProvider extends ExtendedRecipeProvider {
    public BORecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, BlockVariantsBWGIntegration.MOD_ID, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        stairSlab(output, BOWoodBlocks.ASPEN_LOG_STAIRS.get(), BOWoodBlocks.ASPEN_LOG_SLAB.get(), BWGWood.ASPEN.logstem(), false);
        stairSlab(output, BOWoodBlocks.STRIPPED_ASPEN_LOG_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_LOG_SLAB.get(), BWGWood.ASPEN.strippedLogStem(), false);
        recipeWoods(output, BOWoodBlocks.ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.ASPEN_WOOD_SLAB.get(), BOWoodBlocks.ASPEN_WOOD_WALL.get(), BOWoodBlocks.ASPEN_WOOD_FENCE.get(), BOWoodBlocks.ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.wood(), BWGWood.ASPEN.logstem());
        recipeWoods(output, BOWoodBlocks.STRIPPED_ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_SLAB.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.strippedWood(), BWGWood.ASPEN.strippedLogStem());
    }

    public void recipeWoods(RecipeOutput output, StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial) {
        stairs(output, stairs, material, false);
        slab(output, slab, material, false);
        wall(output, wall, material, false);
        wall(output, wall, altMaterial, false);
        fence(output, fence, material);
        fence(output, fence, altMaterial);
        fenceGate(output, fenceGate, material);
        fenceGate(output, fenceGate, altMaterial);
    }

    public void stairSlab(RecipeOutput output, StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
        stairs(output, stair, material, hasStonecutting);
        slab(output, slab, material, hasStonecutting);
    }
}
