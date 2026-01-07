package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOItems;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public final class BOItemTagsProvider extends ExtendedItemTagsProvider {

    public BOItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariantsBWGIntegration.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        runRules(BOItems.REGISTER);
    }
}
