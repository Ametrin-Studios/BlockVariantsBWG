package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class BORecipeProvider extends ExtendedRecipeProvider {

    public BORecipeProvider(HolderLookup.Provider registries, RecipeOutput output, Set<Identifier> recipeSet) {
        super(BlockVariantsBWGIntegration.MOD_ID, registries, output, recipeSet);
    }

    @Override
    protected void buildRecipes() {
        stairSlab(BOWoodBlocks.ASPEN_LOG_STAIRS.get(), BOWoodBlocks.ASPEN_LOG_SLAB.get(), BWGWood.ASPEN.logstem(), false);
        stairSlab(BOWoodBlocks.STRIPPED_ASPEN_LOG_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_LOG_SLAB.get(), BWGWood.ASPEN.strippedLogStem(), false);
        recipeWoods(BOWoodBlocks.ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.ASPEN_WOOD_SLAB.get(), BOWoodBlocks.ASPEN_WOOD_WALL.get(), BOWoodBlocks.ASPEN_WOOD_FENCE.get(), BOWoodBlocks.ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.wood(), BWGWood.ASPEN.logstem());
        recipeWoods(BOWoodBlocks.STRIPPED_ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_SLAB.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE.get(), BWGWood.ASPEN.strippedWood(), BWGWood.ASPEN.strippedLogStem());
    }

    public void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial) {
        stairs(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wall(wall, altMaterial, false);
        fence(fence, material);
        fence(fence, altMaterial);
        fenceGate(fenceGate, material);
        fenceGate(fenceGate, altMaterial);
    }

    public void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    public static class Runner extends ExtendedRecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected ExtendedRecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput, Set<Identifier> set) {
            return new BORecipeProvider(provider, recipeOutput, set);
        }

        @Override
        public String getName() {
            return "Block Variants Recipe Provider";
        }
    }
}
