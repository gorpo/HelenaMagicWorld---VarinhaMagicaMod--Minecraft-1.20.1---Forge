package com.example.examplemod.client.menus;

import com.example.examplemod.client.PremiumEntry;
import com.example.examplemod.client.PremiumMenuScreen;
import net.minecraft.world.item.Items;

import java.util.List;

public final class BiomeTeleportMenu {

    private BiomeTeleportMenu() {
    }

    public static void add(List<PremiumEntry> entries) {
        biome(entries, "Planicies", "Plains", Items.GRASS_BLOCK, "locate biome minecraft:plains");
        biome(entries, "Deserto", "Desert", Items.SAND, "locate biome minecraft:desert");
        biome(entries, "Selva", "Jungle", Items.JUNGLE_SAPLING, "locate biome minecraft:jungle");
        biome(entries, "Taiga", "Taiga", Items.SPRUCE_SAPLING, "locate biome minecraft:taiga");
        biome(entries, "Pantano", "Swamp", Items.MANGROVE_ROOTS, "locate biome minecraft:swamp");
        biome(entries, "Ermo", "Badlands", Items.RED_SAND, "locate biome minecraft:badlands");
        biome(entries, "Cogumelos", "Mushroom Fields", Items.RED_MUSHROOM_BLOCK, "locate biome minecraft:mushroom_fields");
    }

    private static void biome(List<PremiumEntry> entries, String name, String englishName, net.minecraft.world.item.Item icon, String command) {
        MenuEntryFactory.command(entries, PremiumMenuScreen.MenuTab.BIOME_TELEPORT, name, englishName, "Localizar bioma", command, "Vanilla retorna coordenadas no chat.", icon, command);
    }
}
