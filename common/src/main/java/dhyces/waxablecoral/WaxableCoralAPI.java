package dhyces.waxablecoral;

import com.google.common.collect.BiMap;
import dhyces.waxablecoral.services.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class WaxableCoralAPI {

    public static Block getWaxed(Block unwaxedBlock) {
        return Services.PLATFORM_HELPER.getWaxMap().get(unwaxedBlock);
    }

    public static Block getUnwaxed(Block waxed) {
        return Services.PLATFORM_HELPER.getWaxMap().inverse().get(waxed);
    }

    public static void fillWaxingMap() {
        BiMap<Block, Block> map = Services.PLATFORM_HELPER.getWaxMap();
        map.put(Blocks.TUBE_CORAL_BLOCK, Register.WAXED_TUBE_CORAL_BLOCK.value());
        map.put(Blocks.TUBE_CORAL, Register.WAXED_TUBE_CORAL.value());
        map.put(Blocks.TUBE_CORAL_FAN, Register.WAXED_TUBE_CORAL_FAN.value());
        map.put(Blocks.TUBE_CORAL_WALL_FAN, Register.WAXED_TUBE_CORAL_WALL_FAN.value());

        map.put(Blocks.BRAIN_CORAL_BLOCK, Register.WAXED_BRAIN_CORAL_BLOCK.value());
        map.put(Blocks.BRAIN_CORAL, Register.WAXED_BRAIN_CORAL.value());
        map.put(Blocks.BRAIN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_FAN.value());
        map.put(Blocks.BRAIN_CORAL_WALL_FAN, Register.WAXED_BRAIN_CORAL_WALL_FAN.value());

        map.put(Blocks.BUBBLE_CORAL_BLOCK, Register.WAXED_BUBBLE_CORAL_BLOCK.value());
        map.put(Blocks.BUBBLE_CORAL, Register.WAXED_BUBBLE_CORAL.value());
        map.put(Blocks.BUBBLE_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_FAN.value());
        map.put(Blocks.BUBBLE_CORAL_WALL_FAN, Register.WAXED_BUBBLE_CORAL_WALL_FAN.value());

        map.put(Blocks.FIRE_CORAL_BLOCK, Register.WAXED_FIRE_CORAL_BLOCK.value());
        map.put(Blocks.FIRE_CORAL, Register.WAXED_FIRE_CORAL.value());
        map.put(Blocks.FIRE_CORAL_FAN, Register.WAXED_FIRE_CORAL_FAN.value());
        map.put(Blocks.FIRE_CORAL_WALL_FAN, Register.WAXED_FIRE_CORAL_WALL_FAN.value());

        map.put(Blocks.HORN_CORAL_BLOCK, Register.WAXED_HORN_CORAL_BLOCK.value());
        map.put(Blocks.HORN_CORAL, Register.WAXED_HORN_CORAL.value());
        map.put(Blocks.HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_FAN.value());
        map.put(Blocks.HORN_CORAL_WALL_FAN, Register.WAXED_HORN_CORAL_WALL_FAN.value());
    }
}
