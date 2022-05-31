package com.pinapjuices.mugsmod.block;

import com.pinapjuices.mugsmod.MugsMod;
import com.pinapjuices.mugsmod.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MugsMod.MOD_ID);

    public static final RegistryObject<Block> EMPTY_MUG = registerBlock("empty_mug",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> COFFEE_MUG = registerBlock("coffee_mug",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)), CreativeModeTab.TAB_FOOD);
    public static final RegistryObject<Block> PLATE = registerBlock("plate",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)), CreativeModeTab.TAB_MISC);


    // registry
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

}
