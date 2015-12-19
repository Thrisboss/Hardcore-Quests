package commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.connorlinfoot.titleapi.TitleAPI;

public class Quete implements CommandExecutor {
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("quete")){
			
			if(args.length == 1 && args[0].equalsIgnoreCase("1")){
           
				if(p.hasPermission("quest.1")){    
  	          TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.RED + "--- Qu�te 1! ---", " Bonne chance!");
  	         ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);
  	         BookMeta bm = (BookMeta)book.getItemMeta();
  	         bm.setAuthor("Inconnu");
  	         bm.setTitle("Qu�te 1");
  	         ArrayList<String> pages = new ArrayList<String>();
  	         pages.add("Hum... Salut j'ai une premi�re qu�te pour... vous...");
  	         pages.add("Vas parler � Joe le P�cheur... Malgr� ses manies bizarres il peut t'�tre utile ! (Clique lui dessus!) ");
  	         bm.setPages(pages);
  	         book.setItemMeta(bm);
  	          if(!p.getInventory().contains(book)) {
 
  	         p.getInventory().addItem(book);
  	        }
            }else if(!p.hasPermission("quest.1")){
            	p.sendMessage("Vous n'avez pas la permission");
            }
            
             
            
			} else if(args.length == 1 && args[0].equalsIgnoreCase("2")){
				if(p.hasPermission("quest.2")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.GREEN + "--- Qu�te 2! ---", " Bonne chance!");
		  	         ItemStack book2 = new ItemStack(Material.WRITTEN_BOOK, 1);
		  	         BookMeta bm2 = (BookMeta)book2.getItemMeta();
		  	         bm2.setAuthor("Inconnu");
		  	         bm2.setTitle("Qu�te 2");
		  	         ArrayList<String> pages = new ArrayList<String>();
		  	         pages.add("D�j�... T'es un rapide toi!");
		  	         pages.add("Je te propose d'aller nager dans un lac... Tu pourra peut �tre y trouver quelque chose...");
		  	         bm2.setPages(pages);
		  	         book2.setItemMeta(bm2);
		  	          if(!p.getInventory().contains(book2)) {
		 
		  	         p.getInventory().addItem(book2);
				}else if(!p.hasPermission("quest.2")){
					p.sendMessage(ChatColor.RED + "Il faut faire la qu�te num�ro 1!");
				}
				
				}	
				
			}else if(args.length == 1 && args[0].equalsIgnoreCase("3")){
				if(p.hasPermission("quest.3")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.BLUE + "--- Qu�te 3! ---", " Bonne chance!");
				}else if(!p.hasPermission("quest.3")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes!");
				
				}
				
				
				} 
			
			else if(args.length == 1 && args[0].equalsIgnoreCase("4")){
				if(p.hasPermission("quest.4")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.GOLD + "--- Qu�te 4! ---", " Bonne chance!");
				}else if(!p.hasPermission("quest.4")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes!");
				
				}
			
			
			
		}
			else if(args.length == 1 && args[0].equalsIgnoreCase("5")){
				if(p.hasPermission("quest.5")){
					 TitleAPI.sendTitle(p, 5, 10, 5, ChatColor.AQUA + "--- Qu�te 5! ---", " Bonne chance!");
				}else if(!p.hasPermission("quest.5")){
				p.sendMessage(ChatColor.RED + "Il faut terminer les qu�tes pr�c�dentes!");
				
				}
		
		
			} else 
				p.sendMessage(ChatColor.RED + "Il manque la qu�te (1,2,3 ect...) ");{
				
			}
		
		
		}
		return false;
	
  } 
}