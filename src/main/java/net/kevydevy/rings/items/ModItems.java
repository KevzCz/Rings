package net.kevydevy.rings.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kevydevy.rings.Rings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item HEROBRINE_RING = registerItem("herobrine_ring",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item)
    {
    return Registry.register(Registry.ITEM, new Identifier(Rings.MOD_ID, name), item);
    }
    public static void registerModItems()
    {


        Rings.LOGGER.debug("Registering Mod Items for " + Rings.MOD_ID);
    }
}
