package com.nbz3.minecraftcookieclicker;

public class NewsTicker
{
	public static void updateNews()
	{
		if(Main.totalCookies >= 5 && Main.totalCookies < 25)
			Main.news.setText("Your first batch of cookies gets thrown away.");
		if(Main.totalCookies >= 25 && Main.totalCookies < 50)
			Main.news.setText("You start feeding your cookies to your pet wolf.");
		if(Main.totalCookies >= 50 && Main.totalCookies < 75)
			Main.news.setText("Server noobs stop to taste of your cookies.");
		if(Main.totalCookies >= 75 && Main.totalCookies < 100)
			Main.news.setText("Your friends on your multiplayer server like your cookies.");
		if(Main.totalCookies >= 100 && Main.totalCookies < 200)
			Main.news.setText("Your cookies are starting to become well known.");
		if(Main.totalCookies >= 200 && Main.totalCookies < 400)
			Main.news.setText("Minecrafters come all over the server to taste your cookies.");
		if(Main.totalCookies >= 400 && Main.totalCookies < 700)
			Main.news.setText("Your server admins start hosting daily cookie giveaways.");
		if(Main.totalCookies >= 700 && Main.totalCookies < 1200)
			Main.news.setText("Your cookies are selling for a lot of money.");
		if(Main.totalCookies >= 1200 && Main.totalCookies < 2000)
			Main.news.setText("Players from other servers join yours to taste your cookies");
		if(Main.totalCookies >= 2000 && Main.totalCookies < 5000)
			Main.news.setText("Mojang has taken notice of your cookies.");
		if(Main.totalCookies >= 5000 && Main.totalCookies < 7500)
			Main.news.setText("Mojang grants you a realms server to sell your cookies.");
		if(Main.totalCookies >= 7500 && Main.totalCookies < 10000)
			Main.news.setText("Your cookies are starting to flood your server.");
		if(Main.totalCookies >= 10000 && Main.totalCookies < 12000)
			Main.news.setText("Your cookies are now the most eaten food on any server.");
		if(Main.totalCookies >= 12000 && Main.totalCookies < 15000)
			Main.news.setText("You cookies have achieved a sentient AI.");
		if(Main.totalCookies >= 15000 && Main.totalCookies < 20000)
			Main.news.setText("Beings from all over the Nether come to taste your cookies");
		if(Main.totalCookies >= 20000 && Main.totalCookies < 50000)
			Main.news.setText("Your cookies are rewwriting the Minecraft code");
		if(Main.totalCookies >= 50000 && Main.totalCookies < 1000000)
			Main.news.setText("The Minecraft Forums featured your cookies (you win a cookie!)");
			//No you don't really win a cookie :(
		if(Main.totalCookies >= 1000000 && Main.totalCookies < 2000000)
			Main.news.setText("Your cookies are the most eaten food everywhere");
		if(Main.totalCookies >= 2000000 && Main.totalCookies < 5000000)
			Main.news.setText("Your cookie factories are now on every server");
		if(Main.totalCookies >= 1000000000)
			Main.news.setText("Your cookies are 99.99% total of all cookies");
	}
}
