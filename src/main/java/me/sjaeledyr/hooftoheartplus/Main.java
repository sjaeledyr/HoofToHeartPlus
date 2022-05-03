package me.sjaeledyr.hooftoheartplus;

import me.sjaeledyr.hooftoheartplus.util.EventListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[HoofToHeartPlus] HoofToHeartPlus by Sjaeledyr has been loaded!");

        // Init Config
        config.set("player_data", true);
        config = getConfig();
        this.saveDefaultConfig();

        // Init Event Listener
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
