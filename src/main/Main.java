package main;

import cmds.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("pomoc").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {


    }
}
