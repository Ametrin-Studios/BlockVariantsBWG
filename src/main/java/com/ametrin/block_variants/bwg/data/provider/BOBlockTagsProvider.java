package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.*;

import java.util.concurrent.CompletableFuture;

public final class BOBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BOBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BlockVariantsBWGIntegration.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var mineableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE);

        var woodenStairs = tag(BlockTags.WOODEN_STAIRS);
        var woodenSlabs = tag(BlockTags.WOODEN_SLABS);
        var woodenWalls = tag(BVTags.Blocks.WOODEN_WALLS);
        var woodenFences = tag(BlockTags.WOODEN_FENCES);
        var woodenFenceGates = tag(BlockTags.FENCE_GATES);

        for (var block : BOWoodBlocks.REGISTER.getEntries()) {
            mineableWithAxe.add(block.get());

            if (block.value() instanceof StairBlock) {
                woodenStairs.add(block.get());
            } else if (block.value() instanceof SlabBlock) {
                woodenSlabs.add(block.get());
            } else if (block.value() instanceof WallBlock) {
                woodenWalls.add(block.get());
            } else if (block.value() instanceof FenceBlock) {
                woodenFences.add(block.get());
            } else if (block.value() instanceof FenceGateBlock) {
                woodenFenceGates.add(block.get());
            }
        }
    }
}
