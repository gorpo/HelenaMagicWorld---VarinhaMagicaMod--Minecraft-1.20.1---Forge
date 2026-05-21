package com.example.examplemod.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientEvents {

    @SubscribeEvent
    public static void registerKeys(
            RegisterKeyMappingsEvent event
    ) {

        KeyBindings.register();

        event.register(
                KeyBindings.OPEN_MENU_KEY
        );
    }

    @Mod.EventBusSubscriber(
            value = Dist.CLIENT
    )
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onClientTick(
                TickEvent.ClientTickEvent event
        ) {

            if (event.phase
                    != TickEvent.Phase.END) {
                return;
            }

            Minecraft minecraft =
                    Minecraft.getInstance();

            while (KeyBindings.OPEN_MENU_KEY
                    .consumeClick()) {

                if (minecraft.screen instanceof PremiumMenuScreen) {
                    minecraft.setScreen(null);
                    continue;
                }

                if (minecraft.player == null
                        || minecraft.screen != null) {
                    continue;
                }

                minecraft.setScreen(new PremiumMenuScreen());
            }
        }
    }
}
