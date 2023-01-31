package xyz.blueskiesmc.blueskiesaddon;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import xyz.blueskiesmc.blueskiesaddon.utils.ItemTags;

import javax.annotation.ParametersAreNonnullByDefault;

public class BlueSlimeItems {

    public static final ItemGroup BLUESLIME_CATEGORY = new ItemGroup(new NamespacedKey(BlueSlime.getInstance(),
            "blueslime_category"), new CustomItemStack(Material.NETHER_STAR, "&9蓝色粘液"));

    public static final SlimefunItemStack EAGLE_STAR = new SlimefunItemStack("EAGLE_STAR", Material.NETHER_STAR,
            "&7鹰之星","&f将此物品提升到鹰的等级!!",
            ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack FIRE_POWDER = new SlimefunItemStack("FIRE EAGLE POWDER", Material.BLAZE_POWDER,
            "&4火鹰火焰粉","&c使该物品达到火鹰等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack WATER_ORB = new SlimefunItemStack("WATER EAGLE ORB", Material.HEART_OF_THE_SEA,
            "&b水鹰之球","&9使用此物品可获得水鹰等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack AIR_ROD = new SlimefunItemStack("AIR EAGLE ROD", Material.END_ROD,
            "&f公平鹰杖","&9使该物品达到飞鹰等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack EARTH_FLOWER = new SlimefunItemStack("AIR EAGLE FLOWER", Material.WHITE_TULIP,
            "&7大地鹰花","&9将此物品的等级提升至大地鹰等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack PHOENIX_WART = new SlimefunItemStack("PHOENIX NETHER WART", Material.NETHER_WART,
            "&4凤凰虚空疣","&c将此物品的等级提升至凤凰等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack SIREN_LETTER = new SlimefunItemStack("SIREN LETTER", Material.PAPER,
            "&b海妖字母","&9使此物品达到海妖等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack ROC_HEAD = new SlimefunItemStack("ROC DRAGON HEAD", Material.DRAGON_HEAD,
            "&f龙首","&9使该物品的等级达到中华民国等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack CAL_LEAF = new SlimefunItemStack("CALADRIUS LEAF", Material.BIG_DRIPLEAF,
            "&7卡拉德留斯之叶","&9制造此物品可以达到卡拉德留斯的等级!!", ItemTags.CRAFTING_ITEM);
    public static final SlimefunItemStack RAVEN_ROSE = new SlimefunItemStack("RAVEN ROSE", Material.WITHER_ROSE,
            "&7渡鸦玫瑰","&9制造此物品可提升至渡鸦等级!!", ItemTags.CRAFTING_ITEM);

    public static final SlimefunItemStack ICARUS_BEACON = new SlimefunItemStack("ICARUS BEACON", Material.BEACON,
            "&e伊卡洛斯灯塔","&6使此物品的等级达到伊卡洛斯等级!!", ItemTags.CRAFTING_ITEM);

    private BlueSlimeItems(){
    }
}
