package dhyces.waxablecoral.services;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import dhyces.waxablecoral.NeoForgeWaxableCoral;
import dhyces.waxablecoral.services.helpers.PlatformHelper;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BaseCoralFanBlock;
import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.BaseCoralWallFanBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class NeoForgePlatformHelper implements PlatformHelper {
    private static final BiMap<Block, Block> WAXING_BIMAP = HashBiMap.create();

    @Override
    public Holder<Block> registerBlock(String id, Supplier<Block> blockSupplier) {
        return NeoForgeWaxableCoral.BLOCK_REGISTER.register(id, blockSupplier);
    }

    @Override
    public Holder<Item> registerItem(String id, Supplier<Item> itemSupplier) {
        return NeoForgeWaxableCoral.ITEM_REGISTER.register(id, itemSupplier);
    }

    @Override
    public BaseCoralPlantBlock createCoralPlantBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralPlantBlock(properties);
    }

    @Override
    public BaseCoralFanBlock createCoralFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralFanBlock(properties);
    }

    @Override
    public BaseCoralWallFanBlock createCoralWallFanBlock(BlockBehaviour.Properties properties) {
        return new BaseCoralWallFanBlock(properties);
    }

    @Override
    public BiMap<Block, Block> getWaxMap() {
        return WAXING_BIMAP;
    }
}
