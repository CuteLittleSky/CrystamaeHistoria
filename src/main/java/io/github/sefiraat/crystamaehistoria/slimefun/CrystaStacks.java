package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.slimefun.items.artistic.MagicPaintbrush;
import io.github.sefiraat.crystamaehistoria.utils.GeneralUtils;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.text.MessageFormat;

@UtilityClass
public class CrystaStacks {

    // Materials
    public static final SlimefunItemStack CRYSTAL_BLANK;
    public static final SlimefunItemStack CRYSTAL_POLYCHROMATIC;
    public static final SlimefunItemStack CRYSTAL_KALEIDOSCOPIC;
    public static final SlimefunItemStack CRYSTAL_MOTLEY;
    public static final SlimefunItemStack CRYSTAL_PRISMATIC;
    public static final SlimefunItemStack AMALGAMATE_DUST_COMMON;
    public static final SlimefunItemStack AMALGAMATE_DUST_UNCOMMON;
    public static final SlimefunItemStack AMALGAMATE_DUST_RARE;
    public static final SlimefunItemStack AMALGAMATE_DUST_EPIC;
    public static final SlimefunItemStack AMALGAMATE_DUST_MYTHICAL;
    public static final SlimefunItemStack AMALGAMATE_DUST_UNIQUE;
    public static final SlimefunItemStack AMALGAMATE_INGOT_COMMON;
    public static final SlimefunItemStack AMALGAMATE_INGOT_UNCOMMON;
    public static final SlimefunItemStack AMALGAMATE_INGOT_RARE;
    public static final SlimefunItemStack AMALGAMATE_INGOT_EPIC;
    public static final SlimefunItemStack AMALGAMATE_INGOT_MYTHICAL;
    public static final SlimefunItemStack AMALGAMATE_INGOT_UNIQUE;
    public static final SlimefunItemStack ARCANE_SIGIL;
    public static final SlimefunItemStack IMBUED_GLASS;
    public static final SlimefunItemStack UNCANNY_PEARL;
    public static final SlimefunItemStack GILDED_PEARL;
    public static final SlimefunItemStack BASIC_FIBRES;
    public static final SlimefunItemStack POWDERED_ESSENCE;
    public static final SlimefunItemStack MAGICAL_MILK;

    // Runes
    public static final SlimefunItemStack RUNE_BEAST;
    public static final SlimefunItemStack RUNE_BEGINNING;
    public static final SlimefunItemStack RUNE_MOON;
    public static final SlimefunItemStack RUNE_GATE;
    public static final SlimefunItemStack RUNE_TRUE_EARTH;
    public static final SlimefunItemStack RUNE_CHANGE;
    public static final SlimefunItemStack RUNE_NIGHT;
    public static final SlimefunItemStack RUNE_BLACK;
    public static final SlimefunItemStack RUNE_TRUE_HOLY;
    public static final SlimefunItemStack RUNE_DRAGON;
    public static final SlimefunItemStack RUNE_TRUE_WATER;
    public static final SlimefunItemStack RUNE_SOVEREIGN;
    public static final SlimefunItemStack RUNE_SUN;
    public static final SlimefunItemStack RUNE_DAWN;
    public static final SlimefunItemStack RUNE_TWILIGHT;
    public static final SlimefunItemStack RUNE_TRUE_FIRE;
    public static final SlimefunItemStack RUNE_CIRCLE;
    public static final SlimefunItemStack RUNE_BLINKING;
    public static final SlimefunItemStack RUNE_SOUL;
    public static final SlimefunItemStack RUNE_PUNISHMENT;
    public static final SlimefunItemStack RUNE_TRUE_LIGHTNING;
    public static final SlimefunItemStack RUNE_EIGHTFOLD;
    public static final SlimefunItemStack RUNE_CHARM;
    public static final SlimefunItemStack RUNE_TRUE_WIND;
    public static final SlimefunItemStack RUNE_BLACK_SWORD;
    public static final SlimefunItemStack RUNE_BRIGHT_SHIELD;


    // Artistic
    public static final SlimefunItemStack PAINT_BRUSH_BLACK_100;
    public static final SlimefunItemStack PAINT_BRUSH_BLUE_100;
    public static final SlimefunItemStack PAINT_BRUSH_BROWN_100;
    public static final SlimefunItemStack PAINT_BRUSH_CYAN_100;
    public static final SlimefunItemStack PAINT_BRUSH_GRAY_100;
    public static final SlimefunItemStack PAINT_BRUSH_GREEN_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_BLUE_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_GRAY_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIME_100;
    public static final SlimefunItemStack PAINT_BRUSH_MAGENTA_100;
    public static final SlimefunItemStack PAINT_BRUSH_ORANGE_100;
    public static final SlimefunItemStack PAINT_BRUSH_PINK_100;
    public static final SlimefunItemStack PAINT_BRUSH_PURPLE_100;
    public static final SlimefunItemStack PAINT_BRUSH_RED_100;
    public static final SlimefunItemStack PAINT_BRUSH_WHITE_100;
    public static final SlimefunItemStack PAINT_BRUSH_YELLOW_100;
    public static final SlimefunItemStack PAINT_BRUSH_BLACK_1000;
    public static final SlimefunItemStack PAINT_BRUSH_BLUE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_BROWN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_CYAN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_GRAY_1000;
    public static final SlimefunItemStack PAINT_BRUSH_GREEN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_BLUE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_GRAY_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIME_1000;
    public static final SlimefunItemStack PAINT_BRUSH_MAGENTA_1000;
    public static final SlimefunItemStack PAINT_BRUSH_ORANGE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_PINK_1000;
    public static final SlimefunItemStack PAINT_BRUSH_PURPLE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_RED_1000;
    public static final SlimefunItemStack PAINT_BRUSH_WHITE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_YELLOW_1000;
    public static final SlimefunItemStack PAINT_BRUSH_INFINITE;
    public static final SlimefunItemStack MYSTICAL_PIGMENTATO;
    public static final SlimefunItemStack MYSTICAL_TINTANNO;
    public static final SlimefunItemStack BODY_STAND;
    public static final SlimefunItemStack MIND_STAND;
    public static final SlimefunItemStack SOUL_STAND;
    public static final SlimefunItemStack MYSTICAL_ATTITUDINIZER;
    public static final SlimefunItemStack IMBUED_STAND;
    public static final SlimefunItemStack POSE_CHANGER;
    public static final SlimefunItemStack POSE_CLONER;

    // Exalted
    public static final SlimefunItemStack EXALTED_BEACON;
    public static final SlimefunItemStack EXALTED_BAELFIRE;
    public static final SlimefunItemStack EXALTED_FERTILITY_PHARO;
    public static final SlimefunItemStack EXALTED_FERTILITY_TOTEM;
    public static final SlimefunItemStack EXALTED_HARVESTER;
    public static final SlimefunItemStack EXALTED_AGRONOMIST;
    public static final SlimefunItemStack EXALTED_DAWN;
    public static final SlimefunItemStack EXALTED_DUSK;
    public static final SlimefunItemStack EXALTED_SUN;
    public static final SlimefunItemStack EXALTED_STORM;
    public static final SlimefunItemStack EXALTED_SEA_BREEZE;

    // Gadgets
    public static final SlimefunItemStack ABSTRACTION_LAMP;
    public static final SlimefunItemStack DISPERSION_LAMP;
    public static final SlimefunItemStack EXODUS_LAMP;
    public static final SlimefunItemStack INVERSION_VACUUM;
    public static final SlimefunItemStack ANTIPODAL_VACUUM;
    public static final SlimefunItemStack COUNTERPOLE_VACUUM;
    public static final SlimefunItemStack CURSED_EARTH;
    public static final SlimefunItemStack DREADFUL_DIRT;
    public static final SlimefunItemStack SOULFILLED_SOIL;
    public static final SlimefunItemStack SEARING_PLATE;
    public static final SlimefunItemStack DOOMED_PLATE;
    public static final SlimefunItemStack EVISCERATING_PLATE;
    public static final SlimefunItemStack SHREDDING_PLATE;
    public static final SlimefunItemStack TRAP_PLATE;
    public static final SlimefunItemStack EXP_COLLECTOR_BASIC;
    public static final SlimefunItemStack EXP_COLLECTOR_INFUSED;
    public static final SlimefunItemStack EXP_COLLECTOR_ARCANE;
    public static final SlimefunItemStack ENDER_INHIBITOR_BASIC;
    public static final SlimefunItemStack ENDER_INHIBITOR_ADVANCED;
    public static final SlimefunItemStack MOB_CANDLE_DIM;
    public static final SlimefunItemStack MOB_CANDLE_BRIGHT;
    public static final SlimefunItemStack MOB_CANDLE_SCINTILLATING;
    public static final SlimefunItemStack MOB_CANDLE_CORUSCATING;
    public static final SlimefunItemStack MYSTERIOUS_POTTED_PLANT;
    public static final SlimefunItemStack MYSTERIOUS_PLANT;
    public static final SlimefunItemStack MYSTERIOUS_GLASS;
    public static final SlimefunItemStack MYSTERIOUS_WOOL;
    public static final SlimefunItemStack MYSTERIOUS_TERRACOTTA;
    public static final SlimefunItemStack MYSTERIOUS_GLAZED_TERRACOTTA;
    public static final SlimefunItemStack MYSTERIOUS_CONCRETE;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS_FOCUSED;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS_MAGNIFYING;
    public static final SlimefunItemStack TROPHY_STAND;
    public static final SlimefunItemStack EXALTATION_STAND;
    public static final SlimefunItemStack WAYSTONE;
    public static final SlimefunItemStack ANGEL_BLOCK;
    public static final SlimefunItemStack PHILOSOPHERS_SPRAY;
    public static final SlimefunItemStack GLASS_OF_MILK;
    public static final SlimefunItemStack FRAGMENTED_VOID;
    public static final SlimefunItemStack SHATTERED_VOID;

