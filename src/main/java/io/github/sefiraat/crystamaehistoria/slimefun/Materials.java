package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.slimefun.materials.Crystal;
import io.github.sefiraat.crystamaehistoria.slimefun.materials.PowderedEssence;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.realisationaltar.DummyRealisationAltar;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryRarity;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.sefiraat.crystamaehistoria.utils.TextUtils;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.EnumMap;
import java.util.Map;

@UtilityClass
public class Materials {

    private static final Map<StoryType, SlimefunItem> DUMMY_CRYSTAL_MAP = new EnumMap<>(StoryType.class);
    static final Map<StoryRarity, Map<StoryType, SlimefunItem>> CRYSTAL_MAP = new EnumMap<>(StoryRarity.class);

    @Getter
    private static SlimefunItem amalgamateDustCommon;
    @Getter
    private static SlimefunItem amalgamateIngotCommon;
    @Getter
    private static SlimefunItem amalgamateDustUncommon;
    @Getter
    private static SlimefunItem amalgamateIngotUncommon;
    @Getter
    private static SlimefunItem amalgamateDustRare;
    @Getter
    private static SlimefunItem amalgamateIngotRare;
    @Getter
    private static SlimefunItem amalgamateDustEpic;
    @Getter
    private static SlimefunItem amalgamateIngotEpic;
    @Getter
    private static SlimefunItem amalgamateDustMythical;
    @Getter
    private static SlimefunItem amalgamateIngotMythical;
    @Getter
    private static SlimefunItem amalgamateDustUnique;
    @Getter
    private static SlimefunItem amalgamateIngotUnique;
    @Getter
    private static SlimefunItem imbuedGlass;
    @Getter
    private static SlimefunItem uncannyPearl;
    @Getter
    private static SlimefunItem gildedPearl;
    @Getter
    private static SlimefunItem basicFibres;
    @Getter
    private static PowderedEssence powderedEssence;
    @Getter
    private static SlimefunItem magicalMilk;

