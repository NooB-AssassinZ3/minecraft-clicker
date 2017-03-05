package com.nbz3.minecraftcookieclicker;

import java.awt.Color;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Statistic extends JLabel
{
	public Statistic(String display)
	{
		super(display);
		setFont(Main.mcFontStats);
		setForeground(Color.WHITE);
	}
}
