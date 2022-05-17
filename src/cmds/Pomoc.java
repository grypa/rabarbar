package cmds;

import main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import utils.ChatColor;

public class Pomoc implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        p.sendMessage(ChatColor.chat(Main.getInst().getConfig().getString("cmdpomocx1")));
        p.sendMessage(ChatColor.chat(Main.getInst().getConfig().getString("cmdpomocx2")));
        p.sendMessage(ChatColor.chat(Main.getInst().getConfig().getString("cmdpomocx3")));
        return false;
    }
}
