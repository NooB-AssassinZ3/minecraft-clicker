package com.nbz3.minecraftcookieclicker;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class UpgradeButton extends JButton
{
	public static int PISTON = 0;
	public static int BAKER = 1;
	public static int FARM = 2;
	public static int FACTORY = 3;
	public static int MINE = 4;
	public static int SHIPMENT = 5;
	public static int ALCHEMY = 6;
	public static int PORTAL = 7;
	public static int CPS = 8;
	public static int MOD = 9;
	
	public UpgradeButton(String title, ImageIcon image)
	{
		super(title, image);
		setPreferredSize(new Dimension(550,75));
		setFont(Main.mcFontStats);
		setMargin(new Insets(0, 0, 0, 50));
		setHorizontalTextPosition(SwingConstants.LEFT);
		setContentAreaFilled(false);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setFocusPainted(false);
		setForeground(Color.WHITE);
		addActionListener(Main.action);
	}
	
	public UpgradeButton(String title, int buildingType)
	{
		super(title, getImageIcon(buildingType));
		setPreferredSize(new Dimension(550,75));
		setFont(Main.mcFontStats);
		setMargin(new Insets(0, 0, 0, 50));
		setContentAreaFilled(false);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setFocusPainted(false);
		setForeground(Color.WHITE);
		addActionListener(Main.action);
	}
	
	private static ImageIcon getImageIcon(int type)
	{
		if(type == PISTON)
			return Main.pistonIcon;
		else if(type == BAKER)
			return Main.bakerIcon;
		else if(type == FARM)
			return Main.farmIcon;
		else if(type == FACTORY)
			return Main.factoryIcon;
		else if(type == MINE)
			return Main.mineIcon;
		else if(type == SHIPMENT)
			return Main.shipmentIcon;
		else if(type == ALCHEMY)
			return Main.alchemyIcon;
		else if(type == PORTAL)
			return Main.portalIcon;
		else if(type == CPS)
			return Main.smallCookieIcon;
		else if(type == MOD)
			return Main.modIcon;
		else return Main.pistonIcon;
	}
}
