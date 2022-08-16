package utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;

public class Utils {
    public Utils(){}

    public static String color(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void send(CommandSender s, String msg){
        s.sendMessage(color("&b&l[&9BlueSlime&b&l]" + msg));
    }

    public static void registerEvents(Listener listener){
        Bukkit.getServer().getPluginManager().registerEvents(listener, BlueSlime.getInstance());

    }
}
