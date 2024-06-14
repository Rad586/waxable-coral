package dhyces.waxablecoral;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class FabricWaxableCoral implements ModInitializer {
    @Override
    public void onInitialize() {
        WaxableCoral.init();
        WaxableCoralAPI.fillWaxingMap();

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_FAN.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_FAN.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_FAN.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_FAN.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_FAN.value());

            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL.value());

            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_HORN_CORAL_BLOCK.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_FIRE_CORAL_BLOCK.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BUBBLE_CORAL_BLOCK.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_BRAIN_CORAL_BLOCK.value());
            entries.addAfter(Items.DEAD_HORN_CORAL_FAN, Register.WAXED_TUBE_CORAL_BLOCK.value());
        });
    }
}
