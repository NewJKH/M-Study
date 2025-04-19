package org.nano.nStudy.repository;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRepository {
    private List<ItemStack> container;

    public ItemRepository() {
        container = new ArrayList<>();
    }

    public List<ItemStack> getContainer() {
        return container;
    }

    public void setContainer(List<ItemStack> container) {
        this.container = container;
    }

    public void addItem(ItemStack item){
        this.container.add(item);
    }

    public Optional<ItemStack> getItemByIndex(int index){
        return Optional.ofNullable(container.get(index));
    }

}
