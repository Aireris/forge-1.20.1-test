package net.kadirthicc.basitmod.item;

import net.kadirthicc.basitmod.basitmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, basitmod.MODID);

    public static final RegistryObject<CreativeModeTab> KadirTab = CREATIVE_MODE_TABS.register("kadirtab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModdedItem.RUBY.get()))
                    .title(Component.translatable("creativetab.kadirtab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModdedItem.RUBY.get());
                        output.accept(ModdedItem.RAW_RUBY.get());
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
