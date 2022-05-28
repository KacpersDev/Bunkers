package io.github.kacpers.classes;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class Classes {

    private ClassesType type;
    private Player player;

    public Classes(ClassesType type, Player player) {
        this.player = player;
        this.type = type;
    }

    public void applyEffect() {

        if (type == ClassesType.ARCHER) {
            if (player.getInventory().getHelmet().equals(Material.LEATHER_HELMET)
                    && player.getInventory().getChestplate().equals(Material.LEATHER_CHESTPLATE)
                    && player.getInventory().getLeggings().equals(Material.LEATHER_LEGGINGS)
                    && player.getInventory().getBoots().equals(Material.LEATHER_BOOTS)) {

                player.addPotionEffect(PotionEffectType.SPEED.createEffect(99999999, 2));
                player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(99999999, 1));
            }
        } else if (type == ClassesType.BARD) {

        }
    }
}

