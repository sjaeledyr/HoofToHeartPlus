package me.sjaeledyr.hooftoheartplus.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String ip = p.getAddress().getAddress().getHostAddress();
        p.sendMessage("Welcome to Hoof to Heart " + p.getDisplayName());
        p.sendMessage(ChatColor.RED+ "You have joined with the following ip: " + ip);
    }
}
