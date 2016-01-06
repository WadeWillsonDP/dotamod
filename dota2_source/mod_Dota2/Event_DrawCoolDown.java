package mod_Dota2;

import scala.tools.nsc.doc.model.Public;
import sun.java2d.loops.DrawRect;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Event_DrawCoolDown {
	
	private String str;
	@SubscribeEvent
	public void playerName(RenderGameOverlayEvent.Text event) {
	
		str="hello, world";

	    event.left.add(0, String.format(str, Minecraft.getMinecraft().thePlayer.getCommandSenderName()));
	}

}
