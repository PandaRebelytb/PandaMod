package fr.PandaRebel4307.PandaMod;

import com.mojang.logging.LogUtils;
import fr.PandaRebel4307.PandaMod.block.PandaBlock;
import fr.PandaRebel4307.PandaMod.item.pandaitem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(PandaMod.MODID)
public class PandaMod
{

    public static final String MODID = "pandamod";

    private static final Logger LOGGER = LogUtils.getLogger();


    public PandaMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        pandaitem.register(modEventBus);
        PandaBlock.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void commonSetup(final FMLCommonSetupEvent event){

    }
}