    // Mechanisms
    public static final SlimefunItemStack CHRONICLER_PANEL_1;
    public static final SlimefunItemStack CHRONICLER_PANEL_2;
    public static final SlimefunItemStack CHRONICLER_PANEL_3;
    public static final SlimefunItemStack CHRONICLER_PANEL_4;
    public static final SlimefunItemStack CHRONICLER_PANEL_5;
    public static final SlimefunItemStack REALISATION_ALTAR_1;
    public static final SlimefunItemStack REALISATION_ALTAR_2;
    public static final SlimefunItemStack REALISATION_ALTAR_3;
    public static final SlimefunItemStack REALISATION_ALTAR_4;
    public static final SlimefunItemStack REALISATION_ALTAR_5;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_1;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_2;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_3;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_4;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_5;
    public static final SlimefunItemStack STAVE_CONFIGURATOR;
    public static final SlimefunItemStack PRISMATIC_GILDER;

    // Tools
    public static final SlimefunItemStack INERT_PLATE;
    public static final SlimefunItemStack CHARGED_PLATE;
    public static final SlimefunItemStack STAVE_BASIC;
    public static final SlimefunItemStack STAVE_ADVANCED;
    public static final SlimefunItemStack STAVE_ARCANE;
    public static final SlimefunItemStack REFRACTING_LENS;
    public static final SlimefunItemStack THAUMATURGIC_SALTS;
    public static final SlimefunItemStack CRYSTA_RECALL_LATTICE;
    public static final SlimefunItemStack EPHEMERAL_CRAFT_TABLE;
    public static final SlimefunItemStack EPHEMERAL_WORKBENCH;
    public static final SlimefunItemStack LUMINESCENCE_SCOOP;
    public static final SlimefunItemStack BRILLIANCE_SCOOP;
    public static final SlimefunItemStack LUSTRE_SCOOP;
    public static final SlimefunItemStack RADIANCE_SCOOP;
    public static final SlimefunItemStack CONNECTING_COMPASS;
    public static final SlimefunItemStack SPIRITUAL_SILKEN;
    public static final SlimefunItemStack INCORPOREAL_SILKEN;
    public static final SlimefunItemStack SIMPLE_DISPLACER;
    public static final SlimefunItemStack ARCANE_DISPLACER;
    public static final SlimefunItemStack SPONGE_BALMY;
    public static final SlimefunItemStack SPONGE_SEARING;
    public static final SlimefunItemStack SPONGE_SUPER_MASSIVE;
    public static final SlimefunItemStack SLEEPING_BAG;
    public static final SlimefunItemStack DISPLACED_VOID;
    public static final SlimefunItemStack SATCHEL_1;
    public static final SlimefunItemStack SATCHEL_2;
    public static final SlimefunItemStack SATCHEL_3;
    public static final SlimefunItemStack SATCHEL_4;
    public static final SlimefunItemStack SATCHEL_5;
    public static final SlimefunItemStack SATCHEL_6;
    public static final SlimefunItemStack CARGO_COVER;
    public static final SlimefunItemStack ENERGY_NET_COVER;
    public static final SlimefunItemStack NETWORKS_COVER;

    // Uniques
    public static final SlimefunItemStack STORY_TROPHY;
    public static final SlimefunItemStack SPELL_TROPHY;
    public static final SlimefunItemStack GILDING_TROPHY;
    public static final SlimefunItemStack CHRISTMAS_TROPHY;
    public static final SlimefunItemStack VALENTINES_TROPHY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_CHEESY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_BWHITE;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_DECOY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_ODDISH;

    // Recipe Types
    public static final ItemStack RECIPE_TYPE_LIQUEFACTION_CRAFTING;
    public static final ItemStack RECIPE_TYPE_LIQUEFACTION_SPELL;
    public static final ItemStack RECIPE_TYPE_NETHER_DRAINING;
    public static final ItemStack RECIPE_TYPE_REALISATION_ALTAR_NORMAL;
    public static final ItemStack RECIPE_TYPE_REALISATION_ALTAR_SIGIL;

    static {

        // Materials

        CRYSTAL_BLANK = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_BLANK",
            Skulls.CRYSTAL_CLEAR.getPlayerHead(),
            ThemeType.CRAFTING,
            "空白水晶",
            "一块普通的水晶",
            "内部蕴含的魔法能量都被吸干了"
        );

