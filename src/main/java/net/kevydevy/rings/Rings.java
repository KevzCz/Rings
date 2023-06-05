package net.kevydevy.rings;
import net.fabricmc.api.ModInitializer;
import net.kevydevy.rings.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class Rings implements ModInitializer

{
    public static final String MOD_ID = "rings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
