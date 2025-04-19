package org.nano.nStudy.ui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class InvGUI implements InventoryHolder {
    private Inventory inventory;

    public InvGUI() {
        inventory = Bukkit.createInventory(this,54,"이걸로 테스트");
    }


    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}
