package mod_Dota2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class Tab_CreativeTab extends CreativeTabs{

	public Tab_CreativeTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Main.dotaIcon;
	}

}
