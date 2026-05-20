package com.example.examplemod.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class PremiumDetailsScreen extends Screen {

    private final PremiumEntry entry;

    public PremiumDetailsScreen(PremiumEntry entry) {
        super(Component.literal(entry.getDisplayName()));
        this.entry = entry;
    }

    @Override
    protected void init() {

    }

    @Override
    public void render(
            GuiGraphics guiGraphics,
            int mouseX,
            int mouseY,
            float partialTick
    ) {

        renderBackground(guiGraphics);

        int panelWidth = 176;
        int panelHeight = 136;

        int x = (width - panelWidth) / 2;
        int y = (height - panelHeight) / 2;

        guiGraphics.fill(
                x,
                y,
                x + panelWidth,
                y + panelHeight,
                0xA0000000
        );

        drawBorder(guiGraphics, x, y, panelWidth, panelHeight);

        drawCornerTopLeft(guiGraphics, x + 6, y + 6);
        drawCornerTopRight(guiGraphics, x + panelWidth - 6, y + 6);
        drawCornerBottomLeft(guiGraphics, x + 6, y + panelHeight - 6);
        drawCornerBottomRight(guiGraphics, x + panelWidth - 6, y + panelHeight - 6);

        // TITULO (mantido)
        guiGraphics.drawCenteredString(
                font,
                entry.getDisplayName(),
                width / 2,
                y + 9,
                0xFF73FF45
        );

        // MOB
        int mobX = x + 16;
        int mobY = y + 30;
        int mobSize = 40;

        guiGraphics.fill(
                mobX,
                mobY,
                mobX + mobSize,
                mobY + mobSize,
                0x55000000
        );

        drawGreenBox(
                guiGraphics,
                mobX,
                mobY,
                mobSize,
                mobSize
        );

        drawMobFace(
                guiGraphics,
                mobX + 6,
                mobY + 6
        );

        // ===== TEXTO MENOR =====
        guiGraphics.pose().pushPose();

        // 65% do tamanho original
        guiGraphics.pose().scale(0.65F, 0.65F, 1F);

        float tx = (x + 66) / 0.65F;

        // Categoria
        guiGraphics.drawString(
                font,
                "Categoria:",
                (int) tx,
                (int) ((y + 36) / 0.65F),
                0xFF73FF45
        );

        guiGraphics.drawString(
                font,
                entry.getCategory(),
                (int) tx,
                (int) ((y + 44) / 0.65F),
                0xFFFFFFFF
        );

        // Transformacao
        guiGraphics.drawString(
                font,
                "Transformacao:",
                (int) tx,
                (int) ((y + 62) / 0.65F),
                0xFF73FF45
        );

        guiGraphics.drawString(
                font,
                getTransformation(),
                (int) tx,
                (int) ((y + 70) / 0.65F),
                0xFFFFFFFF
        );

        // Atributos
        guiGraphics.drawString(
                font,
                "Atributos:",
                (int) tx,
                (int) ((y + 86) / 0.65F),
                0xFF73FF45
        );

        guiGraphics.drawString(
                font,
                getAttributes(),
                (int) tx,
                (int) ((y + 94) / 0.65F),
                0xFFFFFFFF
        );

        guiGraphics.pose().popPose();

        // BOTAO
        int bx = width / 2 - 32;
        int by = y + 111;
        int bw = 64;
        int bh = 16;

        guiGraphics.fill(
                bx,
                by,
                bx + bw,
                by + bh,
                0xAA111111
        );

        drawGreenBox(
                guiGraphics,
                bx,
                by,
                bw,
                bh
        );

        guiGraphics.drawCenteredString(
                font,
                "Voltar",
                width / 2,
                by + 4,
                0xFF73FF45
        );
    }

    @Override
    public boolean mouseClicked(
            double mouseX,
            double mouseY,
            int button
    ) {

        int panelHeight = 136;
        int y = (height - panelHeight) / 2;

        int bx = width / 2 - 32;
        int by = y + 111;

        if (mouseX >= bx
                && mouseX <= bx + 64
                && mouseY >= by
                && mouseY <= by + 16) {

            minecraft.setScreen(
                    new PremiumMenuScreen()
            );

            return true;
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    private void drawGreenBox(
            GuiGraphics guiGraphics,
            int x,
            int y,
            int width,
            int height
    ) {

        guiGraphics.fill(x, y, x + width, y + 2, 0xFF73FF45);
        guiGraphics.fill(x, y, x + 2, y + height, 0xFF73FF45);
        guiGraphics.fill(x + width - 2, y, x + width, y + height, 0xFF73FF45);
        guiGraphics.fill(x, y + height - 2, x + width, y + height, 0xFF73FF45);
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

    private void drawMobFace(
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

    private String getTransformation() {
        return "Encantamentos";
    }

    private String getAttributes() {
        return "+ Bonus encantamento";
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}