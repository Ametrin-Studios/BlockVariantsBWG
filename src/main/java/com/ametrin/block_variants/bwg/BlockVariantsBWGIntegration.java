package com.ametrin.block_variants.bwg;

import com.ametrin.block_variants.bwg.data.provider.loot.BOBlockLootProvider;
import com.ametrin.block_variants.bwg.registry.BOCreateveModeTabs;
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
        BOCreateveModeTabs.REGISTER.register(modEventBus);
        modEventBus.addListener(BlockVariantsBWGIntegration::gatherData);
    }

    private static void gatherData(final GatherDataEvent event) {
        event.createProvider(output -> new BOBlockStateProvider(output, event.getExistingFileHelper()));
        event.createProvider(output -> new BOItemModelProvider(output, event.getExistingFileHelper()));
        event.createProvider(BORecipeProvider::new);
        event.createProvider(BOLanguageProvider::new);
        event.createBlockAndItemTags(BOBlockTagsProvider::new, BOItemTagsProvider::new);
        event.createProvider(CustomLootTableProvider.builder()
                .addBlockProvider(BOBlockLootProvider::new)
                ::build);
    }
}
