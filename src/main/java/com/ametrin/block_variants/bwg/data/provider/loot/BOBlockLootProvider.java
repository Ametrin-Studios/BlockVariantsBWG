package com.ametrin.block_variants.bwg.data.provider.loot;

import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public final class BOBlockLootProvider extends ExtendedBlockLootSubProvider {

    public BOBlockLootProvider(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        dropSelf(BOWoodBlocks.getAllBlocks());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BOWoodBlocks.getAllBlocks().toList();
    }
}