    public static void setup() {

        CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        // Dummy Crystals (for recipe & compendium displays)
        for (StoryType type : StoryType.getCachedValues()) {
            ThemeType theme = ThemeType.getByType(type);
            SlimefunItem sfItem = new Crystal(
                ItemGroups.DUMMY_ITEM_GROUP,
                ThemeType.themedSlimefunItemStack(
                    "CRY_CRYSTAL_DUMMY_" + type + "_" + type,
                    Skulls.getByType(type).getPlayerHead(),
                    ThemeType.CRYSTAL,
                    theme.getColor() + TextUtils.toTitleCase(ThemeType.getByType(type).getLoreLine() + "水晶"),
                    "物理形态的魔法水晶"
                ),
                DummyRealisationAltar.TYPE,
                new ItemStack[]{},
                StoryRarity.COMMON,
                type
            );
            sfItem.register(plugin);
            DUMMY_CRYSTAL_MAP.put(type, sfItem);
        }

        // Live Crystals
        for (StoryRarity rarity : StoryRarity.getCachedValues()) {
            Map<StoryType, SlimefunItem> storyTypeSlimefunItemMap = new EnumMap<>(StoryType.class);
            for (StoryType type : StoryType.values()) {
                ThemeType theme = ThemeType.getByRarity(rarity);
                SlimefunItem slimefunItem = new Crystal(
                    ItemGroups.CRYSTALS,
                    ThemeType.themedSlimefunItemStack(
                        "CRY_CRYSTAL_" + rarity + "_" + type.toString(),
                        Skulls.getByType(type).getPlayerHead(),
                        ThemeType.CRYSTAL,
                        theme.getColor() + theme.getLoreLine() + ThemeType.getByType(type).getLoreLine() + "水晶",
                        "物理形态的魔法水晶",
                        "高等级的方块可以提供类型更稀有的魔法水晶",
                        "",
                        "可液化为 " + Crystal.getRarityValueMap().get(rarity) + " 单位的液化魔法水晶"
                    ),
                    DummyRealisationAltar.TYPE,
                    new ItemStack[]{null, null, null, null, new ItemStack(Material.AMETHYST_CLUSTER), null, null, null, null},
                    rarity,
                    type
                );
                slimefunItem.register(plugin);
                storyTypeSlimefunItemMap.put(type, slimefunItem);
                CRYSTAL_MAP.put(rarity, storyTypeSlimefunItemMap);
            }
        }

        // Amalgamate Dust Common
        amalgamateDustCommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_COMMON",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (普通)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Uncommon
        amalgamateDustUncommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_UNCOMMON",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (罕见)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Rare
        amalgamateDustRare = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_RARE",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (稀有)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Epic
        amalgamateDustEpic = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_EPIC",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (史诗)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Mythical
        amalgamateDustMythical = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_MYTHICAL",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (神秘)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Unique
        amalgamateDustUnique = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_UNIQUE",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "融合粉 (独一无二)",
                "融合了所有魔法类型的粉"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Ingot Common
        amalgamateIngotCommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_COMMON",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (普通)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustCommon.getItem()
            }
        );

        // Amalgamate Ingot Uncommon
        amalgamateIngotUncommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_UNCOMMON",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (罕见)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustUncommon.getItem()
            }
        );

        // Amalgamate Ingot Rare
        amalgamateIngotRare = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_RARE",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (稀有)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustRare.getItem()
            }
        );

        // Amalgamate Ingot Epic
        amalgamateIngotEpic = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_EPIC",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (史诗)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustEpic.getItem()
            }
        );

        // Amalgamate Ingot Mythical
        amalgamateIngotMythical = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_MYTHICAL",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (神秘)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustMythical.getItem()
            }
        );

        // Amalgamate Ingot Unique
        amalgamateIngotUnique = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_UNIQUE",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "融合锭 (独一无二)",
                "由纯粹的魔法制成的锭"
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustUnique.getItem()
            }
        );

        // Imbued Glass
        RecipeItem imbuedGlassRecipe = new RecipeItem(
            new ItemStack(Material.GLASS_PANE),
            StoryType.ELEMENTAL, 10,
            StoryType.HUMAN, 10,
            StoryType.VOID, 10
        );
        imbuedGlass = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_IMBUED_GLASS",
                new ItemStack(Material.GLASS_PANE),
                ThemeType.CRAFTING,
                "注魔玻璃",
                "注入了魔法水晶的玻璃",
                "拥有一些奇怪的属性"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            imbuedGlassRecipe.getDisplayRecipe()
        );

        // Uncanny Pearl
        RecipeItem uncannyPearlRecipe = new RecipeItem(
            new ItemStack(Material.ENDER_PEARL),
            StoryType.VOID, 25,
            StoryType.CELESTIAL, 25,
            StoryType.ALCHEMICAL, 25
        );
        uncannyPearl = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_UNCANNY_PEARL",
                new ItemStack(Material.ENDER_PEARL),
                ThemeType.CRAFTING,
                "不可思议的珍珠",
                "这颗末影珍珠的内部共振",
                "已经使用魔法水晶平息了"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            uncannyPearlRecipe.getDisplayRecipe()
        );

        // Gilded Pearl
        gildedPearl = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_GILDED_PEARL",
                new ItemStack(Material.ENDER_PEARL),
                ThemeType.CRAFTING,
                "镀金珍珠",
                "一颗平静的珍珠可以进行镀金",
                "用于其他合成"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON,
                SlimefunItems.GILDED_IRON, uncannyPearl.getItem(), SlimefunItems.GILDED_IRON,
                SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON
            }
        );

        // Basic Fibres
        RecipeItem basicFibresRecipe = new RecipeItem(
            new ItemStack(Material.WHEAT),
            StoryType.MECHANICAL, 5,
            StoryType.HISTORICAL, 5,
            StoryType.HUMAN, 5
        );
        basicFibres = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_BASIC_FIBRES",
                new ItemStack(Material.DRIED_KELP),
                ThemeType.CRAFTING,
                "基本纤维",
                "非常基本与粗糙的纤维"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            basicFibresRecipe.getDisplayRecipe()
        );

        // Powdered Essence
        RecipeItem powderedEssenceRecipe = new RecipeItem(
            new ItemStack(Material.BONE_MEAL),
            StoryType.ELEMENTAL, 20,
            StoryType.ALCHEMICAL, 25,
            StoryType.PHILOSOPHICAL, 15
        );
        powderedEssence = new PowderedEssence(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_POWDERED_ESSENCE",
                new ItemStack(Material.WHITE_DYE),
                ThemeType.CRAFTING,
                "粉状精华",
                "精制的合成材料",
                "可作为骨粉使用",
                "",
                LoreBuilder.usesLeft(250)
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            powderedEssenceRecipe.getDisplayRecipe(),
            250
        );

        // Magical Milk
        RecipeItem magicalMilkRecipe = new RecipeItem(
            new ItemStack(Material.MILK_BUCKET),
            StoryType.ALCHEMICAL, 25,
            StoryType.HUMAN, 75,
            StoryType.ANIMAL, 50
        );
        magicalMilk = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_MAGICAL_MILK",
                new ItemStack(Material.MILK_BUCKET),
                ThemeType.CRAFTING,
                "Magical Milk",
                "This milk has something about it...",
                "",
                ChatColor.YELLOW + "Do not waste by drinking!"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            magicalMilkRecipe.getDisplayRecipe()
        );

        // Slimefun Registry
        amalgamateDustCommon.register(plugin);
        amalgamateDustUncommon.register(plugin);
        amalgamateDustRare.register(plugin);
        amalgamateDustEpic.register(plugin);
        amalgamateDustMythical.register(plugin);
        amalgamateDustUnique.register(plugin);
        amalgamateIngotCommon.register(plugin);
        amalgamateIngotUncommon.register(plugin);
        amalgamateIngotRare.register(plugin);
        amalgamateIngotEpic.register(plugin);
        amalgamateIngotMythical.register(plugin);
        amalgamateIngotUnique.register(plugin);
        imbuedGlass.register(plugin);
        uncannyPearl.register(plugin);
        gildedPearl.register(plugin);
        basicFibres.register(plugin);
        powderedEssence.register(plugin);
        magicalMilk.register(plugin);

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(imbuedGlass, imbuedGlassRecipe);
        LiquefactionBasinCache.addCraftingRecipe(uncannyPearl, uncannyPearlRecipe);
        LiquefactionBasinCache.addCraftingRecipe(basicFibres, basicFibresRecipe);
        LiquefactionBasinCache.addCraftingRecipe(powderedEssence, powderedEssenceRecipe);
        LiquefactionBasinCache.addCraftingRecipe(magicalMilk, magicalMilkRecipe);
    }

    public static Map<StoryType, SlimefunItem> getDummyCrystalMap() {
        return DUMMY_CRYSTAL_MAP;
    }

    public static Map<StoryRarity, Map<StoryType, SlimefunItem>> getCrystalMap() {
        return CRYSTAL_MAP;
    }
}
