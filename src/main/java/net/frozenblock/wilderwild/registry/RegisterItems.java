package net.frozenblock.wilderwild.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.frozenblock.wilderwild.item.AncientHorn;
import net.frozenblock.wilderwild.item.CopperHorn;
import net.frozenblock.wilderwild.item.FireflyBottle;
import net.frozenblock.wilderwild.item.MilkweedPod;
import net.frozenblock.wilderwild.misc.FireflyColor;
import net.frozenblock.wilderwild.misc.WilderEnumValues;
import net.frozenblock.wilderwild.misc.WilderSharedConstants;
import net.frozenblock.wilderwild.tag.WilderInstrumentTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.material.Fluids;

public final class RegisterItems {
	private RegisterItems() {
		throw new UnsupportedOperationException("RegisterItems contains only static declarations.");
	}

    public static final MilkweedPod MILKWEED_POD = new MilkweedPod(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(64));
    public static final RecordItem MUSIC_DISC_BENEATH = new RecordItem(15, RegisterSounds.MUSIC_DISC_BENEATH, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 169);
    public static final RecordItem MUSIC_DISC_GOAT_HORN_SYMPHONY = new RecordItem(15, RegisterSounds.MUSIC_DISC_GOATHORN_SYMPHONY, new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(1).rarity(Rarity.RARE), 144);
    public static final RecordItem MUSIC_DISC_BACK = new RecordItem(15, RegisterSounds.MUSIC_DISC_BACK, new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(1).rarity(Rarity.RARE), 76);
    public static final Item FIREFLY_SPAWN_EGG = new SpawnEggItem(RegisterEntities.FIREFLY, Integer.parseInt("2A2E2B", 16), Integer.parseInt("AAF644", 16), new FabricItemSettings().group(CreativeModeTab.TAB_MISC));
    public static final Item JELLYFISH_SPAWN_EGG = new SpawnEggItem(RegisterEntities.JELLYFISH, Integer.parseInt("E484E4", 16), Integer.parseInt("DF71DC", 16), new FabricItemSettings().group(CreativeModeTab.TAB_MISC));
    public static final Item JELLYFISH_BUCKET = new MobBucketItem(RegisterEntities.JELLYFISH, Fluids.WATER, RegisterSounds.ITEM_BUCKET_EMPTY_JELLYFISH, new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(1));


    public static final Item BAOBAB_BOAT_ITEM = new BoatItem(false, WilderEnumValues.BAOBAB, new FabricItemSettings().maxCount(1).group(CreativeModeTab.TAB_TRANSPORTATION));
    public static final Item BAOBAB_CHEST_BOAT_ITEM = new BoatItem(true, WilderEnumValues.BAOBAB, new FabricItemSettings().maxCount(1).group(CreativeModeTab.TAB_TRANSPORTATION));
    public static final Item BAOBAB_SIGN = new SignItem(new FabricItemSettings().group(CreativeModeTab.TAB_DECORATIONS).maxCount(16),
            RegisterBlocks.BAOBAB_SIGN_BLOCK, RegisterBlocks.BAOBAB_WALL_SIGN);
    public static final Item CYPRESS_BOAT_ITEM = new BoatItem(false, WilderEnumValues.CYPRESS, new FabricItemSettings().maxCount(1).group(CreativeModeTab.TAB_TRANSPORTATION));
    public static final Item CYPRESS_CHEST_BOAT_ITEM = new BoatItem(true, WilderEnumValues.CYPRESS, new FabricItemSettings().maxCount(1).group(CreativeModeTab.TAB_TRANSPORTATION));
    public static final Item CYPRESS_SIGN = new SignItem(new FabricItemSettings().group(CreativeModeTab.TAB_DECORATIONS).maxCount(16),
            RegisterBlocks.CYPRESS_SIGN_BLOCK, RegisterBlocks.CYPRESS_WALL_SIGN);

