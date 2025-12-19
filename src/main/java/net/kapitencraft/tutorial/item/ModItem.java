package net.kapitencraft.tutorial.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItem extends Item {
    public ModItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isPiglinCurrency(ItemStack stack) {
        return super.isPiglinCurrency(stack);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return super.hasCraftingRemainingItem(stack);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return super.getCraftingRemainingItem(itemStack);
    }
}
