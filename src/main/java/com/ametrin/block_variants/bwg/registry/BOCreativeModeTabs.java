package com.ametrin.block_variants.bwg.registry;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.potionstudios.biomeswevegone.BiomesWeveGone;

import java.util.function.Supplier;

public final class BOCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockVariantsBWGIntegration.MOD_ID);
    public static final String BLOCK_VARIANTS_BWG_TRANSLATION_KEY = "itemGroup.block_variants_bwg.main";
    public static final Supplier<CreativeModeTab> BLOCK_VARIANTS_BOP = REGISTER.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable(BLOCK_VARIANTS_BWG_TRANSLATION_KEY))
            .withTabsBefore(Identifier.fromNamespaceAndPath(BiomesWeveGone.MOD_ID, "biomes_weve_gone_wood"))
            .icon(() -> BOWoodBlocks.ASPEN_WOOD_WALL.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> BOWoodBlocks.getAllBlocks().forEach(output::accept))
            .build()
    );
}
