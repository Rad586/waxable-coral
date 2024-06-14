package dhyces.waxablecoral;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = WaxableCoral.MODID, dist = Dist.CLIENT)
public class NeoForgeWaxableCoralClient {
    public NeoForgeWaxableCoralClient(IEventBus modBus) {
        modBus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(WaxableCoralClient::init);
    }
}
