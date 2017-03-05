package com.nbz3.minecraftcookieclicker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 * @author nbz3
 * @version 1.0
 */
 

public class Main extends JFrame
{
	private static final long serialVersionUID = -5779504786333863469L;
	public static Timer cookieFlow = new Timer(), autoSaveTimer = new Timer();
	public static double totalCookies = 0, cookiesInBank = 0;
	public static int cookieClicks = 0, cookiesEarned;
	public static int  buildingsOwned = 0, upgradesBought = 0;
	public static double cps = 0.0;
	public static int pistonCount = 0;
	public static int pistonCost = 15;
	public static int bakerCount = 0;
	public static int bakerCost = 50;
	public static int farmCount = 0;
	public static int farmCost = 200;
	public static int factoryCount = 0;
	public static int factoryCost = 500;
	public static int mineCount = 0;
	public static int mineCost = 1500;
	public static int shipmentCount = 0;
	public static int shipmentCost = 5000;
	public static int alchemyCount = 0;
	public static int alchemyCost = 12000;
	public static int portalCount = 0;
	public static int portalCost = 25000;
	public static int modCount = 0;
	public static int modCost = 50000;
	
	public static double cookiesPerClick = 1.0;
	public static double pistonCPS = 0.0;
	public static double bakerCPS = 0.0;
	public static double farmCPS = 0.0;
	public static double factoryCPS = 0.0;
	public static double mineCPS = 0.0;
	public static double shipmentCPS = 0.0;
	public static double alchemyCPS = 0.0;
	public static double portalCPS = 0.0;
	public static double modCPS = 0.0;
	//Uploading Building Icons
	public static ImageIcon pistonIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Piston.png"));
	public static ImageIcon bakerIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Baker.png"));
	public static ImageIcon farmIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Farm.png"));
	public static ImageIcon factoryIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Factory.png"));
	public static ImageIcon mineIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Mine.png"));
	public static ImageIcon shipmentIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Shipment.png"));
	public static ImageIcon alchemyIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Alchemy.png"));
	public static ImageIcon portalIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/Portal.png"));
	public static ImageIcon modIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/buildings/mod.png"));
	public static ImageIcon smallCookieIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/cookieIcon.png"));

	
	public static CookieActionListener action = new CookieActionListener();
	public static JTabbedPane storePane;
	public static JPanel titlePanel, cookiePanel, statPanel, buildingPanel, upgradePanel, menuPanel,achivePanel;
	public static JButton bigCookie; //cookies!!!
	public static ImageIcon titleIcon, cookieIcon;
	public static JLabel title; //Title Art
	public static JLabel cookies, stats;
	public static JLabel cookieCount;
	public static JLabel cookiesPerSec;
	public static JLabel statsTotalCookies, statsCurrentCookies, statsCookiesPerSecond, statsBuildingsOwned;
	public static JLabel statsClicks, statsBigCookies, statsUpgrades, statsMultiplier;
	public static JLabel news;
	public static Font mcFontStats, mcFont, mcFontNews;
	
	public static JButton pistonUpgrade1, bakerUpgrade1, farmUpgrade1, factoryUpgrade1, mineUpgrade1,
						  shipmentUpgrade1, alchemyUpgrade1, portalUpgrade1, modUpgrade1;
	public static JButton cpsUpgrade1;
	public static JButton pistonUpgrade2, bakerUpgrade2, farmUpgrade2, factoryUpgrade2, mineUpgrade2, shipmentUpgrade2,
							alchemyUpgrade2, portalUpgrade2, modUpgrade2, cpsUpgrade2;
	public static JButton pistonUpgrade3, bakerUpgrade3, farmUpgrade3, factoryUpgrade3, mineUpgrade3, shipmentUpgrade3,
							alchemyUpgrade3, portalUpgrade3, modUpgrade3, cpsUpgrade3;
	
