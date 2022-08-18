package utils;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.data.DataType;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;

import javax.annotation.Nonnull;
import java.util.UUID;

public class Listeners implements Listener {


    private final BlueSlime plugin;

    public Listeners(@Nonnull BlueSlime plugin){
        super();
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }



    @EventHandler (ignoreCancelled = true, priority = EventPriority.HIGH)
    private void onBlockRightClick(BlockPlaceEvent e){
        ItemStack item = e.getItemInHand();
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        Player user = e.getPlayer();
        addPermission((User) user, "slimefun.complete");
        System.out.println("Slimefun perm is added!");
        }



    public void onItemRightClick(PlayerRightClickEvent event) {
        event.useItem();
        Player user = event.getPlayer();
        addPermission((User) user, "slimefun.complete");
        System.out.println("Slimefun permission is added");
    }


    @Nonnull
    public ItemUseHandler getItemHandler() {
        System.out.println("Slimefun permission is added");
        return PlayerRightClickEvent::useItem;
    }

    LuckPerms api = LuckPermsProvider.get();
    public static boolean isPlayerInGroup(Player player, String group){
        return player.hasPermission("group."+group);
    }

    public boolean hasPermission(User user, String permission){
        return user.getCachedData().getPermissionData().checkPermission(permission).asBoolean();
    }

    public void addPermission(User user, String permission){
        user = api.getUserManager().getUser(UUID.randomUUID());
        PermissionNode node = PermissionNode.builder(permission).build();
        assert user != null;
        user.getData(DataType.NORMAL).add(node);
        api.getUserManager().saveUser(user);
    }


}
