package com.pinapjuices.mugsmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.pinapjuices.mugsmod.MugsMod;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =   // def-regis is an array list that forge uses to keep track of items u made
            DeferredRegister.create(ForgeRegistries.ITEMS, MugsMod.MOD_ID);


    public static final RegistryObject<Item> EMPTY_MUG = ITEMS.register("empty_mug", () -> new
            Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COFFEE_MUG = ITEMS.register("coffee_mug", () -> new
            Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(10).saturationMod(10f)
            .build())));
    //@Override
    //public UseAction getUseAction(ItemStack stack) {
    //return UseAction.DRINK;

    public static final RegistryObject<Item> PLATE = ITEMS.register("plate", () -> new
            Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    //registry
    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);  // method that registers items i made as being about of my testingmod
    }

}