	public static boolean piston1 = false, baker1 = false, farm1 = false, factory1 = false, mine1 = false, shipment1 = false, alchemy1 = false, portal1 = false;
	public static boolean cps1 = false, mod1 = false;
	public static boolean piston2 = false, baker2 = false, farm2 = false, factory2 = false, mine2 = false, shipment2 = false, alchemy2 = false, portal2 = false;
	public static boolean cps2 = false, mod2 = false;
	public static boolean piston3 = false, baker3 = false, farm3 = false, factory3 = false, mine3 = false, shipment3 = false,
							 alchemy3 = false, portal3 = false, mod3 = false, cps3 = false;
	/* ACHIEVEMENTS */
	//Piston Achievements
	public static boolean piston1achive = false, piston2achive = false, piston3achive = false, piston4achive = false, piston5achive = false;
	//Mod Achievements
	public static boolean mod1achive = false,mod2achive = false, mod3achive = false, mod4achive = false, mod5achive = false;
	public static boolean math1achive = false, oneOEachive = false;
	public static int achievementCount = 0,achCPS = 0;
	public static JButton achievementCountLabel, mod1achiveLabel,math1achiveLabel,oneOEachiveLabel;
	public static boolean menuOpen = false, autoSaveEnabled = true;
	
	public static JButton buyPiston, buyBaker, buyFarm, buyFactory, buyMine, buyShipment, buyAlchemy, buyPortal, buyMod;
	public static JFrame menu;
	public static JButton openMenu, save, exit, reset;
	public static JCheckBox autosave;
	public Main()
	{
		setTitle("Minecraft Clicker");
		setSize(1366, 860);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		try
		{
			InputStream is1 = ClassLoader.getSystemResourceAsStream("resources/font/mcfont.ttf");
			InputStream is2 = ClassLoader.getSystemResourceAsStream("resources/font/mcfontstats.ttf");
			//custom fonts
			mcFont = Font.createFont(Font.TRUETYPE_FONT, is1).deriveFont(50F);
			mcFontStats = Font.createFont(Font.TRUETYPE_FONT, is2).deriveFont(15F);
			mcFontNews = mcFontStats.deriveFont(12F);
            GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphics.registerFont(mcFont); //I hate the font registry system
            graphics.registerFont(mcFontStats);
            graphics.registerFont(mcFontNews);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
		//Cookie Panel
		cookies = new JLabel("Cookies In Bank", SwingConstants.CENTER);
		cookies.setPreferredSize(new Dimension(533, 50));
		cookies.setFont(mcFont);
		cookies.setForeground(Color.WHITE); //White text, black just didn't look pleasing
		
		cookieCount = new JLabel("0 Cookies", SwingConstants.CENTER);
		cookieCount.setPreferredSize(new Dimension(400, 50));
		cookieCount.setFont(mcFontStats);
		cookieCount.setForeground(Color.WHITE);
		
		titleIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/MinecraftClicker.png"));
		title = new JLabel(titleIcon);
		title.setPreferredSize(new Dimension(1599, 69));
		
		cookieIcon = new ImageIcon(ClassLoader.getSystemResource("resources/images/BigCookie.png"));
		bigCookie = new JButton(cookieIcon);
		bigCookie.setBorder(BorderFactory.createEmptyBorder());
		bigCookie.setContentAreaFilled(false); //Remove annoying button background
		bigCookie.addActionListener(action);
		bigCookie.setCursor(new Cursor(Cursor.HAND_CURSOR)); //Makes it more visually appealing
		
		cookiesPerSec = new JLabel("CPS: 0.0");
		cookies.setPreferredSize(new Dimension(533, 50));
		cookiesPerSec.setFont(mcFontStats);
		cookiesPerSec.setForeground(Color.WHITE);
		
		//Statistics Panel
		news = new JLabel("You want to craft some cookies, but no one wants to buy them.  ");
		news.setPreferredSize(new Dimension(533, 100));
		news.setFont(mcFontNews);
		news.setForeground(Color.WHITE);
		
		stats = new JLabel("    Statistics"); //Extra spaces for center alignment due to BoxLayout()
		stats.setPreferredSize(new Dimension(533, 50));
		stats.setFont(mcFont);
		stats.setForeground(Color.WHITE);
		
		statsTotalCookies = new Statistic("Total Cookies Crafted: 0.0");
		statsCurrentCookies = new Statistic("Cookies In Bank: 0.0");
		statsCookiesPerSecond = new Statistic("Cookies Per Second(CPS): 0.0");
		statsBuildingsOwned = new Statistic("Total Buildings: 0");
		statsClicks = new Statistic("Total Clicks On Big Cookie: 0");
		statsBigCookies = new Statistic("Cookies Earned From Clicks: 0");
		statsUpgrades = new Statistic("Upgrades Bought: 0");
		statsMultiplier = new Statistic("CPS Multiplier: 100%");
		
		//Use HTML to enable two lines for the JButton
		
		buyPiston = new BuildingButton("<html> Piston Clicker	" + pistonCPS +" CPS<br /> Cost: " + pistonCost + "  Owned: " + pistonCount + " <html>", pistonIcon);	
		buyBaker = new BuildingButton("<html> Baker Villager	"+bakerCPS+" CPS<br /> Cost: " + bakerCost + "  Owned: " + bakerCount + " <html>", bakerIcon);
		buyFarm = new BuildingButton("<html> Farm	"+farmCPS+" CPS<br /> Cost: " + farmCost + "  Owned: " + farmCount + " <html>", farmIcon);
		buyFactory = new BuildingButton("<html> Redstone Factory	"+factoryCPS+" CPS<br /> Cost: " + factoryCost + "  Owned: " + factoryCount + " <html>", factoryIcon);
		buyMine = new BuildingButton("<html> Mine	"+mineCPS+" CPS<br /> Cost: " + mineCost + "  Owned: " + mineCount + " <html>", mineIcon);
		buyShipment = new BuildingButton("<html> Minecart Shipment	"+shipmentCPS+" CPS<br /> Cost: " + shipmentCost + "  Owned: " + shipmentCount + " <html>", shipmentIcon);
		buyAlchemy = new BuildingButton("<html> Alchemy Lab		"+alchemyCPS+" CPS<br /> Cost: " + alchemyCost + "  Owned: " + alchemyCount + " <html>", alchemyIcon);
		buyPortal = new BuildingButton("<html> Nether Portal	"+portalCPS+" CPS<br /> Cost: " + portalCost + "  Owned: " + portalCount + " <html>", portalIcon);
		buyMod = new BuildingButton("<html> Mod<br />"+modCPS+" CPS<br /> Cost: " + modCost + "  Owned: " + modCount + " </html>", modIcon);
		
		///////////////////
		//UPGRADE BUTTONS//
		///////////////////
		
		//Upgrades T1
		pistonUpgrade1 = new UpgradeButton("<html> Upgraded Automatic Pistons - Cost: 50<br /> +1 Cookie Per Click, Pistons Double CPS </html>", UpgradeButton.PISTON);
		bakerUpgrade1 = new UpgradeButton("<html> Advanced Baking Skills - Cost: 200 <br /> Bakers Double CPS </html>", UpgradeButton.BAKER);
		farmUpgrade1 = new UpgradeButton("<html> Enchanted Iron Hoes - Cost: 360 <br /> Farms Double CPS </html>", UpgradeButton.FARM);
		factoryUpgrade1 = new UpgradeButton("<html> Color-coded Redstone Wiring - Cost: 1000 <br /> Factories Double CPS </html>", UpgradeButton.FACTORY);
		mineUpgrade1 = new UpgradeButton("<html> Efficiency 1 Enchantment - Cost: 7000 <br /> Mines Double CPS </html>", UpgradeButton.MINE);
		shipmentUpgrade1 = new UpgradeButton("<html> Powered Minecart Rails - Cost: 10000 <br /> Minecart Shipments Double CPS </html>", UpgradeButton.SHIPMENT);
		alchemyUpgrade1 = new UpgradeButton("<html> Genetically Modified Netherwarts - Cost: 16000<br /> Alchemy Labs Double CPS </html>", UpgradeButton.ALCHEMY);
		portalUpgrade1 = new UpgradeButton("<html> Faster Chunk Loading - Cost: 40000<br /> Nether Portals Double CPS </html>", UpgradeButton.PORTAL);
		cpsUpgrade1 = new UpgradeButton("<html> Modded Cookies - Cost: 300<br /> +5% CPS</html>", UpgradeButton.CPS);
		modUpgrade1 = new UpgradeButton("<html> Eclipse Java IDE - Cost: 100000<br /> Mods Double CPS </html>", UpgradeButton.MOD);
		//Upgrades T2
		pistonUpgrade2 = new UpgradeButton("<html> More Pistons - Cost: 100<br /> +10 Cookies Per Click, Pistons Triple CPS </html>",UpgradeButton.PISTON);
		bakerUpgrade2 = new UpgradeButton("<html> Assembly Line - Cost: 400 <br /> Bakers Triple CPS </html>", UpgradeButton.BAKER);
		farmUpgrade2 = new UpgradeButton("<html> Irrigation - Cost: 720<br /> Farms Triple CPS </html>", UpgradeButton.FARM);//1020HD!
		factoryUpgrade2 = new UpgradeButton("<html> Automated Pipes - Cost: 2,000 <br /> Factories Triple CPS </html>",UpgradeButton.FACTORY);
		mineUpgrade2 = new UpgradeButton("<html> Cookie Bores - Cost: 14,000 <br /> Mines Triple CPS </html>", UpgradeButton.MINE);
		shipmentUpgrade2 = new UpgradeButton("<html> Plane Shipment - Cost: 20,000 <br /> Minecart Shipments Triple CPS", UpgradeButton.SHIPMENT);
		alchemyUpgrade2 = new UpgradeButton("<html> Sentient Witches - Cost: 32,000 <br /> Alchemy Labs Triple CPS </html>", UpgradeButton.ALCHEMY);
		portalUpgrade2 = new UpgradeButton("<html> Pre-Chunk Loading - Cost: 80,000 <br /> Nether Portals Triple CPS </html>",UpgradeButton.PORTAL);
		modUpgrade2 = new UpgradeButton("<html> Tutorials - Cost: 200,000 <br /> Mods Triple CPS </html>",UpgradeButton.MOD);
		cpsUpgrade2 = new UpgradeButton("<html> AutoHotKey - Cost: 21,000 <br /> +15% CPS </html>", UpgradeButton.CPS);
		
		//Upgrades T3
		pistonUpgrade3 = new UpgradeButton("<html> Obsidian Pistons - Cost: 500<br /> +20 Cookies Per Click, Pistons *10 CPS </html>",UpgradeButton.PISTON);
		bakerUpgrade3 = new UpgradeButton("<html> Easy Bake Ovens - Cost: 2,000 <br /> Bakers *10 CPS </html>",UpgradeButton.BAKER);
		farmUpgrade3 = new UpgradeButton("<html>Bonemeal - Cost: 3,600<br /> Farms *10 CPS </html>",UpgradeButton.FARM);
		factoryUpgrade3 = new UpgradeButton("<html>Computers - Cost: 10,000<br /> Factories *10 CPS</html>",UpgradeButton.FACTORY);
		mineUpgrade3 = new UpgradeButton("<html>Quarries - Cost: 70,000 <br /> Mines *10 CPS</html>",UpgradeButton.MINE);
		shipmentUpgrade3 = new UpgradeButton("<html>FTL Systems - Cost: 100,000<br /> Minecart Shipments *10 CPS</html>",UpgradeButton.SHIPMENT);
		alchemyUpgrade3 = new UpgradeButton("<html>Automated Netherwart Farms - Cost: 160,000<br /> Alchemy Labs *10 CPS</html>",UpgradeButton.ALCHEMY);
		portalUpgrade3 = new UpgradeButton("<html>Dimenstion Displacement Module - Cost: 400,000<br /> Nether Portals *10 CPS</html>",UpgradeButton.PORTAL);
		modUpgrade3 = new UpgradeButton("<html>Teams - Cost: 1,000,000<br /> Mods *10 CPS</html>",UpgradeButton.MOD);
		cpsUpgrade3 = new UpgradeButton("<html>Distributal Denial of Cookies - Cost: 900,000<br /> +20% CPS </html>", UpgradeButton.CPS);
		
		
		//Menu Button
		openMenu = new JButton("Menu");
		openMenu.setPreferredSize(new Dimension(1599, 100));
		openMenu.addActionListener(action);
		openMenu.setContentAreaFilled(false);
		openMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
		openMenu.setFont(mcFontStats);
		openMenu.setForeground(Color.WHITE);
		openMenu.setFocusPainted(false);
		
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1599, 69));
		titlePanel.setBackground(Color.BLACK);
		titlePanel.add(title);
		
