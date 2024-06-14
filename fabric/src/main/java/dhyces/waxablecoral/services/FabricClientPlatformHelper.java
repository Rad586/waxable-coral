package dhyces.waxablecoral.services;

import dhyces.waxablecoral.services.helpers.ClientPlatformHelper;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;

public class FabricClientPlatformHelper implements ClientPlatformHelper {
    @Override
    public void setRenderType(Holder<Block> block, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(block.value(), renderType);
    }
}
