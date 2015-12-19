package commands;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;

import com.connorlinfoot.titleapi.TitleAPI;

import listeners.Pnj;
import listeners.Quete2;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Confirm  implements CommandExecutor {
	


	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		PermissionUser user = PermissionsEx.getUser(p);
		if(cmd.getName().equalsIgnoreCase("confirme")){
			
			if(args.length == 1 && args[0].equalsIgnoreCase("1")){
				if(p.hasPermission("quest.1")){    
					if(Pnj.playerStuff.contains(p.getName())){
  	                       TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.RED + "--- Qu�te 1! ---", " R�ussite!");
  	                         user.addGroup("2");
  	                        user.removeGroup("1");
  	        Location loc = p.getLocation();
  	        Firework firework = p.getWorld().spawn(loc, Firework.class);
  	        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
  	        data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
  	        data.setPower(2);
  	        firework.setFireworkMeta(data);
  	        p.sendMessage(ChatColor.GOLD + "Tu as r�ussi fais /quete 2 !");
	                    }
						
					}
			               
					
				
            else if(!p.hasPermission("quest.1")){
            	p.sendMessage("Vous n'avez pas la permission");
            	
            }
			}
            
             
            
			 else if(args.length == 1 && args[0].equalsIgnoreCase("2")){
				if(p.hasPermission("quest.2")){
					if(Quete2.Quete2Confirm.contains(p.getName())){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.GREEN + "--- Qu�te 2! ---", " R�ussite!");
					 user.addGroup("3");
					 user.removeGroup("2");
			  	        Location loc = p.getLocation();
			  	        Firework firework = p.getWorld().spawn(loc, Firework.class);
			  	        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
			  	        data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
			  	        data.setPower(2);
			  	        firework.setFireworkMeta(data);
					}
					
				}else if(!p.hasPermission("quest.2")){
					p.sendMessage(ChatColor.RED + "Vous ne pouvez pas acceder � cette qu�te!");
				}
				
				
				
			}else if(args.length == 1 && args[0].equalsIgnoreCase("3")){
				if(p.hasPermission("quest.3")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.BLUE + "--- Qu�te 3! ---", " R�ussite!");
					 user.addGroup("4");
					 user.removeGroup("3");
			  	        Location loc = p.getLocation();
			  	        Firework firework = p.getWorld().spawn(loc, Firework.class);
			  	        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
			  	        data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
			  	        data.setPower(2);
			  	        firework.setFireworkMeta(data);
				}else if(!p.hasPermission("quest.3")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes! puis les confirm�es avec /confirme <qu�te>");
				
				}
				
				
				} 
			else if(args.length == 1 && args[0].equalsIgnoreCase("4")){
				if(p.hasPermission("quest.4")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.GOLD + "--- Qu�te 4! ---", " R�ussite!");
					 user.addGroup("5");
					 user.removeGroup("4");
			  	        Location loc = p.getLocation();
			  	        Firework firework = p.getWorld().spawn(loc, Firework.class);
			  	        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
			  	        data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
			  	        data.setPower(2);
			  	        firework.setFireworkMeta(data);
				}else if(!p.hasPermission("quest.4")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes! puis les confirm�es avec /confirme <qu�te>");
				
				}
			
			
			
		}
			else if(args.length == 1 && args[0].equalsIgnoreCase("5")){
				if(p.hasPermission("quest.5")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.AQUA + "--- Qu�te 5! ---", " R�ussite!");
					 user.addGroup("6");
					 user.removeGroup("5");
			  	        Location loc = p.getLocation();
			  	        Firework firework = p.getWorld().spawn(loc, Firework.class);
			  	        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
			  	        data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
			  	        data.setPower(2);
			  	        firework.setFireworkMeta(data);
					 
				}else if(!p.hasPermission("quest.5")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes! puis les confirm�es avec /confirme <qu�te>");
				
				}
		
		
			} else 
				p.sendMessage(ChatColor.RED + "Il manque la qu�te (1,2,3 ect...), n'oubliez pas de faire /confirme <qu�te> ");{
				
			}
		
	}
		return false;
		
}	
  
	public boolean hasEnchantedItem(Player p, ItemStack i, Enchantment e, int enchantmentLevel){
		ItemStack[] inv = p.getInventory().getContents();
		for(ItemStack item:inv){
		if(item.getType().equals(i.getType())){
		if(item.getEnchantments().containsKey(e)){
		if(item.getEnchantmentLevel(e) == enchantmentLevel){
		return true;
		}}}}
		return false;
		}
}