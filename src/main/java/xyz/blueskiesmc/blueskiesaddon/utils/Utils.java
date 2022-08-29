package xyz.blueskiesmc.blueskiesaddon.utils;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitTask;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;

public class Utils {
    public Utils(){}

    public static String color(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void send(CommandSender s, String msg){
        s.sendMessage(color("&b&l[&9蓝色粘液&b&l]" + msg));
    }

    public static void registerEvents(Events listener){
        Bukkit.getServer().getPluginManager().registerEvents(listener, BlueSlime.getInstance());

    }

    public static BukkitTask runSync(Runnable r, long delay) {

        if (Slimefun.instance() == null || !Slimefun.instance().isEnabled()) {
            return null;
        }

        return Bukkit.getScheduler().runTaskLater(Slimefun.instance(), r, delay);
    }
}
