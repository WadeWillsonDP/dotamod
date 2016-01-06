package mod_Dota2;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.Gui;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Main.MODID, version=Main.VERSION)
public class Main {

	public final static String MODID = "DotaMod";
	public final static String VERSION = "1.0";
	public static Item dotaIcon=new Item_DotaIcon();
	public static CreativeTabs cTab;
	
	public Block DireStone;
	public Block RadianStone;
	public Block DireWood;
	public Block RadianWood;
	public Block DotaIcon2;
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		cTab=new Tab_CreativeTab("Dota");
		
		dotaIcon.setTextureName("dota:dota");
		
		DotaIcon2=new Block_DotaIcon(Material.rock);
		DotaIcon2.setBlockName("dotaIcon");
		GameRegistry.registerBlock(DotaIcon2, "DotaIconBlock");
		
		DireStone =new Block_Stone(Material.ice);
		DireStone.setBlockTextureName("dota:Stone");
		DireStone.setBlockName("DireStone");
		GameRegistry.registerBlock(DireStone, "DireStone");
		
		RadianStone=new Block_Stone(Material.ice);
		RadianStone.setBlockTextureName("dota:rstone");
		RadianStone.setBlockName("RadianStone");
		GameRegistry.registerBlock(RadianStone, "RadianStone");
		
		GameRegistry.registerItem(new Item_KelensDagger(),"Dagger");
		GameRegistry.registerItem(new Item_JuggsSword(), "JuggSword");
		GameRegistry.registerItem(new Item_ShadowBlade(), "shadowBlade");
		
		MinecraftForge.EVENT_BUS.register(new Event_DrawCoolDown());
		MinecraftForge.EVENT_BUS.register(new Event_Vertigo());
		
	}
}
