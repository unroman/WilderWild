package net.frozenblock.wilderwild.registry;

import java.util.ArrayList;
import net.frozenblock.lib.worldgen.surface.api.FrozenDimensionBoundRuleSource;
import net.frozenblock.lib.worldgen.surface.api.FrozenSurfaceRuleEntrypoint;
import net.frozenblock.wilderwild.misc.WilderSharedConstants;
import net.frozenblock.wilderwild.world.generation.WilderSharedWorldgen;
import net.minecraft.world.level.levelgen.SurfaceRules;

public final class RegisterSurfaceRules implements FrozenSurfaceRuleEntrypoint {

	@Override
	public void addOverworldSurfaceRules(ArrayList<SurfaceRules.RuleSource> context) {
		var rules = SurfaceRules.sequence(
			WilderSharedWorldgen.betaBeaches(),
			WilderSharedWorldgen.cypressSurfaceRules(),
			WilderSharedWorldgen.warmRiverRules(),
			WilderSharedWorldgen.oasisRules(),
			WilderSharedWorldgen.aridGrass(),
			WilderSharedWorldgen.aridRules(),
			WilderSharedWorldgen.oldGrowthSnowyTaigaRules(),
			WilderSharedWorldgen.oldGrowthDarkForestRules(),
			WilderSharedWorldgen.temperateRainforestRules(),
			WilderSharedWorldgen.rainforestRules()
		);

		context.add(rules);
		WilderSharedConstants.log("Wilder Wild's Overworld Surface Rules have been added!", true);
	}

	@Override
	public void addOverworldSurfaceRulesNoPrelimSurface(ArrayList<SurfaceRules.RuleSource> context) {

	}

	@Override
	public void addNetherSurfaceRules(ArrayList<SurfaceRules.RuleSource> context) {

	}

	@Override
	public void addEndSurfaceRules(ArrayList<SurfaceRules.RuleSource> context) {

	}

	@Override
	public void addSurfaceRules(ArrayList<FrozenDimensionBoundRuleSource> context) {

	}
}
