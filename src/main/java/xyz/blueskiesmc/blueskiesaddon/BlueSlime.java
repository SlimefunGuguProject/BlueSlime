package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.SkullItem;
import me.mrCookieSlime.bstats.bukkit.Metrics;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import utils.Events;
import utils.Utils;

import javax.annotation.Nonnull;

public class BlueSlime extends JavaPlugin implements SlimefunAddon {

    private static BlueSlime instance;

    @Override
    public void onEnable() {

        instance = this;

        Config cfg = new Config(this);

        //final Metrics metrics = new Metrics(this, 69420);
        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new GitHubBuildsUpdater(this, getFile(), "BellaIngenue/BlueSlime/master/").start();
        }

        getLogger().info("-------------------------");
        getLogger().info("   BlueSlime Addon   ");
        getLogger().info("-------------------------");

        Utils.registerEvents(new Events());
        BlueSlimeItemSetup.setup(getInstance());
        ResearchSetup.setup();

        cfg.getBoolean("options.auto-update");

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        saveConfig();
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static BlueSlime getInstance(){
        return instance;
    }

}
