package com.enderdevelopment.cutemobs.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class SlenderBlackCreatureBehavior {
    public static void onHit(LivingEntity entity, Level level) {
        if (!level.isClientSide) {
            level.players().forEach(player -> {
                player.sendSystemMessage(Component.literal("Misclick?"));
            });
        }
    }

    public static void onKill(LivingEntity entity, Level level) {
        if (!level.isClientSide) {
            level.players().forEach(player -> {
                player.sendSystemMessage(Component.literal("You monster").withStyle(ChatFormatting.RED));
            });
        }
    }

    public static void onStalk(LivingEntity entity, Level level) {
        // Implement stalking behavior
    }

    public static void onHide(LivingEntity entity, Level level) {
        // Implement hiding behavior
    }

    public static void onAppear(LivingEntity entity, Level level) {
        // Implement appearing behavior
    }
}