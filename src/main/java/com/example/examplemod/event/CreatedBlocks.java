package com.example.examplemod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class CreatedBlocks {

    public static boolean transform(
            Level level,
            BlockPos pos,
            BlockState state
    ) {

        // PLANKS
        if (state.is(Blocks.OAK_PLANKS)
                || state.is(Blocks.SPRUCE_PLANKS)
                || state.is(Blocks.BIRCH_PLANKS)
                || state.is(Blocks.JUNGLE_PLANKS)
                || state.is(Blocks.ACACIA_PLANKS)
                || state.is(Blocks.DARK_OAK_PLANKS)
                || state.is(Blocks.MANGROVE_PLANKS)
                || state.is(Blocks.CHERRY_PLANKS)
                || state.is(Blocks.BAMBOO_PLANKS)
                || state.is(Blocks.BAMBOO_MOSAIC)
                || state.is(Blocks.CRIMSON_PLANKS)
                || state.is(Blocks.WARPED_PLANKS)) {

            change(level, pos, state, Blocks.HONEYCOMB_BLOCK);
            return true;
        }

        else if (state.is(Blocks.HONEYCOMB_BLOCK)) {

            change(level, pos, state, Blocks.OAK_PLANKS);
            return true;
        }

        // FENCES
        else if (state.is(Blocks.OAK_FENCE)
                || state.is(Blocks.SPRUCE_FENCE)
                || state.is(Blocks.BIRCH_FENCE)
                || state.is(Blocks.JUNGLE_FENCE)
                || state.is(Blocks.ACACIA_FENCE)
                || state.is(Blocks.DARK_OAK_FENCE)
                || state.is(Blocks.MANGROVE_FENCE)
                || state.is(Blocks.CHERRY_FENCE)
                || state.is(Blocks.BAMBOO_FENCE)
                || state.is(Blocks.CRIMSON_FENCE)
                || state.is(Blocks.WARPED_FENCE)) {

            change(level, pos, state, Blocks.IRON_BARS);
            return true;
        }

        else if (state.is(Blocks.IRON_BARS)) {

            change(level, pos, state, Blocks.OAK_FENCE);
            return true;
        }

        // FENCE GATES
        else if (state.is(Blocks.OAK_FENCE_GATE)
                || state.is(Blocks.SPRUCE_FENCE_GATE)
                || state.is(Blocks.BIRCH_FENCE_GATE)
                || state.is(Blocks.JUNGLE_FENCE_GATE)
                || state.is(Blocks.ACACIA_FENCE_GATE)
                || state.is(Blocks.DARK_OAK_FENCE_GATE)
                || state.is(Blocks.MANGROVE_FENCE_GATE)
                || state.is(Blocks.CHERRY_FENCE_GATE)
                || state.is(Blocks.BAMBOO_FENCE_GATE)
                || state.is(Blocks.CRIMSON_FENCE_GATE)
                || state.is(Blocks.WARPED_FENCE_GATE)) {

            change(level, pos, state, Blocks.CHAIN);
            return true;
        }

        else if (state.is(Blocks.CHAIN)) {

            change(level, pos, state, Blocks.OAK_FENCE_GATE);
            return true;
        }

        // DOORS
        else if (state.is(Blocks.OAK_DOOR)
                || state.is(Blocks.SPRUCE_DOOR)
                || state.is(Blocks.BIRCH_DOOR)
                || state.is(Blocks.JUNGLE_DOOR)
                || state.is(Blocks.ACACIA_DOOR)
                || state.is(Blocks.DARK_OAK_DOOR)
                || state.is(Blocks.MANGROVE_DOOR)
                || state.is(Blocks.CHERRY_DOOR)
                || state.is(Blocks.BAMBOO_DOOR)
                || state.is(Blocks.CRIMSON_DOOR)
                || state.is(Blocks.WARPED_DOOR)) {

            change(level, pos, state, Blocks.IRON_DOOR);
            return true;
        }

        else if (state.is(Blocks.IRON_DOOR)) {

            change(level, pos, state, Blocks.OAK_DOOR);
            return true;
        }

        // TRAPDOORS
        else if (state.is(Blocks.OAK_TRAPDOOR)
                || state.is(Blocks.SPRUCE_TRAPDOOR)
                || state.is(Blocks.BIRCH_TRAPDOOR)
                || state.is(Blocks.JUNGLE_TRAPDOOR)
                || state.is(Blocks.ACACIA_TRAPDOOR)
                || state.is(Blocks.DARK_OAK_TRAPDOOR)
                || state.is(Blocks.MANGROVE_TRAPDOOR)
                || state.is(Blocks.CHERRY_TRAPDOOR)
                || state.is(Blocks.BAMBOO_TRAPDOOR)
                || state.is(Blocks.CRIMSON_TRAPDOOR)
                || state.is(Blocks.WARPED_TRAPDOOR)) {

            change(level, pos, state, Blocks.IRON_TRAPDOOR);
            return true;
        }

        else if (state.is(Blocks.IRON_TRAPDOOR)) {

            change(level, pos, state, Blocks.OAK_TRAPDOOR);
            return true;
        }

        // STAIRS
        else if (state.is(Blocks.OAK_STAIRS)
                || state.is(Blocks.SPRUCE_STAIRS)
                || state.is(Blocks.BIRCH_STAIRS)
                || state.is(Blocks.JUNGLE_STAIRS)
                || state.is(Blocks.ACACIA_STAIRS)
                || state.is(Blocks.DARK_OAK_STAIRS)
                || state.is(Blocks.MANGROVE_STAIRS)
                || state.is(Blocks.CHERRY_STAIRS)
                || state.is(Blocks.BAMBOO_STAIRS)
                || state.is(Blocks.BAMBOO_MOSAIC_STAIRS)
                || state.is(Blocks.CRIMSON_STAIRS)
                || state.is(Blocks.WARPED_STAIRS)) {

            change(level, pos, state, Blocks.STONE_BRICK_STAIRS);
            return true;
        }

        else if (state.is(Blocks.STONE_BRICK_STAIRS)) {

            change(level, pos, state, Blocks.OAK_STAIRS);
            return true;
        }

        // SLABS
        else if (state.is(Blocks.OAK_SLAB)
                || state.is(Blocks.SPRUCE_SLAB)
                || state.is(Blocks.BIRCH_SLAB)
                || state.is(Blocks.JUNGLE_SLAB)
                || state.is(Blocks.ACACIA_SLAB)
                || state.is(Blocks.DARK_OAK_SLAB)
                || state.is(Blocks.MANGROVE_SLAB)
                || state.is(Blocks.CHERRY_SLAB)
                || state.is(Blocks.BAMBOO_SLAB)
                || state.is(Blocks.BAMBOO_MOSAIC_SLAB)
                || state.is(Blocks.CRIMSON_SLAB)
                || state.is(Blocks.WARPED_SLAB)) {

            change(level, pos, state, Blocks.STONE_BRICK_SLAB);
            return true;
        }

        else if (state.is(Blocks.STONE_BRICK_SLAB)) {

            change(level, pos, state, Blocks.OAK_SLAB);
            return true;
        }

        // BUTTONS
        else if (state.is(Blocks.OAK_BUTTON)
                || state.is(Blocks.SPRUCE_BUTTON)
                || state.is(Blocks.BIRCH_BUTTON)
                || state.is(Blocks.JUNGLE_BUTTON)
                || state.is(Blocks.ACACIA_BUTTON)
                || state.is(Blocks.DARK_OAK_BUTTON)
                || state.is(Blocks.MANGROVE_BUTTON)
                || state.is(Blocks.CHERRY_BUTTON)
                || state.is(Blocks.BAMBOO_BUTTON)
                || state.is(Blocks.CRIMSON_BUTTON)
                || state.is(Blocks.WARPED_BUTTON)) {

            change(level, pos, state, Blocks.STONE_BUTTON);
            return true;
        }

        else if (state.is(Blocks.STONE_BUTTON)) {

            change(level, pos, state, Blocks.OAK_BUTTON);
            return true;
        }

        // PRESSURE PLATES
        else if (state.is(Blocks.OAK_PRESSURE_PLATE)
                || state.is(Blocks.SPRUCE_PRESSURE_PLATE)
                || state.is(Blocks.BIRCH_PRESSURE_PLATE)
                || state.is(Blocks.JUNGLE_PRESSURE_PLATE)
                || state.is(Blocks.ACACIA_PRESSURE_PLATE)
                || state.is(Blocks.DARK_OAK_PRESSURE_PLATE)
                || state.is(Blocks.MANGROVE_PRESSURE_PLATE)
                || state.is(Blocks.CHERRY_PRESSURE_PLATE)
                || state.is(Blocks.BAMBOO_PRESSURE_PLATE)
                || state.is(Blocks.CRIMSON_PRESSURE_PLATE)
                || state.is(Blocks.WARPED_PRESSURE_PLATE)) {

            change(level, pos, state, Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
            return true;
        }

        else if (state.is(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)) {

            change(level, pos, state, Blocks.OAK_PRESSURE_PLATE);
            return true;
        }

        // WALLS
        else if (state.is(Blocks.COBBLESTONE_WALL)
                || state.is(Blocks.MOSSY_COBBLESTONE_WALL)
                || state.is(Blocks.BRICK_WALL)
                || state.is(Blocks.PRISMARINE_WALL)
                || state.is(Blocks.RED_SANDSTONE_WALL)
                || state.is(Blocks.MOSSY_STONE_BRICK_WALL)
                || state.is(Blocks.GRANITE_WALL)
                || state.is(Blocks.STONE_BRICK_WALL)
                || state.is(Blocks.NETHER_BRICK_WALL)
                || state.is(Blocks.ANDESITE_WALL)
                || state.is(Blocks.RED_NETHER_BRICK_WALL)
                || state.is(Blocks.SANDSTONE_WALL)
                || state.is(Blocks.END_STONE_BRICK_WALL)
                || state.is(Blocks.DIORITE_WALL)
                || state.is(Blocks.BLACKSTONE_WALL)
                || state.is(Blocks.POLISHED_BLACKSTONE_WALL)
                || state.is(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
                || state.is(Blocks.COBBLED_DEEPSLATE_WALL)
                || state.is(Blocks.POLISHED_DEEPSLATE_WALL)
                || state.is(Blocks.DEEPSLATE_BRICK_WALL)
                || state.is(Blocks.DEEPSLATE_TILE_WALL)
                || state.is(Blocks.MUD_BRICK_WALL)) {

            change(level, pos, state, Blocks.OBSIDIAN);
            return true;
        }

        else if (state.is(Blocks.OBSIDIAN)) {

            change(level, pos, state, Blocks.COBBLESTONE_WALL);
            return true;
        }

        // GLASS PANES
        else if (state.is(Blocks.GLASS_PANE)
                || state.is(Blocks.WHITE_STAINED_GLASS_PANE)
                || state.is(Blocks.ORANGE_STAINED_GLASS_PANE)
                || state.is(Blocks.MAGENTA_STAINED_GLASS_PANE)
                || state.is(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                || state.is(Blocks.YELLOW_STAINED_GLASS_PANE)
                || state.is(Blocks.LIME_STAINED_GLASS_PANE)
                || state.is(Blocks.PINK_STAINED_GLASS_PANE)
                || state.is(Blocks.GRAY_STAINED_GLASS_PANE)
                || state.is(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                || state.is(Blocks.CYAN_STAINED_GLASS_PANE)
                || state.is(Blocks.PURPLE_STAINED_GLASS_PANE)
                || state.is(Blocks.BLUE_STAINED_GLASS_PANE)
                || state.is(Blocks.BROWN_STAINED_GLASS_PANE)
                || state.is(Blocks.GREEN_STAINED_GLASS_PANE)
                || state.is(Blocks.RED_STAINED_GLASS_PANE)
                || state.is(Blocks.BLACK_STAINED_GLASS_PANE)) {

            change(level, pos, state, Blocks.TINTED_GLASS);
            return true;
        }

        else if (state.is(Blocks.TINTED_GLASS)) {

            change(level, pos, state, Blocks.GLASS_PANE);
            return true;
        }

        // SIGNS
        else if (state.is(Blocks.OAK_SIGN)
                || state.is(Blocks.SPRUCE_SIGN)
                || state.is(Blocks.BIRCH_SIGN)
                || state.is(Blocks.JUNGLE_SIGN)
                || state.is(Blocks.ACACIA_SIGN)
                || state.is(Blocks.DARK_OAK_SIGN)
                || state.is(Blocks.MANGROVE_SIGN)
                || state.is(Blocks.CHERRY_SIGN)
                || state.is(Blocks.BAMBOO_SIGN)
                || state.is(Blocks.CRIMSON_SIGN)
                || state.is(Blocks.WARPED_SIGN)
                || state.is(Blocks.OAK_WALL_SIGN)
                || state.is(Blocks.SPRUCE_WALL_SIGN)
                || state.is(Blocks.BIRCH_WALL_SIGN)
                || state.is(Blocks.JUNGLE_WALL_SIGN)
                || state.is(Blocks.ACACIA_WALL_SIGN)
                || state.is(Blocks.DARK_OAK_WALL_SIGN)
                || state.is(Blocks.MANGROVE_WALL_SIGN)
                || state.is(Blocks.CHERRY_WALL_SIGN)
                || state.is(Blocks.BAMBOO_WALL_SIGN)
                || state.is(Blocks.CRIMSON_WALL_SIGN)
                || state.is(Blocks.WARPED_WALL_SIGN)) {

            change(level, pos, state, Blocks.BOOKSHELF);
            return true;
        }

        else if (state.is(Blocks.BOOKSHELF)) {

            change(level, pos, state, Blocks.OAK_SIGN);
            return true;
        }

        // HANGING SIGNS
        else if (state.is(Blocks.OAK_HANGING_SIGN)
                || state.is(Blocks.SPRUCE_HANGING_SIGN)
                || state.is(Blocks.BIRCH_HANGING_SIGN)
                || state.is(Blocks.JUNGLE_HANGING_SIGN)
                || state.is(Blocks.ACACIA_HANGING_SIGN)
                || state.is(Blocks.DARK_OAK_HANGING_SIGN)
                || state.is(Blocks.MANGROVE_HANGING_SIGN)
                || state.is(Blocks.CHERRY_HANGING_SIGN)
                || state.is(Blocks.BAMBOO_HANGING_SIGN)
                || state.is(Blocks.CRIMSON_HANGING_SIGN)
                || state.is(Blocks.WARPED_HANGING_SIGN)
                || state.is(Blocks.OAK_WALL_HANGING_SIGN)
                || state.is(Blocks.SPRUCE_WALL_HANGING_SIGN)
                || state.is(Blocks.BIRCH_WALL_HANGING_SIGN)
                || state.is(Blocks.JUNGLE_WALL_HANGING_SIGN)
                || state.is(Blocks.ACACIA_WALL_HANGING_SIGN)
                || state.is(Blocks.DARK_OAK_WALL_HANGING_SIGN)
                || state.is(Blocks.MANGROVE_WALL_HANGING_SIGN)
                || state.is(Blocks.CHERRY_WALL_HANGING_SIGN)
                || state.is(Blocks.BAMBOO_WALL_HANGING_SIGN)
                || state.is(Blocks.CRIMSON_WALL_HANGING_SIGN)
                || state.is(Blocks.WARPED_WALL_HANGING_SIGN)) {

            change(level, pos, state, Blocks.CHISELED_BOOKSHELF);
            return true;
        }

        else if (state.is(Blocks.CHISELED_BOOKSHELF)) {

            change(level, pos, state, Blocks.OAK_HANGING_SIGN);
            return true;
        }

        // WOOL
        else if (state.is(Blocks.WHITE_WOOL)
                || state.is(Blocks.ORANGE_WOOL)
                || state.is(Blocks.MAGENTA_WOOL)
                || state.is(Blocks.LIGHT_BLUE_WOOL)
                || state.is(Blocks.YELLOW_WOOL)
                || state.is(Blocks.LIME_WOOL)
                || state.is(Blocks.PINK_WOOL)
                || state.is(Blocks.GRAY_WOOL)
                || state.is(Blocks.LIGHT_GRAY_WOOL)
                || state.is(Blocks.CYAN_WOOL)
                || state.is(Blocks.PURPLE_WOOL)
                || state.is(Blocks.BLUE_WOOL)
                || state.is(Blocks.BROWN_WOOL)
                || state.is(Blocks.GREEN_WOOL)
                || state.is(Blocks.RED_WOOL)
                || state.is(Blocks.BLACK_WOOL)) {

            change(level, pos, state, Blocks.GREEN_CONCRETE);
            return true;
        }

        else if (state.is(Blocks.GREEN_CONCRETE)) {

            change(level, pos, state, Blocks.WHITE_WOOL);
            return true;
        }

        // CARPETS
        else if (state.is(Blocks.WHITE_CARPET)
                || state.is(Blocks.ORANGE_CARPET)
                || state.is(Blocks.MAGENTA_CARPET)
                || state.is(Blocks.LIGHT_BLUE_CARPET)
                || state.is(Blocks.YELLOW_CARPET)
                || state.is(Blocks.LIME_CARPET)
                || state.is(Blocks.PINK_CARPET)
                || state.is(Blocks.GRAY_CARPET)
                || state.is(Blocks.LIGHT_GRAY_CARPET)
                || state.is(Blocks.CYAN_CARPET)
                || state.is(Blocks.PURPLE_CARPET)
                || state.is(Blocks.BLUE_CARPET)
                || state.is(Blocks.BROWN_CARPET)
                || state.is(Blocks.GREEN_CARPET)
                || state.is(Blocks.RED_CARPET)
                || state.is(Blocks.BLACK_CARPET)) {

            change(level, pos, state, Blocks.MOSS_CARPET);
            return true;
        }

        else if (state.is(Blocks.MOSS_CARPET)) {

            change(level, pos, state, Blocks.WHITE_CARPET);
            return true;
        }

        // BEDS
        else if (state.is(Blocks.WHITE_BED)
                || state.is(Blocks.ORANGE_BED)
                || state.is(Blocks.MAGENTA_BED)
                || state.is(Blocks.LIGHT_BLUE_BED)
                || state.is(Blocks.YELLOW_BED)
                || state.is(Blocks.LIME_BED)
                || state.is(Blocks.PINK_BED)
                || state.is(Blocks.GRAY_BED)
                || state.is(Blocks.LIGHT_GRAY_BED)
                || state.is(Blocks.CYAN_BED)
                || state.is(Blocks.PURPLE_BED)
                || state.is(Blocks.BLUE_BED)
                || state.is(Blocks.BROWN_BED)
                || state.is(Blocks.GREEN_BED)
                || state.is(Blocks.RED_BED)
                || state.is(Blocks.BLACK_BED)) {

            change(level, pos, state, Blocks.SEA_LANTERN);
            return true;
        }

        else if (state.is(Blocks.SEA_LANTERN)) {

            change(level, pos, state, Blocks.WHITE_BED);
            return true;
        }

        // WORK BLOCKS
        else if (state.is(Blocks.CRAFTING_TABLE)) {

            change(level, pos, state, Blocks.SMITHING_TABLE);
            return true;
        }

        else if (state.is(Blocks.SMITHING_TABLE)) {

            change(level, pos, state, Blocks.CRAFTING_TABLE);
            return true;
        }

        else if (state.is(Blocks.FURNACE)) {

            change(level, pos, state, Blocks.BLAST_FURNACE);
            return true;
        }

        else if (state.is(Blocks.BLAST_FURNACE)) {

            change(level, pos, state, Blocks.FURNACE);
            return true;
        }

        else if (state.is(Blocks.SMOKER)) {

            change(level, pos, state, Blocks.CAMPFIRE);
            return true;
        }

        else if (state.is(Blocks.CAMPFIRE)) {

            change(level, pos, state, Blocks.SMOKER);
            return true;
        }

        else if (state.is(Blocks.CARTOGRAPHY_TABLE)) {

            change(level, pos, state, Blocks.LECTERN);
            return true;
        }

        else if (state.is(Blocks.LECTERN)) {

            change(level, pos, state, Blocks.CARTOGRAPHY_TABLE);
            return true;
        }

        else if (state.is(Blocks.FLETCHING_TABLE)) {

            change(level, pos, state, Blocks.TARGET);
            return true;
        }

        else if (state.is(Blocks.TARGET)) {

            change(level, pos, state, Blocks.FLETCHING_TABLE);
            return true;
        }

        else if (state.is(Blocks.GRINDSTONE)) {

            change(level, pos, state, Blocks.ANVIL);
            return true;
        }

        else if (state.is(Blocks.ANVIL)) {

            change(level, pos, state, Blocks.GRINDSTONE);
            return true;
        }

        else if (state.is(Blocks.LOOM)) {

            change(level, pos, state, Blocks.NOTE_BLOCK);
            return true;
        }

        else if (state.is(Blocks.NOTE_BLOCK)) {

            change(level, pos, state, Blocks.LOOM);
            return true;
        }

        else if (state.is(Blocks.STONECUTTER)) {

            change(level, pos, state, Blocks.CUT_COPPER);
            return true;
        }

        else if (state.is(Blocks.CUT_COPPER)) {

            change(level, pos, state, Blocks.STONECUTTER);
            return true;
        }

        // STORAGE BLOCKS
        else if (state.is(Blocks.CHEST)) {

            change(level, pos, state, Blocks.BARREL);
            return true;
        }

        else if (state.is(Blocks.BARREL)) {

            change(level, pos, state, Blocks.CHEST);
            return true;
        }

        else if (state.is(Blocks.TRAPPED_CHEST)) {

            change(level, pos, state, Blocks.ENDER_CHEST);
            return true;
        }

        else if (state.is(Blocks.ENDER_CHEST)) {

            change(level, pos, state, Blocks.TRAPPED_CHEST);
            return true;
        }

        return false;
    }

    private static void change(
            Level level,
            BlockPos pos,
            BlockState currentState,
            Block newBlock
    ) {

        level.setBlock(
                pos,
                copyProperties(
                        currentState,
                        newBlock.defaultBlockState()
                ),
                3
        );
    }

    private static BlockState copyProperties(
            BlockState currentState,
            BlockState newState
    ) {

        if (currentState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)
                && newState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.HORIZONTAL_FACING,
                            currentState.getValue(BlockStateProperties.HORIZONTAL_FACING)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.FACING)
                && newState.hasProperty(BlockStateProperties.FACING)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.FACING,
                            currentState.getValue(BlockStateProperties.FACING)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.AXIS)
                && newState.hasProperty(BlockStateProperties.AXIS)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.AXIS,
                            currentState.getValue(BlockStateProperties.AXIS)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.HALF)
                && newState.hasProperty(BlockStateProperties.HALF)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.HALF,
                            currentState.getValue(BlockStateProperties.HALF)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.STAIRS_SHAPE)
                && newState.hasProperty(BlockStateProperties.STAIRS_SHAPE)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.STAIRS_SHAPE,
                            currentState.getValue(BlockStateProperties.STAIRS_SHAPE)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.SLAB_TYPE)
                && newState.hasProperty(BlockStateProperties.SLAB_TYPE)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.SLAB_TYPE,
                            currentState.getValue(BlockStateProperties.SLAB_TYPE)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF)
                && newState.hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.DOUBLE_BLOCK_HALF,
                            currentState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.DOOR_HINGE)
                && newState.hasProperty(BlockStateProperties.DOOR_HINGE)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.DOOR_HINGE,
                            currentState.getValue(BlockStateProperties.DOOR_HINGE)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.ATTACH_FACE)
                && newState.hasProperty(BlockStateProperties.ATTACH_FACE)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.ATTACH_FACE,
                            currentState.getValue(BlockStateProperties.ATTACH_FACE)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.OPEN)
                && newState.hasProperty(BlockStateProperties.OPEN)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.OPEN,
                            currentState.getValue(BlockStateProperties.OPEN)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.POWERED)
                && newState.hasProperty(BlockStateProperties.POWERED)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.POWERED,
                            currentState.getValue(BlockStateProperties.POWERED)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.WATERLOGGED)
                && newState.hasProperty(BlockStateProperties.WATERLOGGED)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.WATERLOGGED,
                            currentState.getValue(BlockStateProperties.WATERLOGGED)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.NORTH)
                && newState.hasProperty(BlockStateProperties.NORTH)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.NORTH,
                            currentState.getValue(BlockStateProperties.NORTH)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.EAST)
                && newState.hasProperty(BlockStateProperties.EAST)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.EAST,
                            currentState.getValue(BlockStateProperties.EAST)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.SOUTH)
                && newState.hasProperty(BlockStateProperties.SOUTH)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.SOUTH,
                            currentState.getValue(BlockStateProperties.SOUTH)
                    );
        }

        if (currentState.hasProperty(BlockStateProperties.WEST)
                && newState.hasProperty(BlockStateProperties.WEST)) {

            newState =
                    newState.setValue(
                            BlockStateProperties.WEST,
                            currentState.getValue(BlockStateProperties.WEST)
                    );
        }

        return newState;
    }
}
