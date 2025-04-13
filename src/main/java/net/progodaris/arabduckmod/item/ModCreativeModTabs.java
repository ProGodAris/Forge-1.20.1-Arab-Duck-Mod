package net.progodaris.arabduckmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.progodaris.arabduckmod.ArabDuckMod;
import net.progodaris.arabduckmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArabDuckMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DUCK_TAB = CREATIVE_MODE_TABS.register("duck_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DUCK_INGOT.get()))
                    .title(Component.translatable("creativetab.duck_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DUCK_INGOT.get());
                        output.accept(ModItems.RAW_DUCK_ORE.get());

                        output.accept(ModBlocks.DUCK_BLOCK.get());

                        output.accept(ModBlocks.DUCK_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_DUCK_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
