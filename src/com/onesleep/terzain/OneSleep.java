package com.onesleep.terzain;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class OneSleep extends JavaPlugin implements Listener {
	
	public void onEnable() {
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onBedEnter(PlayerBedEnterEvent event) {
		event.getPlayer().getWorld().setTime(0);
		event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("sleep-message")));
	}
	
}
