package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ChatColor {
    public static String chat(String s) {
        return org.bukkit.ChatColor.translateAlternateColorCodes('&',s);
    }
    public static List<String> chat(Collection<String> s){
        Collection<String> toReturn = new ArrayList<>();
        for (String ss : s) {
            toReturn.add(chat(ss));
        }
        return (List<String>) toReturn;
    }
}
