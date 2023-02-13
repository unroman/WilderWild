/*
 * Copyright 2022-2023 FrozenBlock
 * This file is part of Wilder Wild.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, see <https://www.gnu.org/licenses/>.
 */

package net.frozenblock.wilderwild.world.additions.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.frozenblock.wilderwild.registry.RegisterWorldgen;
import net.frozenblock.wilderwild.tag.WilderBiomeTags;
import net.frozenblock.wilderwild.world.additions.feature.WilderPlacedFeatures;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public final class WilderFlowersGeneration {
    public static void generateFlower() {

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_CARNATION),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.CARNATION.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_DATURA),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.DATURA_BIRCH.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_GLORY_OF_THE_SNOW),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.GLORY_OF_THE_SNOW.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(RegisterWorldgen.CYPRESS_WETLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.DENSE_FLOWER_PLACED.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_BROWN_SHELF_FUNGUS),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION, WilderPlacedFeatures.BROWN_SHELF_FUNGUS_PLACED.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_RED_SHELF_FUNGUS),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION, WilderPlacedFeatures.RED_SHELF_FUNGUS_PLACED.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_FLOWERING_WATER_LILY),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PATCH_FLOWERED_WATERLILY.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_CATTAIL),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PATCH_CATTAIL.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.ALLOWS_SURFACE_SLIME_SPAWNS),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PATCH_ALGAE_5.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(RegisterWorldgen.CYPRESS_WETLANDS),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PATCH_ALGAE.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_SEEDING_DANDELION),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.SEEDING_DANDELION.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_MILKWEED),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.MILKWEED.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.NEW_FLOWER_PLAIN.unwrapKey().orElseThrow());

        BiomeModifications.addFeature(BiomeSelectors.tag(WilderBiomeTags.HAS_BERRY_PATCH),
                GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PATCH_BERRY_FOREST.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DESERT),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.TALL_CACTUS_PLACED.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DESERT),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.DESERT_BUSH_PLACED.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BADLANDS),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.PRICKLY_PEAR.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BADLANDS),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.BADLANDS_TALL_CACTUS_PLACED.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BADLANDS),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.BADLANDS_BUSH_SAND_PLACED.unwrapKey().orElseThrow());

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BADLANDS),
				GenerationStep.Decoration.VEGETAL_DECORATION, WilderPlacedFeatures.BADLANDS_BUSH_TERRACOTTA_PLACED.unwrapKey().orElseThrow());


	}
}
