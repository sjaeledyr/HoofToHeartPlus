package me.sjaeledyr.hooftoheartplus;

import me.sjaeledyr.hooftoheartplus.util.EventListener;
import me.sjaeledyr.hooftoheartplus.util.PlayerDataManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public PlayerDataManager playerData;

    @Override
    public void onEnable() {
        this.playerData = new PlayerDataManager(this);
        // Plugin startup logic
        System.out.println("[HoofToHeartPlus] HoofToHeartPlus by Sjaeledyr has been loaded!");

        // Init Event Listener
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
