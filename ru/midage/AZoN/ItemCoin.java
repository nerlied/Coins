package ru.midage.AZoN;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemCoin extends Item {
	private int textureID;

	public ItemCoin(int id, int texture) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("Coin" + texture);
		this.textureID = texture;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Coins:coin" + textureID);
    }
}