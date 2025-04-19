package org.nano.nStudy.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.nano.nStudy.ui.StudyGUI;

public class StudyEvent implements Listener {
    @EventHandler
    public void click(InventoryClickEvent e){
        if ( e.getClickedInventory().getHolder() instanceof StudyGUI gui ){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void monster(EntityDamageByEntityEvent e){
        Player p = (Player) e.getDamager();
        Entity entity = e.getEntity();
        if ( entity instanceof Zombie zombie){
            if ( e.getDamage() >= zombie.getHealth() ){
                p.sendMessage(" 죽음 ");
            }
        }
    }
}
