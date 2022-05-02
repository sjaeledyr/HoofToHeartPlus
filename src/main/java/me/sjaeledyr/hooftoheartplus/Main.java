package me.sjaeledyr.hooftoheartplus;

import me.sjaeledyr.hooftoheartplus.util.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[HoofToHeartPlus] HoofToHeartPlus by Sjaeledyr has been loaded!");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
