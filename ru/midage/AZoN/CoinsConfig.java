package ru.midage.AZoN;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class CoinsConfig {
	
	/** Иды трех монет */
	public static int coin1ID;
	public static int coin2ID;
	public static int coin3ID;
	
	public static void init(File cfgFile){    	
        try {
            cfgFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        
		Configuration config = new Configuration(cfgFile);
		config.load();

		/** Загрузка переменных */
		coin1ID = config.getItem("coin1", 500).getInt();
		coin2ID = config.getItem("coin2", 501).getInt();
		coin3ID = config.getItem("coin3", 503).getInt();
		
		config.save();
	}
}