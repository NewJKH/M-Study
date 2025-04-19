package org.nano.nStudy.app;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.nano.nStudy.repository.ItemRepository;
import org.nano.nStudy.ui.InvGUI;

public class Command implements CommandExecutor {
    private final ItemRepository repository;

    public Command(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, org.bukkit.command.@NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if ( commandSender instanceof Player player){

            InvGUI gui = new InvGUI(repository);
            gui.setup();
            player.openInventory(gui.getInventory());
        }
        return false;
    }

}
