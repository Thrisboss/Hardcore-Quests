package listeners;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.entity.Entity;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Pnj implements Listener{
	
	public static Set<String> playerStuff = new HashSet<String>();

	
	@EventHandler
	public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
		Player p = event.getPlayer();
	  Entity entity = event.getRightClicked();
	  if (!(entity instanceof NPC))
	      return;
	 
	  if(p.hasPermission("quete.1")){
	   if(entity.getName().equalsIgnoreCase("Joe")){
			playerStuff.add(p.getName());
			 
			
	   
	   

	   }
		
	   
	   }
	}
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e){
		Player p = e.getPlayer();
	}
	
}
