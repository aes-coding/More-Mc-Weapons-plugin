package battleaxe.battleaxe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PackInstaller implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().setResourcePack("https://www.dropbox.com/s/dgrewdk6pmj55d0/weapon-s-cit.zip?dl=1");
    }

}
