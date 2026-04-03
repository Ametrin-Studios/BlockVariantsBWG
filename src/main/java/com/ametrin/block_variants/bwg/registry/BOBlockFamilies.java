package com.ametrin.block_variants.bwg.registry;

import net.minecraft.data.BlockFamily;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import java.util.ArrayList;
import java.util.List;

public final class BOBlockFamilies {
    public static List<BlockFamily> LOG_FAMILIES = new ArrayList<>();
    public static List<BlockFamily> WOOD_FAMILIES = new ArrayList<>();

    // Aspen
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

    // Baobab
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

    // Blue Enchanted
    public static final BlockFamily BLUE_ENCHANTED_LOG = logFamily(new BlockFamily.Builder(BWGWood.BLUE_ENCHANTED.logstem())
            .stairs(BOWoodBlocks.BLUE_ENCHANTED_LOG_STAIRS.get())
            .slab(BOWoodBlocks.BLUE_ENCHANTED_LOG_SLAB.get()));
    public static final BlockFamily BLUE_ENCHANTED_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.BLUE_ENCHANTED.wood())
            .stairs(BOWoodBlocks.BLUE_ENCHANTED_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.BLUE_ENCHANTED_WOOD_SLAB.get())
            .wall(BOWoodBlocks.BLUE_ENCHANTED_WOOD_WALL.get())
            .fence(BOWoodBlocks.BLUE_ENCHANTED_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.BLUE_ENCHANTED_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_BLUE_ENCHANTED_LOG = logFamily(new BlockFamily.Builder(BWGWood.BLUE_ENCHANTED.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_BLUE_ENCHANTED_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.BLUE_ENCHANTED.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_BLUE_ENCHANTED_WOOD_FENCE_GATE.get()));

    // Cika
    public static final BlockFamily CIKA_LOG = logFamily(new BlockFamily.Builder(BWGWood.CIKA.logstem())
            .stairs(BOWoodBlocks.CIKA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.CIKA_LOG_SLAB.get()));
    public static final BlockFamily CIKA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.CIKA.wood())
            .stairs(BOWoodBlocks.CIKA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.CIKA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.CIKA_WOOD_WALL.get())
            .fence(BOWoodBlocks.CIKA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.CIKA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CIKA_LOG = logFamily(new BlockFamily.Builder(BWGWood.CIKA.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_CIKA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_CIKA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_CIKA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.CIKA.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_CIKA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_CIKA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_CIKA_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_CIKA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_CIKA_WOOD_FENCE_GATE.get()));

    // Cypress
    public static final BlockFamily CYPRESS_LOG = logFamily(new BlockFamily.Builder(BWGWood.CYPRESS.logstem())
            .stairs(BOWoodBlocks.CYPRESS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.CYPRESS_LOG_SLAB.get()));
    public static final BlockFamily CYPRESS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.CYPRESS.wood())
            .stairs(BOWoodBlocks.CYPRESS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.CYPRESS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.CYPRESS_WOOD_WALL.get())
            .fence(BOWoodBlocks.CYPRESS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.CYPRESS_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CYPRESS_LOG = logFamily(new BlockFamily.Builder(BWGWood.CYPRESS.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_CYPRESS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_CYPRESS_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_CYPRESS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.CYPRESS.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_CYPRESS_WOOD_FENCE_GATE.get()));

    // Ebony
    public static final BlockFamily EBONY_LOG = logFamily(new BlockFamily.Builder(BWGWood.EBONY.logstem())
            .stairs(BOWoodBlocks.EBONY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.EBONY_LOG_SLAB.get()));
    public static final BlockFamily EBONY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.EBONY.wood())
            .stairs(BOWoodBlocks.EBONY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.EBONY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.EBONY_WOOD_WALL.get())
            .fence(BOWoodBlocks.EBONY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.EBONY_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_EBONY_LOG = logFamily(new BlockFamily.Builder(BWGWood.EBONY.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_EBONY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_EBONY_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_EBONY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.EBONY.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_EBONY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_EBONY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_EBONY_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_EBONY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_EBONY_WOOD_FENCE_GATE.get()));

    // Fir
    public static final BlockFamily FIR_LOG = logFamily(new BlockFamily.Builder(BWGWood.FIR.logstem())
            .stairs(BOWoodBlocks.FIR_LOG_STAIRS.get())
            .slab(BOWoodBlocks.FIR_LOG_SLAB.get()));
    public static final BlockFamily FIR_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.FIR.wood())
            .stairs(BOWoodBlocks.FIR_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.FIR_WOOD_SLAB.get())
            .wall(BOWoodBlocks.FIR_WOOD_WALL.get())
            .fence(BOWoodBlocks.FIR_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.FIR_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_FIR_LOG = logFamily(new BlockFamily.Builder(BWGWood.FIR.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_FIR_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_FIR_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_FIR_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.FIR.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_FIR_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_FIR_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_FIR_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_FIR_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_FIR_WOOD_FENCE_GATE.get()));

    // Florus
    public static final BlockFamily FLORUS_LOG = logFamily(new BlockFamily.Builder(BWGWood.FLORUS.logstem())
            .stairs(BOWoodBlocks.FLORUS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.FLORUS_LOG_SLAB.get()));
    public static final BlockFamily FLORUS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.FLORUS.wood())
            .stairs(BOWoodBlocks.FLORUS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.FLORUS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.FLORUS_WOOD_WALL.get())
            .fence(BOWoodBlocks.FLORUS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.FLORUS_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_FLORUS_LOG = logFamily(new BlockFamily.Builder(BWGWood.FLORUS.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_FLORUS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_FLORUS_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_FLORUS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.FLORUS.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_FLORUS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_FLORUS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_FLORUS_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_FLORUS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_FLORUS_WOOD_FENCE_GATE.get()));

    // Green Enchanted
    public static final BlockFamily GREEN_ENCHANTED_LOG = logFamily(new BlockFamily.Builder(BWGWood.GREEN_ENCHANTED.logstem())
            .stairs(BOWoodBlocks.GREEN_ENCHANTED_LOG_STAIRS.get())
            .slab(BOWoodBlocks.GREEN_ENCHANTED_LOG_SLAB.get()));
    public static final BlockFamily GREEN_ENCHANTED_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.GREEN_ENCHANTED.wood())
            .stairs(BOWoodBlocks.GREEN_ENCHANTED_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.GREEN_ENCHANTED_WOOD_SLAB.get())
            .wall(BOWoodBlocks.GREEN_ENCHANTED_WOOD_WALL.get())
            .fence(BOWoodBlocks.GREEN_ENCHANTED_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.GREEN_ENCHANTED_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_GREEN_ENCHANTED_LOG = logFamily(new BlockFamily.Builder(BWGWood.GREEN_ENCHANTED.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_GREEN_ENCHANTED_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.GREEN_ENCHANTED.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_GREEN_ENCHANTED_WOOD_FENCE_GATE.get()));

    // Holly
    public static final BlockFamily HOLLY_LOG = logFamily(new BlockFamily.Builder(BWGWood.HOLLY.logstem())
            .stairs(BOWoodBlocks.HOLLY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.HOLLY_LOG_SLAB.get()));
    public static final BlockFamily HOLLY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.HOLLY.wood())
            .stairs(BOWoodBlocks.HOLLY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.HOLLY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.HOLLY_WOOD_WALL.get())
            .fence(BOWoodBlocks.HOLLY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.HOLLY_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_HOLLY_LOG = logFamily(new BlockFamily.Builder(BWGWood.HOLLY.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_HOLLY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_HOLLY_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_HOLLY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.HOLLY.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_HOLLY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_HOLLY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_HOLLY_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_HOLLY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_HOLLY_WOOD_FENCE_GATE.get()));

    // Ironwood
    public static final BlockFamily IRONWOOD_LOG = logFamily(new BlockFamily.Builder(BWGWood.IRONWOOD.logstem())
            .stairs(BOWoodBlocks.IRONWOOD_LOG_STAIRS.get())
            .slab(BOWoodBlocks.IRONWOOD_LOG_SLAB.get()));
    public static final BlockFamily IRONWOOD_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.IRONWOOD.wood())
            .stairs(BOWoodBlocks.IRONWOOD_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.IRONWOOD_WOOD_SLAB.get())
            .wall(BOWoodBlocks.IRONWOOD_WOOD_WALL.get())
            .fence(BOWoodBlocks.IRONWOOD_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.IRONWOOD_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_IRONWOOD_LOG = logFamily(new BlockFamily.Builder(BWGWood.IRONWOOD.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_IRONWOOD_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_IRONWOOD_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_IRONWOOD_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.IRONWOOD.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_IRONWOOD_WOOD_FENCE_GATE.get()));

    // Jacaranda
    public static final BlockFamily JACARANDA_LOG = logFamily(new BlockFamily.Builder(BWGWood.JACARANDA.logstem())
            .stairs(BOWoodBlocks.JACARANDA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.JACARANDA_LOG_SLAB.get()));
    public static final BlockFamily JACARANDA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.JACARANDA.wood())
            .stairs(BOWoodBlocks.JACARANDA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.JACARANDA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.JACARANDA_WOOD_WALL.get())
            .fence(BOWoodBlocks.JACARANDA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.JACARANDA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_JACARANDA_LOG = logFamily(new BlockFamily.Builder(BWGWood.JACARANDA.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_JACARANDA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_JACARANDA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_JACARANDA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.JACARANDA.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_JACARANDA_WOOD_FENCE_GATE.get()));

    // Mahogany
    public static final BlockFamily MAHOGANY_LOG = logFamily(new BlockFamily.Builder(BWGWood.MAHOGANY.logstem())
            .stairs(BOWoodBlocks.MAHOGANY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.MAHOGANY_LOG_SLAB.get()));
    public static final BlockFamily MAHOGANY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.MAHOGANY.wood())
            .stairs(BOWoodBlocks.MAHOGANY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.MAHOGANY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.MAHOGANY_WOOD_WALL.get())
            .fence(BOWoodBlocks.MAHOGANY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.MAHOGANY_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_MAHOGANY_LOG = logFamily(new BlockFamily.Builder(BWGWood.MAHOGANY.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_MAHOGANY_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_MAHOGANY_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_MAHOGANY_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.MAHOGANY.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_MAHOGANY_WOOD_FENCE_GATE.get()));

    // Maple
    public static final BlockFamily MAPLE_LOG = logFamily(new BlockFamily.Builder(BWGWood.MAPLE.logstem())
            .stairs(BOWoodBlocks.MAPLE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.MAPLE_LOG_SLAB.get()));
    public static final BlockFamily MAPLE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.MAPLE.wood())
            .stairs(BOWoodBlocks.MAPLE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.MAPLE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.MAPLE_WOOD_WALL.get())
            .fence(BOWoodBlocks.MAPLE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.MAPLE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_MAPLE_LOG = logFamily(new BlockFamily.Builder(BWGWood.MAPLE.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_MAPLE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_MAPLE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_MAPLE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.MAPLE.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_MAPLE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_MAPLE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_MAPLE_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_MAPLE_WOOD_FENCE_GATE.get()));

    // Palm
    public static final BlockFamily PALM_LOG = logFamily(new BlockFamily.Builder(BWGWood.PALM.logstem())
            .stairs(BOWoodBlocks.PALM_LOG_STAIRS.get())
            .slab(BOWoodBlocks.PALM_LOG_SLAB.get()));
    public static final BlockFamily PALM_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.PALM.wood())
            .stairs(BOWoodBlocks.PALM_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.PALM_WOOD_SLAB.get())
            .wall(BOWoodBlocks.PALM_WOOD_WALL.get())
            .fence(BOWoodBlocks.PALM_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.PALM_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_PALM_LOG = logFamily(new BlockFamily.Builder(BWGWood.PALM.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_PALM_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_PALM_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_PALM_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.PALM.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_PALM_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_PALM_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_PALM_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_PALM_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_PALM_WOOD_FENCE_GATE.get()));

    // Pine
    public static final BlockFamily PINE_LOG = logFamily(new BlockFamily.Builder(BWGWood.PINE.logstem())
            .stairs(BOWoodBlocks.PINE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.PINE_LOG_SLAB.get()));
    public static final BlockFamily PINE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.PINE.wood())
            .stairs(BOWoodBlocks.PINE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.PINE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.PINE_WOOD_WALL.get())
            .fence(BOWoodBlocks.PINE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.PINE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_PINE_LOG = logFamily(new BlockFamily.Builder(BWGWood.PINE.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_PINE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_PINE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_PINE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.PINE.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_PINE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_PINE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_PINE_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_PINE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_PINE_WOOD_FENCE_GATE.get()));

    // Rainbow Eucalyptus
    public static final BlockFamily RAINBOW_EUCALYPTUS_LOG = logFamily(new BlockFamily.Builder(BWGWood.RAINBOW_EUCALYPTUS.logstem())
            .stairs(BOWoodBlocks.RAINBOW_EUCALYPTUS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.RAINBOW_EUCALYPTUS_LOG_SLAB.get()));
    public static final BlockFamily RAINBOW_EUCALYPTUS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.RAINBOW_EUCALYPTUS.wood())
            .stairs(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_WALL.get())
            .fence(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_RAINBOW_EUCALYPTUS_LOG = logFamily(new BlockFamily.Builder(BWGWood.RAINBOW_EUCALYPTUS.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_RAINBOW_EUCALYPTUS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.RAINBOW_EUCALYPTUS.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE.get()));

    // Redwood
    public static final BlockFamily REDWOOD_LOG = logFamily(new BlockFamily.Builder(BWGWood.REDWOOD.logstem())
            .stairs(BOWoodBlocks.REDWOOD_LOG_STAIRS.get())
            .slab(BOWoodBlocks.REDWOOD_LOG_SLAB.get()));
    public static final BlockFamily REDWOOD_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.REDWOOD.wood())
            .stairs(BOWoodBlocks.REDWOOD_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.REDWOOD_WOOD_SLAB.get())
            .wall(BOWoodBlocks.REDWOOD_WOOD_WALL.get())
            .fence(BOWoodBlocks.REDWOOD_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.REDWOOD_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_REDWOOD_LOG = logFamily(new BlockFamily.Builder(BWGWood.REDWOOD.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_REDWOOD_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_REDWOOD_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_REDWOOD_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.REDWOOD.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_REDWOOD_WOOD_FENCE_GATE.get()));

    // Sakura
    public static final BlockFamily SAKURA_LOG = logFamily(new BlockFamily.Builder(BWGWood.SAKURA.logstem())
            .stairs(BOWoodBlocks.SAKURA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.SAKURA_LOG_SLAB.get()));
    public static final BlockFamily SAKURA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SAKURA.wood())
            .stairs(BOWoodBlocks.SAKURA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.SAKURA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.SAKURA_WOOD_WALL.get())
            .fence(BOWoodBlocks.SAKURA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.SAKURA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_SAKURA_LOG = logFamily(new BlockFamily.Builder(BWGWood.SAKURA.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_SAKURA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SAKURA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_SAKURA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SAKURA.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_SAKURA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SAKURA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_SAKURA_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_SAKURA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_SAKURA_WOOD_FENCE_GATE.get()));

    // Skyris
    public static final BlockFamily SKYRIS_LOG = logFamily(new BlockFamily.Builder(BWGWood.SKYRIS.logstem())
            .stairs(BOWoodBlocks.SKYRIS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.SKYRIS_LOG_SLAB.get()));
    public static final BlockFamily SKYRIS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SKYRIS.wood())
            .stairs(BOWoodBlocks.SKYRIS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.SKYRIS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.SKYRIS_WOOD_WALL.get())
            .fence(BOWoodBlocks.SKYRIS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.SKYRIS_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_SKYRIS_LOG = logFamily(new BlockFamily.Builder(BWGWood.SKYRIS.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_SKYRIS_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SKYRIS_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_SKYRIS_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SKYRIS.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_SKYRIS_WOOD_FENCE_GATE.get()));

    // Spirit
    public static final BlockFamily SPIRIT_LOG = logFamily(new BlockFamily.Builder(BWGWood.SPIRIT.logstem())
            .stairs(BOWoodBlocks.SPIRIT_LOG_STAIRS.get())
            .slab(BOWoodBlocks.SPIRIT_LOG_SLAB.get()));
    public static final BlockFamily SPIRIT_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SPIRIT.wood())
            .stairs(BOWoodBlocks.SPIRIT_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.SPIRIT_WOOD_SLAB.get())
            .wall(BOWoodBlocks.SPIRIT_WOOD_WALL.get())
            .fence(BOWoodBlocks.SPIRIT_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.SPIRIT_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_SPIRIT_LOG = logFamily(new BlockFamily.Builder(BWGWood.SPIRIT.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_SPIRIT_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SPIRIT_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_SPIRIT_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.SPIRIT.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_SPIRIT_WOOD_FENCE_GATE.get()));

    // White Mangrove
    public static final BlockFamily WHITE_MANGROVE_LOG = logFamily(new BlockFamily.Builder(BWGWood.WHITE_MANGROVE.logstem())
            .stairs(BOWoodBlocks.WHITE_MANGROVE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.WHITE_MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily WHITE_MANGROVE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WHITE_MANGROVE.wood())
            .stairs(BOWoodBlocks.WHITE_MANGROVE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.WHITE_MANGROVE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.WHITE_MANGROVE_WOOD_WALL.get())
            .fence(BOWoodBlocks.WHITE_MANGROVE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.WHITE_MANGROVE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_WHITE_MANGROVE_LOG = logFamily(new BlockFamily.Builder(BWGWood.WHITE_MANGROVE.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_WHITE_MANGROVE_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WHITE_MANGROVE.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_WHITE_MANGROVE_WOOD_FENCE_GATE.get()));

    // Willow
    public static final BlockFamily WILLOW_LOG = logFamily(new BlockFamily.Builder(BWGWood.WILLOW.logstem())
            .stairs(BOWoodBlocks.WILLOW_LOG_STAIRS.get())
            .slab(BOWoodBlocks.WILLOW_LOG_SLAB.get()));
    public static final BlockFamily WILLOW_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WILLOW.wood())
            .stairs(BOWoodBlocks.WILLOW_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.WILLOW_WOOD_SLAB.get())
            .wall(BOWoodBlocks.WILLOW_WOOD_WALL.get())
            .fence(BOWoodBlocks.WILLOW_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.WILLOW_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_WILLOW_LOG = logFamily(new BlockFamily.Builder(BWGWood.WILLOW.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_WILLOW_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WILLOW_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_WILLOW_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WILLOW.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_WILLOW_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WILLOW_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_WILLOW_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_WILLOW_WOOD_FENCE_GATE.get()));

    // Witch Hazel
    public static final BlockFamily WITCH_HAZEL_LOG = logFamily(new BlockFamily.Builder(BWGWood.WITCH_HAZEL.logstem())
            .stairs(BOWoodBlocks.WITCH_HAZEL_LOG_STAIRS.get())
            .slab(BOWoodBlocks.WITCH_HAZEL_LOG_SLAB.get()));
    public static final BlockFamily WITCH_HAZEL_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WITCH_HAZEL.wood())
            .stairs(BOWoodBlocks.WITCH_HAZEL_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.WITCH_HAZEL_WOOD_SLAB.get())
            .wall(BOWoodBlocks.WITCH_HAZEL_WOOD_WALL.get())
            .fence(BOWoodBlocks.WITCH_HAZEL_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.WITCH_HAZEL_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_WITCH_HAZEL_LOG = logFamily(new BlockFamily.Builder(BWGWood.WITCH_HAZEL.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_WITCH_HAZEL_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WITCH_HAZEL_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_WITCH_HAZEL_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.WITCH_HAZEL.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_WITCH_HAZEL_WOOD_FENCE_GATE.get()));

    // Zelkova
    public static final BlockFamily ZELKOVA_LOG = logFamily(new BlockFamily.Builder(BWGWood.ZELKOVA.logstem())
            .stairs(BOWoodBlocks.ZELKOVA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.ZELKOVA_LOG_SLAB.get()));
    public static final BlockFamily ZELKOVA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.ZELKOVA.wood())
            .stairs(BOWoodBlocks.ZELKOVA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.ZELKOVA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.ZELKOVA_WOOD_WALL.get())
            .fence(BOWoodBlocks.ZELKOVA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.ZELKOVA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_ZELKOVA_LOG = logFamily(new BlockFamily.Builder(BWGWood.ZELKOVA.strippedLogStem())
            .stairs(BOWoodBlocks.STRIPPED_ZELKOVA_LOG_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_ZELKOVA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_ZELKOVA_WOOD = woodFamily(new BlockFamily.Builder(BWGWood.ZELKOVA.strippedWood())
            .stairs(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_STAIRS.get())
            .slab(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_SLAB.get())
            .wall(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_WALL.get())
            .fence(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_FENCE.get())
            .fenceGate(BOWoodBlocks.STRIPPED_ZELKOVA_WOOD_FENCE_GATE.get()));


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
            throw new UnsupportedOperationException("missing wall");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE)) {
            throw new UnsupportedOperationException("missing fence");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE_GATE)) {
            throw new UnsupportedOperationException("missing fence gate");
        }

        WOOD_FAMILIES.add(family);
        return family;
    }
}
