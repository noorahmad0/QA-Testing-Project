package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
		//way01 Link Test <a 
		//driver.findElement(By.linkText("info@katalon.com")).click();
		
		//way02
		driver.findElement(By.partialLinkText("info@")).click();

	}

}
