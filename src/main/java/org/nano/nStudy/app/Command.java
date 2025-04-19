package org.nano.nStudy.app;

import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.nano.nStudy.util.ItemBuilder;

import java.util.List;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, org.bukkit.command.@NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        ItemStack item = ItemBuilder.builder()
                .create(Material.IRON_SWORD)
                .material(Material.DIAMOND_SWORD)
                .display("§b강력한 검")
                .lore(List.of("§7이 검은...", "§c강력한 힘을 가지고 있다."))
                .model(1001)
                .build();
        return false;
    }
}
