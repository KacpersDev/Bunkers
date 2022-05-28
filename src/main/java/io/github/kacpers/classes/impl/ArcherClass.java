package io.github.kacpers.classes.impl;

import io.github.kacpers.Base;
import io.github.kacpers.classes.Classes;
import io.github.kacpers.classes.ClassesType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ArcherClass implements Listener {

    private final Base plugin;
    private Classes classes;

    public ArcherClass(Base plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event){

        Player player = event.getPlayer();
        this.classes = new Classes(ClassesType.ARCHER, player);
        this.classes.applyEffect();
    }

}
