package me.sjaeledyr.hooftoheartplus.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    PlayerDataManager dh = new PlayerDataManager();
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        // Init Variables
        Player p = e.getPlayer();
        String ip = p.getAddress().getAddress().getHostAddress();

        // Check if this is the player's first time joining the server.
        if(dh.newPlayerCheck(p)) {
            p.sendMessage("You've joined the server for the first time!");
            p.sendMessage("Welcome to Hoof to Heart " + p.getDisplayName());
            dh.addPlayerCheck(p, false);
        } else {
            p.sendMessage("Welcome to Hoof to Heart " + p.getDisplayName());
        }

        // Personal Player join message
        p.sendMessage(ChatColor.RED+ "You have joined with the following ip: " + ip);
    }
}
