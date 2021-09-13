import org.bukkit.Bukkit;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin
{
    private static Logger logger = Bukkit.getLogger();

    @Override
    public void onLoad(){
        logger.info("Plugin Loaded");
    }

    @Override
    public void onEnable(){
        logger.info("Plugin Enabled");
Hook.test();
    }

    @Override
    public void onDisable(){
        logger.info("Plugin Disabled");
    }
}