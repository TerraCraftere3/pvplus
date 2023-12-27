package de.terracrafter.pvplus.item;

import de.terracrafter.pvplus.main;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, main.MODID);

    public static final RegistryObject<Item> HIDDEN_BLADE = ITEMS.register("hidden_blade",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModTab.MOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CREATIVE_STEEL = ITEMS.register("creative_steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CREATIVE_TAB).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
