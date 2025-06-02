package net.kapitencraft.tutorial.item;

import net.kapitencraft.tutorial.TutorialMod;
import net.kapitencraft.tutorial.item.armor.AbstractArmorItem;
import net.kapitencraft.tutorial.item.armor.FrozenBlazeArmorItem;
import net.kapitencraft.tutorial.item.armor.WizardHatArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;

public interface ModItems {
    DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TutorialMod.MOD_ID);

    Map<ArmorItem.Type, DeferredItem<FrozenBlazeArmorItem>> FROZEN_BLAZE_ARMOR = AbstractArmorItem.createRegistry(REGISTRY, "frozen_blaze", FrozenBlazeArmorItem::new);
    DeferredItem<WizardHatArmorItem> WIZARD_HAT = REGISTRY.register("wizard_hat", WizardHatArmorItem::new);
}