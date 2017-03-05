package com.nbz3.minecraftcookieclicker;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class BuildingButton extends JButton
{
	public BuildingButton(String title, ImageIcon image)
	{
		super(title, image);
		setPreferredSize(new Dimension(720, 75));
		setFont(Main.mcFontStats);
		setMargin(new Insets(0, 0, 0, 230)); //Makes text not screw up
		setContentAreaFilled(false);
		setCursor(new Cursor(Cursor.HAND_CURSOR)); //Makes things less annoying
		setFocusPainted(false); //Makes things even less annoying
		setForeground(Color.WHITE);
		addActionListener(Main.action);
	}
}
