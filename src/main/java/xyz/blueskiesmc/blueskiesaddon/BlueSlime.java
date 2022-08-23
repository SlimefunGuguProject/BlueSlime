package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import me.mrCookieSlime.bstats.bukkit.Metrics;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import xyz.blueskiesmc.blueskiesaddon.utils.BlueListener;
import xyz.blueskiesmc.blueskiesaddon.utils.Events;
import xyz.blueskiesmc.blueskiesaddon.utils.Utils;
import net.guizhanss.guizhanlibplugin.updater.GuizhanBuildsUpdaterWrapper;

import javax.annotation.Nonnull;

import static org.bukkit.Bukkit.getServer;

public class BlueSlime extends JavaPlugin implements SlimefunAddon, Listener {

    private static BlueSlime instance;

    @Override
    public void onEnable() {

        instance = this;

        Config cfg = new Config(this);

        //final Metrics metrics = new Metrics(this, 69420);
        if (getConfig().getBoolean("auto-update", true) && getDescription().getVersion().startsWith("Build")) {
            GuizhanBuildsUpdaterWrapper.start(this, getFile(), "SlimefunGuguProject", "BlueSlime", "master", false);
        }

        getLogger().info("--------------------------------------------------");
        getLogger().info("                BlueSlime Addon   ");
        getLogger().info("  汉化by:SlimefunGuguProject,buiawpkgew1")
        getLogger().info("--------------------------------------------------");

        BlueSlimeItemSetup.setup(getInstance());
        ResearchSetup.setup();
        Utils.registerEvents(new Events());

        cfg.getBoolean("options.auto-update");

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        saveConfig();
        instance = null;
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
