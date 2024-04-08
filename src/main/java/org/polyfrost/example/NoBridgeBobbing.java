package org.polyfrost.example;

import org.polyfrost.example.config.NBBConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = NoBridgeBobbing.MODID, name = NoBridgeBobbing.NAME, version = NoBridgeBobbing.VERSION)
public class NoBridgeBobbing {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    @Mod.Instance(MODID)
    public static NoBridgeBobbing INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static NBBConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new NBBConfig();
    }
}
