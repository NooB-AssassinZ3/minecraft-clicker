package com.nbz3.minecraftcookieclicker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JOptionPane;


public class LoadSaveReset {
//Loads all data from save file
	private static String defaultDirectory()
	{
	    String OS = System.getProperty("os.name").toUpperCase();
	    if (OS.contains("WIN"))
	        return System.getenv("APPDATA");
	    else if (OS.contains("MAC"))
	        return System.getProperty("user.home") + "/Library/Application "
	                + "Support";
	    else if (OS.contains("NUX"))
	        return System.getProperty("user.home") + "/.config/";
	    return System.getProperty("user.dir");
	}
	public static void load()
	{
		try
		{
			InputStream in = new FileInputStream(defaultDirectory() + "/MinecraftClickerSave.txt");
			ObjectInputStream ois = new ObjectInputStream(in);

			Main.totalCookies = (double) ois.readObject();
			Main.cookiesInBank = (double) ois.readObject();
			Main.cookieClicks = (int) ois.readObject();
			Main.buildingsOwned = (int) ois.readObject();
			Main.pistonCount = (int) ois.readObject();
			Main.pistonCost = (int) ois.readObject();
			Main.bakerCount = (int) ois.readObject();
			Main.bakerCost = (int) ois.readObject();
			Main.farmCount = (int) ois.readObject();
			Main.farmCost = (int) ois.readObject();
			Main.factoryCount = (int) ois.readObject();
			Main.factoryCost = (int) ois.readObject();
			Main.mineCount = (int) ois.readObject();
			Main.mineCost = (int) ois.readObject();
			Main.shipmentCount = (int) ois.readObject();
			Main.shipmentCost = (int) ois.readObject();
			Main.alchemyCount = (int) ois.readObject();
			Main.alchemyCost = (int) ois.readObject();
			Main.portalCount = (int) ois.readObject();
			Main.portalCost = (int) ois.readObject();
			Main.modCount = (int) ois.readObject();
			Main.modCost = (int) ois.readObject();
			Main.autoSaveEnabled = (boolean) ois.readObject();
			Main.cookiesEarned = (int) ois.readObject();
			Main.piston1 = (boolean) ois.readObject();
			Main.piston2 = (boolean) ois.readObject();
			Main.piston3 = (boolean) ois.readObject();
			Main.baker1 = (boolean) ois.readObject();
			Main.baker2 = (boolean) ois.readObject();
			Main.baker3 = (boolean) ois.readObject();
			Main.farm1 = (boolean) ois.readObject();
			Main.farm2 = (boolean) ois.readObject();
			Main.farm3 = (boolean) ois.readObject();
			Main.factory1 = (boolean) ois.readObject();
			Main.factory2 = (boolean) ois.readObject();
			Main.factory3 = (boolean) ois.readObject();
			Main.mine1 = (boolean) ois.readObject();
			Main.mine2 = (boolean) ois.readObject();
			Main.mine3 = (boolean) ois.readObject();
			Main.shipment1 = (boolean) ois.readObject();
			Main.shipment2 = (boolean) ois.readObject();
			Main.shipment3 = (boolean) ois.readObject();
			Main.alchemy1 = (boolean) ois.readObject();
			Main.alchemy2 = (boolean) ois.readObject();
			Main.alchemy3 = (boolean) ois.readObject();
			Main.portal1 = (boolean) ois.readObject();
			Main.portal2 = (boolean) ois.readObject();
			Main.portal3 = (boolean) ois.readObject();
			Main.mod1 = (boolean) ois.readObject();
			Main.mod2 = (boolean) ois.readObject();
			Main.mod3 = (boolean) ois.readObject();
			Main.cps1 = (boolean) ois.readObject();
			Main.cps2 = (boolean) ois.readObject();
			Main.cps3 = (boolean) ois.readObject();
			Main.piston1achive = (boolean) ois.readObject();
			Main.piston2achive = (boolean) ois.readObject();
			Main.piston3achive = (boolean) ois.readObject();
			Main.piston4achive = (boolean) ois.readObject();
			Main.piston5achive = (boolean) ois.readObject();
			Main.mod1achive = (boolean) ois.readObject();
			Main.mod2achive = (boolean) ois.readObject();
			Main.mod3achive = (boolean) ois.readObject();
			Main.mod4achive = (boolean) ois.readObject();
			Main.mod5achive = (boolean) ois.readObject();
			Main.math1achive = (boolean) ois.readObject();
			Main.oneOEachive = (boolean) ois.readObject();
			Main.achievementCount = (int) ois.readObject();
			Main.upgradesBought = (int) ois.readObject();
			Main.cookiesPerClick = (double) ois.readObject();
			
			Main.updateStats();
			Main.setTimer();
			ois.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
//Saves all objects to file
	public static void save()
	{
		try
		{
			OutputStream out = new FileOutputStream(defaultDirectory() + "/MinecraftClickerSave.txt");
			ObjectOutputStream oos = new ObjectOutputStream(out);

			oos.writeObject(Main.totalCookies);
			oos.writeObject(Main.cookiesInBank);
			oos.writeObject(Main.cookieClicks);
			oos.writeObject(Main.buildingsOwned);
			oos.writeObject(Main.pistonCount);
			oos.writeObject(Main.pistonCost);
			oos.writeObject(Main.bakerCount);
			oos.writeObject(Main.bakerCost);
			oos.writeObject(Main.farmCount);
			oos.writeObject(Main.farmCost);
			oos.writeObject(Main.factoryCount);
			oos.writeObject(Main.factoryCost);
			oos.writeObject(Main.mineCount);
			oos.writeObject(Main.mineCost);
			oos.writeObject(Main.shipmentCount);
			oos.writeObject(Main.shipmentCost);
			oos.writeObject(Main.alchemyCount);
			oos.writeObject(Main.alchemyCost);
			oos.writeObject(Main.portalCount);
			oos.writeObject(Main.portalCost);
			oos.writeObject(Main.modCount);
			oos.writeObject(Main.modCost);
			oos.writeObject(Main.autoSaveEnabled);
			oos.writeObject(Main.cookiesEarned);
			oos.writeObject(Main.piston1);
			oos.writeObject(Main.piston2);
			oos.writeObject(Main.piston3);
			oos.writeObject(Main.baker1);
			oos.writeObject(Main.baker2);
			oos.writeObject(Main.baker3);
			oos.writeObject(Main.farm1);
			oos.writeObject(Main.farm2);
			oos.writeObject(Main.farm3);
			oos.writeObject(Main.factory1);
			oos.writeObject(Main.factory2);
			oos.writeObject(Main.factory3);
			oos.writeObject(Main.mine1);
			oos.writeObject(Main.mine2);
			oos.writeObject(Main.mine3);
			oos.writeObject(Main.shipment1);
			oos.writeObject(Main.shipment2);
			oos.writeObject(Main.shipment3);
			oos.writeObject(Main.alchemy1);
			oos.writeObject(Main.alchemy2);
			oos.writeObject(Main.alchemy3);
			oos.writeObject(Main.portal1);
			oos.writeObject(Main.portal2);
			oos.writeObject(Main.portal3);
			oos.writeObject(Main.cps1);
			oos.writeObject(Main.cps2);
			oos.writeObject(Main.cps3);
			oos.writeObject(Main.mod1);
			oos.writeObject(Main.mod2);
			oos.writeObject(Main.mod3);
			oos.writeObject(Main.piston1achive);
			oos.writeObject(Main.piston2achive);
			oos.writeObject(Main.piston3achive);
			oos.writeObject(Main.piston4achive);
			oos.writeObject(Main.piston5achive);
			oos.writeObject(Main.mod1achive);
			oos.writeObject(Main.mod2achive);
			oos.writeObject(Main.mod3achive);
			oos.writeObject(Main.mod4achive);
			oos.writeObject(Main.mod5achive);
			oos.writeObject(Main.math1achive);
			oos.writeObject(Main.oneOEachive);
			oos.writeObject(Main.achievementCount);
			oos.writeObject(Main.upgradesBought);
			oos.writeObject(Main.cookiesPerClick);
			
			oos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void reset()
	{
		int choice = JOptionPane.showConfirmDialog(Main.openMenu, "Are you sure you want to reset? \n This cannot be undone.", "Reset?", JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION)
		{
			Main.totalCookies = 0;
			Main.cookiesInBank = 0;
			Main.cookieClicks = 0;
			Main.buildingsOwned = 0;
			Main.cps = 0.0;
			Main.pistonCount = 0;
			Main.pistonCost = 15;
			Main.bakerCount = 0;
			Main.bakerCost = 50;
			Main.farmCount = 0;
			Main.farmCost = 200;
			Main.factoryCount = 0;
			Main.factoryCost = 500;
			Main.mineCount = 0;
			Main.mineCost = 1500;
			Main.shipmentCount = 0;
			Main.shipmentCost = 5000;
			Main.alchemyCount = 0;
			Main.alchemyCost = 12000;
			Main.portalCount = 0;
			Main.portalCost = 25000;
			Main.modCount = 0;
			Main.modCost = 50000;
			Main.cookiesEarned = 0;
			Main.cookiesPerClick = 1.0;
			Main.upgradePanel.remove(Main.pistonUpgrade1);
			Main.upgradePanel.remove(Main.pistonUpgrade2);
			Main.upgradePanel.remove(Main.pistonUpgrade3);
			Main.upgradePanel.remove(Main.bakerUpgrade1);
			Main.upgradePanel.remove(Main.bakerUpgrade2);
			Main.upgradePanel.remove(Main.bakerUpgrade3);
			Main.upgradePanel.remove(Main.farmUpgrade1);
			Main.upgradePanel.remove(Main.farmUpgrade2);
			Main.upgradePanel.remove(Main.farmUpgrade3);
			Main.upgradePanel.remove(Main.factoryUpgrade1);
			Main.upgradePanel.remove(Main.factoryUpgrade2);
			Main.upgradePanel.remove(Main.factoryUpgrade3);
			Main.upgradePanel.remove(Main.mineUpgrade1);
			Main.upgradePanel.remove(Main.mineUpgrade2);
			Main.upgradePanel.remove(Main.mineUpgrade3);
			Main.upgradePanel.remove(Main.shipmentUpgrade1);
			Main.upgradePanel.remove(Main.shipmentUpgrade2);
			Main.upgradePanel.remove(Main.shipmentUpgrade3);
			Main.upgradePanel.remove(Main.alchemyUpgrade1);
			Main.upgradePanel.remove(Main.alchemyUpgrade2);
			Main.upgradePanel.remove(Main.alchemyUpgrade3);
			Main.upgradePanel.remove(Main.portalUpgrade1);
			Main.upgradePanel.remove(Main.portalUpgrade2);
			Main.upgradePanel.remove(Main.portalUpgrade3);
			Main.upgradePanel.remove(Main.modUpgrade1);
			Main.upgradePanel.remove(Main.modUpgrade2);
			Main.upgradePanel.remove(Main.modUpgrade3);
			Main.upgradePanel.remove(Main.cpsUpgrade1);
			Main.upgradePanel.remove(Main.cpsUpgrade2);
			Main.piston1 = false;
			Main.piston2 = false;
			Main.piston3 = false;
			Main.baker1 = false;
			Main.baker2 = false;
			Main.baker3 = false;
			Main.farm1 = false;
			Main.farm2 = false;
			Main.farm3 = false;
			Main.factory1 = false;
			Main.factory2 = false;
			Main.factory3 = false;
			Main.mine1 = false;
			Main.mine2 = false;
			Main.mine3 = false;
			Main.shipment3 = false;
			Main.alchemy3 = false;
			Main.portal3 = false;
			Main.cps3 = false;
			Main.mod3 = false;
			Main.shipment1 = false;
			Main.shipment2 = false;
			Main.alchemy1 = false;
			Main.alchemy2 = false;
			Main.portal1 = false;
			Main.portal2 = false;
			Main.cps1 = false;
			Main.cps2 = false;
			Main.mod1 = false;
			Main.mod2 = false;
			Main.piston1achive = false;
			Main.piston2achive = false;
			Main.piston3achive = false;
			Main.piston4achive = false;
			Main.mod1achive = false;
			Main.math1achive = false;
			Main.oneOEachive = false;
			Main.achievementCount = 0;
			Main.upgradesBought = 0;
			
			save();
			Main.updateStats();
		}
	}
}
