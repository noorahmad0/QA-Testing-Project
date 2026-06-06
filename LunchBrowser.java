package day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		//way01LunchBrowser
		//driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//way02LunchBrowser
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

	}

}
