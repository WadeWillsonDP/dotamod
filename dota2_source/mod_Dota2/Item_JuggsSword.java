package mod_Dota2;

import ibxm.Player;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class Item_JuggsSword extends ItemTool{

	public Item_JuggsSword(){
		super(7.0f, ToolMaterial.EMERALD , new HashSet());
		this.setTextureName("dota:JuggSword");
		this.setCreativeTab(Main.cTab);
		this.setUnlocalizedName("Jugg'sSword");
		this.setHarvestLevel(null, 0);
	}
}
