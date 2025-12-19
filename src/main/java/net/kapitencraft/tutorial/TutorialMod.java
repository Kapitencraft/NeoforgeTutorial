package net.kapitencraft.tutorial;

import com.mojang.logging.LogUtils;
import net.kapitencraft.tutorial.registry.ModItems;
import net.kapitencraft.tutorial.registry.ModDataComponents;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(TutorialMod.MOD_ID)
public class TutorialMod {
    public static final String MOD_ID = "tutorial_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TutorialMod(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.REGISTRY.register(modEventBus);
        ModDataComponents.REGISTRY.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public static ResourceLocation res(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