        CRYSTAL_POLYCHROMATIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_POLYCHROMATIC",
            Skulls.CRYSTAL_POLYCHROME.getPlayerHead(),
            ThemeType.CRAFTING,
            "多彩水晶",
            "一块注入了多种魔法的水晶"
        );

        CRYSTAL_KALEIDOSCOPIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_KALEIDOSCOPIC",
            Skulls.CRYSTAL_KALEIDOSCOPIC.getPlayerHead(),
            ThemeType.CRAFTING,
            "千变水晶",
            "一块注入了多种魔法的水晶"
        );

        CRYSTAL_MOTLEY = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_MOTLEY",
            Skulls.CRYSTAL_MOTLEY.getPlayerHead(),
            ThemeType.CRAFTING,
            "混合水晶",
            "一块注入了多种魔法的水晶"
        );

        CRYSTAL_PRISMATIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_PRISMATIC",
            Skulls.CRYSTAL_PRISMATIC.getPlayerHead(),
            ThemeType.CRAFTING,
            "棱镜水晶",
            "这块水晶已经注入了太多的魔法",
            "&m棱镜核心已经点亮"
        );

        AMALGAMATE_DUST_COMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_COMMON",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (普通)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_DUST_UNCOMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_UNCOMMON",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (罕见)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_DUST_RARE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_RARE",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (稀有)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_DUST_EPIC = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_EPIC",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (史诗)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_DUST_MYTHICAL = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_MYTHICAL",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (神秘)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_DUST_UNIQUE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_UNIQUE",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "融合粉 (独特)",
            "融合了所有魔法类型的粉"
        );

        AMALGAMATE_INGOT_COMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_COMMON",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (普通)",
            "由纯粹的魔法制成的锭"
        );

        AMALGAMATE_INGOT_UNCOMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_UNCOMMON",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (罕见)",
            "由纯粹的魔法制成的锭"
        );

        AMALGAMATE_INGOT_RARE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_RARE",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (稀有)",
            "由纯粹的魔法制成的锭"
        );

        AMALGAMATE_INGOT_EPIC = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_EPIC",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (史诗)",
            "由纯粹的魔法制成的锭"
        );

        AMALGAMATE_INGOT_MYTHICAL = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_MYTHICAL",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (神秘)",
            "由纯粹的魔法制成的锭"
        );

        AMALGAMATE_INGOT_UNIQUE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_UNIQUE",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "融合锭 (独特)",
            "由纯粹的魔法制成的锭"
        );

        ARCANE_SIGIL = ThemeType.themedSlimefunItemStack(
            "CRY_ARCANE_SIGIL",
            new ItemStack(Material.GLOW_LICHEN),
            ThemeType.CRAFTING,
            "神秘印记",
            "在世界中由其他魔法水晶使用者",
            "遗留下来的古代标记"
        );

        IMBUED_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_IMBUED_GLASS",
            new ItemStack(Material.GLASS_PANE),
            ThemeType.CRAFTING,
            "注魔玻璃",
            "注入了魔法水晶的玻璃",
            "拥有一些奇怪的属性"
        );

        UNCANNY_PEARL = ThemeType.themedSlimefunItemStack(
            "CRY_UNCANNY_PEARL",
            new ItemStack(Material.ENDER_PEARL),
            ThemeType.CRAFTING,
            "不可思议的珍珠",
            "这颗末影珍珠的内部共振",
            "已经使用魔法水晶平息了"
        );

        GILDED_PEARL = ThemeType.themedSlimefunItemStack(
            "CRY_GILDED_PEARL",
            new ItemStack(Material.ENDER_PEARL),
            ThemeType.CRAFTING,
            "镀金珍珠",
            "一颗平静的珍珠可以进行镀金",
            "用于其他合成"
        );

        BASIC_FIBRES = ThemeType.themedSlimefunItemStack(
            "CRY_BASIC_FIBRES",
            new ItemStack(Material.DRIED_KELP),
            ThemeType.CRAFTING,
            "基本纤维",
            "非常基本与粗糙的纤维"
        );

        POWDERED_ESSENCE = ThemeType.themedSlimefunItemStack(
            "CRY_POWDERED_ESSENCE",
            new ItemStack(Material.WHITE_DYE),
            ThemeType.CRAFTING,
            "粉状精华",
            "精制的合成材料",
            "可作为骨粉使用",
            "",
            LoreBuilder.usesLeft(250)
        );

        MAGICAL_MILK = ThemeType.themedSlimefunItemStack(
            "CRY_MAGICAL_MILK_POWDER",
            new ItemStack(Material.SUGAR),
            ThemeType.CRAFTING,
            "魔法牛奶",
            "这种牛奶有一点特殊...",
            "",
            ChatColor.YELLOW + "不要直接饮用!"
        );

        // Runes
        RUNE_BEAST = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BEAST",
            Skulls.RUNE_A.getPlayerHead(),
            ThemeType.RUNE,
            "野性符文",
            "肆无忌惮的激情和干劲",
            "狼的嚎叫在内部回响"
        );

        RUNE_BEGINNING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BEGINNING",
            Skulls.RUNE_B.getPlayerHead(),
            ThemeType.RUNE,
            "起源符文",
            "混乱形成秩序",
            "未知的漩涡静止了"
        );

        RUNE_MOON = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_MOON",
            Skulls.RUNE_C.getPlayerHead(),
            ThemeType.RUNE,
            "转化符文",
            "慈悲心和纯粹的破坏性的冲突",
            "在内心汹涌澎湃"
        );

        RUNE_GATE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_GATE",
            Skulls.RUNE_D.getPlayerHead(),
            ThemeType.RUNE,
            "大门符文",
            "连接世界的线程",
            "都经过符文中蕴含的魔法"
        );

        RUNE_TRUE_EARTH = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_EARTH",
            Skulls.RUNE_E.getPlayerHead(),
            ThemeType.RUNE,
            "真实地球符文",
            "所有地球魔法的能量",
            "都集中在符文中"
        );

        RUNE_CHANGE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CHANGE",
            Skulls.RUNE_F.getPlayerHead(),
            ThemeType.RUNE,
            "改变符文",
            "所有宇宙的未知与未来都在符文之中"
        );

        RUNE_NIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_NIGHT",
            Skulls.RUNE_G.getPlayerHead(),
            ThemeType.RUNE,
            "夜晚符文",
            "该符文包含能让死灵出现的魔法"
        );

        RUNE_BLACK = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLACK",
            Skulls.RUNE_H.getPlayerHead(),
            ThemeType.RUNE,
            "黑色符文",
            "包含能够控制思想与意志的力量"
        );

        RUNE_TRUE_HOLY = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_HOLY",
            Skulls.RUNE_I.getPlayerHead(),
            ThemeType.RUNE,
            "真实神圣符文",
            "所有内在的光芒都源于此"
        );

        RUNE_DRAGON = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_DRAGON",
            Skulls.RUNE_J.getPlayerHead(),
            ThemeType.RUNE,
            "龙之符文",
            "龙的存在源于该符文，也生成了该符文",
            "这究竟是不是一个悖论呢"
        );

        RUNE_TRUE_WATER = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_WATER",
            Skulls.RUNE_K.getPlayerHead(),
            ThemeType.RUNE,
            "真实水之符文",
            "一切自由流体的开端"
        );

        RUNE_SOVEREIGN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SOVEREIGN",
            Skulls.RUNE_L.getPlayerHead(),
            ThemeType.RUNE,
            "至高符文",
            "根据规则统治",
            "一人之下，万人之上"
        );

        RUNE_SUN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SUN",
            Skulls.RUNE_M.getPlayerHead(),
            ThemeType.RUNE,
            "太阳符文",
            "带来繁荣与生命",
            "所有人都要付出代价"
        );

        RUNE_DAWN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_DAWN",
            Skulls.RUNE_N.getPlayerHead(),
            ThemeType.RUNE,
            "黎明符文",
            "带来新生，带来恢复"
        );

        RUNE_TWILIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TWILIGHT",
            Skulls.RUNE_O.getPlayerHead(),
            ThemeType.RUNE,
            "暮光符文",
            "抛弃过去的一切",
            "带来全新的世界"
        );

        RUNE_TRUE_FIRE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_FIRE",
            Skulls.RUNE_P.getPlayerHead(),
            ThemeType.RUNE,
            "真实火焰符文",
            "无限的地狱之火包含在其中"
        );

        RUNE_CIRCLE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CIRCLE",
            Skulls.RUNE_Q.getPlayerHead(),
            ThemeType.RUNE,
            "圆之符文",
            "保持秩序，维护和平",
            "圆之符文在MC中因为某些原因被弱化了"
        );

        RUNE_BLINKING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLINKING",
            Skulls.RUNE_R.getPlayerHead(),
            ThemeType.RUNE,
            "折跃符文",
            "该符文包含空间魔法",
            "可用于远距离折跃"
        );

        RUNE_SOUL = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SOUL",
            Skulls.RUNE_S.getPlayerHead(),
            ThemeType.RUNE,
            "灵魂吞噬者符文",
            "生与死，轮回不止",
            "我们生，他们死"
        );

        RUNE_PUNISHMENT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_PUNISHMENT",
            Skulls.RUNE_T.getPlayerHead(),
            ThemeType.RUNE,
            "惩罚符文",
            "该符文通过剔除异见者与不法之徒",
            "来加强统治"
        );

        RUNE_TRUE_LIGHTNING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_LIGHTNING",
            Skulls.RUNE_U.getPlayerHead(),
            ThemeType.RUNE,
            "真实雷电符文",
            "来自天空中的暴风雨",
            "蕴含在该符文中"
        );

        RUNE_EIGHTFOLD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_EIGHTFOLD",
            Skulls.RUNE_V.getPlayerHead(),
            ThemeType.RUNE,
            "八重符文",
            "现实与诞生的规则",
            "这个符文中的魔法可以创造全新的物质"
        );

        RUNE_CHARM = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CHARM",
            Skulls.RUNE_W.getPlayerHead(),
            ThemeType.RUNE,
            "魅力符文",
            "激情，驱动与爱",
            "全都包含在符文中的魔法内"
        );

        RUNE_TRUE_WIND = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_WIND",
            Skulls.RUNE_X.getPlayerHead(),
            ThemeType.RUNE,
            "真实风之符文",
            "包含永无止境的风"
        );

        RUNE_BLACK_SWORD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLACK_SWORD",
            Skulls.RUNE_Y.getPlayerHead(),
            ThemeType.RUNE,
            "黑剑符文",
            "力量，统治，驱动"
        );

        RUNE_BRIGHT_SHIELD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BRIGHT_SHIELD",
            Skulls.RUNE_Y.getPlayerHead(),
            ThemeType.RUNE,
            "亮盾符文",
            "力量，保护，安全"
        );

        // Artistic

        PAINT_BRUSH_BLACK_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLACK_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
            ThemeType.TOOL,
            "魔法画笔 (黑色)",
            "可以将染色方块变成黑色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BLUE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLUE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
            ThemeType.TOOL,
            "魔法画笔 (蓝色)",
            "可以将染色方块变成蓝色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BROWN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BROWN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
            ThemeType.TOOL,
            "魔法画笔 (棕色)",
            "可以将染色方块变成棕色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_CYAN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_CYAN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
            ThemeType.TOOL,
            "魔法画笔 (青色)",
            "可以将染色方块变成青色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_GRAY_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GRAY_100",
            MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
            ThemeType.TOOL,
            "魔法画笔 (灰色)",
            "可以将染色方块变成灰色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_GREEN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GREEN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
            ThemeType.TOOL,
            "魔法画笔 (绿色)",
            "可以将染色方块变成绿色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIGHT_BLUE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_BLUE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
            ThemeType.TOOL,
            "魔法画笔 (淡蓝色)",
            "可以将染色方块变成淡蓝色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIGHT_GRAY_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_GRAY_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
            ThemeType.TOOL,
            "魔法画笔 (淡灰色)",
            "可以将染色方块变成淡灰色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIME_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIME_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIME),
            ThemeType.TOOL,
            "魔法画笔 (黄绿色)",
            "可以将染色方块变成黄绿色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_MAGENTA_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_MAGENTA_100",
            MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
            ThemeType.TOOL,
            "魔法画笔 (品红色)",
            "可以将染色方块变成黄绿色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_ORANGE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_ORANGE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
            ThemeType.TOOL,
            "魔法画笔 (橙色)",
            "可以将染色方块变成橙色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_PINK_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PINK_100",
            MagicPaintbrush.getTippedBrush(DyeColor.PINK),
            ThemeType.TOOL,
            "魔法画笔 (粉色)",
            "可以将染色方块变成粉色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_PURPLE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PURPLE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
            ThemeType.TOOL,
            "魔法画笔 (紫色)",
            "可以将染色方块变成紫色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_RED_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_RED_100",
            MagicPaintbrush.getTippedBrush(DyeColor.RED),
            ThemeType.TOOL,
            "魔法画笔 (红色)",
            "可以将染色方块变成红色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_WHITE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_WHITE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
            ThemeType.TOOL,
            "魔法画笔 (白色)",
            "可以将染色方块变成红色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_YELLOW_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_YELLOW_100",
            MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
            ThemeType.TOOL,
            "魔法画笔 (黄色)",
            "可以将染色方块变成红色",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BLACK_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLACK_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
            ThemeType.TOOL,
            "高级魔法画笔 (黑色)",
            "可以将染色方块变成黑色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_BLUE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLUE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
            ThemeType.TOOL,
            "高级魔法画笔 (蓝色)",
            "可以将染色方块变成黑色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_BROWN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BROWN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
            ThemeType.TOOL,
            "高级魔法画笔 (棕色)",
            "可以将染色方块变成黑色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_CYAN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_CYAN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
            ThemeType.TOOL,
            "高级魔法画笔 (青色)",
            "可以将染色方块变成青色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_GRAY_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GRAY_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
            ThemeType.TOOL,
            "高级魔法画笔 (灰色)",
            "可以将染色方块变成灰色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_GREEN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GREEN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
            ThemeType.TOOL,
            "高级魔法画笔 (绿色)",
            "可以将染色方块变成绿色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIGHT_BLUE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_BLUE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
            ThemeType.TOOL,
            "高级魔法画笔 (淡蓝色)",
            "可以将染色方块变成淡蓝色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIGHT_GRAY_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_GRAY_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
            ThemeType.TOOL,
            "高级魔法画笔 (淡灰色)",
            "可以将染色方块变成淡灰色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIME_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIME_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIME),
            ThemeType.TOOL,
            "高级魔法画笔 (黄绿色)",
            "可以将染色方块变成黄绿色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_MAGENTA_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_MAGENTA_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
            ThemeType.TOOL,
            "高级魔法画笔 (品红色)",
            "可以将染色方块变成品红色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_ORANGE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_ORANGE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
            ThemeType.TOOL,
            "高级魔法画笔 (橙色)",
            "可以将染色方块变成橙色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_PINK_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PINK_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.PINK),
            ThemeType.TOOL,
            "高级魔法画笔 (粉色)",
            "可以将染色方块变成粉色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_PURPLE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PURPLE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
            ThemeType.TOOL,
            "高级魔法画笔 (紫色)",
            "可以将染色方块变成紫色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_RED_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_RED_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.RED),
            ThemeType.TOOL,
            "高级魔法画笔 (红色)",
            "可以将染色方块变成红色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_WHITE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_WHITE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
            ThemeType.TOOL,
            "高级魔法画笔 (白色)",
            "可以将染色方块变成白色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_YELLOW_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_YELLOW_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
            ThemeType.TOOL,
            "高级魔法画笔 (黄色)",
            "可以将染色方块变成黄色",
            "拥有更多使用次数",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_INFINITE = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_INFINITE",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE, true),
            ThemeType.TOOL,
            "神秘画笔",
            "可以粉刷染色方块与染色生物",
            "可以选择所有的可用颜色",
            "没有使用次数限制",
            "",
            MessageFormat.format("{0}Shift+左键点击: {1}改变颜色", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        MYSTICAL_PIGMENTATO = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_PIGMENTATO",
            new ItemStack(Material.PRISMARINE),
            ThemeType.CRAFTING,
            "神秘色素",
            "浓缩的彩色精华"
        );

        MYSTICAL_TINTANNO = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_TINTANNO",
            new ItemStack(Material.DARK_PRISMARINE),
            ThemeType.CRAFTING,
            "神秘染料",
            "浓缩的彩色精华"
        );

        BODY_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_BODY_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "不完整的盔甲架(身体)",
            "这个盔甲架的一部分坏掉了"
        );

        MIND_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_MIND_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "不完整的盔甲架(思想)",
            "这个盔甲架的一部分坏掉了",
            "&m这个人应该是思想出问题了"
        );

        SOUL_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_SOUL_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "不完整的盔甲架(灵魂)",
            "这个盔甲架的一部分坏掉了"
        );

        MYSTICAL_ATTITUDINIZER = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_ATTITUDINIZER",
            new ItemStack(Material.BELL),
            ThemeType.CRAFTING,
            "神秘姿态",
            "浓缩的姿态精华"
        );

        IMBUED_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_IMBUED_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.TOOL,
            "注入盔甲架",
            "这个盔甲架可以被造型设置器",
            "设置为隐身或变小"
        );

        POSE_CHANGER = ThemeType.themedSlimefunItemStack(
            "CRY_POSE_CHANGER",
            new ItemStack(Material.BAMBOO),
            ThemeType.TOOL,
            "造型设置器",
            "该物品可以让你设置盔甲架的造型",
            "可以更改原版的盔甲架",
            "可以对注入盔甲架做更多事情",
            "",
            MessageFormat.format("{0}左键点击: {1}更改选中的部分", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift+左键点击: {1}更改修改的方法", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}右键点击: {1}应用更改 (positive)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift+右键点击: {1}应用更改 (negative)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            "",
            MessageFormat.format("{0}选中部分: {1}HEAD", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}修改方法: {1}RESET", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        POSE_CLONER = ThemeType.themedSlimefunItemStack(
            "CRY_POSE_CLONER",
            new ItemStack(Material.SEA_PICKLE),
            ThemeType.TOOL,
            "造型复制器",
            "这个物品可以复制注入盔甲架",
            "的造型并应用到另一个注入盔甲架上",
            "",
            MessageFormat.format("{0}右键点击: {1}复制造型", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift+右键点击: {1}应用造型", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        EXALTED_BEACON = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_BEACON",
            new ItemStack(Material.BEACON),
            ThemeType.EXALTED,
            "尊贵的信标",
            "一个信标，内部拥有难以置信的力量",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "等级: " + ThemeType.PASSIVE.getColor() + "2",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        EXALTED_BAELFIRE = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_BAELFIRE",
            new ItemStack(Material.SOUL_CAMPFIRE),
            ThemeType.EXALTED,
            "尊贵的篝火",
            "一个信标，内部拥有难以置信的力量",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "等级: " + ThemeType.PASSIVE.getColor() + "3",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        EXALTED_FERTILITY_PHARO = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_FERTILITY_PHARO",
            new ItemStack(Material.DIAMOND_BLOCK),
            ThemeType.EXALTED,
            "尊贵的喂养机",
            "一个魔法构造，可以喂养周围10x10范围内的动物",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        EXALTED_FERTILITY_TOTEM = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_FERTILITY_TOTEM",
            new ItemStack(Material.EMERALD_BLOCK),
            ThemeType.EXALTED,
            "尊贵的生产图腾",
            "一个魔法构造，可以喂养周围20x20范围内的动物",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        EXALTED_HARVESTER = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_HARVESTER",
            new ItemStack(Material.HAY_BLOCK),
            ThemeType.EXALTED,
            "尊贵的收割机",
            "一个魔法构造，可以收获9x9范围内的所有作物",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 法术等级 达到 宗师级魔法师"
        );

        EXALTED_AGRONOMIST = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_AGRONOMIST",
            new ItemStack(Material.DRIED_KELP_BLOCK),
            ThemeType.EXALTED,
            "尊贵的农学家",
            "一个魔法构造，可以收获19x19范围内的所有作物",
            "需要放置在尊贵展台上才能使用",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 法术等级 达到 宗师级魔法师"
        );

        EXALTED_DAWN = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_DAWN",
            new ItemStack(Material.YELLOW_WOOL),
            ThemeType.EXALTED,
            "尊贵的黎明",
            "一个魔法构造，像太阳一样耀眼",
            "让玩家时间固定在白天（不会影响实际时间）",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在白天合成"
        );

        EXALTED_DUSK = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_DUSK",
            new ItemStack(Material.BLACK_WOOL),
            ThemeType.EXALTED,
            "尊贵的黄昏",
            "一个魔法构造，像新月一样闪耀",
            "让玩家时间固定在夜晚（不会影响实际时间）",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在夜间合成"
        );

        EXALTED_SUN = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_SUN",
            new ItemStack(Material.MAGMA_BLOCK),
            ThemeType.EXALTED,
            "尊贵的太阳",
            "一个散发着太阳的光辉的魔法构造",
            "让玩家天气变为晴天（不会影响实际天气）",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 需要在晴天合成"
        );

        EXALTED_STORM = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_STORM",
            new ItemStack(Material.GRAY_WOOL),
            ThemeType.EXALTED,
            "尊贵的风暴",
            "一个散发着风暴的破坏力的魔法构造",
            "让玩家天气变为雨天（不会影响实际天气）",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在雨天合成"
        );

        EXALTED_SEA_BREEZE = ThemeType.themedSlimefunItemStack(
            "CRY_SEA_BREEZE",
            new ItemStack(Material.TUBE_CORAL_BLOCK),
            ThemeType.EXALTED,
            "尊贵的海风",
            "一个可以给周围方块带来海风的魔法构造",
            "会加速风化和氧化附近的方块",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在沙滩上合成"
        );

        // Gadgets

        ABSTRACTION_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_1",
            new ItemStack(Material.LANTERN),
            ThemeType.GADGET,
            "驱散之灯 (1)",
            "\"妖魔鬼怪快离开~\"",
            "驱散之灯会不断地推开",
            "附近的敌对生物",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "5 格",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "3 CrystaPow™"
        );

        DISPERSION_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_2",
            new ItemStack(Material.SOUL_LANTERN),
            ThemeType.GADGET,
            "驱散之灯 (2)",
            "\"妖魔鬼怪快离开~\"",
            "驱散之灯会不断地推开",
            "附近的敌对生物",
            "",
            ThemeType.CLICK_INFO.getColor() + "反馈: " + ThemeType.PASSIVE.getColor() + "7 格",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "5 CrystaPow™"
        );

        EXODUS_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_3",
            GeneralUtils.getPreEnchantedItemStack(Material.SOUL_LANTERN),
            ThemeType.GADGET,
            "驱散之灯 (3)",
            "\"妖魔鬼怪快离开~\"",
            "驱散之灯会不断地推开",
            "附近的敌对生物",
            "",
            ThemeType.CLICK_INFO.getColor() + "反馈: " + ThemeType.PASSIVE.getColor() + "10 格",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "10 CrystaPow™"
        );

        INVERSION_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_1",
            new ItemStack(Material.REDSTONE_LAMP),
            ThemeType.GADGET,
            "空气炮 (1)",
            "可以朝某个方向不断发射空气炮",
            "推开指定方向的实体",
            "",
            ThemeType.CLICK_INFO.getColor() + "推动距离: " + ThemeType.PASSIVE.getColor() + "5 格"
        );

        ANTIPODAL_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_2",
            new ItemStack(Material.NOTE_BLOCK),
            ThemeType.GADGET,
            "空气炮 (2)",
            "可以朝某个方向不断发射空气炮",
            "推开指定方向的实体",
            "",
            ThemeType.CLICK_INFO.getColor() + "推动距离: " + ThemeType.PASSIVE.getColor() + "10 格"
        );

        COUNTERPOLE_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_3",
            new ItemStack(Material.DEEPSLATE_BRICKS),
            ThemeType.GADGET,
            "空气炮 (3)",
            "可以朝某个方向不断发射空气炮",
            "推开指定方向的实体",
            "",
            ThemeType.CLICK_INFO.getColor() + "推动距离: " + ThemeType.PASSIVE.getColor() + "15 格"
        );

        CURSED_EARTH = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_1",
            new ItemStack(Material.BROWN_WOOL),
            ThemeType.GADGET,
            "诅咒之地 (1)",
            "黑魔法影响了这个方块",
            "会不断召唤出可怕的怪物",
            "",
            ThemeType.CLICK_INFO.getColor() + "生成间隔: " + ThemeType.PASSIVE.getColor() + "20",
            ThemeType.CLICK_INFO.getColor() + "光照等级不高于: " + ThemeType.PASSIVE.getColor() + "7",
            ThemeType.CLICK_INFO.getColor() + "生成: " + ThemeType.PASSIVE.getColor() + "基础怪物"
        );

        DREADFUL_DIRT = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_2",
            new ItemStack(Material.BLACK_WOOL),
            ThemeType.GADGET,
            "诅咒之地 (2)",
            "黑魔法影响了这个方块",
            "会不断召唤出可怕的怪物",
            "",
            ThemeType.CLICK_INFO.getColor() + "生成间隔: " + ThemeType.PASSIVE.getColor() + "10",
            ThemeType.CLICK_INFO.getColor() + "光照等级不高于: " + ThemeType.PASSIVE.getColor() + "15",
            ThemeType.CLICK_INFO.getColor() + "生成: " + ThemeType.PASSIVE.getColor() + "进阶怪物"
        );

        SOULFILLED_SOIL = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_3",
            new ItemStack(Material.LIME_WOOL),
            ThemeType.GADGET,
            "灵魂之地",
            "黑魔法已被净化",
            "",
            ThemeType.CLICK_INFO.getColor() + "生成间隔: " + ThemeType.PASSIVE.getColor() + "10",
            ThemeType.CLICK_INFO.getColor() + "光照等级不高于: " + ThemeType.PASSIVE.getColor() + "15",
            ThemeType.CLICK_INFO.getColor() + "生成: " + ThemeType.PASSIVE.getColor() + "友好生物"
        );

        SEARING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_1",
            new ItemStack(Material.CRIMSON_PRESSURE_PLATE),
            ThemeType.GADGET,
            "灼烧板 (1)",
            "一块被魔法加热的板",
            "任何站在上面的生物都会被烫伤",
            "",
            ThemeType.CLICK_INFO.getColor() + "伤害: " + ThemeType.PASSIVE.getColor() + "1",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落: " + ThemeType.PASSIVE.getColor() + "否"
        );

        DOOMED_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_2",
            new ItemStack(Material.WARPED_PRESSURE_PLATE),
            ThemeType.GADGET,
            "灼烧板 (2)",
            "一块被魔法加热的板",
            "任何站在上面的生物都会被烫伤",
            "",
            ThemeType.CLICK_INFO.getColor() + "伤害: " + ThemeType.PASSIVE.getColor() + "1",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落: " + ThemeType.PASSIVE.getColor() + "是"
        );

        EVISCERATING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_3",
            new ItemStack(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE),
            ThemeType.GADGET,
            "灼烧板 (3)",
            "一块被魔法加热的板",
            "任何站在上面的生物都会被烫伤",
            "",
            ThemeType.CLICK_INFO.getColor() + "伤害: " + ThemeType.PASSIVE.getColor() + "2",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落: " + ThemeType.PASSIVE.getColor() + "是"
        );

        SHREDDING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_4",
            new ItemStack(Material.LIGHT_WEIGHTED_PRESSURE_PLATE),
            ThemeType.GADGET,
            "灼烧板 (4)",
            "一块被魔法加热的板",
            "任何站在上面的生物都会被烫伤",
            "",
            ThemeType.CLICK_INFO.getColor() + "伤害: " + ThemeType.PASSIVE.getColor() + "3",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落: " + ThemeType.PASSIVE.getColor() + "是"
        );

        TRAP_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_TRAP",
            new ItemStack(Material.DARK_OAK_PRESSURE_PLATE),
            ThemeType.GADGET,
            "陷阱板",
            "这块板不再造成伤害，而是施加药水效果",
            "手持药水右键点击以设置施加的药水效果"
        );

        EXP_COLLECTOR_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_1",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "基础经验收集器",
            "注入了魔法的经验收集器",
            "不再需要电力和学识之瓶了",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "4",
            ThemeType.CLICK_INFO.getColor() + "上限: " + ThemeType.PASSIVE.getColor() + "2500"
        );

        EXP_COLLECTOR_INFUSED = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_2",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "注入经验收集器",
            "注入了更多魔法的经验收集器",
            "范围和存储上限增加了",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "8",
            ThemeType.CLICK_INFO.getColor() + "上限: " + ThemeType.PASSIVE.getColor() + "10000"
        );

        EXP_COLLECTOR_ARCANE = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_3",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "神秘经验收集器",
            "魔法印记让经验收集器",
            "能存储更多",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "8",
            ThemeType.CLICK_INFO.getColor() + "上限: " + ThemeType.PASSIVE.getColor() + "999999"
        );

        ENDER_INHIBITOR_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_ENDER_INHIBITOR_1",
            new ItemStack(Material.REDSTONE_TORCH),
            ThemeType.GADGET,
            "基础末影人抑制器",
            "我们利用末影人体内的回响",
            "来让它们在一段时间内无法传送离开",
            "在范围的末影人内会不断延长持续时间",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "4 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "2 秒"
        );

        ENDER_INHIBITOR_ADVANCED = ThemeType.themedSlimefunItemStack(
            "CRY_ENDER_INHIBITOR_2",
            new ItemStack(Material.SOUL_TORCH),
            ThemeType.GADGET,
            "进阶末影人抑制器",
            "我们利用末影人体内的回响",
            "来让它们在一段时间内无法传送离开",
            "在范围的末影人内会不断延长持续时间",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "8 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "2 秒"
        );

        MOB_CANDLE_DIM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_1",
            new ItemStack(Material.BLACK_CANDLE),
            ThemeType.GADGET,
            "防刷怪蜡烛 (1)",
            "这根蜡烛可以阻止周围区域",
            "自然生成怪物",
            "将在一段时间后消失",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "16 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "2 小时 (现实时间)"
        );

        MOB_CANDLE_BRIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_2",
            new ItemStack(Material.BROWN_CANDLE),
            ThemeType.GADGET,
            "防刷怪蜡烛 (2)",
            "这根蜡烛可以阻止周围区域",
            "自然生成怪物",
            "将在一段时间后消失",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "32 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "24 小时 (现实时间)"
        );

        MOB_CANDLE_SCINTILLATING = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_3",
            new ItemStack(Material.WHITE_CANDLE),
            ThemeType.GADGET,
            "防刷怪蜡烛 (3)",
            "这根蜡烛可以阻止周围区域",
            "自然生成怪物",
            "将在一段时间后消失",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "64 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "48 小时 (现实时间)"
        );

        MOB_CANDLE_CORUSCATING = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_4",
            new ItemStack(Material.MAGENTA_CANDLE),
            ThemeType.GADGET,
            "防刷怪蜡烛 (4)",
            "这根蜡烛可以阻止周围区域",
            "自然生成怪物",
            "将在一段时间后消失",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "64 格",
            ThemeType.CLICK_INFO.getColor() + "持续时间: " + ThemeType.PASSIVE.getColor() + "14 天 (现实时间)"
        );

        MYSTERIOUS_POTTED_PLANT = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_POTTED_PLANT",
            new ItemStack(Material.FLOWER_POT),
            ThemeType.GADGET,
            "花盆中的神秘植物",
            "只需要一点点魔法",
            "就能让世界变得更加美好"
        );

        MYSTERIOUS_PLANT = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_PLANT",
            new ItemStack(Material.OXEYE_DAISY),
            ThemeType.GADGET,
            "神秘植物",
            "把它从神秘花盆里取出来需要花一点时间"
        );

        MYSTERIOUS_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_GLASS",
            new ItemStack(Material.ORANGE_STAINED_GLASS),
            ThemeType.GADGET,
            "神秘玻璃",
            "很像彩虹玻璃但更加随机"
        );

        MYSTERIOUS_WOOL = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_WOOL",
            new ItemStack(Material.ORANGE_WOOL),
            ThemeType.GADGET,
            "神秘羊毛",
            "很像彩虹羊毛但更加随机"
        );

        MYSTERIOUS_TERRACOTTA = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_TERRACOTTA",
            new ItemStack(Material.ORANGE_TERRACOTTA),
            ThemeType.GADGET,
            "神秘陶瓦",
            "很像彩虹陶瓦但更加随机"
        );

        MYSTERIOUS_GLAZED_TERRACOTTA = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_GLAZED_TERRACOTTA",
            new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA),
            ThemeType.GADGET,
            "神秘带釉陶瓦",
            "很像彩虹带釉陶瓦但更加随机"
        );

        MYSTERIOUS_CONCRETE = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_CONCRETE",
            new ItemStack(Material.ORANGE_CONCRETE),
            ThemeType.GADGET,
            "神秘混凝土",
            "很像彩虹混凝土但更加随机"
        );

        GREEN_HOUSE_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_1",
            new ItemStack(Material.GLASS),
            ThemeType.GADGET,
            "温室玻璃",
            "在该方块下的作物生长会变快",
            "仅主世界白天时有效",
            "",
            ThemeType.CLICK_INFO.getColor() + "速度: " + ThemeType.PASSIVE.getColor() + "5 倍"
        );

        GREEN_HOUSE_GLASS_FOCUSED = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_2",
            new ItemStack(Material.YELLOW_STAINED_GLASS),
            ThemeType.GADGET,
            "高级温室玻璃",
            "在该方块下的作物生长会变快",
            "仅主世界白天时有效",
            "",
            ThemeType.CLICK_INFO.getColor() + "速度: " + ThemeType.PASSIVE.getColor() + "10 倍"
        );

        GREEN_HOUSE_GLASS_MAGNIFYING = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_3",
            new ItemStack(Material.TINTED_GLASS),
            ThemeType.GADGET,
            "巨型温室玻璃",
            "在该方块下的作物生长会变快",
            "仅主世界白天时有效",
            "",
            ThemeType.CLICK_INFO.getColor() + "速度: " + ThemeType.PASSIVE.getColor() + "20 倍"
        );

        TROPHY_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_TROPHY_DISPLAY_1",
            new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_WALL),
            ThemeType.GADGET,
            "战利品展示",
            "用于放置战利品并展示给全世界",
            "",
            "可放置:",
            ThemeType.CLICK_INFO.getColor() + "等级达到历史见证者的方块"
        );

        EXALTATION_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTATION_STAND",
            new ItemStack(Material.PRISMARINE_WALL),
            ThemeType.GADGET,
            "尊贵展台",
            "可以放置尊贵的物品",
            "这些物品有特定的摆放条件",
            "会给附近带来强大的效果"
        );

        WAYSTONE = ThemeType.themedSlimefunItemStack(
            "CRY_WAYSTONE",
            new ItemStack(Material.END_STONE_BRICK_WALL),
            ThemeType.GADGET,
            "路标",
            "可以作为魔法传送网的目的地"
        );

        ANGEL_BLOCK = ThemeType.themedSlimefunItemStack(
            "CRY_ANGEL_BLOCK",
            new ItemStack(Material.GLASS),
            ThemeType.GADGET,
            "天使方块",
            "可以被放置在任何地方",
            "甚至可以直接在空中放置"
        );

        PHILOSOPHERS_SPRAY = ThemeType.themedSlimefunItemStack(
            "CRY_PHILOSOPHERS_SPRAY",
            new ItemStack(Material.DISPENSER),
            ThemeType.GADGET,
            "哲学家喷雾",
            "使用红石信号激活后",
            "可以置换上方的方块"
        );

        GLASS_OF_MILK = ThemeType.themedSlimefunItemStack(
            "CRY_GLASS_OF_MILK",
            Skulls.ITEM_MILK.getPlayerHead(),
            ThemeType.GADGET,
            "牛奶玻璃",
            "放置后，右键点击可以",
            "移除身上所有的药水效果",
            "",
            ThemeType.WARNING.getColor() + "破坏后无法取回"
        );

        FRAGMENTED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_FRAGMENTED_VOID",
            new ItemStack(Material.BLACK_CONCRETE),
            ThemeType.GADGET,
            "虚空裂隙 (1)",
            "经过特殊处理的黑洞，可以随身携带",
            "放置后会吸入附近的所有物品",
            "",
            ThemeType.WARNING.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "5 格"
        );

        SHATTERED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_SHATTERED_VOID",
            new ItemStack(Material.BLACK_CONCRETE),
            ThemeType.GADGET,
            "虚空裂隙 (2)",
            "经过特殊处理的黑洞，可以随身携带",
            "放置后会吸入附近的所有物品",
            "",
            ThemeType.WARNING.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "7 格"
        );

        CHRONICLER_PANEL_1 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_1",
            new ItemStack(Material.COBBLED_DEEPSLATE_SLAB),
            ThemeType.MECHANISM,
            "记录者 (T1)",
            "记录者可以在任意方块中寻找",
            "并发掘出隐藏在其中的故事",
            "",
            "可发掘 T1-T2 方块"
        );

        CHRONICLER_PANEL_2 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_2",
            new ItemStack(Material.DEEPSLATE_TILE_SLAB),
            ThemeType.MECHANISM,
            "记录者 (T2)",
            "记录者可以在任意方块中寻找",
            "并发掘出隐藏在其中的故事",
            "",
            "可发掘 T1-T3 方块"
        );

        CHRONICLER_PANEL_3 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_3",
            new ItemStack(Material.NETHER_BRICK_SLAB),
            ThemeType.MECHANISM,
            "记录者 (T3)",
            "记录者可以在任意方块中寻找",
            "并发掘出隐藏在其中的故事",
            "",
            "可发掘 T1-T4 方块"
        );

        CHRONICLER_PANEL_4 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_4",
            new ItemStack(Material.DARK_PRISMARINE_SLAB),
            ThemeType.MECHANISM,
            "记录者 (T4)",
            "记录者可以在任意方块中寻找",
            "并发掘出隐藏在其中的故事",
            "",
            "可发掘 T1-T5 方块"
        );

        CHRONICLER_PANEL_5 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_5",
            new ItemStack(Material.SMOOTH_QUARTZ_SLAB),
            ThemeType.MECHANISM,
            "记录者 (T5)",
            "记录者可以在任意方块中寻找",
            "并发掘出隐藏在其中的故事",
            "",
            "可发掘 T1-T5 方块",
            "",
            "会自动获取丢在上方的物品",
            "并开始发掘故事",
            "发掘完成后会在下方丢出"
        );

        REALISATION_ALTAR_1 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_1",
            new ItemStack(Material.CHISELED_DEEPSLATE),
            ThemeType.MECHANISM,
            "现实祭坛 (T1)",
            "现实祭坛可以从已发掘出故事的方块中",
            "提取魔法能量，并将其转化为物理形态",
            "",
            "可提取 T1 - T2 方块"
        );

        REALISATION_ALTAR_2 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_2",
            new ItemStack(Material.CHISELED_NETHER_BRICKS),
            ThemeType.MECHANISM,
            "现实祭坛 (T2)",
            "现实祭坛可以从已发掘出故事的方块中",
            "提取魔法能量，并将其转化为物理形态",
            "",
            "可提取 T1 - T3 方块"
        );

        REALISATION_ALTAR_3 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_3",
            new ItemStack(Material.CHISELED_RED_SANDSTONE),
            ThemeType.MECHANISM,
            "现实祭坛 (T3)",
            "现实祭坛可以从已发掘出故事的方块中",
            "提取魔法能量，并将其转化为物理形态",
            "",
            "可提取 T1 - T4 方块"
        );

        REALISATION_ALTAR_4 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_4",
            new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE),
            ThemeType.MECHANISM,
            "现实祭坛 (T4)",
            "现实祭坛可以从已发掘出故事的方块中",
            "提取魔法能量，并将其转化为物理形态",
            "",
            "可提取 T1 - T5 方块"
        );

        REALISATION_ALTAR_5 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_5",
            new ItemStack(Material.CHISELED_STONE_BRICKS),
            ThemeType.MECHANISM,
            "现实祭坛 (T5)",
            "现实祭坛可以从已发掘出故事的方块中",
            "提取魔法能量，并将其转化为物理形态",
            "",
            "可提取 T1 - T5 方块",
            "",
            "会自动获取丢在上方的物品",
            "并开始转化"
        );

        LIQUEFACTION_BASIN_1 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_1",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (T1)",
            "投入魔法水晶可将其转化为液化魔法水晶",
            "用于后续的魔法合成",
            "警告: 不要在里面有液化魔法水晶时破坏!",
            "",
            "最多可存储 500 液化魔法水晶"
        );

        LIQUEFACTION_BASIN_2 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_2",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (T2)",
            "投入魔法水晶可将其转化为液化魔法水晶",
            "用于后续的魔法合成",
            "警告: 不要在里面有液化魔法水晶时破坏!",
            "",
            "最多可存储 1250 液化魔法水晶"
        );

        LIQUEFACTION_BASIN_3 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_3",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (T3)",
            "投入魔法水晶可将其转化为液化魔法水晶",
            "用于后续的魔法合成",
            "警告: 不要在里面有液化魔法水晶时破坏!",
            "",
            "最多可存储 2500 液化魔法水晶"
        );

        LIQUEFACTION_BASIN_4 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_4",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (T4)",
            "投入魔法水晶可将其转化为液化魔法水晶",
            "用于后续的魔法合成",
            "警告: 不要在里面有液化魔法水晶时破坏!",
            "",
            "最多可存储 5000 液化魔法水晶"
        );

        LIQUEFACTION_BASIN_5 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_5",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (T5)",
            "投入魔法水晶可将其转化为液化魔法水晶",
            "用于后续的魔法合成",
            "警告: 不要在里面有液化魔法水晶时破坏!",
            "",
            "最多可存储 10000 液化魔法水晶"
        );

        STAVE_CONFIGURATOR = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_CONFIGURATOR",
            new ItemStack(Material.CUT_COPPER),
            ThemeType.MECHANISM,
            "法杖配置器",
            "你可以使用法杖配置器来将",
            "法术绑定至法杖"
        );

        PRISMATIC_GILDER = ThemeType.themedSlimefunItemStack(
            "CRY_PRISMATIC_GILDER",
            new ItemStack(Material.WARPED_FENCE),
            ThemeType.MECHANISM,
            "棱镜镀金器",
            "将棱镜水晶转换为薄膜",
            "可以覆盖在其他魔法物品上",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        // Tools

        INERT_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_SPELL_PLATE_1",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "基础魔法板",
            "一块空白的魔法板",
            "可以储存魔法能量"
        );

        CHARGED_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_CHARGED_PLATE_1",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "基础法术板",
            "经过魔法充能的魔法板"
        );

        STAVE_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_1",
            new ItemStack(Material.STICK),
            ThemeType.STAVE,
            "基础法杖",
            "可以进行法术绑定的法杖"
        );

        STAVE_ADVANCED = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_2",
            new ItemStack(Material.STICK),
            ThemeType.STAVE,
            "高级法杖",
            "可以进行法术绑定的法杖"
        );

        STAVE_ARCANE = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_3",
            GeneralUtils.getPreEnchantedItemStack(Material.STICK),
            ThemeType.STAVE,
            "神秘法杖",
            "可以进行法术绑定的法杖"
        );

        REFRACTING_LENS = ThemeType.themedSlimefunItemStack(
            "CRY_REFRACTING_LENS",
            new ItemStack(Material.SPYGLASS),
            ThemeType.TOOL,
            "折射棱镜",
            "这个魔法棱镜可以区分",
            "不同类型的魔法水晶的光芒",
            "",
            "右键点击一个方块来查看信息",
            "",
            ThemeType.CLICK_INFO.getColor() + "可用于:",
            "液化池",
            "经验收集器"
        );

        THAUMATURGIC_SALTS = ThemeType.themedSlimefunItemStack(
            "CRY_THAUMATURGIC_SALT",
            new ItemStack(Material.REDSTONE),
            ThemeType.TOOL,
            "魔法盐",
            "一种特制的盐",
            "可以从液化池中吸收液化魔法水晶",
            "",
            "右键点击液化池以清空"
        );

        CRYSTA_RECALL_LATTICE = ThemeType.themedSlimefunItemStack(
            "CRY_RECALL_LATTICE",
            new ItemStack(Material.NETHER_STAR),
            ThemeType.TOOL,
            "魔法传送网",
            "右键点击传送至绑定的路标",
            "",
            "Shift+右键点击一个路标以绑定"
        );

        EPHEMERAL_CRAFT_TABLE = ThemeType.themedSlimefunItemStack(
            "CRY_EPHEMERAL_CRAFT_TABLE",
            new ItemStack(Material.CRAFTING_TABLE),
            ThemeType.TOOL,
            "临时工作台",
            "右键点击可以打开一个工作台",
            "仅原版合成"
        );

        EPHEMERAL_WORKBENCH = ThemeType.themedSlimefunItemStack(
            "CRY_EPHEMERAL_WORKBENCH",
            new ItemStack(Material.CRAFTING_TABLE),
            ThemeType.TOOL,
            "临时融合工作台",
            "右键点击可以打开一个融合工作台",
            "原版+增强型工作台配方"
        );

        LUMINESCENCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_LUMINESCENCE_SCOOP",
            new ItemStack(Material.LANTERN),
            ThemeType.TOOL,
            "发光勺 (1)",
            "右键点击放置一个魔法光源",
            "Shift+右键点击收回光源",
            "",
            LoreBuilder.usesLeft(25)
        );

        BRILLIANCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_BRILLIANCE_SCOOP",
            new ItemStack(Material.LANTERN),
            ThemeType.TOOL,
            "发光勺 (2)",
            "右键点击放置一个魔法光源",
            "Shift+右键点击收回光源",
            "",
            LoreBuilder.usesLeft(75)
        );

        LUSTRE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_LUSTRE_SCOOP",
            new ItemStack(Material.SOUL_LANTERN),
            ThemeType.TOOL,
            "发光勺 (3)",
            "右键点击放置一个魔法光源",
            "Shift+右键点击收回光源",
            "",
            LoreBuilder.usesLeft(250)
        );

        RADIANCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_RADIANCE_SCOOP",
            GeneralUtils.getPreEnchantedItemStack(Material.SOUL_LANTERN),
            ThemeType.TOOL,
            "发光勺 (4)",
            "右键点击放置一个魔法光源",
            "Shift+右键点击收回光源",
            "",
            LoreBuilder.usesLeft(500)
        );

        CONNECTING_COMPASS = ThemeType.themedSlimefunItemStack(
            "CRY_CONNECTING_COMPASS",
            new ItemStack(Material.COMPASS),
            ThemeType.TOOL,
            "连接指南针",
            "可以保存一个坐标",
            "让你稍后可以回到之前的位置",
            "",
            "没有传送功能",
            "",
            MessageFormat.format("{0}右键点击: {1}显示保存的坐标", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift+右键点击: {1}保存坐标", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        SPIRITUAL_SILKEN = ThemeType.themedSlimefunItemStack(
            "CRY_SPIRITUAL_SILKEN",
            new ItemStack(Material.BONE),
            ThemeType.TOOL,
            "强征 (1)",
            "这个工具被注入了神圣的力量",
            "可以完好地保存物品",
            ChatColor.RED + "仅能作用于不会掉落本身的方块",
            ChatColor.RED + "(无论是否拥有精准采集)",
            "",
            LoreBuilder.usesLeft(50)
        );

        INCORPOREAL_SILKEN = ThemeType.themedSlimefunItemStack(
            "CRY_INCORPOREAL_SILKEN",
            new ItemStack(Material.BONE),
            ThemeType.TOOL,
            "强征 (2)",
            "这个工具被注入了神圣的力量",
            "可以完好地保存物品",
            ChatColor.RED + "仅能作用于不会掉落本身的方块",
            ChatColor.RED + "(无论是否拥有精准采集)",
            "",
            LoreBuilder.usesLeft(1000)
        );

        SIMPLE_DISPLACER = ThemeType.themedSlimefunItemStack(
            "CRY_SIMPLE_DISPLACER",
            new ItemStack(Material.TORCH),
            ThemeType.TOOL,
            "简易置换器",
            "置换器可以将一些物品",
            "替换为另一个维度的物品",
            "",
            LoreBuilder.usesLeft(50)
        );

        ARCANE_DISPLACER = ThemeType.themedSlimefunItemStack(
            "CRY_ARCANE_DISPLACER",
            new ItemStack(Material.REDSTONE_TORCH),
            ThemeType.TOOL,
            "神秘置换器",
            "置换器可以将一些物品",
            "替换为另一个维度的物品",
            "",
            LoreBuilder.usesLeft(500)
        );

        SPONGE_BALMY = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_BALMY",
            new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "温和海绵",
            "这种注入魔法的海绵可以吸收岩浆",
            "在使用后需要放置在水边来清洗",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "4 格"
        );

        SPONGE_SEARING = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_SEARING",
            GeneralUtils.getPreEnchantedItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "炽热海绵",
            "这种注入魔法的海绵可以吸收岩浆",
            "在使用后需要放置在水边来清洗",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "7 格"
        );

        SPONGE_SUPER_MASSIVE = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_SUPER_MASSIVE",
            GeneralUtils.getPreEnchantedItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "超大海绵",
            "这种注入魔法的海绵可以吸收岩浆",
            "在使用后需要放置在水边来清洗",
            "",
            ThemeType.CLICK_INFO.getColor() + "范围: " + ThemeType.PASSIVE.getColor() + "10 格"
        );

        SLEEPING_BAG = ThemeType.themedSlimefunItemStack(
            "CRY_SLEEPING_BAG",
            new ItemStack(Material.LIGHT_BLUE_BANNER),
            ThemeType.TOOL,
            "符文睡袋",
            "这个睡袋可以让在你野外安全地渡过晚上",
            "不会设置重生点."
        );

        DISPLACED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_DISPLACED_VOID",
            new ItemStack(Material.COCOA_BEANS),
            ThemeType.TOOL,
            "微型虚空裂隙",
            "只有口袋大小的虚空裂隙",
            "",
            ThemeType.CLICK_INFO.getColor() + "按住Shift捡起附近的物品"
        );

        SATCHEL_1 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_1",
            new ItemStack(Material.WHITE_CONCRETE),
            ThemeType.TOOL,
            "学徒水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "仅独特"
        );

        SATCHEL_2 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_2",
            new ItemStack(Material.GRAY_CONCRETE),
            ThemeType.TOOL,
            "法师水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "独特 至 普通"
        );

        SATCHEL_3 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_3",
            new ItemStack(Material.LIME_CONCRETE),
            ThemeType.TOOL,
            "巫师水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "独特 至 罕见"
        );

        SATCHEL_4 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_4",
            new ItemStack(Material.YELLOW_CONCRETE),
            ThemeType.TOOL,
            "咒术师水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "独特 至 稀有"
        );

        SATCHEL_5 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_5",
            new ItemStack(Material.PURPLE_CONCRETE),
            ThemeType.TOOL,
            "术士水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "独特 至 史诗"
        );

        SATCHEL_6 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_6",
            new ItemStack(Material.RED_CONCRETE),
            ThemeType.TOOL,
            "宗师水晶收纳袋",
            "这个简易的收纳袋可以保存魔法水晶",
            "",
            ThemeType.WARNING.getColor() + "可收纳: " + ThemeType.PASSIVE.getColor() + "独特 至 神秘"
        );

        CARGO_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_CARGO_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方块隐藏器 - 货运节点",
            "(消耗品)",
            "右键点击一个货运节点",
            "以使用副手上的方块隐藏该节点"
        );

        ENERGY_NET_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_ENERGY_NET_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方块隐藏器 - 能源节点",
            "(消耗品)",
            "右键点击一个能源节点",
            "以使用副手上的方块隐藏该节点"
        );

        NETWORKS_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_NETWORK_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方块隐藏器 - 网络节点",
            "(消耗品)",
            "右键点击一个网络节点",
            "以使用副手上的方块隐藏该节点"
        );

        SPELL_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_SPELL_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "传说之证: 宗师级魔法师",
            "证明你是最优秀的",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 法术等级 达到 宗师级魔法师"
        );

        STORY_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_STORY_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "传说之证: 荣誉教授",
            "证明你是最优秀的",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 故事等级 达到 荣誉教授"
        );

        GILDING_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_GILDING_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "传说之证: 老板",
            "证明你是最优秀的",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 镀金等级 达到 老板"
        );

        CHRISTMAS_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_CHRISTMAS_TROPHY",
            new ItemStack(Material.SPRUCE_SAPLING),
            ThemeType.CRAFTING,
            "圣诞快乐",
            "为你们准备了一些小礼物",
            "你只需要把它制作出来",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在圣诞节期间制作（不仅限当天）"
        );

        VALENTINES_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_VALENTINES_TROPHY",
            new ItemStack(Material.PINK_DYE),
            ThemeType.CRAFTING,
            "情人节快乐",
            "一点小小的爱，希望能有帮助",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在情人节期间制作（不仅限当天）"
        );

        BIRTHDAY_TROPHY_CHEESY = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_CHEESY",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快乐Cheesy!",
            "一位热心的绅士",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在Cheesy的生日当天制作"
        );

        BIRTHDAY_TROPHY_BWHITE = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_BWHITE",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快乐BWhite!",
            "一位永恒的合作伙伴!",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在BWhite的生日当天制作"
        );

        BIRTHDAY_TROPHY_DECOY = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_DECOY",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快乐Decoy!",
            "一位永恒的合作伙伴!",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在Decoy的生日当天制作"
        );

        BIRTHDAY_TROPHY_ODDISH = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_ODDISH",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快乐Oddish!",
            "可能是一场即将到来的阴郁",
            "",
            ThemeType.CLICK_INFO.getColor() + "需要: 在Oddish的生日当天制作"
        );

        // Recipe Types

        RECIPE_TYPE_LIQUEFACTION_CRAFTING = ThemeType.themedItemStack(
            Material.CAULDRON,
            ThemeType.MECHANISM,
            "液化池",
            "在液化池中投入足够数量的魔法水晶",
            "然后投入指定的物品来进行合成"
        );

        RECIPE_TYPE_LIQUEFACTION_SPELL = ThemeType.themedItemStack(
            Material.CAULDRON,
            ThemeType.MECHANISM,
            "液化池",
            "在液化池中投入足够数量的魔法水晶",
            "然后投入魔法板来进行合成"
        );

        RECIPE_TYPE_NETHER_DRAINING = ThemeType.themedItemStack(
            Material.OBSIDIAN,
            ThemeType.RESEARCH,
            "下界祛魔",
            "魔法水晶在穿过下界传送门时",
            "其中包含的魔法将会完全流失",
            "将神秘级的魔法水晶丢进下界传送门",
            "可以让魔法水晶流失魔法",
            "支持任何神秘级的魔法水晶"
        );

        RECIPE_TYPE_REALISATION_ALTAR_NORMAL = ThemeType.themedItemStack(
            Material.CHISELED_DEEPSLATE,
            ThemeType.MECHANISM,
            "现实祭坛",
            "将有故事的方块放入现实祭坛",
            "现实祭坛会提取出方块故事中蕴含的魔法元素",
            "并将其转化为物理形态——魔法水晶簇",
            "破坏现实祭坛周围的魔法水晶簇后",
            "可以获得其中包含的不同类型的魔法水晶"
        );

        RECIPE_TYPE_REALISATION_ALTAR_SIGIL = ThemeType.themedItemStack(
            Material.CHISELED_DEEPSLATE,
            ThemeType.MECHANISM,
            "现实祭坛",
            "神秘印记会有小概率",
            "在提取镀金物品的故事时生成"
        );
    }
}
