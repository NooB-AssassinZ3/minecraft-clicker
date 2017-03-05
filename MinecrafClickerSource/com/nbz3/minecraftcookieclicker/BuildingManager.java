package com.nbz3.minecraftcookieclicker;

public class BuildingManager
{
	public static void addBuilding(String buildingType)
	{
		if(buildingType.equals("piston"))
		{
			if(Main.cookiesInBank >= Main.pistonCost)
			{
				Main.cookiesInBank -= Main.pistonCost;
				Main.buildingsOwned++;
				Main.pistonCount++;
				Main.pistonCost = (int)Math.ceil(Main.pistonCost * 1.15);
				Main.cookiesPerClick += 1;
				
				if(!Main.piston1 && Main.pistonCount >= 1)
					Main.upgradePanel.add(Main.pistonUpgrade1);
				if(Main.piston1 && !Main.piston2 && Main.pistonCount >= 10)
					Main.upgradePanel.add(Main.pistonUpgrade2);
				if(Main.piston2 && Main.piston1 && !Main.piston3 && Main.pistonCount >= 50)
					Main.upgradePanel.add(Main.pistonUpgrade3);
			}
		}
		if(buildingType.equals("baker"))
		{
			if(Main.cookiesInBank >= Main.bakerCost)
			{
				Main.cookiesInBank -= Main.bakerCost;
				Main.buildingsOwned++;
				Main.bakerCount++;
				Main.bakerCost = (int)Math.ceil(Main.bakerCost * 1.15);
				
				if(!Main.baker1 && Main.bakerCount >= 1)
					Main.upgradePanel.add(Main.bakerUpgrade1);
				if(Main.baker1 && !Main.baker2 && Main.bakerCount >= 10)
					Main.upgradePanel.add(Main.bakerUpgrade2);
				if(Main.baker1 && Main.baker2 && !Main.baker3 && Main.bakerCount >= 50)
					Main.upgradePanel.add(Main.bakerUpgrade3);
				
			}
		}
		if(buildingType.equals("farm"))
		{
			if(Main.cookiesInBank >= Main.farmCost)
			{
				Main.cookiesInBank -= Main.farmCost;
				Main.buildingsOwned++;
				Main.farmCount++;
				Main.farmCost = (int)Math.ceil(Main.farmCost * 1.15);
				
				if(!Main.farm1 && Main.farmCount >= 1)
					Main.upgradePanel.add(Main.farmUpgrade1);
			}
		}
		if(buildingType.equals("factory"))
		{
			if(Main.cookiesInBank >= Main.factoryCost)
			{
				Main.cookiesInBank -= Main.factoryCost;
				Main.buildingsOwned++;
				Main.factoryCount++;
				Main.factoryCost = (int)Math.ceil(Main.factoryCost * 1.15);
				
				if(!Main.factory1 && Main.factoryCount >= 1)
					Main.upgradePanel.add(Main.factoryUpgrade1);
			}
		}
		if(buildingType.equals("mine"))
		{
			if(Main.cookiesInBank >= Main.mineCost)
			{
				Main.cookiesInBank -= Main.mineCost;
				Main.buildingsOwned++;
				Main.mineCount++;
				Main.mineCost = (int)Math.ceil(Main.mineCost * 1.15);
				
				if(!Main.mine1 && Main.mineCount >= 1)
					Main.upgradePanel.add(Main.mineUpgrade1);
			}
		}
		if(buildingType.equals("shipment"))
		{
			if(Main.cookiesInBank >= Main.shipmentCost)
			{
				Main.cookiesInBank -= Main.shipmentCost;
				Main.buildingsOwned++;
				Main.shipmentCount++;
				Main.shipmentCost = (int)Math.ceil(Main.shipmentCost * 1.15);
				
				if(!Main.shipment1 && Main.shipmentCount >= 1)
					Main.upgradePanel.add(Main.shipmentUpgrade1);
			}	
		}
		if(buildingType.equals("alchemy"))
		{
			if(Main.cookiesInBank >= Main.alchemyCost)
			{
				Main.cookiesInBank -= Main.alchemyCost;
				Main.buildingsOwned++;
				Main.alchemyCount++;
				Main.alchemyCost = (int)Math.ceil(Main.alchemyCost * 1.15);
				
				if(!Main.alchemy1 && Main.alchemyCount >= 1)
					Main.upgradePanel.add(Main.alchemyUpgrade1);
			}
		}
		if(buildingType.equals("portal"))
		{
			if(Main.cookiesInBank >= Main.portalCost)
			{
				Main.cookiesInBank -= Main.portalCost;
				Main.buildingsOwned++;
				Main.portalCount++;
				Main.portalCost = (int)Math.ceil(Main.portalCost * 1.15);
				
				if(!Main.portal1 && Main.portalCount >= 1)
					Main.upgradePanel.add(Main.portalUpgrade1);
			}
		}
		if(buildingType.equals("mod"))
			if(Main.cookiesInBank >= Main.modCost){
				Main.cookiesInBank -= Main.modCost;
				Main.buildingsOwned++;
				Main.modCount++;
				Main.modCost = (int)Math.ceil(Main.modCost * 1.15);
				
				if(!Main.mod1 && Main.modCount > 0)
					Main.upgradePanel.add(Main.modUpgrade1);
			}
			Main.setTimer();
			Main.updateStats();
	}
	
