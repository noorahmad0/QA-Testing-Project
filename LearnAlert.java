package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//simple alert
//		driver.findElement(By.id("OKTab")).click();
//		String title = driver.switchTo().alert().getText();
//		System.out.println(title);
//		
//	    driver.switchTo().alert().accept(); //to click ok 
		
		
		//confirmation alert 
//		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.id("CancelTab")).click();
//		
//		driver.switchTo().alert().dismiss();
		
		
		//promot alet
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.id("Textbox")).click();
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();

	}

}
