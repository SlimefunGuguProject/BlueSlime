package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.SkullItem;
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

import javax.annotation.Nonnull;

public class BlueSlime extends JavaPlugin implements SlimefunAddon {

    private static BlueSlime instance;
    @Override
    public void onEnable() {

        BlueSlime instance = this;
        // Read something from your config.yml
        Config cfg = new Config(this);

        getLogger().info("-------------------------");
        getLogger().info("   BlueSlime Addon   ");
        getLogger().info("-------------------------");


        cfg.getBoolean("options.auto-update");// You could start an Auto-Updater for example

        // Give your Category a unique id.
        // NamespacedKey categoryId = new NamespacedKey(this, "blueslime_category");
        // CustomItemStack categoryItem = new CustomItemStack(new SkullItem("9ea98e8d6c5642e32ab569dabf93cd690460c49477ca9b9dbf7259b37951f2ad"), "&bBlueSlime Addon Category");
        // ItemGroup itemGroup = new ItemGroup(categoryId, categoryItem);

        // Create a new Slimefun ItemStack
        // This class has many constructors, it is very important that you give each item a unique id.
        // SlimefunItemStack itemStack = new SlimefunItemStack("EAGLE_STAR", Material.NETHER_STAR, "&4Eagle's Star", "&cMake this item to rank up to Eagle Rank!!");

        // The Recipe is an ItemStack Array with a length of 9.
        // It represents a Shaped Recipe in a 3x3 crafting grid
        // The machine in which this recipe is crafted in is specified further down
        //ItemStack[] recipe = {
        //        new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD),
        //        null, SlimefunItems.CARBONADO, null,
        //       new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        // Now you just have to register the item
        // RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in which this item is crafted in.
        // Recipy Types from Slimefun itself will automatically add the recipe to that machine
        // EagleStar star = new EagleStar(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        // star.register(this);

        // NamespacedKey researchKey = new NamespacedKey(this, "eagle_star");
        // Research research = new Research(researchKey, 69420666, "You have unlocked the Eagle Star",20);
        // research.addItems(star);

        // research.register();

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
