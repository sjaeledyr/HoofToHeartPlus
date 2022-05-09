package me.sjaeledyr.hooftoheartplus.util;

import me.sjaeledyr.hooftoheartplus.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
    private Main plugin;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        // Init Variables
        Player p = e.getPlayer();
        String ip = p.getAddress().getAddress().getHostAddress();

        plugin.playerData.getConfig().set("players." + p.getUniqueId().toString() + ".ip", ip);
        plugin.playerData.getConfig().set("players." + p.getUniqueId().toString() + ".player_name", p.getDisplayName());
        plugin.playerData.saveConfig();

        // Personal Player join message
        p.sendMessage(ChatColor.RED + "You have joined with the following ip: " + ip);
    }
}
