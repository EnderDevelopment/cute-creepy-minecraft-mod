package com.enderdevelopment.cutemobs.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class CuteMobBehavior {
    public static void onEncounter(LivingEntity entity, Level level) {
        if (!level.isClientSide) {
            level.players().forEach(player -> {
                player.sendSystemMessage(Component.literal("how cute!"));
            });
        }
    }

    public static void onHurt(LivingEntity entity, Level level) {
        if (!level.isClientSide) {
            level.players().forEach(player -> {
                player.sendSystemMessage(Component.literal("poor thing"));
            });
        }
    }

    public static void onAttacked(LivingEntity entity, Level level) {
        if (!level.isClientSide) {
            level.players().forEach(player -> {
                player.sendSystemMessage(Component.literal("How dare you?").withStyle(ChatFormatting.RED));
            });
        }
    }
}