package com.instructables.main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class CommandClass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getLabel().equalsIgnoreCase("instructables")) {
            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                commandSender.sendMessage(ChatColor.GOLD + "Put whatever you want here!");

                PlayerInventory inventory = player.getInventory();
                inventory.setHelmet(inventory.getItemInMainHand());

                return true;
            } else {
                commandSender.sendMessage("You need to be a player to use this command!");
                return true;
            }
        }
        return false;
    }

}