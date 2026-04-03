package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public final class BOItemTagsProvider extends ExtendedItemTagsProvider {

    public BOItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider) {
        super(packOutput, lookupProvider, blockTagProvider, BlockVariantsBWGIntegration.MOD_ID, null);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        runRules(BOItems.REGISTER);

        // copy(BlockTags.STAIRS, ItemTags.STAIRS);
        // copy(BlockTags.SLABS, ItemTags.SLABS);
        // copy(BlockTags.WALLS, ItemTags.WALLS);
        // copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS);
        copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
    }
}
