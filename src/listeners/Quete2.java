package listeners;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Quete2 implements Listener{
	
	public static  ArrayList<String> Quete2Confirm = new ArrayList<String>();
	
	Location lingot = new Location(Bukkit.getWorld("world"), -518, 63, 136);
	
	
	@EventHandler
	public void onPlayerMoveEvent(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		if(p.hasPermission("quest.2")){
		if(!Quete2Confirm.contains(p.getName())){
		if(p.getLocation().getBlockX() == -518){
			if(p.getLocation().getBlockY() == 63){
				if(p.getLocation().getBlockZ() == 136){
				Quete2Confirm.add(p.getName());
				p.performCommand("confirme 2");	
				p.sendMessage(ChatColor.GOLD + "Fait /quete 3");
				
				}
			}
			
		}
	}
	}
	}
}
