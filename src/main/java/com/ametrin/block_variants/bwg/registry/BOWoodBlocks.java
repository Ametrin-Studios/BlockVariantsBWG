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
    public static final DeferredBlock<FenceGateBlock> ASPEN_WOOD_FENCE_GATE = register("aspen_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ASPEN.woodType(), properties.mapColor(BWGWood.ASPEN.wood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<StairBlock> STRIPPED_ASPEN_WOOD_STAIRS = register("stripped_aspen_wood_stairs", properties -> new StairBlock(BWGWood.ASPEN.strippedWood().defaultBlockState(), properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<SlabBlock> STRIPPED_ASPEN_WOOD_SLAB = register("stripped_aspen_wood_slab", properties -> new SlabBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<WallBlock> STRIPPED_ASPEN_WOOD_WALL = register("stripped_aspen_wood_wall", properties -> new WallBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceBlock> STRIPPED_ASPEN_WOOD_FENCE = register("stripped_aspen_wood_fence", properties -> new FenceBlock(properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ASPEN_WOOD_FENCE_GATE = register("stripped_aspen_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.ASPEN.woodType(), properties.mapColor(BWGWood.ASPEN.strippedWood().defaultMapColor())), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    // Baobab
    public static final DeferredBlock<StairBlock> BAOBAB_LOG_STAIRS = register("baobab_log_stairs", properties -> new StairBlock(BWGWood.BAOBAB.logstem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<SlabBlock> BAOBAB_LOG_SLAB = register("baobab_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_BAOBAB_LOG_STAIRS = register("stripped_baobab_log_stairs", properties -> new StairBlock(BWGWood.BAOBAB.strippedLogStem().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAOBAB_LOG_SLAB = register("stripped_baobab_log_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<StairBlock> BAOBAB_WOOD_STAIRS = register("baobab_wood_stairs", properties -> new StairBlock(BWGWood.BAOBAB.wood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<SlabBlock> BAOBAB_WOOD_SLAB = register("baobab_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<WallBlock> BAOBAB_WOOD_WALL = register("baobab_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<FenceBlock> BAOBAB_WOOD_FENCE = register("baobab_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<FenceGateBlock> BAOBAB_WOOD_FENCE_GATE = register("baobab_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BAOBAB.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.wood()));
    public static final DeferredBlock<StairBlock> STRIPPED_BAOBAB_WOOD_STAIRS = register("stripped_baobab_wood_stairs", properties -> new StairBlock(BWGWood.BAOBAB.strippedWood().defaultBlockState(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAOBAB_WOOD_SLAB = register("stripped_baobab_wood_slab", SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<WallBlock> STRIPPED_BAOBAB_WOOD_WALL = register("stripped_baobab_wood_wall", WallBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<FenceBlock> STRIPPED_BAOBAB_WOOD_FENCE = register("stripped_baobab_wood_fence", FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BAOBAB_WOOD_FENCE_GATE = register("stripped_baobab_wood_fence_gate", properties -> new FenceGateBlock(BWGWood.BAOBAB.woodType(), properties), () -> BlockBehaviour.Properties.ofFullCopy(BWGWood.BAOBAB.strippedWood()));

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
