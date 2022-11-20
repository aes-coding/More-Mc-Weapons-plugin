package battleaxe.battleaxe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Item {
    public static ItemStack blazeSword;
    public static ItemStack boneSword;
    public static ItemStack cakesword;
    public static ItemStack crystalsword;
    public static ItemStack emeraldsword;
    public static ItemStack flintsword;
    public static ItemStack morningstar;
    public static ItemStack sinisterblade;
    public static ItemStack spikedclub;

    public static void blazeSword(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Blaze Sword");
        List<String> lore = new ArrayList<>();
        lore.add("Made out of Blaze rods");
        lore.add("Will burn your enemies");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 8, false);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 5, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        blazeSword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("blazesword"), item);
        recipe.shape(" B ",
                "BGB",
                " S ");
        recipe.setIngredient('B', Material.BLAZE_ROD);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void boneSword(){
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone Sword");
        List<String> lore = new ArrayList<>();
        lore.add("Made out of Bones");
        lore.add("ITs not very strong, but effective against the undead");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, false);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 12, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        boneSword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bonesword"), item);
        recipe.shape(" B ",
                " B ",
                " S ");
        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void cakeSword(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Cake Sword");
        List<String> lore = new ArrayList<>();
        lore.add("It's a Cake");
        lore.add("You can't eat it");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        cakesword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("cakesword"), item);
        recipe.shape(" C ",
                " C ",
                " S ");
        recipe.setIngredient('C', Material.CAKE);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void crystalSword(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Crystal Sword");
        List<String> lore = new ArrayList<>();
        lore.add("It's quiet sharp");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 15, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        crystalsword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("crystalsword"), item);
        recipe.shape(" C ",
                "CNC",
                " S ");
        recipe.setIngredient('C', Material.AMETHYST_SHARD);
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void emeraldSword(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Emerald Sword");
        List<String> lore = new ArrayList<>();
        lore.add("SHINY");
        meta.setLore(lore);
        item.setItemMeta(meta);
        emeraldsword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("emeraldsword"), item);
        recipe.shape(" E ",
                " E ",
                " S ");
        recipe.setIngredient('E', Material.EMERALD);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void flintSword(){
        ItemStack item = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Flint Blade");
        List<String> lore = new ArrayList<>();
        lore.add("Made out of Flint");
        meta.setLore(lore);
        item.setItemMeta(meta);
        flintsword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("flintsword"), item);
        recipe.shape(" F ",
                " F ",
                " S ");
        recipe.setIngredient('F', Material.FLINT);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void morningstar(){
        ItemStack item = new ItemStack(Material.IRON_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Morning Star");
        List<String> lore = new ArrayList<>();
        lore.add("Spain without the a");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 17, false);
        item.setItemMeta(meta);
        morningstar = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("morningstar"), item);
        recipe.shape("  I",
                " C ",
                "S  ");
        recipe.setIngredient('I', Material.IRON_BLOCK);
        recipe.setIngredient('C', Material.CHAIN);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void sinisterBlade(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Sinister Blade");
        List<String> lore = new ArrayList<>();
        lore.add("It's a blade with some blood");
        meta.setLore(lore);
        item.setItemMeta(meta);
        sinisterblade = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("sinisterblade"), item);
        recipe.shape(" R ",
                "RNR",
                " S ");
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void spikedClub(){
        ItemStack item = new ItemStack(Material.WOODEN_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Spiked Club");
        List<String> lore = new ArrayList<>();
        lore.add("A Wooden Bat with nails");
        meta.setLore(lore);
        item.setItemMeta(meta);
        spikedclub = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("spikedclub"), item);
        recipe.shape(" IW",
                " WI",
                "S  ");
        recipe.setIngredient('I', Material.IRON_NUGGET);
        recipe.setIngredient('W', Material.STRIPPED_OAK_WOOD);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }
}
