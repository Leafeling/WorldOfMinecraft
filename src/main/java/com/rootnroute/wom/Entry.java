package com.rootnroute.wom;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Entry extends JavaPlugin {
    public static Entry instance;
    public static ConsoleCommandSender console;

    @Override
    public void onEnable() {
        instance = this;
        console = Bukkit.getConsoleSender();

        console.sendMessage("Loading WorldOfMinecraft...");
    }

    @Override
    public void onDisable() {
        console.sendMessage("Unloading WorldOfMinecraft...");

        instance = null;
        console = null;
    }

    public static Entry getInstance() {
        return instance;
    }
}
