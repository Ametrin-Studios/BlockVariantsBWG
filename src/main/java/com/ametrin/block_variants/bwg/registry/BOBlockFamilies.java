package com.ametrin.block_variants.bwg.registry;

import net.minecraft.data.BlockFamily;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import java.util.ArrayList;
import java.util.List;

public final class BOBlockFamilies {
    public static List<BlockFamily> LOG_FAMILIES = new ArrayList<>();
    public static List<BlockFamily> WOOD_FAMILIES = new ArrayList<>();

    public static final BlockFamily ASPEN_LOG = logFamily(new BlockFamily.Builder(BWGWood.ASPEN.logstem())
            .stairs(BOWoodBlocks.ASPEN_LOG_STAIRS.get())
            .slab(BOWoodBlocks.ASPEN_LOG_SLAB.get()));
    public static final BlockFamily ASPEN_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.ASPEN.wood())
            .stairs(BOWoodBlocks.ASPEN_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.ASPEN_WOOD_SLAB.get())
            .wall(BOWoodBlocks.ASPEN_WOOD_WALL.get())
            .fence(BOWoodBlocks.ASPEN_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.ASPEN_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_ASPEN_LOG = logFamily(new BlockFamily.Builder(BWGWood.ASPEN.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_ASPEN_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_ASPEN_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_ASPEN_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.ASPEN.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_ASPEN_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_ASPEN_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE.get()));

    public static final BlockFamily BAOBAB_LOG = logFamily(new BlockFamily.Builder(BWGWood.BAOBAB.logstem())
            .stairs(BOWoodBlocks.BAOBAB_LOG_STAIRS.get())
            .slab(BOWoodBlocks.BAOBAB_LOG_SLAB.get()));
    public static final BlockFamily BAOBAB_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.BAOBAB.wood())
            .stairs(BOWoodBlocks.BAOBAB_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.BAOBAB_WOOD_SLAB.get())
            .wall(BOWoodBlocks.BAOBAB_WOOD_WALL.get())
            .fence(BOWoodBlocks.BAOBAB_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.BAOBAB_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_BAOBAB_LOG = logFamily(new BlockFamily.Builder(BWGWood.BAOBAB.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_BAOBAB_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_BAOBAB_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_BAOBAB_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.BAOBAB.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_BAOBAB_WOOD_FENCE_GATE.get()));

    private static BlockFamily logFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }

        LOG_FAMILIES.add(family);
        return family;
    }

    private static BlockFamily woodFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }
        if (!variants.containsKey(BlockFamily.Variant.WALL)) {
            throw new UnsupportedOperationException("missing slab");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE)) {
            throw new UnsupportedOperationException("missing slab");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE_GATE)) {
            throw new UnsupportedOperationException("missing slab");
        }

        WOOD_FAMILIES.add(family);
        return family;
    }
}
