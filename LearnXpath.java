package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
		//way01
		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		
		//way02
		//driver.findElement(By.xpath("//a[text()='Make Appointment']")).click();
		
		//way03
		//driver.findElement(By.xpath("//a[contains(@id,'btn-make')]")).click();
		
		//way04
		//driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]")).click();
		
		//way05
		//driver.findElement(By.xpath("//a[starts-with(@id,'btn-make-appointment')]")).click();
		
		//way06
		//driver.findElement(By.xpath("//a[starts-with(text(),'Make Appointment')]")).click();
		
		//way07
		//driver.findElement(By.xpath("//a[ends-with(@id,'btn-make-appointment')]")).click();
		
		//way08
		//driver.findElement(By.xpath("//a[ends-with(text(),'Make Appointment')]")).click();
		

	}

}
