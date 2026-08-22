package com.ametrin.block_variants.bwg.registry;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWood;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class BOWoodBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariantsBWGIntegration.MOD_ID);

    // ASPEN
    public static final DeferredBlock<StairBlock> ASPEN_LOG_STAIRS = register("aspen_log_stairs", properties -> new StairBlock(BWGWood.ASPEN.logstem().defaultBlockState(), properties.mapColor(BWGWood.ASPEN.logstem().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<SlabBlock> ASPEN_LOG_SLAB = register("aspen_log_slab", properties -> new SlabBlock(properties.mapColor(BWGWood.ASPEN.logstem().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StairBlock> STRIPPED_ASPEN_LOG_STAIRS = register("stripped_aspen_log_stairs", properties -> new StairBlock(BWGWood.ASPEN.strippedLogStem().defaultBlockState(), properties.mapColor(BWGWood.ASPEN.strippedLogStem().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_ASPEN_LOG_SLAB = register("stripped_aspen_log_slab", properties -> new SlabBlock(properties.mapColor(BWGWood.ASPEN.strippedLogStem().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<StairBlock> ASPEN_WOOD_STAIRS = register("aspen_wood_stairs", properties -> new StairBlock(BWGWood.ASPEN.wood().defaultBlockState(), properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<SlabBlock> ASPEN_WOOD_SLAB = register("aspen_wood_slab", properties -> new SlabBlock(properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<WallBlock> ASPEN_WOOD_WALL = register("aspen_wood_wall", properties -> new WallBlock(properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<FenceBlock> ASPEN_WOOD_FENCE = register("aspen_wood_fence", properties -> new FenceBlock(properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<FenceGateBlock> ASPEN_WOOD_FENCE_GATE = register("aspen_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ASPEN.woodType(), properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_ASPEN_WOOD_STAIRS = register("stripped_aspen_wood_stairs", properties -> new StairBlock(BWGWood.ASPEN.strippedWood().defaultBlockState(), properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_ASPEN_WOOD_SLAB = register("stripped_aspen_wood_slab", properties -> new SlabBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<WallBlock> STRIPPED_ASPEN_WOOD_WALL = register("stripped_aspen_wood_wall", properties -> new WallBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceBlock> STRIPPED_ASPEN_WOOD_FENCE = register("stripped_aspen_wood_fence", properties -> new FenceBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ASPEN_WOOD_FENCE_GATE = register("stripped_aspen_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ASPEN.woodType(), properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).forceSolidOn());

    // Baobab
    public static final DeferredBlock<StairBlock> BAOBAB_LOG_STAIRS = register("baobab_log_stairs", properties -> new StairBlock(BWGWood.BAOBAB.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<SlabBlock> BAOBAB_LOG_SLAB = register("baobab_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_BAOBAB_LOG_STAIRS = register("stripped_baobab_log_stairs", properties -> new StairBlock(BWGWood.BAOBAB.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAOBAB_LOG_SLAB = register("stripped_baobab_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<StairBlock> BAOBAB_WOOD_STAIRS = register("baobab_wood_stairs", properties -> new StairBlock(BWGWood.BAOBAB.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<SlabBlock> BAOBAB_WOOD_SLAB = register("baobab_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<WallBlock> BAOBAB_WOOD_WALL = register("baobab_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<FenceBlock> BAOBAB_WOOD_FENCE = register("baobab_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<FenceGateBlock> BAOBAB_WOOD_FENCE_GATE = register("baobab_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BAOBAB.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_BAOBAB_WOOD_STAIRS = register("stripped_baobab_wood_stairs", properties -> new StairBlock(BWGWood.BAOBAB.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAOBAB_WOOD_SLAB = register("stripped_baobab_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_BAOBAB_WOOD_WALL = register("stripped_baobab_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_BAOBAB_WOOD_FENCE = register("stripped_baobab_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BAOBAB_WOOD_FENCE_GATE = register("stripped_baobab_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BAOBAB.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()).forceSolidOn());

    // Blue Enchanted
    public static final DeferredBlock<StairBlock> BLUE_ENCHANTED_LOG_STAIRS = register("blue_enchanted_log_stairs", properties -> new StairBlock(BWGWood.BLUE_ENCHANTED.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<SlabBlock> BLUE_ENCHANTED_LOG_SLAB = register("blue_enchanted_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_BLUE_ENCHANTED_LOG_STAIRS = register("stripped_blue_enchanted_log_stairs", properties -> new StairBlock(BWGWood.BLUE_ENCHANTED.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BLUE_ENCHANTED_LOG_SLAB = register("stripped_blue_enchanted_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<StairBlock> BLUE_ENCHANTED_WOOD_STAIRS = register("blue_enchanted_wood_stairs", properties -> new StairBlock(BWGWood.BLUE_ENCHANTED.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<SlabBlock> BLUE_ENCHANTED_WOOD_SLAB = register("blue_enchanted_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<WallBlock> BLUE_ENCHANTED_WOOD_WALL = register("blue_enchanted_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<FenceBlock> BLUE_ENCHANTED_WOOD_FENCE = register("blue_enchanted_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()));
    public static final DeferredBlock<FenceGateBlock> BLUE_ENCHANTED_WOOD_FENCE_GATE = register("blue_enchanted_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BLUE_ENCHANTED.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_BLUE_ENCHANTED_WOOD_STAIRS = register("stripped_blue_enchanted_wood_stairs", properties -> new StairBlock(BWGWood.BLUE_ENCHANTED.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BLUE_ENCHANTED_WOOD_SLAB = register("stripped_blue_enchanted_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_BLUE_ENCHANTED_WOOD_WALL = register("stripped_blue_enchanted_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_BLUE_ENCHANTED_WOOD_FENCE = register("stripped_blue_enchanted_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BLUE_ENCHANTED_WOOD_FENCE_GATE = register("stripped_blue_enchanted_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BLUE_ENCHANTED.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BLUE_ENCHANTED.strippedWood()).forceSolidOn());

    // Cika
    public static final DeferredBlock<StairBlock> CIKA_LOG_STAIRS = register("cika_log_stairs", properties -> new StairBlock(BWGWood.CIKA.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<SlabBlock> CIKA_LOG_SLAB = register("cika_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_CIKA_LOG_STAIRS = register("stripped_cika_log_stairs", properties -> new StairBlock(BWGWood.CIKA.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_CIKA_LOG_SLAB = register("stripped_cika_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<StairBlock> CIKA_WOOD_STAIRS = register("cika_wood_stairs", properties -> new StairBlock(BWGWood.CIKA.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<SlabBlock> CIKA_WOOD_SLAB = register("cika_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<WallBlock> CIKA_WOOD_WALL = register("cika_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<FenceBlock> CIKA_WOOD_FENCE = register("cika_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()));
    public static final DeferredBlock<FenceGateBlock> CIKA_WOOD_FENCE_GATE = register("cika_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.CIKA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_CIKA_WOOD_STAIRS = register("stripped_cika_wood_stairs", properties -> new StairBlock(BWGWood.CIKA.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_CIKA_WOOD_SLAB = register("stripped_cika_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_CIKA_WOOD_WALL = register("stripped_cika_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_CIKA_WOOD_FENCE = register("stripped_cika_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CIKA_WOOD_FENCE_GATE = register("stripped_cika_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.CIKA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CIKA.strippedWood()).forceSolidOn());

    // Cypress
    public static final DeferredBlock<StairBlock> CYPRESS_LOG_STAIRS = register("cypress_log_stairs", properties -> new StairBlock(BWGWood.CYPRESS.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<SlabBlock> CYPRESS_LOG_SLAB = register("cypress_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_CYPRESS_LOG_STAIRS = register("stripped_cypress_log_stairs", properties -> new StairBlock(BWGWood.CYPRESS.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_CYPRESS_LOG_SLAB = register("stripped_cypress_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<StairBlock> CYPRESS_WOOD_STAIRS = register("cypress_wood_stairs", properties -> new StairBlock(BWGWood.CYPRESS.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<SlabBlock> CYPRESS_WOOD_SLAB = register("cypress_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<WallBlock> CYPRESS_WOOD_WALL = register("cypress_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<FenceBlock> CYPRESS_WOOD_FENCE = register("cypress_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()));
    public static final DeferredBlock<FenceGateBlock> CYPRESS_WOOD_FENCE_GATE = register("cypress_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.CYPRESS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_CYPRESS_WOOD_STAIRS = register("stripped_cypress_wood_stairs", properties -> new StairBlock(BWGWood.CYPRESS.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_CYPRESS_WOOD_SLAB = register("stripped_cypress_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_CYPRESS_WOOD_WALL = register("stripped_cypress_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_CYPRESS_WOOD_FENCE = register("stripped_cypress_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CYPRESS_WOOD_FENCE_GATE = register("stripped_cypress_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.CYPRESS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.CYPRESS.strippedWood()).forceSolidOn());

    // Ebony
    public static final DeferredBlock<StairBlock> EBONY_LOG_STAIRS = register("ebony_log_stairs", properties -> new StairBlock(BWGWood.EBONY.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<SlabBlock> EBONY_LOG_SLAB = register("ebony_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_EBONY_LOG_STAIRS = register("stripped_ebony_log_stairs", properties -> new StairBlock(BWGWood.EBONY.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_EBONY_LOG_SLAB = register("stripped_ebony_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<StairBlock> EBONY_WOOD_STAIRS = register("ebony_wood_stairs", properties -> new StairBlock(BWGWood.EBONY.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<SlabBlock> EBONY_WOOD_SLAB = register("ebony_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<WallBlock> EBONY_WOOD_WALL = register("ebony_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<FenceBlock> EBONY_WOOD_FENCE = register("ebony_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()));
    public static final DeferredBlock<FenceGateBlock> EBONY_WOOD_FENCE_GATE = register("ebony_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.EBONY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_EBONY_WOOD_STAIRS = register("stripped_ebony_wood_stairs", properties -> new StairBlock(BWGWood.EBONY.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_EBONY_WOOD_SLAB = register("stripped_ebony_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_EBONY_WOOD_WALL = register("stripped_ebony_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_EBONY_WOOD_FENCE = register("stripped_ebony_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_EBONY_WOOD_FENCE_GATE = register("stripped_ebony_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.EBONY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.EBONY.strippedWood()).forceSolidOn());

    // Fir
    public static final DeferredBlock<StairBlock> FIR_LOG_STAIRS = register("fir_log_stairs", properties -> new StairBlock(BWGWood.FIR.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<SlabBlock> FIR_LOG_SLAB = register("fir_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_FIR_LOG_STAIRS = register("stripped_fir_log_stairs", properties -> new StairBlock(BWGWood.FIR.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_FIR_LOG_SLAB = register("stripped_fir_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<StairBlock> FIR_WOOD_STAIRS = register("fir_wood_stairs", properties -> new StairBlock(BWGWood.FIR.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<SlabBlock> FIR_WOOD_SLAB = register("fir_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<WallBlock> FIR_WOOD_WALL = register("fir_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<FenceBlock> FIR_WOOD_FENCE = register("fir_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()));
    public static final DeferredBlock<FenceGateBlock> FIR_WOOD_FENCE_GATE = register("fir_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.FIR.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_FIR_WOOD_STAIRS = register("stripped_fir_wood_stairs", properties -> new StairBlock(BWGWood.FIR.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_FIR_WOOD_SLAB = register("stripped_fir_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_FIR_WOOD_WALL = register("stripped_fir_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_FIR_WOOD_FENCE = register("stripped_fir_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_FIR_WOOD_FENCE_GATE = register("stripped_fir_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.FIR.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FIR.strippedWood()).forceSolidOn());

    // Florus
    public static final DeferredBlock<StairBlock> FLORUS_LOG_STAIRS = register("florus_stem_stairs", properties -> new StairBlock(BWGWood.FLORUS.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<SlabBlock> FLORUS_LOG_SLAB = register("florus_stem_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_FLORUS_LOG_STAIRS = register("stripped_florus_stem_stairs", properties -> new StairBlock(BWGWood.FLORUS.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_FLORUS_LOG_SLAB = register("stripped_florus_stem_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<StairBlock> FLORUS_WOOD_STAIRS = register("florus_wood_stairs", properties -> new StairBlock(BWGWood.FLORUS.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<SlabBlock> FLORUS_WOOD_SLAB = register("florus_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<WallBlock> FLORUS_WOOD_WALL = register("florus_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<FenceBlock> FLORUS_WOOD_FENCE = register("florus_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()));
    public static final DeferredBlock<FenceGateBlock> FLORUS_WOOD_FENCE_GATE = register("florus_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.FLORUS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_FLORUS_WOOD_STAIRS = register("stripped_florus_wood_stairs", properties -> new StairBlock(BWGWood.FLORUS.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_FLORUS_WOOD_SLAB = register("stripped_florus_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_FLORUS_WOOD_WALL = register("stripped_florus_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_FLORUS_WOOD_FENCE = register("stripped_florus_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_FLORUS_WOOD_FENCE_GATE = register("stripped_florus_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.FLORUS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.FLORUS.strippedWood()).forceSolidOn());

    // Green Enchanted
    public static final DeferredBlock<StairBlock> GREEN_ENCHANTED_LOG_STAIRS = register("green_enchanted_log_stairs", properties -> new StairBlock(BWGWood.GREEN_ENCHANTED.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<SlabBlock> GREEN_ENCHANTED_LOG_SLAB = register("green_enchanted_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_GREEN_ENCHANTED_LOG_STAIRS = register("stripped_green_enchanted_log_stairs", properties -> new StairBlock(BWGWood.GREEN_ENCHANTED.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_GREEN_ENCHANTED_LOG_SLAB = register("stripped_green_enchanted_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<StairBlock> GREEN_ENCHANTED_WOOD_STAIRS = register("green_enchanted_wood_stairs", properties -> new StairBlock(BWGWood.GREEN_ENCHANTED.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<SlabBlock> GREEN_ENCHANTED_WOOD_SLAB = register("green_enchanted_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<WallBlock> GREEN_ENCHANTED_WOOD_WALL = register("green_enchanted_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<FenceBlock> GREEN_ENCHANTED_WOOD_FENCE = register("green_enchanted_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()));
    public static final DeferredBlock<FenceGateBlock> GREEN_ENCHANTED_WOOD_FENCE_GATE = register("green_enchanted_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.GREEN_ENCHANTED.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_GREEN_ENCHANTED_WOOD_STAIRS = register("stripped_green_enchanted_wood_stairs", properties -> new StairBlock(BWGWood.GREEN_ENCHANTED.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_GREEN_ENCHANTED_WOOD_SLAB = register("stripped_green_enchanted_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_GREEN_ENCHANTED_WOOD_WALL = register("stripped_green_enchanted_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_GREEN_ENCHANTED_WOOD_FENCE = register("stripped_green_enchanted_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_GREEN_ENCHANTED_WOOD_FENCE_GATE = register("stripped_green_enchanted_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.GREEN_ENCHANTED.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.GREEN_ENCHANTED.strippedWood()).forceSolidOn());

    // Holly
    public static final DeferredBlock<StairBlock> HOLLY_LOG_STAIRS = register("holly_log_stairs", properties -> new StairBlock(BWGWood.HOLLY.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<SlabBlock> HOLLY_LOG_SLAB = register("holly_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_HOLLY_LOG_STAIRS = register("stripped_holly_log_stairs", properties -> new StairBlock(BWGWood.HOLLY.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_HOLLY_LOG_SLAB = register("stripped_holly_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<StairBlock> HOLLY_WOOD_STAIRS = register("holly_wood_stairs", properties -> new StairBlock(BWGWood.HOLLY.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<SlabBlock> HOLLY_WOOD_SLAB = register("holly_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<WallBlock> HOLLY_WOOD_WALL = register("holly_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<FenceBlock> HOLLY_WOOD_FENCE = register("holly_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()));
    public static final DeferredBlock<FenceGateBlock> HOLLY_WOOD_FENCE_GATE = register("holly_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.HOLLY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_HOLLY_WOOD_STAIRS = register("stripped_holly_wood_stairs", properties -> new StairBlock(BWGWood.HOLLY.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_HOLLY_WOOD_SLAB = register("stripped_holly_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_HOLLY_WOOD_WALL = register("stripped_holly_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_HOLLY_WOOD_FENCE = register("stripped_holly_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_HOLLY_WOOD_FENCE_GATE = register("stripped_holly_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.HOLLY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.HOLLY.strippedWood()).forceSolidOn());

    // Ironwood
    public static final DeferredBlock<StairBlock> IRONWOOD_LOG_STAIRS = register("ironwood_log_stairs", properties -> new StairBlock(BWGWood.IRONWOOD.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<SlabBlock> IRONWOOD_LOG_SLAB = register("ironwood_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_IRONWOOD_LOG_STAIRS = register("stripped_ironwood_log_stairs", properties -> new StairBlock(BWGWood.IRONWOOD.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_IRONWOOD_LOG_SLAB = register("stripped_ironwood_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<StairBlock> IRONWOOD_WOOD_STAIRS = register("ironwood_wood_stairs", properties -> new StairBlock(BWGWood.IRONWOOD.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<SlabBlock> IRONWOOD_WOOD_SLAB = register("ironwood_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<WallBlock> IRONWOOD_WOOD_WALL = register("ironwood_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<FenceBlock> IRONWOOD_WOOD_FENCE = register("ironwood_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()));
    public static final DeferredBlock<FenceGateBlock> IRONWOOD_WOOD_FENCE_GATE = register("ironwood_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.IRONWOOD.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_IRONWOOD_WOOD_STAIRS = register("stripped_ironwood_wood_stairs", properties -> new StairBlock(BWGWood.IRONWOOD.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_IRONWOOD_WOOD_SLAB = register("stripped_ironwood_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_IRONWOOD_WOOD_WALL = register("stripped_ironwood_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_IRONWOOD_WOOD_FENCE = register("stripped_ironwood_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_IRONWOOD_WOOD_FENCE_GATE = register("stripped_ironwood_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.IRONWOOD.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.IRONWOOD.strippedWood()).forceSolidOn());

    // Jacaranda
    public static final DeferredBlock<StairBlock> JACARANDA_LOG_STAIRS = register("jacaranda_log_stairs", properties -> new StairBlock(BWGWood.JACARANDA.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<SlabBlock> JACARANDA_LOG_SLAB = register("jacaranda_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_JACARANDA_LOG_STAIRS = register("stripped_jacaranda_log_stairs", properties -> new StairBlock(BWGWood.JACARANDA.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_JACARANDA_LOG_SLAB = register("stripped_jacaranda_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<StairBlock> JACARANDA_WOOD_STAIRS = register("jacaranda_wood_stairs", properties -> new StairBlock(BWGWood.JACARANDA.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<SlabBlock> JACARANDA_WOOD_SLAB = register("jacaranda_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<WallBlock> JACARANDA_WOOD_WALL = register("jacaranda_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<FenceBlock> JACARANDA_WOOD_FENCE = register("jacaranda_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()));
    public static final DeferredBlock<FenceGateBlock> JACARANDA_WOOD_FENCE_GATE = register("jacaranda_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.JACARANDA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_JACARANDA_WOOD_STAIRS = register("stripped_jacaranda_wood_stairs", properties -> new StairBlock(BWGWood.JACARANDA.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_JACARANDA_WOOD_SLAB = register("stripped_jacaranda_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_JACARANDA_WOOD_WALL = register("stripped_jacaranda_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_JACARANDA_WOOD_FENCE = register("stripped_jacaranda_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_JACARANDA_WOOD_FENCE_GATE = register("stripped_jacaranda_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.JACARANDA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.JACARANDA.strippedWood()).forceSolidOn());

    // Mahogany
    public static final DeferredBlock<StairBlock> MAHOGANY_LOG_STAIRS = register("mahogany_log_stairs", properties -> new StairBlock(BWGWood.MAHOGANY.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<SlabBlock> MAHOGANY_LOG_SLAB = register("mahogany_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_MAHOGANY_LOG_STAIRS = register("stripped_mahogany_log_stairs", properties -> new StairBlock(BWGWood.MAHOGANY.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_MAHOGANY_LOG_SLAB = register("stripped_mahogany_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<StairBlock> MAHOGANY_WOOD_STAIRS = register("mahogany_wood_stairs", properties -> new StairBlock(BWGWood.MAHOGANY.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<SlabBlock> MAHOGANY_WOOD_SLAB = register("mahogany_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<WallBlock> MAHOGANY_WOOD_WALL = register("mahogany_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<FenceBlock> MAHOGANY_WOOD_FENCE = register("mahogany_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()));
    public static final DeferredBlock<FenceGateBlock> MAHOGANY_WOOD_FENCE_GATE = register("mahogany_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.MAHOGANY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_MAHOGANY_WOOD_STAIRS = register("stripped_mahogany_wood_stairs", properties -> new StairBlock(BWGWood.MAHOGANY.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_MAHOGANY_WOOD_SLAB = register("stripped_mahogany_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_MAHOGANY_WOOD_WALL = register("stripped_mahogany_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_MAHOGANY_WOOD_FENCE = register("stripped_mahogany_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_MAHOGANY_WOOD_FENCE_GATE = register("stripped_mahogany_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.MAHOGANY.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAHOGANY.strippedWood()).forceSolidOn());

    // Maple
    public static final DeferredBlock<StairBlock> MAPLE_LOG_STAIRS = register("maple_log_stairs", properties -> new StairBlock(BWGWood.MAPLE.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<SlabBlock> MAPLE_LOG_SLAB = register("maple_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_MAPLE_LOG_STAIRS = register("stripped_maple_log_stairs", properties -> new StairBlock(BWGWood.MAPLE.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_MAPLE_LOG_SLAB = register("stripped_maple_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<StairBlock> MAPLE_WOOD_STAIRS = register("maple_wood_stairs", properties -> new StairBlock(BWGWood.MAPLE.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<SlabBlock> MAPLE_WOOD_SLAB = register("maple_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<WallBlock> MAPLE_WOOD_WALL = register("maple_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<FenceBlock> MAPLE_WOOD_FENCE = register("maple_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()));
    public static final DeferredBlock<FenceGateBlock> MAPLE_WOOD_FENCE_GATE = register("maple_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.MAPLE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_MAPLE_WOOD_STAIRS = register("stripped_maple_wood_stairs", properties -> new StairBlock(BWGWood.MAPLE.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_MAPLE_WOOD_SLAB = register("stripped_maple_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_MAPLE_WOOD_WALL = register("stripped_maple_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_MAPLE_WOOD_FENCE = register("stripped_maple_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_MAPLE_WOOD_FENCE_GATE = register("stripped_maple_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.MAPLE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.MAPLE.strippedWood()).forceSolidOn());

    // Palm
    public static final DeferredBlock<StairBlock> PALM_LOG_STAIRS = register("palm_log_stairs", properties -> new StairBlock(BWGWood.PALM.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<SlabBlock> PALM_LOG_SLAB = register("palm_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_PALM_LOG_STAIRS = register("stripped_palm_log_stairs", properties -> new StairBlock(BWGWood.PALM.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_PALM_LOG_SLAB = register("stripped_palm_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<StairBlock> PALM_WOOD_STAIRS = register("palm_wood_stairs", properties -> new StairBlock(BWGWood.PALM.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<SlabBlock> PALM_WOOD_SLAB = register("palm_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<WallBlock> PALM_WOOD_WALL = register("palm_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<FenceBlock> PALM_WOOD_FENCE = register("palm_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()));
    public static final DeferredBlock<FenceGateBlock> PALM_WOOD_FENCE_GATE = register("palm_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.PALM.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_PALM_WOOD_STAIRS = register("stripped_palm_wood_stairs", properties -> new StairBlock(BWGWood.PALM.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_PALM_WOOD_SLAB = register("stripped_palm_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_PALM_WOOD_WALL = register("stripped_palm_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_PALM_WOOD_FENCE = register("stripped_palm_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_PALM_WOOD_FENCE_GATE = register("stripped_palm_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.PALM.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PALM.strippedWood()).forceSolidOn());

    // Pine
    public static final DeferredBlock<StairBlock> PINE_LOG_STAIRS = register("pine_log_stairs", properties -> new StairBlock(BWGWood.PINE.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<SlabBlock> PINE_LOG_SLAB = register("pine_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_PINE_LOG_STAIRS = register("stripped_pine_log_stairs", properties -> new StairBlock(BWGWood.PINE.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_PINE_LOG_SLAB = register("stripped_pine_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<StairBlock> PINE_WOOD_STAIRS = register("pine_wood_stairs", properties -> new StairBlock(BWGWood.PINE.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<SlabBlock> PINE_WOOD_SLAB = register("pine_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<WallBlock> PINE_WOOD_WALL = register("pine_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<FenceBlock> PINE_WOOD_FENCE = register("pine_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()));
    public static final DeferredBlock<FenceGateBlock> PINE_WOOD_FENCE_GATE = register("pine_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.PINE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_PINE_WOOD_STAIRS = register("stripped_pine_wood_stairs", properties -> new StairBlock(BWGWood.PINE.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_PINE_WOOD_SLAB = register("stripped_pine_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_PINE_WOOD_WALL = register("stripped_pine_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_PINE_WOOD_FENCE = register("stripped_pine_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_PINE_WOOD_FENCE_GATE = register("stripped_pine_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.PINE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.PINE.strippedWood()).forceSolidOn());

    // Rainbow Eucalyptus
    public static final DeferredBlock<StairBlock> RAINBOW_EUCALYPTUS_LOG_STAIRS = register("rainbow_eucalyptus_log_stairs", properties -> new StairBlock(BWGWood.RAINBOW_EUCALYPTUS.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<SlabBlock> RAINBOW_EUCALYPTUS_LOG_SLAB = register("rainbow_eucalyptus_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_RAINBOW_EUCALYPTUS_LOG_STAIRS = register("stripped_rainbow_eucalyptus_log_stairs", properties -> new StairBlock(BWGWood.RAINBOW_EUCALYPTUS.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_RAINBOW_EUCALYPTUS_LOG_SLAB = register("stripped_rainbow_eucalyptus_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<StairBlock> RAINBOW_EUCALYPTUS_WOOD_STAIRS = register("rainbow_eucalyptus_wood_stairs", properties -> new StairBlock(BWGWood.RAINBOW_EUCALYPTUS.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<SlabBlock> RAINBOW_EUCALYPTUS_WOOD_SLAB = register("rainbow_eucalyptus_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<WallBlock> RAINBOW_EUCALYPTUS_WOOD_WALL = register("rainbow_eucalyptus_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<FenceBlock> RAINBOW_EUCALYPTUS_WOOD_FENCE = register("rainbow_eucalyptus_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()));
    public static final DeferredBlock<FenceGateBlock> RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE = register("rainbow_eucalyptus_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.RAINBOW_EUCALYPTUS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_RAINBOW_EUCALYPTUS_WOOD_STAIRS = register("stripped_rainbow_eucalyptus_wood_stairs", properties -> new StairBlock(BWGWood.RAINBOW_EUCALYPTUS.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_RAINBOW_EUCALYPTUS_WOOD_SLAB = register("stripped_rainbow_eucalyptus_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_RAINBOW_EUCALYPTUS_WOOD_WALL = register("stripped_rainbow_eucalyptus_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE = register("stripped_rainbow_eucalyptus_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_RAINBOW_EUCALYPTUS_WOOD_FENCE_GATE = register("stripped_rainbow_eucalyptus_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.RAINBOW_EUCALYPTUS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.RAINBOW_EUCALYPTUS.strippedWood()).forceSolidOn());

    // Redwood
    public static final DeferredBlock<StairBlock> REDWOOD_LOG_STAIRS = register("redwood_log_stairs", properties -> new StairBlock(BWGWood.REDWOOD.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<SlabBlock> REDWOOD_LOG_SLAB = register("redwood_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_REDWOOD_LOG_STAIRS = register("stripped_redwood_log_stairs", properties -> new StairBlock(BWGWood.REDWOOD.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_REDWOOD_LOG_SLAB = register("stripped_redwood_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<StairBlock> REDWOOD_WOOD_STAIRS = register("redwood_wood_stairs", properties -> new StairBlock(BWGWood.REDWOOD.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<SlabBlock> REDWOOD_WOOD_SLAB = register("redwood_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<WallBlock> REDWOOD_WOOD_WALL = register("redwood_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<FenceBlock> REDWOOD_WOOD_FENCE = register("redwood_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()));
    public static final DeferredBlock<FenceGateBlock> REDWOOD_WOOD_FENCE_GATE = register("redwood_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.REDWOOD.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_REDWOOD_WOOD_STAIRS = register("stripped_redwood_wood_stairs", properties -> new StairBlock(BWGWood.REDWOOD.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_REDWOOD_WOOD_SLAB = register("stripped_redwood_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_REDWOOD_WOOD_WALL = register("stripped_redwood_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_REDWOOD_WOOD_FENCE = register("stripped_redwood_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_REDWOOD_WOOD_FENCE_GATE = register("stripped_redwood_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.REDWOOD.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.REDWOOD.strippedWood()).forceSolidOn());

    // Sakura
    public static final DeferredBlock<StairBlock> SAKURA_LOG_STAIRS = register("sakura_log_stairs", properties -> new StairBlock(BWGWood.SAKURA.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<SlabBlock> SAKURA_LOG_SLAB = register("sakura_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_SAKURA_LOG_STAIRS = register("stripped_sakura_log_stairs", properties -> new StairBlock(BWGWood.SAKURA.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SAKURA_LOG_SLAB = register("stripped_sakura_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<StairBlock> SAKURA_WOOD_STAIRS = register("sakura_wood_stairs", properties -> new StairBlock(BWGWood.SAKURA.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<SlabBlock> SAKURA_WOOD_SLAB = register("sakura_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<WallBlock> SAKURA_WOOD_WALL = register("sakura_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<FenceBlock> SAKURA_WOOD_FENCE = register("sakura_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()));
    public static final DeferredBlock<FenceGateBlock> SAKURA_WOOD_FENCE_GATE = register("sakura_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SAKURA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_SAKURA_WOOD_STAIRS = register("stripped_sakura_wood_stairs", properties -> new StairBlock(BWGWood.SAKURA.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SAKURA_WOOD_SLAB = register("stripped_sakura_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_SAKURA_WOOD_WALL = register("stripped_sakura_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_SAKURA_WOOD_FENCE = register("stripped_sakura_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SAKURA_WOOD_FENCE_GATE = register("stripped_sakura_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SAKURA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SAKURA.strippedWood()).forceSolidOn());

    // Skyris
    public static final DeferredBlock<StairBlock> SKYRIS_LOG_STAIRS = register("skyris_log_stairs", properties -> new StairBlock(BWGWood.SKYRIS.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<SlabBlock> SKYRIS_LOG_SLAB = register("skyris_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_SKYRIS_LOG_STAIRS = register("stripped_skyris_log_stairs", properties -> new StairBlock(BWGWood.SKYRIS.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SKYRIS_LOG_SLAB = register("stripped_skyris_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<StairBlock> SKYRIS_WOOD_STAIRS = register("skyris_wood_stairs", properties -> new StairBlock(BWGWood.SKYRIS.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<SlabBlock> SKYRIS_WOOD_SLAB = register("skyris_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<WallBlock> SKYRIS_WOOD_WALL = register("skyris_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<FenceBlock> SKYRIS_WOOD_FENCE = register("skyris_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()));
    public static final DeferredBlock<FenceGateBlock> SKYRIS_WOOD_FENCE_GATE = register("skyris_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SKYRIS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_SKYRIS_WOOD_STAIRS = register("stripped_skyris_wood_stairs", properties -> new StairBlock(BWGWood.SKYRIS.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SKYRIS_WOOD_SLAB = register("stripped_skyris_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_SKYRIS_WOOD_WALL = register("stripped_skyris_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_SKYRIS_WOOD_FENCE = register("stripped_skyris_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SKYRIS_WOOD_FENCE_GATE = register("stripped_skyris_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SKYRIS.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SKYRIS.strippedWood()).forceSolidOn());

    // Spirit
    public static final DeferredBlock<StairBlock> SPIRIT_LOG_STAIRS = register("spirit_log_stairs", properties -> new StairBlock(BWGWood.SPIRIT.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<SlabBlock> SPIRIT_LOG_SLAB = register("spirit_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_SPIRIT_LOG_STAIRS = register("stripped_spirit_log_stairs", properties -> new StairBlock(BWGWood.SPIRIT.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SPIRIT_LOG_SLAB = register("stripped_spirit_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<StairBlock> SPIRIT_WOOD_STAIRS = register("spirit_wood_stairs", properties -> new StairBlock(BWGWood.SPIRIT.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<SlabBlock> SPIRIT_WOOD_SLAB = register("spirit_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<WallBlock> SPIRIT_WOOD_WALL = register("spirit_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<FenceBlock> SPIRIT_WOOD_FENCE = register("spirit_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()));
    public static final DeferredBlock<FenceGateBlock> SPIRIT_WOOD_FENCE_GATE = register("spirit_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SPIRIT.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_SPIRIT_WOOD_STAIRS = register("stripped_spirit_wood_stairs", properties -> new StairBlock(BWGWood.SPIRIT.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_SPIRIT_WOOD_SLAB = register("stripped_spirit_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_SPIRIT_WOOD_WALL = register("stripped_spirit_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_SPIRIT_WOOD_FENCE = register("stripped_spirit_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SPIRIT_WOOD_FENCE_GATE = register("stripped_spirit_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.SPIRIT.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.SPIRIT.strippedWood()).forceSolidOn());

    // White Mangrove
    public static final DeferredBlock<StairBlock> WHITE_MANGROVE_LOG_STAIRS = register("white_mangrove_log_stairs", properties -> new StairBlock(BWGWood.WHITE_MANGROVE.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<SlabBlock> WHITE_MANGROVE_LOG_SLAB = register("white_mangrove_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_WHITE_MANGROVE_LOG_STAIRS = register("stripped_white_mangrove_log_stairs", properties -> new StairBlock(BWGWood.WHITE_MANGROVE.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WHITE_MANGROVE_LOG_SLAB = register("stripped_white_mangrove_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<StairBlock> WHITE_MANGROVE_WOOD_STAIRS = register("white_mangrove_wood_stairs", properties -> new StairBlock(BWGWood.WHITE_MANGROVE.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<SlabBlock> WHITE_MANGROVE_WOOD_SLAB = register("white_mangrove_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<WallBlock> WHITE_MANGROVE_WOOD_WALL = register("white_mangrove_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<FenceBlock> WHITE_MANGROVE_WOOD_FENCE = register("white_mangrove_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()));
    public static final DeferredBlock<FenceGateBlock> WHITE_MANGROVE_WOOD_FENCE_GATE = register("white_mangrove_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WHITE_MANGROVE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_WHITE_MANGROVE_WOOD_STAIRS = register("stripped_white_mangrove_wood_stairs", properties -> new StairBlock(BWGWood.WHITE_MANGROVE.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WHITE_MANGROVE_WOOD_SLAB = register("stripped_white_mangrove_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_WHITE_MANGROVE_WOOD_WALL = register("stripped_white_mangrove_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_WHITE_MANGROVE_WOOD_FENCE = register("stripped_white_mangrove_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WHITE_MANGROVE_WOOD_FENCE_GATE = register("stripped_white_mangrove_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WHITE_MANGROVE.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WHITE_MANGROVE.strippedWood()).forceSolidOn());

    // Willow
    public static final DeferredBlock<StairBlock> WILLOW_LOG_STAIRS = register("willow_log_stairs", properties -> new StairBlock(BWGWood.WILLOW.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<SlabBlock> WILLOW_LOG_SLAB = register("willow_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_WILLOW_LOG_STAIRS = register("stripped_willow_log_stairs", properties -> new StairBlock(BWGWood.WILLOW.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WILLOW_LOG_SLAB = register("stripped_willow_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<StairBlock> WILLOW_WOOD_STAIRS = register("willow_wood_stairs", properties -> new StairBlock(BWGWood.WILLOW.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<SlabBlock> WILLOW_WOOD_SLAB = register("willow_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<WallBlock> WILLOW_WOOD_WALL = register("willow_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<FenceBlock> WILLOW_WOOD_FENCE = register("willow_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()));
    public static final DeferredBlock<FenceGateBlock> WILLOW_WOOD_FENCE_GATE = register("willow_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WILLOW.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_WILLOW_WOOD_STAIRS = register("stripped_willow_wood_stairs", properties -> new StairBlock(BWGWood.WILLOW.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WILLOW_WOOD_SLAB = register("stripped_willow_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_WILLOW_WOOD_WALL = register("stripped_willow_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_WILLOW_WOOD_FENCE = register("stripped_willow_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WILLOW_WOOD_FENCE_GATE = register("stripped_willow_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WILLOW.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WILLOW.strippedWood()).forceSolidOn());

    // Witch Hazel
    public static final DeferredBlock<StairBlock> WITCH_HAZEL_LOG_STAIRS = register("witch_hazel_log_stairs", properties -> new StairBlock(BWGWood.WITCH_HAZEL.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<SlabBlock> WITCH_HAZEL_LOG_SLAB = register("witch_hazel_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_WITCH_HAZEL_LOG_STAIRS = register("stripped_witch_hazel_log_stairs", properties -> new StairBlock(BWGWood.WITCH_HAZEL.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WITCH_HAZEL_LOG_SLAB = register("stripped_witch_hazel_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<StairBlock> WITCH_HAZEL_WOOD_STAIRS = register("witch_hazel_wood_stairs", properties -> new StairBlock(BWGWood.WITCH_HAZEL.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<SlabBlock> WITCH_HAZEL_WOOD_SLAB = register("witch_hazel_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<WallBlock> WITCH_HAZEL_WOOD_WALL = register("witch_hazel_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<FenceBlock> WITCH_HAZEL_WOOD_FENCE = register("witch_hazel_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()));
    public static final DeferredBlock<FenceGateBlock> WITCH_HAZEL_WOOD_FENCE_GATE = register("witch_hazel_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WITCH_HAZEL.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_WITCH_HAZEL_WOOD_STAIRS = register("stripped_witch_hazel_wood_stairs", properties -> new StairBlock(BWGWood.WITCH_HAZEL.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_WITCH_HAZEL_WOOD_SLAB = register("stripped_witch_hazel_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_WITCH_HAZEL_WOOD_WALL = register("stripped_witch_hazel_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_WITCH_HAZEL_WOOD_FENCE = register("stripped_witch_hazel_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WITCH_HAZEL_WOOD_FENCE_GATE = register("stripped_witch_hazel_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.WITCH_HAZEL.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.WITCH_HAZEL.strippedWood()).forceSolidOn());

    // Zelkova
    public static final DeferredBlock<StairBlock> ZELKOVA_LOG_STAIRS = register("zelkova_log_stairs", properties -> new StairBlock(BWGWood.ZELKOVA.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<SlabBlock> ZELKOVA_LOG_SLAB = register("zelkova_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_ZELKOVA_LOG_STAIRS = register("stripped_zelkova_log_stairs", properties -> new StairBlock(BWGWood.ZELKOVA.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_ZELKOVA_LOG_SLAB = register("stripped_zelkova_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<StairBlock> ZELKOVA_WOOD_STAIRS = register("zelkova_wood_stairs", properties -> new StairBlock(BWGWood.ZELKOVA.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<SlabBlock> ZELKOVA_WOOD_SLAB = register("zelkova_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<WallBlock> ZELKOVA_WOOD_WALL = register("zelkova_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<FenceBlock> ZELKOVA_WOOD_FENCE = register("zelkova_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()));
    public static final DeferredBlock<FenceGateBlock> ZELKOVA_WOOD_FENCE_GATE = register("zelkova_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ZELKOVA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.wood()).forceSolidOn());
    public static final DeferredBlock<StairBlock> STRIPPED_ZELKOVA_WOOD_STAIRS = register("stripped_zelkova_wood_stairs", properties -> new StairBlock(BWGWood.ZELKOVA.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_ZELKOVA_WOOD_SLAB = register("stripped_zelkova_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_ZELKOVA_WOOD_WALL = register("stripped_zelkova_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_ZELKOVA_WOOD_FENCE = register("stripped_zelkova_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ZELKOVA_WOOD_FENCE_GATE = register("stripped_zelkova_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ZELKOVA.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.ZELKOVA.strippedWood()).forceSolidOn());


    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, Item.Properties::new);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BOItems.REGISTER.registerItem(name, iproperties -> new BlockItem(registryObject.get(), iproperties), itemProperties);
        return registryObject;
    }

    public static Stream<Block> getAllBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
}
