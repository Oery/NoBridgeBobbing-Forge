package dev.oery.nobridgebobbing;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import dev.oery.nobridgebobbing.config.NBBConfig;
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
    @Mod.Instance(MODID)
    public static NoBridgeBobbing INSTANCE;
    public static NBBConfig config;
    public Minecraft mc = Minecraft.getMinecraft();
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new NBBConfig();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onTick(TickEvent.PlayerTickEvent event) {
        if (this.config.enabled && this.mc.thePlayer != null) {
            this.mc.gameSettings.viewBobbing = this.mc.thePlayer.getLookVec().yCoord > -0.95F;
        }
    }
}
