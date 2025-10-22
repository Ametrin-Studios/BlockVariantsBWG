package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.potionstudios.biomeswevegone.BiomesWeveGone;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isLog;

public final class BOBlockStateProvider extends ExtendedBlockStateProvider {

    public BOBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BlockVariantsBWGIntegration.MOD_ID, existingFileHelper);
    }

    {
        blockStateProviderRules.add((block, name, texture) -> {
            if (!isLog(name)) {
                return false;
            }
            if (block instanceof StairBlock) {
                var top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), top, top);
            } else if (block instanceof SlabBlock) {
                var top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(name.replace("_slab", "")), modBlockLoc(texture.replace("_slab", "")), top, top);
            } else {
                return false;
            }
            return true;
        });
    }

    @Override
    protected void registerStatesAndModels() {
        runProviderRules(BOWoodBlocks.REGISTER);
    }

    @Override
    protected String getTextureLocation(String name) {
        if (name.contains("_wood")) {
            name = name.replace("_wood", "/log");
        }

        if (name.contains("_log")) {
            name = name.replace("_log", "/log");
        }

        if(name.startsWith("stripped_")){
            name = name.replace("stripped_", "");
            name = name.replace("/log", "/stripped_log");
        }
        return name;
    }

    @Override
    protected ResourceLocation modBlockLoc(String key) {
        return BiomesWeveGone.id("block/" + key);
    }
}
