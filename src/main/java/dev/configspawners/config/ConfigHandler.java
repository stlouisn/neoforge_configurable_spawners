package dev.configspawners.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public final class ConfigHandler {

  public static final ModConfigSpec configSpec;

  public static ConfigValue<Integer> spawnDelay, spawnCount, maxNearbyEntities, requiredPlayerRange, spawnRange;

  static {

    ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

    spawnDelay = builder
        .defineInRange("spawnDelay", 20, 10, 30);

    spawnCount = builder
        .defineInRange("spawnCount", 4, 2, 6);

    maxNearbyEntities = builder
        .defineInRange("maxNearbyEntities", 7, 2, 12);

    requiredPlayerRange = builder
        .defineInRange("requiredPlayerRange", 16, 16, 64);

    spawnRange = builder
        .defineInRange("spawnRange", 4, 4, 16);

    configSpec = builder.build();

  }
}