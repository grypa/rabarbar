package utils;

import main.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class cfgClass {

    private static FileConfiguration cfg = Main.getInst().getConfig();

    public static void checkConfig(){
        cfg.addDefault("player", "");
        Main.getInst().saveConfig();
        Main.getInst().reloadConfig();
    }
}
