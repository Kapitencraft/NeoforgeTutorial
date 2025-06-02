package net.kapitencraft.tutorial.event;

import net.kapitencraft.tutorial.TutorialMod;
import net.kapitencraft.tutorial.item.ModItems;
import net.kapitencraft.tutorial.item.armor.AbstractArmorItem;
import net.kapitencraft.tutorial.item.armor.client.ArmorClientExtension;
import net.kapitencraft.tutorial.item.armor.client.model.FrozenBlazeArmorModel;
import net.kapitencraft.tutorial.item.armor.client.model.WizardHatModel;
import net.kapitencraft.tutorial.item.armor.client.provider.ArmorModelProvider;
import net.kapitencraft.tutorial.item.armor.client.provider.SimpleModelProvider;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = TutorialMod.MOD_ID)
public class ModClientEventbusEvents {

    @SubscribeEvent
    public static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        registerArmorExtension(ModItems.FROZEN_BLAZE_ARMOR, event, new SimpleModelProvider(FrozenBlazeArmorModel::createBodyLayer, FrozenBlazeArmorModel::new));
        event.registerItem(new ArmorClientExtension(new SimpleModelProvider(WizardHatModel::createBodyLayer, WizardHatModel::new)), ModItems.WIZARD_HAT);
    }

    @SuppressWarnings("unchecked")
    private static <T extends AbstractArmorItem> void registerArmorExtension(Map<ArmorItem.Type, DeferredItem<T>> map, RegisterClientExtensionsEvent event, ArmorModelProvider provider) {
        event.registerItem(new ArmorClientExtension(provider), map.values().toArray(DeferredItem[]::new));
    }
}
