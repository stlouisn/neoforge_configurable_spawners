package dev.configspawners;

import dev.configspawners.config.ConfigHandler;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ConfigSpawners implements ModInitializer {

  @SuppressWarnings("unused")
  public static final Logger LOGGER = LoggerFactory.getLogger(ModConstants.MOD_ID);

  @Override
  public void onInitialize() {
    ConfigHandler.init();
  }

}
