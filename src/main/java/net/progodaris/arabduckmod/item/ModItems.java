package net.progodaris.arabduckmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.progodaris.arabduckmod.ArabDuckMod;
import net.progodaris.arabduckmod.item.custom.DuckDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArabDuckMod.MOD_ID);

    public static final RegistryObject<Item> DUCK_INGOT = ITEMS.register("duck_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DUCK_ORE = ITEMS.register("raw_duck_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUCK_DETECTOR = ITEMS.register("duck_detector",
            () -> new DuckDetectorItem(new Item.Properties().durability(256)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
