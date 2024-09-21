package dev.configspawners.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public final class ConfigHandler {

  public static final ModConfigSpec configSpec;

  public static ConfigValue<Integer> spawnDelay;
  public static ConfigValue<Integer> spawnCount;
  public static ConfigValue<Integer> maxNearbyEntities;
  public static ConfigValue<Integer> requiredPlayerRange;
  public static ConfigValue<Integer> spawnRange;

  static {

    ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

    spawnDelay = builder
        .comment("Determines both minimum and maximum delays between spawns.\nDefault: 20")
        .defineInRange("spawnDelay", 20, 10, 30);

    spawnCount = builder
        .comment("The maximum number of entities to spawn per wave.\nDefault: 4")
        .defineInRange("spawnCount", 4, 2, 6);

    maxNearbyEntities = builder
        .comment("The maximum number of entities that can be loaded around the spawner.\nDefault: 7")
        .defineInRange("maxNearbyEntities", 7, 2, 12);

    requiredPlayerRange = builder
        .comment("The minimum range required for the spawner to become active.\nDefault: 16")
        .defineInRange("requiredPlayerRange", 16, 16, 64);

    spawnRange = builder
        .comment("The maximum range from the spawner where entities can spawn.\nDefault: 4")
        .defineInRange("spawnRange", 4, 4, 16);

    configSpec = builder.build();

  }
}