	public static void addUpgrade(String buildingType, int tier)
	{
		if(buildingType.equals("piston"))
		{
			if(tier == 1 && Main.cookiesInBank > 50)
			{
				if(!Main.piston1)
				{
					Main.piston1 = true;
					Main.cookiesInBank -= 50;
					Main.pistonUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.pistonUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 100 && !Main.piston2){
				Main.piston2 = true;
				Main.cookiesInBank -= 100;
				Main.pistonUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.pistonUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 500 && !Main.piston3) {
				Main.piston3 = true;
				Main.cookiesInBank -= 500;
				Main.pistonUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.pistonUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("baker"))
		{
			if(tier == 1 && Main.cookiesInBank >= 200)
			{
				if(!Main.baker1)
				{
					Main.baker1 = true;
					Main.cookiesInBank -= 200;
					Main.bakerUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.bakerUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 400 && !Main.baker2){
				Main.baker2 = true;
				Main.cookiesInBank -= 400;
				Main.bakerUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.bakerUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 800 && !Main.baker3){
				Main.baker3 = true;
				Main.cookiesInBank -= 800;
				Main.bakerUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.bakerUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("farm"))
		{
			if(tier == 1 && Main.cookiesInBank >= 360)
			{
				if(!Main.farm1)
				{
					Main.farm1 = true;
					Main.cookiesInBank -= 360;
					Main.farmUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.farmUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 720 && !Main.farm2){
				Main.farm2 = true;
				Main.cookiesInBank -= 720;
				Main.farmUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.farmUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 3600 && !Main.farm3){
				Main.farm3 = true;
				Main.cookiesInBank -= 3600;
				Main.farmUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.farmUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("factory"))
		{
			if(tier == 1 && Main.cookiesInBank >= 1000)
			{
				if(!Main.factory1)
				{
					Main.factory1 = true;
					Main.cookiesInBank -= 1000;
					Main.factoryUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.factoryUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 2000 && !Main.factory2){
				Main.factory2= true;
				Main.cookiesInBank -= 2000;
				Main.factoryUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.factoryUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank > 10000 && !Main.factory3){
				Main.factory3 = true;
				Main.cookiesInBank -= 10000;
				Main.factoryUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.factoryUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("mine"))
		{
			if(tier == 1 && Main.cookiesInBank >= 7000)
			{
				if(!Main.mine1)
				{
					Main.mine1 = true;
					Main.cookiesInBank -= 7000;
					Main.mineUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.mineUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 14000 && !Main.mine2){
				Main.mine2 = true;
				Main.cookiesInBank -= 14000;
				Main.mineUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.mineUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank > 70000 && !Main.mine3){
				Main.mine3 = true;
				Main.cookiesInBank -= 70000;
				Main.mineUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.mineUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("shipment"))
		{
			if(tier == 1 && Main.cookiesInBank >= 10000)
			{
				if(!Main.shipment1)
				{
					Main.shipment1 = true;
					Main.cookiesInBank -= 10000;
					Main.shipmentUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.shipmentUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 20000 && !Main.shipment2){
				Main.shipment2 = true;
				Main.cookiesInBank -= 20000;
				Main.shipmentUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.shipmentUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank > 100000 && !Main.shipment3){
				Main.shipment3 = true;
				Main.cookiesInBank -= 100000;
				Main.shipmentUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.shipmentUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("alchemy"))
		{
			if(tier == 1 && Main.cookiesInBank >= 16000)
			{
				if(!Main.alchemy1)
				{
					Main.alchemy1 = true;
					Main.cookiesInBank -= 16000;
					Main.alchemyUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.alchemyUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 32000 && !Main.alchemy2){
				Main.alchemy2 = true;
				Main.cookiesInBank -= 32000;
				Main.alchemyUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.alchemyUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 160000 && !Main.alchemy3){
				Main.alchemy3 = true;
				Main.cookiesInBank -= 160000;
				Main.alchemyUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.alchemyUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("portal"))
		{
			if(tier == 1 && Main.cookiesInBank >= 40000)
			{
				if(!Main.portal1)
				{
					Main.portal1 = true;
					Main.cookiesInBank -= 40000;
					Main.portalUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.portalUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 80000 && !Main.portal2){
				Main.portal2 = true;
				Main.cookiesInBank -= 80000;
				Main.portalUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.portalUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 400000 && !Main.portal3){
				Main.portal3 = true;
				Main.cookiesInBank -= 400000;
				Main.portalUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.portalUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("cps"))
		{
			if(tier == 1 && Main.cookiesInBank >= 300)
			{
				if(!Main.cps1)
				{
					Main.cps1 = true;
					Main.cookiesInBank -= 300;
					Main.cpsUpgrade1.setVisible(false);
					Main.upgradePanel.remove(Main.cpsUpgrade1);
					Main.upgradesBought++;
				}
			}
			if(tier == 2 && Main.cookiesInBank >= 21000 && !Main.cps2){
				Main.cps2 = true;
				Main.cookiesInBank -= 21000;
				Main.cpsUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.cpsUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 900000 && !Main.portal3){
				Main.cps3 = true;
				Main.cookiesInBank -= 900000;
				Main.cpsUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.cpsUpgrade3);
				Main.upgradesBought++;
			}
		}
		if(buildingType.equals("mod"))
			if (tier == 1 && Main.cookiesInBank >= 150000 && !Main.mod1){
				Main.mod1=true;
				Main.cookiesInBank -= 150000;
				Main.modUpgrade1.setVisible(false);
				Main.upgradePanel.remove(Main.modUpgrade1);
				Main.upgradesBought++;
			}
			if (tier == 2 && Main.cookiesInBank >= 300000 && !Main.mod2 && Main.mod1){
				Main.mod2=true;
				Main.cookiesInBank -= 300000;
				Main.modUpgrade2.setVisible(false);
				Main.upgradePanel.remove(Main.modUpgrade2);
				Main.upgradesBought++;
			}
			if(tier == 3 && Main.cookiesInBank >= 1000000 && !Main.portal3){
				Main.mod3 = true;
				Main.cookiesInBank -= 1000000;
				Main.modUpgrade3.setVisible(false);
				Main.upgradePanel.remove(Main.modUpgrade3);
				Main.upgradesBought++;
			}
		Main.updateStats();
	}
	
	
	//For upgrades
	public static int getPistonMultiplier()
	{
		int multiplier = 1;
		if(Main.piston1)
			multiplier *= 2;
		if(Main.piston2)
			multiplier *= 3;
		if(Main.piston3)
			multiplier *= 10;
		
		return multiplier;
	}
	
	public static int getBakerMultiplier()
	{
		int multiplier = 1;
		if(Main.baker1)
			multiplier *= 2;
		if(Main.baker2)
			multiplier *=3;
		
		
		return multiplier;
	}
	
	public static int getFarmMultiplier()
	{
		int multiplier = 1;
		if(Main.farm1)
			multiplier *= 2;
		if(Main.farm2)
			multiplier *=3;
		
		return multiplier;
	}
	
	public static int getFactoryMultiplier()
	{
		int multiplier = 1;
		if(Main.factory1)
			multiplier *= 2;
		if(Main.factory2)
			multiplier *=3;
		
		return multiplier;
	}
	
	public static int getMineMultiplier()
	{
		int multiplier = 1;
		if(Main.mine1)
			multiplier += 1;
		if(Main.mine2)
			multiplier +=2;
		
		return multiplier;
	}
	
	public static int getShipmentMultiplier()
	{
		int multiplier = 1;
		if(Main.shipment1)
			multiplier += 1;
		if(Main.shipment2)
			multiplier +=2;
		
		return multiplier;
	}
	
	public static int getAlchemyMultiplier()
	{
		int multiplier = 1;
		if(Main.alchemy1)
			multiplier += 1;
		if(Main.alchemy2)
			multiplier +=2;
		
		return multiplier;
	}
	public static int getPortalMultiplier()
	{
		int multiplier = 1;
		if(Main.portal1)
			multiplier += 1;
		if(Main.portal2)
			multiplier +=2;
		
		return multiplier;
	}
	
	public static double getCPSMultiplier()
	{
		double multiplier = 100;
		if(Main.cps1)
			multiplier += 5;
		if(Main.cps2)
			multiplier += 15;
		multiplier += Main.achievementCount * 5;
		multiplier /= 100;
		return multiplier;
	}
	public static int getModMultipler(){
		int multiplier = 1;
		if(Main.mod1)
			multiplier +=1;
		if(Main.mod2)
			multiplier +=2;
		
		
		return multiplier;
	}
	
	public static void loadUpgrades()
	{
		//loading T1 upgrades
		if(!Main.piston1 && Main.pistonCount > 0)
			Main.upgradePanel.add(Main.pistonUpgrade1);
		
		if(!Main.baker1 && Main.bakerCount > 0)
			Main.upgradePanel.add(Main.bakerUpgrade1);
		
		if(!Main.farm1 && Main.farmCount > 0)
			Main.upgradePanel.add(Main.farmUpgrade1);
		
		if(!Main.factory1 && Main.factoryCount > 0)
			Main.upgradePanel.add(Main.factoryUpgrade1);
		
		if(!Main.mine1 && Main.mineCount > 0)
			Main.upgradePanel.add(Main.mineUpgrade1);
		
		if(!Main.shipment1 && Main.shipmentCount > 0)
			Main.upgradePanel.add(Main.shipmentUpgrade1);
		
		if(!Main.alchemy1 && Main.alchemyCount > 0)
			Main.upgradePanel.add(Main.alchemyUpgrade1);
		
		if(!Main.portal1 && Main.portalCount > 0)
			Main.upgradePanel.add(Main.portalUpgrade1);
		
		if(!Main.cps1 && Main.cookieClicks > 100)
			Main.upgradePanel.add(Main.cpsUpgrade1);
		
		if(!Main.mod1 && Main.modCount > 0)
			Main.upgradePanel.add(Main.modUpgrade1);
		
		//loading T2 upgrades
		
		if(Main.piston1 && !Main.piston2 && Main.pistonCount >= 10)
			Main.upgradePanel.add(Main.pistonUpgrade2);
		
		if(Main.baker1 && !Main.baker2 && Main.bakerCount >= 10)
			Main.upgradePanel.add(Main.bakerUpgrade2);
		
		if(Main.farm1 && !Main.farm2 && Main.farmCount >= 10)
			Main.upgradePanel.add(Main.farmUpgrade2);
		
		if(Main.factory1 && !Main.factory2 && Main.factoryCount >= 10)
			Main.upgradePanel.add(Main.factoryUpgrade2);
		
		if(Main.mine1 && !Main.mine2 && Main.mineCount >= 10)
			Main.upgradePanel.add(Main.mineUpgrade2);
		
		if(Main.shipment1 && !Main.shipment2 && Main.shipmentCount >= 10)
			Main.upgradePanel.add(Main.shipmentUpgrade2);
		
		if(Main.alchemy1 && !Main.alchemy2 && Main.alchemyCount >= 10)
			Main.upgradePanel.add(Main.alchemyUpgrade2);
		
		if(Main.portal1 && !Main.portal2 && Main.portalCount >= 10)
			Main.upgradePanel.add(Main.portalUpgrade2);
		
		if(Main.cps1 && !Main.cps2 && Main.cookieClicks >= 300)
			Main.upgradePanel.add(Main.cpsUpgrade2);
		
		if(Main.mod1 && !Main.mod2 && Main.modCount >= 10)
			Main.upgradePanel.add(Main.modUpgrade2);
		
		//Loading T3 Upgrades
		if(Main.piston1 && Main.piston2 && !Main.piston3 && Main.pistonCount >= 50)
			Main.upgradePanel.add(Main.pistonUpgrade3);
		
		
		}
	}
