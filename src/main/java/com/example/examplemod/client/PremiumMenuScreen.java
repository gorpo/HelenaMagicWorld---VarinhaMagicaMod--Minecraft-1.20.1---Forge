package com.example.examplemod.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ObjectSelectionList;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class PremiumMenuScreen extends Screen {

    private PremiumList premiumList;

    private final List<PremiumEntry> premiumEntries =
            new ArrayList<>();

    public PremiumMenuScreen() {
        super(Component.literal("Magic Hemp INFO"));
    }

    @Override
    protected void init() {

        super.init();

        premiumEntries.clear();
        addAnimals();

        premiumList =
                new PremiumList(
                        minecraft
                );

        addRenderableWidget(
                premiumList
        );
    }

    private void addAnimals() {

        premiumEntries.add(new PremiumEntry("Allay", "Allay", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Axolotl", "Axolotl", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Morcego", "Bat", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Abelha", "Bee", "Natureza"));
        premiumEntries.add(new PremiumEntry("Camelo", "Camel", "Casa"));
        premiumEntries.add(new PremiumEntry("Gato", "Cat", "Casa"));
        premiumEntries.add(new PremiumEntry("Galinha", "Chicken", "Metal"));
        premiumEntries.add(new PremiumEntry("Vaca", "Cow", "Metal"));
        premiumEntries.add(new PremiumEntry("Creeper", "Creeper", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Raposa", "Fox", "Casa"));
        premiumEntries.add(new PremiumEntry("Sapo", "Frog", "Casa"));
        premiumEntries.add(new PremiumEntry("Cabra", "Goat", "Casa"));
        premiumEntries.add(new PremiumEntry("Cavalo", "Horse", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Iron Golem", "Iron Golem", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Panda", "Panda", "Casa"));
        premiumEntries.add(new PremiumEntry("Porco", "Pig", "Metal"));
        premiumEntries.add(new PremiumEntry("Coelho", "Rabbit", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Ovelha", "Sheep", "Metal"));
        premiumEntries.add(new PremiumEntry("Snow Golem", "Snow Golem", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Tartaruga", "Turtle", "Casa"));
        premiumEntries.add(new PremiumEntry("Villager", "Villager", "Utilidade"));
        premiumEntries.add(new PremiumEntry("Lobo", "Wolf", "Casa"));
    }



    @Override
    public void render(
            GuiGraphics guiGraphics,
            int mouseX,
            int mouseY,
            float partialTick
    ) {

        renderBackground(guiGraphics);

        int panelWidth = 205;
        int panelHeight = 160;

        int x = (width - panelWidth) / 2;
        int y = (height - panelHeight) / 2;

// BACKGROUND DO MENU
        ResourceLocation background =
                ResourceLocation.tryBuild(
                        "examplemod",
                        "textures/gui/background/background.jpg"
                );

        guiGraphics.blit(
                background,
                x,
                y,
                0,
                0,
                panelWidth,
                panelHeight,
                panelWidth,
                panelHeight
        );

// TRANSPARÊNCIA PRETA POR CIMA
        guiGraphics.fill(
                x,
                y,
                x + panelWidth,
                y + panelHeight,
                0xA0000000
        );

        drawCornerTopLeft(guiGraphics, x + 6, y + 6);
        drawCornerTopRight(guiGraphics, x + panelWidth - 6, y + 6);
        drawCornerBottomLeft(guiGraphics, x + 6, y + panelHeight - 6);
        drawCornerBottomRight(guiGraphics, x + panelWidth - 6, y + panelHeight - 6);

        guiGraphics.drawCenteredString(
                font,
                "Magic Hemp INFO",
                width / 2,
                y + 8,
                0xFF73FF45
        );

        guiGraphics.pose().pushPose();
        guiGraphics.pose().scale(0.75F, 0.75F, 1F);

        guiGraphics.drawCenteredString(
                font,
                "Consulte informacoes do mod",
                (int)((width / 2f) / 0.75F),
                (int)((y + 20) / 0.75F),
                0xFF73FF45
        );

        guiGraphics.pose().popPose();

        // scroll verde
        int scrollX = x + panelWidth - 14;

        guiGraphics.fill(
                scrollX,
                y + 34,
                scrollX + 2,
                y + panelHeight - 24,
                0xFF73FF45
        );

        guiGraphics.drawCenteredString(
                font,
                "▲",
                scrollX + 1,
                y + 22,
                0xFF73FF45
        );

        guiGraphics.drawCenteredString(
                font,
                "▼",
                scrollX + 1,
                y + panelHeight - 18,
                0xFF73FF45
        );

        super.render(
                guiGraphics,
                mouseX,
                mouseY,
                partialTick
        );
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    class PremiumList extends ObjectSelectionList<PremiumList.Entry> {

        public PremiumList(
                Minecraft minecraft
        ) {

            super(
                    minecraft,
                    300,
                    150,
                    (PremiumMenuScreen.this.height / 2) - 50,
                    (PremiumMenuScreen.this.height / 2) + 72,
                    40
            );

            setRenderBackground(false);
            setRenderTopAndBottom(false);
            setRenderSelection(false);

            for (PremiumEntry entry : premiumEntries) {
                addEntry(new Entry(entry));
            }
        }

        @Override
        public int getRowLeft() {
            return (PremiumMenuScreen.this.width - 175) / 2;
        }

        @Override
        public int getRowWidth() {
            return 900;
        }

        @Override
        protected int getScrollbarPosition() {
            return (PremiumMenuScreen.this.width / 2) + 86;
        }


        //barra de rolagem---------------------------------------
        @Override
        protected void renderDecorations(
                GuiGraphics guiGraphics,
                int mouseX,
                int mouseY
        ) {

            int scrollX =
                    premiumList.getScrollbarPosition() + 2;

            int top =
                    premiumList.y0 + 4;

            int bottom =
                    premiumList.y1 - 4;

            int trackHeight =
                    bottom - top;

            double maxScroll =
                    premiumList.getMaxScroll();

            int thumbHeight = 30;

            int thumbY = top;

            if (maxScroll > 0) {
                thumbY += (int)(
                        (premiumList.getScrollAmount() / maxScroll)
                                * (trackHeight - thumbHeight)
                );


            }

            guiGraphics.fill(
                    scrollX - 3,
                    thumbY - 4,
                    scrollX + 5,
                    thumbY + thumbHeight + 4,
                    0xFF73FF45
            );
        }

        class Entry extends ObjectSelectionList.Entry<Entry> {

            private final PremiumEntry entry;

            public Entry(PremiumEntry entry) {
                this.entry = entry;
            }

            @Override
            public void render(
                    GuiGraphics guiGraphics,
                    int index,
                    int top,
                    int left,
                    int width,
                    int height,
                    int mouseX,
                    int mouseY,
                    boolean hovered,
                    float partialTick
            ) {

                guiGraphics.fill(
                        left,
                        top,
                        left + width,
                        top + height - 1,
                        hovered
                                ? 0x44181818
                                : 0x33111111
                );

                // caixa imagem maior
                guiGraphics.fill(
                        left + 4,
                        top + 2,
                        left + 36,
                        top + 34,
                        0x55000000
                );

                drawThinGreenBox(
                        guiGraphics,
                        left + 4,
                        top + 2,
                        32,
                        32
                );

                drawMobImage(
                        guiGraphics,
                        left + 6,
                        top + 4
                );

                // texto
                guiGraphics.pose().pushPose();
                guiGraphics.pose().scale(
                        0.85F,
                        0.85F,
                        1F
                );

                guiGraphics.drawString(
                        font,
                        entry.getDisplayName(),
                        (int)((left + 42) / 0.85F),
                        (int)((top + 5) / 0.85F),
                        0xFF73FF45
                );

                guiGraphics.drawString(
                        font,
                        entry.getCategory(),
                        (int)((left + 42) / 0.85F),
                        (int)((top + 18) / 0.85F),
                        0xFF73FF45
                );

                guiGraphics.pose().popPose();
            }

            private void drawMobImage(
                    GuiGraphics guiGraphics,
                    int x,
                    int y
            ) {

                String fileName =
                        entry.getEnglishName()
                                .toLowerCase()
                                .replace(" ", "_");

                ResourceLocation texture =
                        ResourceLocation.tryParse(
                                "examplemod:textures/gui/mobs/"
                                        + fileName
                                        + ".png"
                        );

                RenderSystem.enableBlend();

                guiGraphics.blit(
                        texture,
                        x,
                        y,
                        0,
                        0,
                        28,
                        28,
                        28,
                        28
                );
            }

            @Override
            public boolean mouseClicked(
                    double mouseX,
                    double mouseY,
                    int button
            ) {

                minecraft.setScreen(
                        new PremiumDetailsScreen(entry)
                );

                return true;
            }

            @Override
            public Component getNarration() {
                return Component.literal(
                        entry.getDisplayName()
                );
            }
        }
    }

    private void drawThinGreenBox(
            GuiGraphics guiGraphics,
            int x,
            int y,
            int width,
            int height
    ) {

        guiGraphics.fill(x, y, x + width, y + 1, 0xFF73FF45);
        guiGraphics.fill(x, y, x + 1, y + height, 0xFF73FF45);
        guiGraphics.fill(x + width - 1, y, x + width, y + height, 0xFF73FF45);
        guiGraphics.fill(x, y + height - 1, x + width, y + height, 0xFF73FF45);
    }

    private void drawBorder(
            GuiGraphics guiGraphics,
            int x,
            int y,
            int width,
            int height
    ) {

        guiGraphics.fill(x, y, x + width, y + 1, 0xFF5A5A5A);
        guiGraphics.fill(x, y, x + 1, y + height, 0xFF5A5A5A);
        guiGraphics.fill(x + width - 1, y, x + width, y + height, 0xFF5A5A5A);
        guiGraphics.fill(x, y + height - 1, x + width, y + height, 0xFF5A5A5A);
    }

    private void drawCornerTopLeft(GuiGraphics g, int x, int y) {
        g.fill(x, y, x + 6, y + 1, 0xFF73FF45);
        g.fill(x, y, x + 1, y + 6, 0xFF73FF45);
    }

    private void drawCornerTopRight(GuiGraphics g, int x, int y) {
        g.fill(x - 5, y, x + 1, y + 1, 0xFF73FF45);
        g.fill(x, y, x + 1, y + 6, 0xFF73FF45);
    }

    private void drawCornerBottomLeft(GuiGraphics g, int x, int y) {
        g.fill(x, y, x + 6, y + 1, 0xFF73FF45);
        g.fill(x, y - 5, x + 1, y + 1, 0xFF73FF45);
    }

    private void drawCornerBottomRight(GuiGraphics g, int x, int y) {
        g.fill(x - 5, y, x + 1, y + 1, 0xFF73FF45);
        g.fill(x, y - 5, x + 1, y + 1, 0xFF73FF45);
    }
}