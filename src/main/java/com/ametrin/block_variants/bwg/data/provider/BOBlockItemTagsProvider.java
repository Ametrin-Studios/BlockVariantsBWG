package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.*;

public abstract class BOBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    @Override
    protected void run() {
        var woodenStairs = tag(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        var woodenSlabs = tag(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        var woodenWalls = tag(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS);
        var woodenFences = tag(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        var woodenFenceGates = tag(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);

        for (var block : BOWoodBlocks.REGISTER.getEntries()) {
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
