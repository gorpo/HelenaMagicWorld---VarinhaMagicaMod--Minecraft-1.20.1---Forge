package com.example.examplemod.event;

import com.example.examplemod.ExampleMod;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CraftEvents {

    @SubscribeEvent
    public void onLeftClickBlock(
            PlayerInteractEvent.LeftClickBlock event
    ) {

        Level level = event.getLevel();

        if (level.isClientSide()) return;

        if (event.getEntity().isShiftKeyDown()) {
            return;
        }

        if (event.getHand() != InteractionHand.MAIN_HAND)
            return;

        ItemStack held =
                event.getEntity().getMainHandItem();

        if (held.getItem()
                != ExampleMod.MAGIC_HEMP.get())
            return;

        event.setCanceled(true);

        BlockPos pos = event.getPos();

        var state =
                level.getBlockState(pos);

        if (state.is(Blocks.STONE)
                || state.is(Blocks.ANDESITE)
                || state.is(Blocks.DIORITE)
                || state.is(Blocks.GRANITE)) {

            level.setBlock(
                    pos,
                    Blocks.DIAMOND_BLOCK.defaultBlockState(),
                    3
            );
        }

        else if (state.is(Blocks.COBBLESTONE)) {

            level.setBlock(
                    pos,
                    Blocks.EMERALD_BLOCK.defaultBlockState(),
                    3
            );
        }

        else if (state.is(Blocks.DIRT)
                || state.is(Blocks.GRASS_BLOCK)
                || state.is(Blocks.COARSE_DIRT)) {

            level.setBlock(
                    pos,
                    Blocks.MOSS_BLOCK.defaultBlockState(),
                    3
            );
        }

        else if (state.is(BlockTags.LOGS)) {

            level.setBlock(
                    pos,
                    Blocks.GOLD_BLOCK.defaultBlockState(),
                    3
            );
        }

        ExampleMod.effects(
                (ServerLevel) level,
                pos
        );
    }
}