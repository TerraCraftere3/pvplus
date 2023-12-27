package de.terracrafter.pvplus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("pvplus_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HIDDEN_BLADE.get());
        }
    };

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("pvplus_creative_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CREATIVE_STEEL.get());
        }
    };
}
