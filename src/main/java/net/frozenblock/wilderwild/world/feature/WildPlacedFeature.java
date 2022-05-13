package net.frozenblock.wilderwild.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import static net.minecraft.world.gen.feature.VegetationPlacedFeatures.*;

public class WildPlacedFeature {
    //TREES
    public static final RegistryEntry<PlacedFeature> NEW_TREES_FLOWER_FOREST = PlacedFeatures.register("new_trees_flower_forest", WildConfiguredFeatures.NEW_TREES_FLOWER_FOREST, modifiers(PlacedFeatures.createCountExtraModifier(8, 0.1F, 1)));

    public static final RegistryEntry<PlacedFeature> NEW_TREES_PLAINS = PlacedFeatures.register("new_trees_plains", WildConfiguredFeatures.NEW_TREES_PLAINS,
            PlacedFeatures.createCountExtraModifier(0, 0.05F, 1), SquarePlacementModifier.of(), NOT_IN_SURFACE_WATER_MODIFIER, PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.getDefaultState(), BlockPos.ORIGIN)), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> NEW_TREES_SWAMP = PlacedFeatures.register("new_trees_swamp", WildTreeConfigured.NEW_SWAMP_TREE,
            PlacedFeatures.createCountExtraModifier(2, 0.1F, 1), SquarePlacementModifier.of(), SurfaceWaterDepthFilterPlacementModifier.of(2), PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BiomePlacementModifier.of(), BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Blocks.MANGROVE_PROPAGULE.getDefaultState(), BlockPos.ORIGIN)));

    public static final RegistryEntry<PlacedFeature> NEW_FALLEN_OAK_AND_BIRCH_PLACED = PlacedFeatures.register("new_fallen_oak_and_birch_placed",
            WildConfiguredFeatures.NEW_FALLEN_BIRCH_AND_OAK, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> NEW_TREES_BIRCH_AND_OAK = PlacedFeatures.register("new_trees_birch_and_oak",
            WildConfiguredFeatures.NEW_TREES_BIRCH_AND_OAK, modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1)));

    public static final RegistryEntry<PlacedFeature> NEW_FANCY_OAK_PLACED = PlacedFeatures.register("new_fancy_oak_placed",
            WildTreeConfigured.NEW_FANCY_OAK, modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 1), Blocks.OAK_SAPLING));

    public static final RegistryEntry<PlacedFeature> NEW_BIRCH_PLACED = PlacedFeatures.register("new_birch_placed",
            WildTreeConfigured.NEW_BIRCH_BEES_0004, modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), Blocks.BIRCH_SAPLING));

    public static final RegistryEntry<PlacedFeature> NEW_TALL_BIRCH_PLACED = PlacedFeatures.register("new_tall_birch_placed",
            WildTreeConfigured.NEW_SUPER_BIRCH_BEES_0004, modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), Blocks.BIRCH_SAPLING));

    public static final RegistryEntry<PlacedFeature> NEW_FALLEN_BIRCH_PLACED = PlacedFeatures.register("new_fallen_birch_placed",
            WildTreeConfigured.NEW_FALLEN_BIRCH_TREE, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> HUGE_RED_MUSHROOM_PLACED = PlacedFeatures.register("huge_red_mushroom_placed",
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM, RarityFilterPlacementModifier.of(90), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> NEW_TALL_DARK_OAK_PLACED = PlacedFeatures.register("new_tall_dark_oak_placed",
            WildTreeConfigured.NEW_TALL_DARK_OAK, modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(4, 0.1F, 1), Blocks.DARK_OAK_SAPLING));

    public static final RegistryEntry<PlacedFeature> NEW_SPRUCE_PLACED = PlacedFeatures.register("new_spruce_placed",
            WildConfiguredFeatures.NEW_TREES_TAIGA, modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1)));

    public static final RegistryEntry<PlacedFeature> NEW_SHORT_SPRUCE_PLACED = PlacedFeatures.register("new_short_spruce_placed",
            WildConfiguredFeatures.NEW_SHORT_TREES_TAIGA, modifiers(PlacedFeatures.createCountExtraModifier(5, 0.1F, 1)));

    //Decorations
    public static final RegistryEntry<PlacedFeature> PATCH_CATTAIL =
            PlacedFeatures.register("cattail", WildConfiguredFeatures.CATTAIL,
                    RarityFilterPlacementModifier.of(3), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> PATCH_FLOWERED_WATERLILY = PlacedFeatures.register("patch_flowered_waterlily",
            WildConfiguredFeatures.PATCH_FLOWERED_WATERLILY, modifiers(1));

    public static final RegistryEntry<PlacedFeature> HUGE_MUSHROOMS_SWAMP = PlacedFeatures.register("huge_mushrooms_swamp",
            VegetationConfiguredFeatures.MUSHROOM_ISLAND_VEGETATION, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> NEW_MUSHROOM_PLACED = PlacedFeatures.register("new_mushroom_placed",
            VegetationConfiguredFeatures.MUSHROOM_ISLAND_VEGETATION, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> NEW_BROWN_MUSHROOM_PLACED = PlacedFeatures.register("new_brown_mushroom_placed",
            VegetationConfiguredFeatures.PATCH_BROWN_MUSHROOM, modifiers(10));

    public static final RegistryEntry<PlacedFeature> NEW_GRASS_PLACED = PlacedFeatures.register("new_grass_placed",
            VegetationConfiguredFeatures.PATCH_GRASS_JUNGLE, modifiers(20));

    public static final RegistryEntry<PlacedFeature> DATURA_BIRCH = PlacedFeatures.register("datura_birch",
            WildConfiguredFeatures.DATURA, RarityFilterPlacementModifier.of(5), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> CARNATION_BIRCH = PlacedFeatures.register("carnation_birch",
            WildConfiguredFeatures.CARNATION, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> WHITE_DANDELION = PlacedFeatures.register("white_dandelion",
            WildConfiguredFeatures.WHITE_DANDELION, RarityFilterPlacementModifier.of(6), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> MILKWEED = PlacedFeatures.register("milkweed",
            WildConfiguredFeatures.MILKWEED, RarityFilterPlacementModifier.of(12), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> POLLEN_PLACED = PlacedFeatures.register("pollen",
            WildConfiguredFeatures.POLLEN_CONFIGURED, RarityFilterPlacementModifier.of(1), CountPlacementModifier.of(2), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, SquarePlacementModifier.of(), SurfaceThresholdFilterPlacementModifier.of(Heightmap.Type.MOTION_BLOCKING, 0, 128), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> BROWN_SHELF_FUNGUS_PLACED = PlacedFeatures.register("brown_shelf_fungus_placed",
            WildConfiguredFeatures.BROWN_SHELF_FUNGUS_CONFIGURED, RarityFilterPlacementModifier.of(1), CountPlacementModifier.of(16), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, SquarePlacementModifier.of(), SurfaceThresholdFilterPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG, 0, 128), BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> RED_SHELF_FUNGUS_PLACED = PlacedFeatures.register("red_shelf_fungus_placed",
            WildConfiguredFeatures.RED_SHELF_FUNGUS_CONFIGURED, RarityFilterPlacementModifier.of(1), CountPlacementModifier.of(16), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, SquarePlacementModifier.of(), SurfaceThresholdFilterPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG, 0, 128), BiomePlacementModifier.of());
}
