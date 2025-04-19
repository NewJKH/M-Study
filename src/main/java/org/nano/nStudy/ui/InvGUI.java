package org.nano.nStudy.ui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.nano.nStudy.repository.ItemRepository;

public class InvGUI implements InventoryHolder {
    private Inventory inventory;
    private final ItemRepository repository;

    public InvGUI(ItemRepository itemRepository) {
        this.repository = itemRepository;
        this.inventory = Bukkit.createInventory(this,54,"이걸로 테스트");
    }

    public void setup(){
        repository.getContainer()
                .forEach(itemStack -> inventory.addItem(itemStack));
    }


    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}
