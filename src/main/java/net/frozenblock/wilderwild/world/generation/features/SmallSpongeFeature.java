package net.frozenblock.wilderwild.world.generation.features;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import net.frozenblock.wilderwild.block.SmallSpongeBlock;
import net.frozenblock.wilderwild.world.generation.features.config.SmallSpongeFeatureConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class SmallSpongeFeature extends Feature<SmallSpongeFeatureConfig> {

    public SmallSpongeFeature(Codec<SmallSpongeFeatureConfig> codec) {
        super(codec);
    }

    @Override
	public boolean place(FeaturePlaceContext<SmallSpongeFeatureConfig> context) {
		WorldGenLevel worldGenLevel = context.level();
		BlockPos blockPos = context.origin();
		RandomSource randomSource = context.random();
		SmallSpongeFeatureConfig config = context.config();
		if (!isAirOrWater(worldGenLevel.getBlockState(blockPos))) {
			return false;
		} else {
			List<Direction> list = config.shuffleDirections(randomSource);
			if (generate(worldGenLevel, blockPos, worldGenLevel.getBlockState(blockPos), config, randomSource, list)) {
				return true;
			} else {
				BlockPos.MutableBlockPos mutableBlockPos = blockPos.mutable();

				for(Direction direction : list) {
					mutableBlockPos.set(blockPos);
					List<Direction> list2 = config.shuffleDirections(randomSource, direction.getOpposite());

					for(int i = 0; i < config.searchRange; ++i) {
						mutableBlockPos.setWithOffset(blockPos, direction);
						BlockState blockState = worldGenLevel.getBlockState(mutableBlockPos);
						if (!isAirOrWater(blockState) && !blockState.is(config.sponge)) {
							break;
						}

						if (generate(worldGenLevel, mutableBlockPos, blockState, config, randomSource, list2)) {
							return true;
						}
					}
				}

				return false;
			}
		}
	}

	public static boolean generate(WorldGenLevel level, BlockPos pos, BlockState state, SmallSpongeFeatureConfig config, RandomSource random, List<Direction> directions) {
		BlockPos.MutableBlockPos mutable = pos.mutable();
		Iterator<Direction> var7 = directions.iterator();

		Direction direction;
		Direction placementDirection;
		BlockState blockState;
		do {
			if (!var7.hasNext()) {
				return false;
			}

			direction = var7.next();
			blockState = level.getBlockState(mutable.setWithOffset(pos, direction));
			placementDirection = direction;
			if (placementDirection.getAxis() == Direction.Axis.Y) {
				placementDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);
			} else {
				placementDirection = placementDirection.getOpposite();
			}
		} while (!blockState.is(config.canPlaceOn));

		BlockState blockState2 = config.sponge.defaultBlockState().setValue(SmallSpongeBlock.FACING, placementDirection).setValue(SmallSpongeBlock.FACE, SmallSpongeBlock.getFace(direction)).setValue(SmallSpongeBlock.STAGE, random.nextInt(2));
		if (blockState2 == null) {
			return false;
		} else if (blockState2.getValue(SmallSpongeBlock.WATERLOGGED)) {
			level.setBlock(pos, blockState2, 3);
			level.getChunk(pos).markPosForPostprocessing(pos);

			return true;
		}
		return false;
	}

	public static boolean isAirOrWater(BlockState state) {
		return state.isAir() || state.is(Blocks.WATER);
	}

}

