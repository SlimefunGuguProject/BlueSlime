package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class ResearchSetup {
    private ResearchSetup(){}

    public static void setup(){

        register("rank_items", 69420666, "Rank-Up Items", 20, BlueSlimeItems.EAGLE_STAR, BlueSlimeItems.AIR_ROD,
                BlueSlimeItems.FIRE_POWDER, BlueSlimeItems.WATER_ORB, BlueSlimeItems.EARTH_FLOWER);
        register("rank_items_2", 69420667, "Rank-Up Items Advanced", 30, BlueSlimeItems.ROC_HEAD, BlueSlimeItems.PHOENIX_WART,
                BlueSlimeItems.SIREN_LETTER, BlueSlimeItems.CAL_LEAF, BlueSlimeItems.RAVEN_ROSE, BlueSlimeItems.ICARUS_BEACON);

    }

    private static void register(String key, int id, String name, int defaultCost, ItemStack... items){
        Research research = new Research(new NamespacedKey(BlueSlime.getInstance(), key), id, name, defaultCost);

        for (ItemStack item : items){
            SlimefunItem sfItem = SlimefunItem.getByItem(item);

            if (sfItem != null){
                research.addItems(sfItem);
            }
        }
        research.register();
    }
}
