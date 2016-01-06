package mod_Dota2;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Event_Vertigo {

	@SubscribeEvent
	public void vertigo(AttackEntityEvent event){
		EntityPlayer player1=event.entityPlayer;
		Entity player2;
//		if(event.target instanceof EntityPlayer){
			player2=event.target;
			player2.setVelocity(0, 0, 0);
			player2.setInWeb();
//		}
	}
}
