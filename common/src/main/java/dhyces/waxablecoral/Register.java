package dhyces.waxablecoral;

import dhyces.waxablecoral.services.Services;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class Register {
    public static void init() {}
    
    public static final Holder<Block> WAXED_TUBE_CORAL_BLOCK = registerBlock("waxed_tube_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_BLOCK)));
    public static final Holder<Block> WAXED_BRAIN_CORAL_BLOCK = registerBlock("waxed_brain_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final Holder<Block> WAXED_BUBBLE_CORAL_BLOCK = registerBlock("waxed_bubble_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final Holder<Block> WAXED_FIRE_CORAL_BLOCK = registerBlock("waxed_fire_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_BLOCK)));
    public static final Holder<Block> WAXED_HORN_CORAL_BLOCK = registerBlock("waxed_horn_coral_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_BLOCK)));
    
    public static final Holder<Block> WAXED_TUBE_CORAL = registerBlock("waxed_tube_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL)));
    public static final Holder<Block> WAXED_BRAIN_CORAL = registerBlock("waxed_brain_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL)));
    public static final Holder<Block> WAXED_BUBBLE_CORAL = registerBlock("waxed_bubble_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL)));
    public static final Holder<Block> WAXED_FIRE_CORAL = registerBlock("waxed_fire_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL)));
    public static final Holder<Block> WAXED_HORN_CORAL = registerBlock("waxed_horn_coral", () -> Services.PLATFORM_HELPER.createCoralPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL)));

    public static final Holder<Block> WAXED_TUBE_CORAL_FAN = registerBlock("waxed_tube_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_FAN)));
    public static final Holder<Block> WAXED_BRAIN_CORAL_FAN = registerBlock("waxed_brain_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_FAN)));
    public static final Holder<Block> WAXED_BUBBLE_CORAL_FAN = registerBlock("waxed_bubble_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_FAN)));
    public static final Holder<Block> WAXED_FIRE_CORAL_FAN = registerBlock("waxed_fire_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_FAN)));
    public static final Holder<Block> WAXED_HORN_CORAL_FAN = registerBlock("waxed_horn_coral_fan", () -> Services.PLATFORM_HELPER.createCoralFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_FAN)));
    
    public static final Holder<Block> WAXED_TUBE_CORAL_WALL_FAN = registerBlock("waxed_tube_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUBE_CORAL_WALL_FAN)));
    public static final Holder<Block> WAXED_BRAIN_CORAL_WALL_FAN = registerBlock("waxed_brain_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRAIN_CORAL_WALL_FAN)));
    public static final Holder<Block> WAXED_BUBBLE_CORAL_WALL_FAN = registerBlock("waxed_bubble_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BUBBLE_CORAL_WALL_FAN)));
    public static final Holder<Block> WAXED_FIRE_CORAL_WALL_FAN = registerBlock("waxed_fire_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FIRE_CORAL_WALL_FAN)));
    public static final Holder<Block> WAXED_HORN_CORAL_WALL_FAN = registerBlock("waxed_horn_coral_wall_fan", () -> Services.PLATFORM_HELPER.createCoralWallFanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HORN_CORAL_WALL_FAN)));
    
    public static final Holder<Item> WAXED_TUBE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_TUBE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_BRAIN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BRAIN_CORAL_BLOCK);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_FIRE_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_FIRE_CORAL_BLOCK);
    public static final Holder<Item> WAXED_HORN_CORAL_BLOCK_ITEM = registerBlockItem(WAXED_HORN_CORAL_BLOCK);
    
    public static final Holder<Item> WAXED_TUBE_CORAL_ITEM = registerBlockItem(WAXED_TUBE_CORAL);
    public static final Holder<Item> WAXED_BRAIN_CORAL_ITEM = registerBlockItem(WAXED_BRAIN_CORAL);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_ITEM = registerBlockItem(WAXED_BUBBLE_CORAL);
    public static final Holder<Item> WAXED_FIRE_CORAL_ITEM = registerBlockItem(WAXED_FIRE_CORAL);
    public static final Holder<Item> WAXED_HORN_CORAL_ITEM = registerBlockItem(WAXED_HORN_CORAL);
    
    public static final Holder<Item> WAXED_TUBE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_TUBE_CORAL_FAN, WAXED_TUBE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_BRAIN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BRAIN_CORAL_FAN, WAXED_BRAIN_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_BUBBLE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_BUBBLE_CORAL_FAN, WAXED_BUBBLE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_FIRE_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_FIRE_CORAL_FAN, WAXED_FIRE_CORAL_WALL_FAN);
    public static final Holder<Item> WAXED_HORN_CORAL_FAN_ITEM = registerStandingWallBlockItem(WAXED_HORN_CORAL_FAN, WAXED_HORN_CORAL_WALL_FAN);

    private static Holder<Block> registerBlock(String id, Supplier<Block> objectSupplier) {
        return Services.PLATFORM_HELPER.registerBlock(id, objectSupplier);
    }

    private static Holder<Item> registerItem(String id, Supplier<Item> objectSupplier) {
        return Services.PLATFORM_HELPER.registerItem(id, objectSupplier);
    }

    private static Holder<Item> registerBlockItem(Holder<Block> block) {
        return registerItem(block.unwrapKey().orElseThrow().location().getPath(), () -> new BlockItem(block.value(), new Item.Properties()));
    }

    private static Holder<Item> registerStandingWallBlockItem(Holder<Block> standingBlock, Holder<Block> wallBlock) {
        return registerItem(standingBlock.unwrapKey().orElseThrow().location().getPath(), () -> new StandingAndWallBlockItem(standingBlock.value(), wallBlock.value(), new Item.Properties(), Direction.DOWN));
    }
}
