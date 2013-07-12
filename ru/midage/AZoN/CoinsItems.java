package ru.midage.AZoN;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoinsItems {
	public static Item coin1;
	public static Item coin2;
	public static Item coin3;
	
	public static void init(){
		coin1 = new ItemCoin(CoinsConfig.coin1ID, 1);
		coin2 = new ItemCoin(CoinsConfig.coin2ID, 2);
		coin3 = new ItemCoin(CoinsConfig.coin3ID, 3);
	}
	
	/** Имена из конфига */
	public static void addNames(){
		LanguageRegistry.addName(coin1, "Бронзовая монета");
		LanguageRegistry.addName(coin2, "Серебряная монета");
		LanguageRegistry.addName(coin3, "Золотая монета");
	}
}