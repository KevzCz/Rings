package net.kevydevy.rings.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kevydevy.rings.Rings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemsGroup
{
    public static final ItemGroup HEROBRINE_RING = FabricItemGroupBuilder.build(
            new Identifier(Rings.MOD_ID, "Herobrine_ring"), () -> new ItemStack(ModItems.HEROBRINE_RING)
    );
}
