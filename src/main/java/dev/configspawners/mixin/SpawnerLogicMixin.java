package dev.configspawners.mixin;

import dev.configspawners.config.ConfigHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.block.spawner.MobSpawnerLogic;

@Mixin(MobSpawnerLogic.class)
public class SpawnerLogicMixin {

    @Shadow private int spawnDelay;
    @Shadow private int minSpawnDelay;
    @Shadow private int maxSpawnDelay;
    @Shadow private int spawnCount;
    @Shadow private int maxNearbyEntities;
    @Shadow private int requiredPlayerRange;
    @Shadow private int spawnRange;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void modifySpawnDelays(CallbackInfo ci) {
        this.spawnDelay          = ConfigHandler.getInstance().spawnDelay;
        this.minSpawnDelay       = spawnDelay * 10;
        this.maxSpawnDelay       = spawnDelay * 40;
        this.spawnCount          = ConfigHandler.getInstance().spawnCount;
        this.maxNearbyEntities   = ConfigHandler.getInstance().maxNearbyEntities;
        this.requiredPlayerRange = ConfigHandler.getInstance().requiredPlayerRange;
        this.spawnRange          = ConfigHandler.getInstance().spawnRange;
    }
}
