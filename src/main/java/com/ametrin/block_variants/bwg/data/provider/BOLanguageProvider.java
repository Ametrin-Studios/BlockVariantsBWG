package com.ametrin.block_variants.bwg.data.provider;

import com.ametrin.block_variants.bwg.BlockVariantsBWGIntegration;
import com.ametrin.block_variants.bwg.registry.BOBlockFamilies;
import com.ametrin.block_variants.bwg.registry.BOCreativeModeTabs;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.ItemLike;

public final class BOLanguageProvider extends ExtendedLanguageProvider {
    public BOLanguageProvider(PackOutput output) {
        super(output, BlockVariantsBWGIntegration.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BOCreativeModeTabs.BLOCK_VARIANTS_BWG_TRANSLATION_KEY, "Block Variants - BWG");

        family("Aspen Log").family(BOBlockFamilies.ASPEN_LOG);
        family("Stripped Aspen Log").family(BOBlockFamilies.STRIPPED_ASPEN_LOG);
        family("Aspen Wood").family(BOBlockFamilies.ASPEN_WOOD);
        family("Stripped Aspen Wood").family(BOBlockFamilies.STRIPPED_ASPEN_WOOD);

        family("Baobab Log").family(BOBlockFamilies.BAOBAB_LOG);
        family("Stripped Baobab Log").family(BOBlockFamilies.STRIPPED_BAOBAB_LOG);
        family("Baobab Wood").family(BOBlockFamilies.BAOBAB_WOOD);
        family("Stripped Baobab Wood").family(BOBlockFamilies.STRIPPED_BAOBAB_WOOD);

        family("Blue Enchanted Log").family(BOBlockFamilies.BLUE_ENCHANTED_LOG);
        family("Stripped Blue Enchanted Log").family(BOBlockFamilies.STRIPPED_BLUE_ENCHANTED_LOG);
        family("Blue Enchanted Wood").family(BOBlockFamilies.BLUE_ENCHANTED_WOOD);
        family("Stripped Blue Enchanted Wood").family(BOBlockFamilies.STRIPPED_BLUE_ENCHANTED_WOOD);

        family("Cika Log").family(BOBlockFamilies.CIKA_LOG);
        family("Stripped Cika Log").family(BOBlockFamilies.STRIPPED_CIKA_LOG);
        family("Cika Wood").family(BOBlockFamilies.CIKA_WOOD);
        family("Stripped Cika Wood").family(BOBlockFamilies.STRIPPED_CIKA_WOOD);

        family("Cypress Log").family(BOBlockFamilies.CYPRESS_LOG);
        family("Stripped Cypress Log").family(BOBlockFamilies.STRIPPED_CYPRESS_LOG);
        family("Cypress Wood").family(BOBlockFamilies.CYPRESS_WOOD);
        family("Stripped Cypress Wood").family(BOBlockFamilies.STRIPPED_CYPRESS_WOOD);

        family("Ebony Log").family(BOBlockFamilies.EBONY_LOG);
        family("Stripped Ebony Log").family(BOBlockFamilies.STRIPPED_EBONY_LOG);
        family("Ebony Wood").family(BOBlockFamilies.EBONY_WOOD);
        family("Stripped Ebony Wood").family(BOBlockFamilies.STRIPPED_EBONY_WOOD);

        family("Fir Log").family(BOBlockFamilies.FIR_LOG);
        family("Stripped Fir Log").family(BOBlockFamilies.STRIPPED_FIR_LOG);
        family("Fir Wood").family(BOBlockFamilies.FIR_WOOD);
        family("Stripped Fir Wood").family(BOBlockFamilies.STRIPPED_FIR_WOOD);

        family("Florus Stem").family(BOBlockFamilies.FLORUS_LOG);
        family("Stripped Florus Stem").family(BOBlockFamilies.STRIPPED_FLORUS_LOG);
        family("Florus Wood").family(BOBlockFamilies.FLORUS_WOOD);
        family("Stripped Florus Wood").family(BOBlockFamilies.STRIPPED_FLORUS_WOOD);

        family("Green Enchanted Log").family(BOBlockFamilies.GREEN_ENCHANTED_LOG);
        family("Stripped Green Enchanted Log").family(BOBlockFamilies.STRIPPED_GREEN_ENCHANTED_LOG);
        family("Green Enchanted Wood").family(BOBlockFamilies.GREEN_ENCHANTED_WOOD);
        family("Stripped Green Enchanted Wood").family(BOBlockFamilies.STRIPPED_GREEN_ENCHANTED_WOOD);

        family("Holly Log").family(BOBlockFamilies.HOLLY_LOG);
        family("Stripped Holly Log").family(BOBlockFamilies.STRIPPED_HOLLY_LOG);
        family("Holly Wood").family(BOBlockFamilies.HOLLY_WOOD);
        family("Stripped Holly Wood").family(BOBlockFamilies.STRIPPED_HOLLY_WOOD);

        family("Ironwood Log").family(BOBlockFamilies.IRONWOOD_LOG);
        family("Stripped Ironwood Log").family(BOBlockFamilies.STRIPPED_IRONWOOD_LOG);
        family("Ironwood Wood").family(BOBlockFamilies.IRONWOOD_WOOD);
        family("Stripped Ironwood Wood").family(BOBlockFamilies.STRIPPED_IRONWOOD_WOOD);

        family("Jacaranda Log").family(BOBlockFamilies.JACARANDA_LOG);
        family("Stripped Jacaranda Log").family(BOBlockFamilies.STRIPPED_JACARANDA_LOG);
        family("Jacaranda Wood").family(BOBlockFamilies.JACARANDA_WOOD);
        family("Stripped Jacaranda Wood").family(BOBlockFamilies.STRIPPED_JACARANDA_WOOD);

        family("Mahogany Log").family(BOBlockFamilies.MAHOGANY_LOG);
        family("Stripped Mahogany Log").family(BOBlockFamilies.STRIPPED_MAHOGANY_LOG);
        family("Mahogany Wood").family(BOBlockFamilies.MAHOGANY_WOOD);
        family("Stripped Mahogany Wood").family(BOBlockFamilies.STRIPPED_MAHOGANY_WOOD);

        family("Maple Log").family(BOBlockFamilies.MAPLE_LOG);
        family("Stripped Maple Log").family(BOBlockFamilies.STRIPPED_MAPLE_LOG);
        family("Maple Wood").family(BOBlockFamilies.MAPLE_WOOD);
        family("Stripped Maple Wood").family(BOBlockFamilies.STRIPPED_MAPLE_WOOD);

        family("Palm Log").family(BOBlockFamilies.PALM_LOG);
        family("Stripped Palm Log").family(BOBlockFamilies.STRIPPED_PALM_LOG);
        family("Palm Wood").family(BOBlockFamilies.PALM_WOOD);
        family("Stripped Palm Wood").family(BOBlockFamilies.STRIPPED_PALM_WOOD);

        family("Pine Log").family(BOBlockFamilies.PINE_LOG);
        family("Stripped Pine Log").family(BOBlockFamilies.STRIPPED_PINE_LOG);
        family("Pine Wood").family(BOBlockFamilies.PINE_WOOD);
        family("Stripped Pine Wood").family(BOBlockFamilies.STRIPPED_PINE_WOOD);

        family("Rainbow Eucalyptus Log").family(BOBlockFamilies.RAINBOW_EUCALYPTUS_LOG);
        family("Stripped Rainbow Eucalyptus Log").family(BOBlockFamilies.STRIPPED_RAINBOW_EUCALYPTUS_LOG);
        family("Rainbow Eucalyptus Wood").family(BOBlockFamilies.RAINBOW_EUCALYPTUS_WOOD);
        family("Stripped Rainbow Eucalyptus Wood").family(BOBlockFamilies.STRIPPED_RAINBOW_EUCALYPTUS_WOOD);

        family("Redwood Log").family(BOBlockFamilies.REDWOOD_LOG);
        family("Stripped Redwood Log").family(BOBlockFamilies.STRIPPED_REDWOOD_LOG);
        family("Redwood Wood").family(BOBlockFamilies.REDWOOD_WOOD);
        family("Stripped Redwood Wood").family(BOBlockFamilies.STRIPPED_REDWOOD_WOOD);

        family("Sakura Log").family(BOBlockFamilies.SAKURA_LOG);
        family("Stripped Sakura Log").family(BOBlockFamilies.STRIPPED_SAKURA_LOG);
        family("Sakura Wood").family(BOBlockFamilies.SAKURA_WOOD);
        family("Stripped Sakura Wood").family(BOBlockFamilies.STRIPPED_SAKURA_WOOD);

        family("Skyris Log").family(BOBlockFamilies.SKYRIS_LOG);
        family("Stripped Skyris Log").family(BOBlockFamilies.STRIPPED_SKYRIS_LOG);
        family("Skyris Wood").family(BOBlockFamilies.SKYRIS_WOOD);
        family("Stripped Skyris Wood").family(BOBlockFamilies.STRIPPED_SKYRIS_WOOD);

        family("Spirit Log").family(BOBlockFamilies.SPIRIT_LOG);
        family("Stripped Spirit Log").family(BOBlockFamilies.STRIPPED_SPIRIT_LOG);
        family("Spirit Wood").family(BOBlockFamilies.SPIRIT_WOOD);
        family("Stripped Spirit Wood").family(BOBlockFamilies.STRIPPED_SPIRIT_WOOD);

        family("White Mangrove Log").family(BOBlockFamilies.WHITE_MANGROVE_LOG);
        family("Stripped White Mangrove Log").family(BOBlockFamilies.STRIPPED_WHITE_MANGROVE_LOG);
        family("White Mangrove Wood").family(BOBlockFamilies.WHITE_MANGROVE_WOOD);
        family("Stripped White Mangrove Wood").family(BOBlockFamilies.STRIPPED_WHITE_MANGROVE_WOOD);

        family("Willow Log").family(BOBlockFamilies.WILLOW_LOG);
        family("Stripped Willow Log").family(BOBlockFamilies.STRIPPED_WILLOW_LOG);
        family("Willow Wood").family(BOBlockFamilies.WILLOW_WOOD);
        family("Stripped Willow Wood").family(BOBlockFamilies.STRIPPED_WILLOW_WOOD);

        family("Witch Hazel Log").family(BOBlockFamilies.WITCH_HAZEL_LOG);
        family("Stripped Witch Hazel Log").family(BOBlockFamilies.STRIPPED_WITCH_HAZEL_LOG);
        family("Witch Hazel Wood").family(BOBlockFamilies.WITCH_HAZEL_WOOD);
        family("Stripped Witch Hazel Wood").family(BOBlockFamilies.STRIPPED_WITCH_HAZEL_WOOD);

        family("Zelkova Log").family(BOBlockFamilies.ZELKOVA_LOG);
        family("Stripped Zelkova Log").family(BOBlockFamilies.STRIPPED_ZELKOVA_LOG);
        family("Zelkova Wood").family(BOBlockFamilies.ZELKOVA_WOOD);
        family("Stripped Zelkova Wood").family(BOBlockFamilies.STRIPPED_ZELKOVA_WOOD);
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

        public FamilyBuilder family(BlockFamily family) {
            family.getVariants().forEach((variant, block) -> {
                switch (variant) {
                    case STAIRS -> stairs(block);
                    case SLAB -> slab(block);
                    case WALL -> wall(block);
                    case FENCE -> fence(block);
                    case FENCE_GATE -> fenceGate(block);
                    default -> throw new UnsupportedOperationException("en_us name for " + variant + " not implemented");
                }
            });

            return this;
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
