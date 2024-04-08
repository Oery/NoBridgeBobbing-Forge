package dev.oery.nobridgebobbing.config;

import dev.oery.nobridgebobbing.NoBridgeBobbing;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

/**
 * The main Config entrypoint that extends the Config type and init the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class NBBConfig extends Config {
    public NBBConfig() {
        super(new Mod(NoBridgeBobbing.NAME, ModType.UTIL_QOL), NoBridgeBobbing.MODID + ".json");
        initialize();
    }
}

