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

    public ItemBuilder create(ItemStack itemStack){
        this.itemStack = new ItemStack(itemStack);
        this.meta = itemStack.getItemMeta();
        return this;
    }
    public ItemBuilder create(Material material){
        this.itemStack = new ItemStack(material);
        this.meta = itemStack.getItemMeta();
        return this;
    }
    public ItemBuilder material(Material material){
        this.itemStack = itemStack.withType(material);
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
    public ItemBuilder model(int customModelData){
        this.meta.setCustomModelData(customModelData);
        return this;
    }
    public ItemStack build(){
        itemStack.setItemMeta(meta);
        return this.itemStack;
    }
}
