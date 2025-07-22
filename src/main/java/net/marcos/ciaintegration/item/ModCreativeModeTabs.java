package net.marcos.ciaintegration.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.marcos.ciaintegration.CreateImmersiveArmorerIntegration;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateImmersiveArmorerIntegration.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("create_immersive_tacz_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMPTY_FLAMMABLE_CHEMICAL.get()))
                    .title(Component.translatable("creativetab.ciaintegration_tab"))
                    .displayItems((ItemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.AP_CASING.get());
                        output.accept(ModItems.EMPTY_FLAMMABLE_CHEMICAL.get());
                        output.accept(ModItems.FOURFIVEFOUR_CASUL_CASING.get());
                        output.accept(ModItems.NINEMM_CASING.get());
                        output.accept(ModItems.TWENTYMM_CASING.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
