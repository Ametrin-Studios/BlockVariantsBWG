package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isLog;
import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWood;

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
        if(isWood(name) || isLog(name))
        {
            return getLogBlockTexture(name);
        }
        return name;
    }

    public static String getLogBlockTexture(String s) {
        var type = s.contains("florus") ? "stem" : "log";
        var _type = "_" + type;
        s = s.replace("_wood", _type);
        if (!s.startsWith("stripped_")) {
            return s.replace(_type, "/" + type);
        }
        return s.replace("stripped_", "").replace(_type, "/stripped_" + type);
    }

    @Override
    protected ResourceLocation modBlockLoc(String key) {
        return ResourceLocation.fromNamespaceAndPath("biomeswevegone", "block/" + key);
    }
}
