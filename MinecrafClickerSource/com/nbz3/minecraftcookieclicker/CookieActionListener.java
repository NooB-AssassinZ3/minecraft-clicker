package com.nbz3.minecraftcookieclicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieActionListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Main.bigCookie)
		{
			Main.cookieClicks++;
			Main.addCookie(Main.getCookiesPerClick());
			Main.cookiesEarned += Main.getCookiesPerClick();
			if(Main.cookieClicks > 100 && !Main.cps1)
				Main.upgradePanel.add(Main.cpsUpgrade1);
		}
		if(e.getSource() == Main.buyPiston)
			BuildingManager.addBuilding("piston");
		if(e.getSource() == Main.buyBaker)
			BuildingManager.addBuilding("baker");
		if(e.getSource() == Main.buyFarm)
			BuildingManager.addBuilding("farm");
		if(e.getSource() == Main.buyFactory)
			BuildingManager.addBuilding("factory");
		if(e.getSource() == Main.buyMine)
			BuildingManager.addBuilding("mine");
		if(e.getSource() == Main.buyShipment)
			BuildingManager.addBuilding("shipment");
		if(e.getSource() == Main.buyAlchemy)
			BuildingManager.addBuilding("alchemy");
		if(e.getSource() == Main.buyPortal)
			BuildingManager.addBuilding("portal");
		if(e.getSource() == Main.buyMod)
			BuildingManager.addBuilding("mod");
		
		//Upgrade Tier 1
		if(e.getSource() == Main.pistonUpgrade1)
			BuildingManager.addUpgrade("piston", 1);
		if(e.getSource() == Main.bakerUpgrade1)
			BuildingManager.addUpgrade("baker", 1);
		if(e.getSource() == Main.farmUpgrade1)
			BuildingManager.addUpgrade("farm", 1);
		if(e.getSource() == Main.factoryUpgrade1)
			BuildingManager.addUpgrade("factory", 1);
		if(e.getSource() == Main.mineUpgrade1)
			BuildingManager.addUpgrade("mine", 1);
		if(e.getSource() == Main.shipmentUpgrade1)
			BuildingManager.addUpgrade("shipment", 1);
		if(e.getSource() == Main.alchemyUpgrade1)
			BuildingManager.addUpgrade("alchemy", 1);
		if(e.getSource() == Main.portalUpgrade1)
			BuildingManager.addUpgrade("portal", 1);
		if(e.getSource() == Main.cpsUpgrade1)
			BuildingManager.addUpgrade("cps", 1);
		if(e.getSource()==Main.modUpgrade1)
			BuildingManager.addUpgrade("mod", 1);
		//Upgrade Tier 2
		if(e.getSource()==Main.pistonUpgrade2)
			BuildingManager.addUpgrade("piston", 2);
		if(e.getSource()==Main.bakerUpgrade2)
			BuildingManager.addUpgrade("baker", 2);
		if(e.getSource()==Main.farmUpgrade2)
			BuildingManager.addUpgrade("farm", 2);
		if(e.getSource()==Main.factoryUpgrade2)
			BuildingManager.addUpgrade("factory", 2);
		if(e.getSource()==Main.mineUpgrade2)
			BuildingManager.addUpgrade("mine", 2);
		if(e.getSource()==Main.shipmentUpgrade2)
			BuildingManager.addUpgrade("shipment", 2);
		if(e.getSource()==Main.alchemyUpgrade2)
			BuildingManager.addUpgrade("alchemy", 2);
		if(e.getSource()==Main.portalUpgrade2)
			BuildingManager.addUpgrade("portal", 2);
		if(e.getSource()==Main.modUpgrade2)
			BuildingManager.addUpgrade("mod", 2);
		if(e.getSource()==Main.cpsUpgrade2)
			BuildingManager.addUpgrade("cps", 2);
		
		//T3 upgrades
		if(e.getSource()==Main.pistonUpgrade3)
			BuildingManager.addUpgrade("piston", 3);
		if(e.getSource()==Main.bakerUpgrade3)
			BuildingManager.addUpgrade("baker", 3);
		if(e.getSource()==Main.farmUpgrade3)
			BuildingManager.addUpgrade("farm", 3);
		if(e.getSource()==Main.factoryUpgrade3)
			BuildingManager.addUpgrade("factory", 3);
		if(e.getSource()==Main.mineUpgrade3)
			BuildingManager.addUpgrade("mine", 3);
		if(e.getSource()==Main.shipmentUpgrade3)
			BuildingManager.addUpgrade("shipment", 3);
		if(e.getSource()==Main.alchemyUpgrade3)
			BuildingManager.addUpgrade("alchemy", 3);
		if(e.getSource()==Main.portalUpgrade3)
			BuildingManager.addUpgrade("portal", 3);
		if(e.getSource()==Main.modUpgrade3)
			BuildingManager.addUpgrade("mod", 3);
		if(e.getSource()==Main.cpsUpgrade3)
			BuildingManager.addUpgrade("cps", 3);
		
		if(e.getSource() == Main.openMenu)
			if(!Main.menuOpen)
				Main.openMenu();
		if(e.getSource() == Main.autosave)
		{
			if(Main.autosave.isSelected())
				Main.autoSaveEnabled = true;
			else
				Main.autoSaveEnabled = false;
				
			Main.updateAutoSaveTimer();
		}
		if(e.getSource() == Main.save)
			LoadSaveReset.save();
		if(e.getSource() == Main.reset)
			LoadSaveReset.reset();
		if(e.getSource() == Main.exit)
			System.exit(0);
	}

}
