package com.ninja.ghastSpawners.abstracts;

import com.ninja.ghastSpawners.GhastSpawners;

public class Accessor {
    private static GhastSpawners plugin;

    public static void setPlugin(GhastSpawners instance) {
        plugin = instance;
    }

    public static GhastSpawners getPlugin() {
        return plugin;
    }
}
