package me.thrisboss.HardcoreQuest;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import commands.Confirm;
import commands.Quete;


public class Main extends JavaPlugin implements Listener{

	
	// PLUGIN.YML à faire! 
	
	

    	
    
    public void onEnable() {
		registerEvents();
		registerCommands();
	    instance = this;
	}

	
	public void onDisable(){
		getLogger().info("Plugin Disabled");
	
		
	}
	
	public void registerEvents(){
    org.bukkit.plugin.PluginManager pm = Bukkit.getPluginManager();
	pm.registerEvents(new listeners.Pnj(), this);
    pm.registerEvents(new listeners.Quete2(), this);
	
	
	}
	public void registerCommands(){
		 getCommand("quete").setExecutor(new Quete());
		 getCommand("confirme").setExecutor(new Confirm());
		// getCommand("gm0").setExecutor(new Gamemode0());
		// getCommand("array").setExecutor(new array());
		// getCommand("menuadmin").setExecutor(new menuadmin());
		// getCommand("menu").setExecutor(new menu());
		
		
	}
	public static Main instance;
	

}
	