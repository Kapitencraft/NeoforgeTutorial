package net.kapitencraft.tutorial.client;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;

public class CustomBEWLRExtensions implements IClientItemExtensions {
    public static final CustomBEWLRExtensions INSTANCE = new CustomBEWLRExtensions();

    @Override
    public BlockEntityWithoutLevelRenderer getCustomRenderer() {
        return ModBlockEntityWithoutLevelRenderer.INSTANCE;
    }
}
