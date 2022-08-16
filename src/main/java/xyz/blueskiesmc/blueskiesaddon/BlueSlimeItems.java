package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class BlueSlimeItems {

    public static final ItemGroup BLUESLIME_CATEGORY = new ItemGroup(new NamespacedKey(BlueSlime.getInstance(),
            "blueslime_category"), new CustomItemStack(Material.NETHER_STAR, "&9BlueSlime"));

    public static final SlimefunItemStack EAGLE_STAR = new SlimefunItemStack("EAGLE_STAR", Material.NETHER_STAR,
            "&7Eagle's Star", "&fMake this item to rank up to the Eagle Rank!!");

    public static final SlimefunItemStack FIRE_POWDER = new SlimefunItemStack("FIRE EAGLE POWDER", Material.BLAZE_POWDER,
            "&2Fire Eagle Blaze Powder", "&cMake this item to rank up to the Fire Eagle Rank!!");

    public static final SlimefunItemStack WATER_ORB = new SlimefunItemStack("WATER EAGLE ORB", Material.HEART_OF_THE_SEA,
            "&bWater Eagle Orb", "&9Make this item to rank up to the Water Eagle Rank!!");

    public static final SlimefunItemStack AIR_ROD = new SlimefunItemStack("AIR EAGLE ROD", Material.END_ROD,
            "&fAir Eagle Rod", "&9Make this item to rank up to the Air Eagle Rank!!");

    public static final SlimefunItemStack EARTH_FLOWER = new SlimefunItemStack("AIR EAGLE FLOWER", Material.WHITE_TULIP,
            "&7Earth Eagle Flower", "&9Make this item to rank up to the Earth Eagle Rank!!");

    public static final SlimefunItemStack PHOENIX_WART = new SlimefunItemStack("Phoenix NETHER WART", Material.NETHER_WART,
            "&2Phoenix Nether Wart", "&cMake this item to rank up to the Phoenix Rank!!");

    public static final SlimefunItemStack SIREN_LETTER = new SlimefunItemStack("SIREN LETTER", Material.PAPER,
            "&bSiren Letter", "&9Make this item to rank up to the Siren Rank!!");

    public static final SlimefunItemStack ROC_HEAD = new SlimefunItemStack("ROC DRAGON HEAD", Material.DRAGON_HEAD,
            "&fRoc Dragon Head", "&9Make this item to rank up to the Roc Rank!!");

    public static final SlimefunItemStack CAL_LEAF = new SlimefunItemStack("CALADRIUS LEAF", Material.BIG_DRIPLEAF,
            "&7Caladrius Leaf", "&9Make this item to rank up to the Caladrius Rank!!");
    public static final SlimefunItemStack RAVEN_ROSE = new SlimefunItemStack("RAVEN ROSE", Material.WITHER_ROSE,
            "&7Raven Rose", "&9Make this item to rank up to the Raven Rank!!");

    public static final SlimefunItemStack ICARUS_BEACON = new SlimefunItemStack("ICARUS BEACON", Material.BEACON,
            "&eIcarus Beacon", "&6Make this item to rank up to the Icarus Rank!!");

    private BlueSlimeItems(){
    }
}
