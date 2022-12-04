package fr.PandaRebel4307.PandaMod.block;

import fr.PandaRebel4307.PandaMod.PandaMod;
import item.pandaitem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class PandaBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PandaMod.MODID);

    public static final RegistryObject<Block> HALFINUM_BLOCK = registerBlock("halfinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)), CreativeModeTab.TAB_MATERIALS);

    private static RegistryObject<Block> registerBlockItem(String halfinumBlock, Object o) {
    }

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
    }

    private static <T extends Block, block> RegistryObject<Item> registerBlockItem(String name, block, CreativeModeTab){
        return pandaitem.ITEMS.register(name, () -> new BlockItem(registryBlock().get(), new Item.Properties().tab(tab)))
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