    public static final Item POLLEN = new BlockItem(RegisterBlocks.POLLEN_BLOCK, new FabricItemSettings().group(CreativeModeTab.TAB_DECORATIONS));

    public static final Item BAOBAB_NUT = new BlockItem(RegisterBlocks.BAOBAB_NUT, new FabricItemSettings().group(CreativeModeTab.TAB_DECORATIONS).food(RegisterFood.BAOBAB_NUT));
    //public static final Item PRICKLY_PEAR = new PrickOnUseBlockItem(RegisterBlocks.PRICKLY_PEAR_CACTUS, new FabricItemSettings().group(CreativeModeTab.TAB_FOOD).food(RegisterFood.PRICKLY_PEAR), 2F, RegisterSounds.PLAYER_HURT_CACTUS, "prickly_pear");
    //public static final Item PEELED_PRICKLY_PEAR = new Item(new FabricItemSettings().group(CreativeModeTab.TAB_FOOD).food(Foods.APPLE));

    public static final Item FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.ON);
    public static final Item BLACK_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.BLACK);
    public static final Item RED_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.RED);
    public static final Item GREEN_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.GREEN);
    public static final Item BROWN_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.BROWN);
    public static final Item BLUE_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.BLUE);
    public static final Item PURPLE_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.PURPLE);
    public static final Item CYAN_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.CYAN);
    public static final Item LIGHT_GRAY_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.LIGHT_GRAY);
    public static final Item GRAY_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.GRAY);
    public static final Item PINK_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.PINK);
    public static final Item LIME_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.LIME);
    public static final Item YELLOW_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.YELLOW);
    public static final Item LIGHT_BLUE_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.LIGHT_BLUE);
    public static final Item MAGENTA_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.MAGENTA);
    public static final Item ORANGE_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.ORANGE);
    public static final Item WHITE_FIREFLY_BOTTLE = new FireflyBottle(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(32), FireflyColor.WHITE);

    public static final Item ANCIENT_HORN_FRAGMENT = new Item(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(64));

    public static final AncientHorn ANCIENT_HORN = new AncientHorn(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(1).rarity(Rarity.EPIC), WilderInstrumentTags.ANCIENT_HORNS);
    public static final ResourceKey<Instrument> ANCIENT_HORN_INSTRUMENT = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("ancient_horn"));
    public static final CopperHorn COPPER_HORN = new CopperHorn(new FabricItemSettings().group(CreativeModeTab.TAB_MISC).maxCount(1), WilderInstrumentTags.COPPER_HORNS);
    public static final ResourceKey<Instrument> SAX_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("sax_copper_horn"));
    public static final ResourceKey<Instrument> TUBA_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("tuba_copper_horn"));
    public static final ResourceKey<Instrument> FLUTE_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("flute_copper_horn"));
    public static final ResourceKey<Instrument> OBOE_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("oboe_copper_horn"));
    public static final ResourceKey<Instrument> CLARINET_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("clarinet_copper_horn"));
    public static final ResourceKey<Instrument> TRUMPET_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("trumpet_copper_horn"));
    public static final ResourceKey<Instrument> TROMBONE_COPPER_HORN = ResourceKey.create(Registry.INSTRUMENT_REGISTRY, WilderSharedConstants.id("trombone_copper_horn"));

    public static void registerItems() {
        WilderSharedConstants.logWild("Registering Items for", WilderSharedConstants.UNSTABLE_LOGGING);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("baobab_boat"), BAOBAB_BOAT_ITEM);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("baobab_chest_boat"), BAOBAB_CHEST_BOAT_ITEM);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("baobab_sign"), BAOBAB_SIGN);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("cypress_boat"), CYPRESS_BOAT_ITEM);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("cypress_chest_boat"), CYPRESS_CHEST_BOAT_ITEM);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("cypress_sign"), CYPRESS_SIGN);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("ancient_horn"), ANCIENT_HORN);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("copper_horn"), COPPER_HORN);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("milkweed_pod"), MILKWEED_POD);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("music_disc_beneath"), MUSIC_DISC_BENEATH);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("music_disc_goathorn_symphony"), MUSIC_DISC_GOAT_HORN_SYMPHONY);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("music_disc_back"), MUSIC_DISC_BACK);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("firefly_spawn_egg"), FIREFLY_SPAWN_EGG);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("jellyfish_spawn_egg"), JELLYFISH_SPAWN_EGG);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("jellyfish_bucket"), JELLYFISH_BUCKET);

        Registry.register(Registry.INSTRUMENT, ANCIENT_HORN_INSTRUMENT, new Instrument(RegisterSounds.ITEM_ANCIENT_HORN_CALL, 300, 256.0F));
        Registry.register(Registry.INSTRUMENT, SAX_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_SAX_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, TUBA_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_TUBA_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, FLUTE_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_FLUTE_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, OBOE_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_OBOE_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, CLARINET_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_CLARINET_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, TRUMPET_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_TRUMPET_LOOP, 32767, 64.0F));
        Registry.register(Registry.INSTRUMENT, TROMBONE_COPPER_HORN, new Instrument(RegisterSounds.ITEM_COPPER_HORN_TROMBONE_LOOP, 32767, 64.0F));
        //StartingSounds.STARTING_SOUNDS.put(SAX_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_SAX_START);
        //StartingSounds.STARTING_SOUNDS.put(TUBA_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_TUBA_START);
        //StartingSounds.STARTING_SOUNDS.put(FLUTE_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_FLUTE_START);
        //StartingSounds.STARTING_SOUNDS.put(OBOE_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_OBOE_START);
        //StartingSounds.STARTING_SOUNDS.put(CLARINET_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_CLARINET_START);
        //StartingSounds.STARTING_SOUNDS.put(TRUMPET_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_TRUMPET_START);
        //StartingSounds.STARTING_SOUNDS.put(TROMBONE_COPPER_HORN, RegisterSounds.ITEM_COPPER_HORN_TROMBONE_START);

        Registry.register(Registry.ITEM, WilderSharedConstants.id("baobab_nut"), BAOBAB_NUT);
        //Registry.register(Registry.ITEM, WilderSharedConstants.id("prickly_pear"), PRICKLY_PEAR);
        //Registry.register(Registry.ITEM, WilderSharedConstants.id("peeled_prickly_pear"), PEELED_PRICKLY_PEAR);

        Registry.register(Registry.ITEM, WilderSharedConstants.id("firefly_bottle"), FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("magenta_firefly_bottle"), MAGENTA_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("purple_firefly_bottle"), PURPLE_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("blue_firefly_bottle"), BLUE_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("black_firefly_bottle"), BLACK_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("red_firefly_bottle"), RED_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("green_firefly_bottle"), GREEN_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("brown_firefly_bottle"), BROWN_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("cyan_firefly_bottle"), CYAN_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("light_gray_firefly_bottle"), LIGHT_GRAY_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("gray_firefly_bottle"), GRAY_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("pink_firefly_bottle"), PINK_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("lime_firefly_bottle"), LIME_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("yellow_firefly_bottle"), YELLOW_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("light_blue_firefly_bottle"), LIGHT_BLUE_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("orange_firefly_bottle"), ORANGE_FIREFLY_BOTTLE);
        Registry.register(Registry.ITEM, WilderSharedConstants.id("white_firefly_bottle"), WHITE_FIREFLY_BOTTLE);

        Registry.register(Registry.ITEM, WilderSharedConstants.id("pollen"), POLLEN);

        Registry.register(Registry.ITEM, WilderSharedConstants.id("ancient_horn_fragment"), ANCIENT_HORN_FRAGMENT);

        TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            factories.add(new VillagerTrades.ItemsForEmeralds(RegisterItems.BAOBAB_NUT, 5, 1, 8, 1));
            factories.add(new VillagerTrades.ItemsForEmeralds(RegisterBlocks.CYPRESS_SAPLING.asItem(), 5, 1, 8, 1));
        });
    }
}
