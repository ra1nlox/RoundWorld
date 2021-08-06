package md.rainlox.roundWorldPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.logging.Logger;

import md.rainlox.roundWorldPlugin.handlers.MainHandler;

public class Main extends JavaPlugin {

    private final Logger log = Logger.getLogger("RoundWorld");
    public final FileConfiguration conf = getConfig();

    private final MainHandler handler = new MainHandler(this);

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(handler, this);

        log.info(conf.getString("messages.onEnable"));
    }

    @Override
    public void onDisable() {

        log.info(conf.getString("messages.onDisable"));
    }

}
