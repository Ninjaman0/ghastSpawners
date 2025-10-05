package com.ninja.ghastSpawners.gui.gui;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

import com.ninja.ghastSpawners.gui.GuiListener;
import net.codava.virtualspawner.SpawnerPlugin;
import net.codava.virtualspawner.abstracts.AbstractGui;
import net.codava.virtualspawner.abstracts.AbstractManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class GuiManager extends AbstractManager {
    private Map<Player, AbstractGui> opened = Maps.newConcurrentMap();

    public void load(SpawnerPlugin plugin) {
        super.load(plugin);
        Bukkit.getPluginManager().registerEvents(new GuiListener(this), plugin);
    }

    public void unload() {
    }

    public void setOpened(Player player, AbstractGui gui) {
        this.opened.put(player, gui);
    }

    public void removeOpened(Player player) {
        if (this.opened.containsKey(player)) {
            ((AbstractGui)this.opened.get(player)).cleanCachePlayer(player);
        }

        this.opened.remove(player);
    }

    public Optional<AbstractGui> getOpened(Player player) {
        return Optional.ofNullable((AbstractGui)this.opened.getOrDefault(player, (Object)null));
    }
}
