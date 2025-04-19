package org.nano.nStudy.ui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class StudyGUI implements InventoryHolder {
    private final Inventory inventory;

    public StudyGUI() {
        inventory = Bukkit.createInventory(this,18,"나는 이걸 창고로 사용하겠다.");
    }


    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}
