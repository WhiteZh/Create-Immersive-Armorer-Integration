package net.marcos.ciaintegration.item;

import net.marcos.ciaintegration.CreateImmersiveArmorerIntegration;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateImmersiveArmorerIntegration.MOD_ID);

    public static final RegistryObject<Item> NINEMM_CASING = ITEMS.register("9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWENTYMM_CASING = ITEMS.register("20mm_cased_telescoped_ammunition_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOURFIVEFOUR_CASUL_CASING = ITEMS.register("454_casul_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AP_CASING = ITEMS.register("ap_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_FLAMMABLE_CHEMICAL = ITEMS.register("empty_flammable_chemical", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}