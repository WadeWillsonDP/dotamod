package mod_Dota2;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

import org.lwjgl.opengl.GLContext;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import akka.actor.FSM.Event;
import akka.io.SelectionHandler.ChannelRegistryImpl.Task;
import scala.reflect.internal.Trees.This;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemTool;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.world.WorldEvent;

public class Item_KelensDagger extends ItemTool {

	boolean NoCd = true;
	Timer timer = new Timer();

	private class Task extends TimerTask {

		@Override
		public void run() {
			NoCd = true;
		}
	}

	public Item_KelensDagger() {
		super(0, ToolMaterial.EMERALD, new HashSet());
		this.setTextureName("dota:dagger");
		this.setCreativeTab(Main.cTab);
		this.setUnlocalizedName("Dagger");
	}

	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (NoCd == true) {

			cd.cooldown();
			float Angle = (player.rotationYaw / 180F) * 3.141593F;
			double x = player.posX + (20f * -MathHelper.sin(Angle));
			double y = player.posY;
			double z = player.posZ + (20f * MathHelper.cos(Angle));

			while (world.getBlock((int) x, (int) y - 1, (int) z) == Blocks.air
					|| world.getBlock((int) x, (int) (y - 1), (int) z) == Blocks.leaves) {
				y -= 1;
			}

			while (world.getBlock((int) x, (int) y, (int) z) != Blocks.air
					|| world.getBlock((int) x, (int) (y + 1), (int) z) != Blocks.air) {
				y += 1;
			}

			double XX, YY, ZZ;

			System.out.println(world.getBlock((int) x, (int) y, (int) z)
					.getUnlocalizedName());
			System.out.println(world.getBlock((int) x, (int) y + 1, (int) z)
					.getUnlocalizedName());
			player.setLocationAndAngles(x, y + 1, z, player.rotationYaw,
					player.rotationPitch);
			// if(player.posY==y){
			// player.setLocationAndAngles(x, y+10, z, player.rotationYaw,
			// player.rotationPitch);
			// }
			NoCd = false;
			Task cdTask = new Task();
			timer.schedule(cdTask, 5000);
			XX = player.posX;
			YY = player.posY;
			ZZ = player.posZ;
			System.out.println(XX + " " + YY + " " + ZZ);
			System.out.println(x + " " + y + " " + z);
		}
		return stack;
	}

}
