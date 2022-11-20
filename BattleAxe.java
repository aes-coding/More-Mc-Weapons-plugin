package battleaxe.battleaxe;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class BattleAxe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getLogger().info("it works");

        Item.blazeSword();
        Item.morningstar();
        Item.emeraldSword();
        Item.cakeSword();
        Item.boneSword();
        Item.crystalSword();
        Item.flintSword();
        Item.sinisterBlade();
        Item.spikedClub();

        this.getServer().getPluginManager().registerEvents(new PackInstaller(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
