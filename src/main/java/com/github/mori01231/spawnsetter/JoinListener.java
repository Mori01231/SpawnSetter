package com.github.mori01231.spawnsetter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class JoinListener implements Listener {
/*
    private SpawnSetter plugin;
    public JoinListener(SpawnSetter){
        this.plugin = plugin;
    }
    */


    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playername = event.getPlayer().getName();

        getServer().dispatchCommand(getServer().getConsoleSender(), "mvtp " + playername + " world");
        getServer().dispatchCommand(getServer().getConsoleSender(), "spawnpoint " + playername + " 105 3 95");

    }
}
