package xyz.blueskiesmc.blueskiesaddon.utils;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.data.DataType;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;
import xyz.blueskiesmc.blueskiesaddon.BlueSlimeItems;

import javax.annotation.Nonnull;
import java.util.UUID;

import static org.bukkit.Bukkit.getLogger;

public class BlueListener implements Listener {

    private final BlueSlime plugin = new BlueSlime();


    public BlueListener(BlueSlime plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    /* @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        ;
        addItemHandler(itemUseHandler);
    }
    */

    /*
    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    private void onItemRightClick(PlayerRightClickEvent e) {
        ItemStack item = e.getItem();
        Player user = e.getPlayer();
        if (item == BlueSlimeItems.EAGLE_STAR) {
            e.useItem();
            addPermission((User) user, "slimefun.eagle");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.PHOENIX_WART){
            e.useItem();
            addPermission((User) user, "slimefun.phoenix");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.RAVEN_ROSE){
            e.useItem();
            addPermission((User) user, "slimefun.raven");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.EARTH_FLOWER){
            e.useItem();
            addPermission((User) user, "slimefun.earth");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.AIR_ROD){
            e.useItem();
            addPermission((User) user, "slimefun.air");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.CAL_LEAF){
            e.useItem();
            addPermission((User) user, "slimefun.cal");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.WATER_ORB){
            e.useItem();
            addPermission((User) user, "slimefun.water");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.SIREN_LETTER){
            e.useItem();
            addPermission((User) user, "slimefun.siren");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.ROC_HEAD){
            e.useItem();
            addPermission((User) user, "slimefun.roc");
            getLogger().info("Slimefun Permission Passed");
        }
        else if(item == BlueSlimeItems.ICARUS_BEACON){
            e.useItem();
            addPermission((User) user, "slimefun.icarus");
            getLogger().info("Slimefun Permission Passed");
        }
        else{
            getLogger().info("No Permission Added");
        }
    }

    @Nonnull
    public ItemUseHandler getItemHandler() {
        getLogger().info("Slimefun Permission is Added");
        return PlayerRightClickEvent::useItem;
    }

    LuckPerms api = LuckPermsProvider.get();

    public static boolean isPlayerInGroup(Player player, String group) {
        return player.hasPermission("group." + group);
    }

    public boolean hasPermission(User user, String permission) {
        return user.getCachedData().getPermissionData().checkPermission(permission).asBoolean();
    }

    public void addPermission(User user, String permission) {
        user = api.getUserManager().getUser(user.getUniqueId());
        PermissionNode node = PermissionNode.builder(permission).build();
        assert user != null;
        user.getData(DataType.NORMAL).add(node);
        api.getUserManager().saveUser(user);
    }


     */
}
