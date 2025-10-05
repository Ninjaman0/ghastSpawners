package com.ninja.ghastSpawners.abstracts;

import com.ninja.ghastSpawners.GhastSpawners;

public abstract class AbstractManager {
    protected GhastSpawners plugin;

    public void load(GhastSpawners plugin) {
        this.plugin = plugin;
    }

    public abstract void unload();
}
