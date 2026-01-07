package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.*;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import static com.barion.block_variants.data.provider.BVModelProvider.*;

public final class BOModelProvider extends ExtendedModelProvider {
    public BOModelProvider(PackOutput output) {
        super(output, BlockVariantsBWGIntegration.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // ASPEN
        logStairsSlab(blockModels, BWGWood.ASPEN.logstem(), BOWoodBlocks.ASPEN_LOG_STAIRS.get(), BOWoodBlocks.ASPEN_LOG_SLAB.get());
        logStairsSlab(blockModels, BWGWood.ASPEN.strippedLogStem(), BOWoodBlocks.STRIPPED_ASPEN_LOG_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_LOG_SLAB.get());
        woodStairsSlabWallFenceGate(blockModels, BWGWood.ASPEN.logstem(), BOWoodBlocks.ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.ASPEN_WOOD_SLAB.get(), BWGWood.ASPEN.wood(), BOWoodBlocks.ASPEN_WOOD_WALL.get(), BOWoodBlocks.ASPEN_WOOD_FENCE.get(), BOWoodBlocks.ASPEN_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, BWGWood.ASPEN.strippedLogStem(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_STAIRS.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_SLAB.get(), BWGWood.ASPEN.strippedWood(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE.get(), BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE.get());
    }

    private static void woodStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, Block doubleSlap, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        var mapping = TextureMapping.cube(getLogBlockTexture(base));
        customWall(blockModels, wall, mapping);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, doubleSlap, mapping);
        customFence(blockModels, fence, mapping);
        customFenceGate(blockModels, gate, mapping);
    }

    private static void logStairsSlab(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab) {
        var mapping = logTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
    }

    // TODO: remove after next block variants update
    private static void customFence(BlockModelGenerators blockModels, Block fenceBlock, TextureMapping mapping) {
        var post = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_POST.create(fenceBlock, mapping, blockModels.modelOutput));
        var side = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_SIDE.create(fenceBlock, mapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFence(fenceBlock, post, side));
        var identifier = ModelTemplates.FENCE_INVENTORY.create(fenceBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(fenceBlock, identifier);
    }

    public static void customFenceGate(BlockModelGenerators blockModels, Block fenceGateBlock, TextureMapping mapping) {
        var open = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_OPEN.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var closed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_CLOSED.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var wall_open = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var wall_closed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGateBlock, mapping, blockModels.modelOutput));
        blockModels.blockStateOutput
                .accept(BlockModelGenerators.createFenceGate(fenceGateBlock, open, closed, wall_open, wall_closed, true));
    }

    private static TextureMapping logTextureMapping(Block log) {
        return new TextureMapping()
                .put(TextureSlot.SIDE, getLogBlockTexture(log))
                .put(TextureSlot.TOP, getLogBlockTexture(log).withSuffix("_top"))
                .put(TextureSlot.BOTTOM, getLogBlockTexture(log).withSuffix("_top"));
    }

    private static Identifier getLogBlockTexture(Block block) {
        return TextureMapping.getBlockTexture(block).withPath(s -> {
            if(!s.startsWith("block/stripped_")){
                return s.replace("_log", "/log");
            }
            return s.replace("stripped_", "").replace("_log", "/stripped_log");
        });
    }
}
