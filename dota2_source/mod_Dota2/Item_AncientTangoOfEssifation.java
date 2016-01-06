package mod_Dota2;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemTool;

public class Item_AncientTangoOfEssifation extends ItemTool{

	protected Item_AncientTangoOfEssifation() {
		super(0f, ToolMaterial.EMERALD, new HashSet());
		this.setTextureName("dota:eattree");
		this.setHarvestLevel("Tango", 10);
		this.setCreativeTab(Main.cTab);
		// TODO Auto-generated constructor stub
	}

}
