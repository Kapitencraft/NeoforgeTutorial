package net.kapitencraft.tutorial.registry;

import net.kapitencraft.tutorial.TutorialMod;
import net.kapitencraft.tutorial.item.component.BackpackContents;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public interface ModDataComponents {
    DeferredRegister<DataComponentType<?>> REGISTRY = DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, TutorialMod.MOD_ID);

    Supplier<DataComponentType<BackpackContents>> BACKPACK_CONTENTS = REGISTRY.register("backpack_contents", () -> DataComponentType.<BackpackContents>builder().persistent(BackpackContents.CODEC).networkSynchronized(BackpackContents.STREAM_CODEC).build());
}
