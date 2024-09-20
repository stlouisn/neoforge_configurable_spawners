package dev.configspawners;

import dev.configspawners.utils.ModConstants;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@SuppressWarnings("unused")
@Mod(value = ModConstants.MOD_ID, dist = Dist.CLIENT)
public final class ConfigurableSpawnersClient {

  public ConfigurableSpawnersClient(ModContainer container) {
    container.registerExtensionPoint(IConfigScreenFactory.class, (mc, parent) -> new ConfigurationScreen(container, parent));
  }
}