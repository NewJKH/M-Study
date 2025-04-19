package org.nano.nStudy.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {

    public static ItemBuilder builder() {
        return new ItemBuilder();
    }

    private ItemStack itemStack;
    private ItemMeta meta;

    public ItemBuilder create(Material material){
        itemStack = new ItemStack(material);
        meta = itemStack.getItemMeta();
        return this;
    }

    public ItemBuilder display(String display){
        this.meta.setDisplayName(display);
        return this;
    }

    public ItemBuilder lore(List<String> lore){
        this.meta.setLore(lore);
        return this;
    }

    public ItemBuilder model(int model){
        this.meta.setCustomModelData(model);
        return this;
    }

    public ItemStack build(){
        itemStack.setItemMeta(meta);
        return itemStack;
    }

}
