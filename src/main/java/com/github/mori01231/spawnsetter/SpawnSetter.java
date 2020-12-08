package com.github.mori01231.spawnsetter;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnSetter extends JavaPlugin {

    private static SpawnSetter instance;

    public SpawnSetter (){
        instance = this;
    }

    public static SpawnSetter getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    public void registerEvents(){

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new JoinListener(),  this);
    }
}
