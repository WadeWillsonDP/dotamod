package mod_Dota2;

import java.util.HashSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class Item_ShadowBlade extends ItemTool{

	public Item_ShadowBlade(){
		super(0,ToolMaterial.EMERALD,new HashSet());
		setTextureName("dota:shadowBlade");
		setHarvestLevel("something", -1);
		setCreativeTab(Main.cTab);
		setUnlocalizedName("shadowBlade");
	}
	boolean invis=false;
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		System.out.println("12121");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		player.setInvisible(true);
		return stack;
	}
}
