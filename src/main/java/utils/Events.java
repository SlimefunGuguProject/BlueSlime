package utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import xyz.blueskiesmc.blueskiesaddon.BSNotPlaceable;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;

import javax.annotation.Nonnull;

public class Events implements Listener {

    public Events(){}

    @EventHandler
    private void onBSNotPlaceablePlace(BlockPlaceEvent e){
        ItemStack item = e.getItemInHand();
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem instanceof NotPlaceable){
            e.setCancelled(true);
        }
    }
}
