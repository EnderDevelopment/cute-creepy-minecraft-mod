package com.enderdevelopment.cutemobs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class SlenderBlackCreature extends Monster {
    protected SlenderBlackCreature(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean isBaby() {
        return false;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // Add goals for the Slender black creature
    }
}