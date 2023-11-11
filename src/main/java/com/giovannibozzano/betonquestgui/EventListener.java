package com.giovannibozzano.betonquestgui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.betoncraft.betonquest.api.QuestCompassTargetChangeEvent;


public class EventListener implements Listener {

    @EventHandler
    public void QuestCompassTargetChangeEventListener(QuestCompassTargetChangeEvent event)
    {
        Player player = event.getPlayer();
        if(event.getLocation().getWorld() == player.getWorld()) {
            PacketHandler.sendPacketTargetLocation(player, event.getLocation());
        }
    }
}