		cookiePanel = new JPanel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/grass.png")).getImage(), 0, 0, null);
			}
		};

		cookiePanel.setPreferredSize(new Dimension(533, 831));
		cookiePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cookiePanel.add(cookies);
		cookiePanel.add(cookieCount);
		cookiePanel.add(bigCookie);
		cookiePanel.add(cookiesPerSec);

		statPanel = new JPanel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/stone.png")).getImage(), 0, 0, null);
			}
		};
		statPanel.setPreferredSize(new Dimension(533, 831));
		statPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		statPanel.setLayout(new BoxLayout(statPanel, BoxLayout.Y_AXIS));
		statPanel.add(news);
		statPanel.add(stats);
		statPanel.add(statsTotalCookies);
		statPanel.add(statsCurrentCookies);
		statPanel.add(statsCookiesPerSecond);
		statPanel.add(statsBuildingsOwned);
		statPanel.add(statsUpgrades);
		statPanel.add(statsClicks);
		statPanel.add(statsBigCookies);
		statPanel.add(statsMultiplier);
		
		buildingPanel = new JPanel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/obsidian.jpg")).getImage(), 0, 0, null);
			}
		};
		buildingPanel.add(buyPiston);
		buildingPanel.add(buyBaker);
		buildingPanel.add(buyFarm);
		buildingPanel.add(buyFactory);
		buildingPanel.add(buyMine);
		buildingPanel.add(buyShipment);
		buildingPanel.add(buyAlchemy);
		buildingPanel.add(buyPortal);
		buildingPanel.add(buyMod);
		
		achivePanel = new JPanel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/obsidian.jpg")).getImage(), 0, 0, null);
			}
		};
		achivePanel.add(achievementCountLabel);
		
		upgradePanel = new JPanel()
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/obsidian.jpg")).getImage(), 0, 0, null);
			}
		};
		
		storePane = new JTabbedPane();
		storePane.setFont(mcFontStats);
		storePane.addTab("Buildings", buildingPanel);
		storePane.addTab("Upgrades", upgradePanel);
		storePane.addTab("Achievements", achivePanel);
		storePane.setPreferredSize(new Dimension(533, 831));
		storePane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		menuPanel = new JPanel()
		{
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(new ImageIcon(ClassLoader.getSystemResource("resources/images/planks.png")).getImage(), 0, 0, null);
			}
		};
		menuPanel.setPreferredSize(new Dimension(1599, 100));
		menuPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		menuPanel.add(openMenu);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(titlePanel, BorderLayout.NORTH);
		getContentPane().add(statPanel, BorderLayout.CENTER);
		getContentPane().add(cookiePanel, BorderLayout.LINE_START);
		getContentPane().add(storePane, BorderLayout.LINE_END);
		getContentPane().add(menuPanel, BorderLayout.SOUTH);
		
		LoadSaveReset.load(); //Load all data from save file
		setVisible(true);
		
		if(autoSaveEnabled)
			setAutoSaveTimer();
	}
	
	public static void addCookie(double amount)
	{
		totalCookies += amount;
		cookiesInBank += amount;
		
		updateStats();
	}
	
	public static double getCookiesPerClick()
	{
		//Will rewrite this later
		double cookies = cookiesPerClick;
		if(piston1)
			cookies = 2;
		return cookies;
	}
	
	//Cancels current timer and sets a new one. CPS over 4 is visually made to look less boring
	public static void setTimer()
	{
		cookieFlow.cancel();
		cookieFlow = new Timer();
		
		if(cps >= 10)
		{
			cookieFlow.scheduleAtFixedRate(new TimerTask()
			{
				@Override
				public void run()
				{	
					addCookie(cps / 20);
				}
			}, 50, 50);
		}
		else
		{
			cookieFlow.scheduleAtFixedRate(new TimerTask()
			{
				@Override
				public void run()
				{
					
					addCookie(cps);
				}
			}, 1000, 1000);
		}

	}
	
	//Sets timer to save every 5 seconds
	public static void setAutoSaveTimer()
	{
		autoSaveTimer = new Timer();
		autoSaveTimer.scheduleAtFixedRate(new TimerTask()
		{
			@Override 
			public void run()
			{
				LoadSaveReset.save();
			}
		}, 5000, 5000);
	}
	
	//Updates auto save timer
	public static void updateAutoSaveTimer()
	{
		if(autoSaveEnabled)
		{
			autoSaveTimer.cancel();
			setAutoSaveTimer();
		}
		else
			autoSaveTimer.cancel();
	}
	
	//Updates all statistics
	public static void updateStats()
	{
		//Update CPS
		pistonCPS = pistonCount * 0.3 * BuildingManager.getPistonMultiplier();
		bakerCPS = bakerCount * 1.2* BuildingManager.getBakerMultiplier();
		farmCPS = farmCount * 4.1* BuildingManager.getFarmMultiplier();
		factoryCPS = factoryCount * 9.4* BuildingManager.getFactoryMultiplier();
		mineCPS = mineCount * 19.2* BuildingManager.getMineMultiplier();
		shipmentCPS = shipmentCount *40.6* BuildingManager.getShipmentMultiplier();
		alchemyCPS = alchemyCount * 100* BuildingManager.getAlchemyMultiplier();
		portalCPS = portalCount * 500* BuildingManager.getPortalMultiplier();
		modCPS = modCount * 1000*BuildingManager.getModMultipler();
		cps = (pistonCPS + bakerCPS + farmCPS + factoryCPS + modCPS + mineCPS + shipmentCPS + alchemyCPS + portalCPS) * BuildingManager.getCPSMultiplier();	
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###,###.#"); /*So it looks like 789,381,904 
																					   	 Instead of 789381904
																					   */
		
		//Update stats
		cookieCount.setText(df.format(cookiesInBank) + " Cookies");
		statsTotalCookies.setText("Total Cookies Crafted: " + df.format(totalCookies));
		statsCurrentCookies.setText("Cookies In Bank: " + df.format(cookiesInBank));
		statsCookiesPerSecond.setText("Cookies Per Second(CPS): " + df.format(cps));
		statsBuildingsOwned.setText("Total Buildings: " + Integer.toString(buildingsOwned));
		statsClicks.setText("Total Clicks On Big Cookie: " + cookieClicks);
		statsBigCookies.setText("Cookies Earned From Clicks: " + cookiesEarned);
		statsUpgrades.setText("Upgrades Bought: " + upgradesBought);
		statsMultiplier.setText("CPS Multiplier: " + (int)(BuildingManager.getCPSMultiplier() * 100) + "%");
		cookiesPerSec.setText("CPS: " + df.format(cps));
		
		//Update building text
		buyPiston.setText("<html> Piston Clicker<br />"+pistonCPS+" CPS<br /> Cost: " + pistonCost + "  Owned: " + pistonCount + " <html>");
		buyBaker.setText("<html> Baker Villager<br />"+bakerCPS+" CPS<br /> Cost: " + bakerCost + "  Owned: " + bakerCount + " <html>");
		buyFarm.setText("<html> Farm<br />"+farmCPS+" CPS<br /> Cost: " + farmCost + "  Owned: " + farmCount + " <html>");
		buyFactory.setText("<html> Redstone Factory<br />"+factoryCPS+" CPS <br /> Cost: " + factoryCost + "  Owned: " + factoryCount + " <html>");
		buyMine.setText("<html> Mine<br />"+mineCPS+" CPS <br /> Cost: " + mineCost + "  Owned: " + mineCount + " <html>");
		buyShipment.setText("<html> Minecart Shipment<br />"+shipmentCPS+" CPS <br /> Cost: " + shipmentCost + "  Owned: " + shipmentCount + " <html>");
		buyAlchemy.setText("<html> Alchemy Lab<br />"+alchemyCPS+" CPS <br /> Cost: " + alchemyCost + "  Owned: " + alchemyCount + " <html>");
		buyPortal.setText("<html> Nether Portal<br />"+portalCPS+" CPS <br /> Cost: " + portalCost + "  Owned: " + portalCount + " <html>");
		buyMod.setText("<html> Mod<br />"+modCPS+" CPS <br /> Cost: " + modCost + "  Owned: " + modCount + " <html>");
		
		//News Ticker
		NewsTicker.updateNews();
		//Upgrade Ticker
		BuildingManager.loadUpgrades();
	}
			
	public static void openMenu()
	{
		menuOpen = true;
		menu = new JFrame();
		menu.setTitle("Menu");
		menu.setSize(new Dimension(500, 500));
		menu.setResizable(true);
		menu.setAlwaysOnTop(true);
		menu.setLocationRelativeTo(null);
		menu.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		    	menuOpen = false; //Set boolean to false to not cause annoying problems
		    }
		});
		menu.setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("resources/images/sand.jpg"))));
		
		JLabel menuTitle = new JLabel("      Menu");
		menuTitle.setFont(mcFont);
		menuTitle.setPreferredSize(new Dimension(450, 120));
		menuTitle.setForeground(Color.BLACK);
		
		autosave = new JCheckBox("Auto save", autoSaveEnabled);
		autosave.setFont(mcFontStats);
		autosave.setPreferredSize(new Dimension(150, 70));
		autosave.setContentAreaFilled(false);
		autosave.setCursor(new Cursor(Cursor.HAND_CURSOR));
		autosave.setFocusPainted(false);
		autosave.setAlignmentX(Component.CENTER_ALIGNMENT);
		autosave.addActionListener(action);
		autosave.setEnabled(true);
		
		save = new JButton("Save");
		save.setFont(mcFontStats);
		save.setPreferredSize(new Dimension(450, 70));
		save.setContentAreaFilled(false);
		save.setCursor(new Cursor(Cursor.HAND_CURSOR));
		save.setFocusPainted(false);
		save.setAlignmentX(Component.CENTER_ALIGNMENT);
		save.addActionListener(action);
		
		reset = new JButton("Reset");
		reset.setFont(mcFontStats);
		reset.setPreferredSize(new Dimension(450, 70));
		reset.setContentAreaFilled(false);
		reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reset.setFocusPainted(false);
		reset.setAlignmentX(Component.CENTER_ALIGNMENT);
		reset.addActionListener(action);
		
		exit = new JButton("Exit");
		exit.setFont(mcFontStats);
		exit.setPreferredSize(new Dimension(450, 70));
		exit.setContentAreaFilled(false);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		exit.setAlignmentX(Component.CENTER_ALIGNMENT);
		exit.addActionListener(action);
		
		menu.getContentPane().setLayout(new FlowLayout());
		menu.getContentPane().add(menuTitle);
		menu.getContentPane().add(autosave);
		menu.getContentPane().add(save);
		menu.getContentPane().add(reset);
		menu.getContentPane().add(exit);
		
		menu.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
}
