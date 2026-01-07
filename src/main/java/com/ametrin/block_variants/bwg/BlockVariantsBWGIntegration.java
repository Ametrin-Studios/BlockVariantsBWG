package com.ametrin.block_variants.bwg;

import com.ametrin.block_variants.bwg.data.provider.*;
import com.ametrin.block_variants.bwg.data.provider.loot.BOBlockLootProvider;
import com.ametrin.block_variants.bwg.registry.BOCreativeModeTabs;
import com.ametrin.block_variants.bwg.registry.BOItems;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

@Mod(BlockVariantsBWGIntegration.MOD_ID)
public class BlockVariantsBWGIntegration {
    public static final String MOD_ID = "block_variants_bwg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BlockVariantsBWGIntegration(IEventBus modEventBus, ModContainer modContainer) {
        BOItems.REGISTER.register(modEventBus);
        BOWoodBlocks.REGISTER.register(modEventBus);
        BOCreativeModeTabs.REGISTER.register(modEventBus);
        modEventBus.addListener(BlockVariantsBWGIntegration::gatherData);
    }

    private static void gatherData(final GatherDataEvent.Client event) {
        event.createProvider(BOModelProvider::new);
        event.createProvider(BORecipeProvider.Runner::new);
        event.createProvider(BOLanguageProvider::new);
        event.createProvider(BOBlockTagsProvider::new);
        event.createProvider(BOItemTagsProvider::new);
        event.createProvider(CustomLootTableProvider.builder()
                .addBlockProvider(BOBlockLootProvider::new)
                ::build);
    }
}
