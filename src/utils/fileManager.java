package utils;

import main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class fileManager {

    private Main inst;

    private static YamlConfiguration messages;

    private File messagesFile;
    private File mainDri;

    public fileManager(Main inst){
        this.inst = inst;
        this.mainDri = inst.getDataFolder();
        this.messagesFile = new File(this.mainDri,"config.yml");

        if (!this.mainDri.exists()) this.mainDri.mkdir();
        if (!this.messagesFile.exists()) inst.saveResource("config.yml", true);

        messages = YamlConfiguration.loadConfiguration(this.messagesFile);

    }
    public static YamlConfiguration getMessages() {
        return messages;
    }
}
