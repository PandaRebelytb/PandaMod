package item;

import fr.PandaRebel4307.PandaMod.PandaMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class pandaitem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PandaMod.MODID);

    public static final RegistryObject<Item> halfinum_ingot = ITEMS.register ("halfinum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
