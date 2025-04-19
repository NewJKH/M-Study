package org.nano.nStudy;

import org.bukkit.plugin.java.JavaPlugin;
import org.nano.nStudy.app.ContainerCommand;
import org.nano.nStudy.repository.ItemRepository;

import java.util.Objects;

public final class NStudy extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemRepository itemRepository = new ItemRepository();
        // /창고
        Objects.requireNonNull(getCommand("창고")).setExecutor(new ContainerCommand());
    }

    @Override
    public void onDisable() {


    }
}
