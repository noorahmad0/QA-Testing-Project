package day01;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowserEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		
		//way01 
		//driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//way02
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

	}

}
