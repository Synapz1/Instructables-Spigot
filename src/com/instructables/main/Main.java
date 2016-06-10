package com.instructables.main;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("instructables").setExecutor(new CommandClass());
    }

    @Override
    public void onDisable() {

    }

}