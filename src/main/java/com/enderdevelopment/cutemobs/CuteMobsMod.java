package com.enderdevelopment.cutemobs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuteMobsMod implements ModInitializer {
    public static final String MOD_ID = "cutemobs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Cute Mobs Mod");
        registerEntities();
    }

    private void registerEntities() {
                // Register baby mobs and new baby mobs
        EntityType.Builder<CuteBabyMob> cuteBabyMobBuilder = EntityType.Builder.of(CuteBabyMob::new, MobCategory.CREATURE)
                .sized(0.5f, 0.5f);
        EntityType<CuteBabyMob> CUTE_BABY_MOB = Registry.register(Registries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cute_baby_mob"),
                cuteBabyMobBuilder.build("cute_baby_mob"));

        EntityType.Builder<CuteCrab> cuteCrabBuilder = EntityType.Builder.of(CuteCrab::new, MobCategory.CREATURE)
                .sized(0.5f, 0.5f);
        EntityType<CuteCrab> CUTE_CRAB = Registry.register(Registries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cute_crab"),
                cuteCrabBuilder.build("cute_crab"));

        EntityType.Builder<MiniEnderman> miniEndermanBuilder = EntityType.Builder.of(MiniEnderman::new, MobCategory.CREATURE)
                .sized(0.5f, 0.5f);
        EntityType<MiniEnderman> MINI_ENDERMAN = Registry.register(Registries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "mini_enderman"),
                miniEndermanBuilder.build("mini_enderman"));

        EntityType.Builder<CuteLotusFlower> cuteLotusFlowerBuilder = EntityType.Builder.of(CuteLotusFlower::new, MobCategory.CREATURE)
                .sized(0.5f, 0.5f);
        EntityType<CuteLotusFlower> CUTE_LOTUS_FLOWER = Registry.register(Registries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cute_lotus_flower"),
                cuteLotusFlowerBuilder.build("cute_lotus_flower"));

                EntityType.Builder<SlenderBlackCreature> slenderBlackCreatureBuilder = EntityType.Builder.of(SlenderBlackCreature::new, MobCategory.MONSTER)
                .sized(1.5f, 15.0f);
        EntityType<SlenderBlackCreature> SLENDER_BLACK_CREATURE = Registry.register(Registries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "slender_black_creature"),
                slenderBlackCreatureBuilder.build("slender_black_creature"));
    }
}