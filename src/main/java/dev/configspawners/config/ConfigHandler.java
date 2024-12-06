package dev.configspawners.config;

import dev.configspawners.ModConstants;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.BoundedDiscrete;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Tooltip;

@Config(name = ModConstants.MOD_ID)
public class ConfigHandler implements ConfigData {

  @Tooltip
  @BoundedDiscrete(min = 10, max = 30)
  public int spawnDelay = 20;

  @Tooltip
  @BoundedDiscrete(min = 2, max = 30)
  public int spawnCount = 4;

  @Tooltip
  @BoundedDiscrete(min = 2, max = 12)
  public int maxNearbyEntities = 7;

  @Tooltip
  @BoundedDiscrete(min = 16, max = 64)
  public int requiredPlayerRange = 16;

  @Tooltip
  @BoundedDiscrete(min = 4, max = 16)
  public int spawnRange = 4;

  public static void init() {
    AutoConfig.register(ConfigHandler.class, Toml4jConfigSerializer::new);
  }

  public static ConfigHandler getInstance() {
    return AutoConfig.getConfigHolder(ConfigHandler.class).getConfig();
  }

}