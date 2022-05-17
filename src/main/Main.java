package main;

import cmds.Pomoc;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import utils.fileManager;

public class Main extends JavaPlugin {

    public static Main instance;

    private YamlConfiguration messages;
    public Main(){ instance = this;}


    @Override
    public void onEnable() {
        instance = this;
        new fileManager(this);
        this.messages = fileManager. getMessages();
        saveDefaultConfig();
        getCommand("pomoc").setExecutor(new Pomoc());
        reloadConfig();

    }

    public static Main getInst(){
        if (instance == null) return new Main();
        return instance;
    }


    @Override
    public void onDisable() {




    }
}
