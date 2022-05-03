package me.sjaeledyr.hooftoheartplus.util;

import me.sjaeledyr.hooftoheartplus.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class PlayerDataManager {
    private Main main = Main.getPlugin(Main.class);
    FileConfiguration cfg = main.getConfig();

    public void addPlayerCheck(Player p, boolean isFirstJoin) {
        boolean i = cfg.getBoolean(p.getName() + "." + "isFirstJoin");
        boolean a = isFirstJoin;
        cfg.set(p.getName() + "." + "isFirstJoin", false);
        main.saveConfig();
    }

    public boolean newPlayerCheck(Player p) {
        return cfg.getBoolean(p.getName() + "." + "isFirstJoin");
    }
}
