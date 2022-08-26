package xyz.blueskiesmc.blueskiesaddon.utils;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.data.DataType;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import xyz.blueskiesmc.blueskiesaddon.BlueSlime;
import xyz.blueskiesmc.blueskiesaddon.BlueSlimeItems;

import javax.annotation.Nonnull;
import javax.security.auth.kerberos.KerberosTicket;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getServer;

public class Events implements Listener {

    public Events() {
    }

    LuckPerms api = LuckPermsProvider.get();

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    private void onItemRightClick(PlayerRightClickEvent e) {
        ItemStack item = e.getItem();
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        Player player = e.getPlayer();
        User user = api.getPlayerAdapter(Player.class).getUser(player);
        // getLogger().info("What item is this? "+ item);
        // getLogger().info("What sfItem is this? "+ sfItem);
        // getLogger().info("Who is holding this? "+ user);
        if (sfItem != null) {
            if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.EAGLE_STAR, true)){
                e.useItem();
                addPermission(user, "slimefun.eagle");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.EAGLE_STAR, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.EAGLE_STAR, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.AIR_ROD, true)){
                e.useItem();
                addPermission(user, "slimefun.air");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.AIR_ROD, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.AIR_ROD, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.WATER_ORB, true)){
                e.useItem();
                addPermission(user, "slimefun.water");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.WATER_ORB, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.WATER_ORB, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.EARTH_FLOWER, true)){
                e.useItem();
                addPermission(user, "slimefun.earth");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.EARTH_FLOWER, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.EARTH_FLOWER, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.FIRE_POWDER, true)){
                e.useItem();
                addPermission(user, "slimefun.fire");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.FIRE_POWDER, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.FIRE_POWDER, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.PHOENIX_WART, true)){
                e.useItem();
                addPermission(user, "slimefun.phoenix");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.PHOENIX_WART, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.PHOENIX_WART, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.SIREN_LETTER, true)){
                e.useItem();
                addPermission(user, "slimefun.siren");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.SIREN_LETTER, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.SIREN_LETTER, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.ROC_HEAD, true)){
                e.useItem();
                addPermission(user, "slimefun.roc");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.ROC_HEAD, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.ROC_HEAD, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.CAL_LEAF, true)){
                e.useItem();
                addPermission(user, "slimefun.caladrius");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.CAL_LEAF, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.CAL_LEAF, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.RAVEN_ROSE, true)){
                e.useItem();
                addPermission(user, "slimefun.raven");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.RAVEN_ROSE, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.RAVEN_ROSE, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
            else if (SlimefunUtils.isItemSimilar(item, BlueSlimeItems.ICARUS_BEACON, true)){
                e.useItem();
                addPermission(user, "slimefun.icarus");
                getLogger().info("Slimefun Permission Passed");
                if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInMainHand(), BlueSlimeItems.ICARUS_BEACON, true)){
                    player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                }
                else if(SlimefunUtils.isItemSimilar(player.getInventory().getItemInOffHand(), BlueSlimeItems.ICARUS_BEACON, true)){
                    player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount()-1);
                }
            }
        }
    }


    public void addPermission(User user, String permission) {
        user = api.getUserManager().getUser(user.getUniqueId());
        PermissionNode node = PermissionNode.builder(permission).build();
        if (user != null) {
            user.getData(DataType.NORMAL).add(node);
            api.getUserManager().saveUser(user);
        }
        else {
            getLogger().info("User is Null");
        }
    }



}