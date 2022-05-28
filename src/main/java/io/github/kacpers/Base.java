package io.github.kacpers;

import io.github.kacpers.classes.impl.ArcherClass;
import io.github.kacpers.classes.impl.BardClass;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Base extends JavaPlugin {

    private static Base plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }

    public static Base getPlugin() {
        return plugin;
    }

    @Override
    public void onDisable() {

    }

    private void listener(){
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new ArcherClass(this), this);
        manager.registerEvents(new BardClass(this),this);
    }
}
