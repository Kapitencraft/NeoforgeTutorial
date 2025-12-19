package net.kapitencraft.tutorial.item.component;

import com.mojang.serialization.Codec;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

public record BackpackContents(NonNullList<ItemStack> content) implements ContainerAccessor {
    public static final Codec<BackpackContents> CODEC = NonNullList.codecOf(ItemStack.OPTIONAL_CODEC).xmap(BackpackContents::new, BackpackContents::content);
    public static final StreamCodec<RegistryFriendlyByteBuf, BackpackContents> STREAM_CODEC = ItemStack.OPTIONAL_STREAM_CODEC.apply(ByteBufCodecs.list())
            .map(NonNullList::copyOf, Function.identity())
            .map(BackpackContents::new, BackpackContents::content);

    @Override
    public NonNullList<ItemStack> getContent() {
        return content;
    }
}
