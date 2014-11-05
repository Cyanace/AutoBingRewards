

import java.awt.Desktop;
import java.net.URL;
public class bingSearch {

	static String[] search = {"pizza", "cake", "java%20sleep","java%20math.random", "define%20facetious", "Minecraft", "how%20to%20make%20a%20pickaxe", "Solar%20eclipse", "java%20SDK", "Blood%20moon", "java%20write%20text%20into%20browser", "Java%20eclipse", "java%20method%20overloading", "java%20public%20static%20void%20main", "exeter%20math%203", "Java%20method%20parameters", "Dry%20erase%20markers",
		"Whiteboard", "Java%20legal%20overloading", "Java%20Jsoup", "Java%20string", "Honda", "Ford", "Toyota", "Telephone", "Chess", "Checkers", "Twister", "Computer%20Science", "Witchery", "Nuclear%20Reactor", "Snow", "SnowBall%20fight", "Snow%20day", "Samsung", "ASUS", "Toshiba", "Lenovo", "Microsoft", "HP", "Logitech", "Anker", "Mojang", "Chrome", "Internet%20Explorer", "Firefox", 
		"Horse%20racing", "Java%20how%20to%20program", "ACT", "SAT", "AP%20test", "Webstore", "Touchscreen", "Drawing%20tablet", "Painting", "Crayon", "marker", "GPU", "Intel", "NVIDIA", "Geforce", "Radeon", "g-sync", "mouse%20pad", "trackpad", "keyboad", "tablet", "Transformer", "STEM", "Game%20Maker", "Play%20station", "XBOX", "XBOX%20360", "XBOX%20one", "Chat%20system", "Java%20class", "java%20method",
		"Java%20project", "C++", "Visual%20basic", "Roman%20Numerals", "Linux", "Windows%208", "Windows%207", "Windows%2010", "PSU", "HDMI", "USB", "USB%203.0", "Moniter", "Computer%20monitor", "DVI-d", "HD", "Android", "Android%20kit%20kat", "Android%20jelly%20bean", "Android%20Honeycomb", "Motherboard", "Asus%20rog", "OLED", "plasma%20tv", "4k%20hd%20tv", "Ultrabook", "macbook", "macbook%20pro", "bing",
		"Java%20references", "javascript", "adobe", "photoshop", "gimp", "photography", "camera", "megapixel"};
	public static void main(String[] args) throws InterruptedException{
		
		String input = search[(int) (Math.random()*search.length)];
		System.out.println(search.length);
		for(int i = 0; i < 3; i++){
			input = search[(int) (Math.random()*search.length)];
		
			//openWebpage("http://www.bing.com/search?q=" + input);
			Thread.sleep((long) (2000+Math.random()*3000));
		}
	}
	 public static void openWebpage(String urlString) {
		    try {
		        Desktop.getDesktop().browse(new URL(urlString).toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
}


