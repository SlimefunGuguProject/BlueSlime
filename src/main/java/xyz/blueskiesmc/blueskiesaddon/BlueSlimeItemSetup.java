package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

import static io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide.getItem;

public class BlueSlimeItemSetup {

    private static void setup(@Nonnull BlueSlime plugin){

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.EAGLE_STAR, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.NETHER_STAR),
                null, SlimefunItems.NECROTIC_SKULL, null,
                getItem(Material.NETHER_STAR), null, null
        }).register(plugin);

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.FIRE_POWDER, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.BLAZE_POWDER),
                null, SlimefunItems.ESSENCE_OF_AFTERLIFE, null,
                getItem(Material.BLAZE_POWDER), null, null
        }).register(plugin);
        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.WATER_ORB, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.HEART_OF_THE_SEA),
                null, SlimefunItems.ESSENCE_OF_AFTERLIFE, null,
                getItem(Material.HEART_OF_THE_SEA), null, null
        }).register(plugin);
        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.EARTH_FLOWER, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.WHITE_TULIP),
                null, SlimefunItems.ESSENCE_OF_AFTERLIFE, null,
                getItem(Material.WHITE_TULIP), null, null
        }).register(plugin);
        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.AIR_ROD, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.END_ROD),
                null, SlimefunItems.ESSENCE_OF_AFTERLIFE, null,
                getItem(Material.END_ROD), null, null
        }).register(plugin);


        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.PHOENIX_WART, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.NETHER_WART),
                null, BlueSlimeItems.FIRE_POWDER, null,
                getItem(Material.NETHER_WART), null, null
        }).register(plugin);

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.SIREN_LETTER, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.PAPER),
                null, BlueSlimeItems.WATER_ORB, null,
                getItem(Material.PAPER), null, null
        }).register(plugin);

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.ROC_HEAD, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.DRAGON_HEAD),
                null, BlueSlimeItems.AIR_ROD, null,
                getItem(Material.DRAGON_HEAD), null, null
        }).register(plugin);

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.CAL_LEAF, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.BIG_DRIPLEAF),
                null, BlueSlimeItems.EARTH_FLOWER, null,
                getItem(Material.BIG_DRIPLEAF), null, null
        }).register(plugin);
        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.RAVEN_ROSE, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.WITHER_ROSE),
                null, BlueSlimeItems.EARTH_FLOWER, null,
                getItem(Material.WITHER_ROSE), null, null
        }).register(plugin);

        new SlimefunItem(BlueSlimeItems.BLUESLIME_CATEGORY, BlueSlimeItems.ICARUS_BEAACON, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                null, null, getItem(Material.BEACON),
                null, BlueSlimeItems.EAGLE_STAR, null,
                getItem(Material.BEACON), null, null
        }).register(plugin);

    }

    private static ItemStack getItem(Material mat) {
        return new ItemStack(mat);
    }
}
