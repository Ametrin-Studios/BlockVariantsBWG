package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOCreateveModeTabs;
import com.ametrin.block_variants.bwg.registry.BOWoodBlocks;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

public final class BOLanguageProvider extends ExtendedLanguageProvider {
    public BOLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBWGIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BOCreateveModeTabs.BLOCK_VARIANTS_BWG_TRANSLATION_KEY, "Block Variants - Oh The Biomes We've Gone");


        family("Aspen Log").stairs(BOWoodBlocks.ASPEN_LOG_STAIRS).slab(BOWoodBlocks.ASPEN_LOG_SLAB);
        family("Stripped Aspen Log").stairs(BOWoodBlocks.STRIPPED_ASPEN_LOG_STAIRS).slab(BOWoodBlocks.STRIPPED_ASPEN_LOG_SLAB);
        family("Aspen Wood").stairs(BOWoodBlocks.ASPEN_WOOD_STAIRS).slab(BOWoodBlocks.ASPEN_WOOD_SLAB).wall(BOWoodBlocks.ASPEN_WOOD_WALL).fence(BOWoodBlocks.ASPEN_WOOD_FENCE).fenceGate(BOWoodBlocks.ASPEN_WOOD_FENCE_GATE);
        family("Stripped Aspen Wood").stairs(BOWoodBlocks.STRIPPED_ASPEN_WOOD_STAIRS).slab(BOWoodBlocks.STRIPPED_ASPEN_WOOD_SLAB).wall(BOWoodBlocks.STRIPPED_ASPEN_WOOD_WALL).fence(BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE).fenceGate(BOWoodBlocks.STRIPPED_ASPEN_WOOD_FENCE_GATE);

    }

    public FamilyBuilder family(String name) {
        return new FamilyBuilder(this, name);
    }

    public static final class FamilyBuilder {
        private final ExtendedLanguageProvider provider;
        private final String name;

        public FamilyBuilder(ExtendedLanguageProvider provider, String name) {
            this.provider = provider;
            this.name = name;
        }

        public FamilyBuilder stairs(ItemLike stairs) {
            provider.add(stairs.asItem(), name + " Stairs");
            return this;
        }

        public FamilyBuilder slab(ItemLike slab) {
            provider.add(slab.asItem(), name + " Slab");
            return this;
        }

        public FamilyBuilder wall(ItemLike slab) {
            provider.add(slab.asItem(), name + " Wall");
            return this;
        }

        public FamilyBuilder fence(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence");
            return this;
        }

        public FamilyBuilder fenceGate(ItemLike slab) {
            provider.add(slab.asItem(), name + " Fence Gate");
            return this;
        }
    }
}
