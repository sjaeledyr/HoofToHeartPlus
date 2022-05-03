package me.sjaeledyr.hooftoheartplus.util;

import me.sjaeledyr.hooftoheartplus.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class PlayerDataManager {
    private Main main = Main.getPlugin(Main.class);
    FileConfiguration cfg = main.getConfig();

    // Document that a player has joined the server before
    public void addPlayerCheck(Player p, boolean isFirstJoin) {
        boolean i = cfg.getBoolean(p.getName() + "." + "isFirstJoin");
        boolean a = isFirstJoin;
        cfg.set(p.getName() + "." + "isFirstJoin", false);
        main.saveConfig();
    }
    // See if it is a player's first time joining the server
    public boolean newPlayerCheck(Player p) {
        return cfg.getBoolean(p.getName() + "." + "isFirstJoin");
    }

    // Document player IP address
    public void listIp(Player p, String ip) {
        cfg.set(p.getName() + "." + "lastIpAddress", ip);
    }
}
