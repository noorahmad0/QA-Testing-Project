package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1 open the url from chrome and maximization
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
		//step2 click on make appointement
		driver.findElement(By.id("btn-make-appointment")).click();
		
		//step3 fill the username
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		
		//step4 fill the password
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		
		//step5 click login
		driver.findElement(By.id("btn-login")).click();
		
		
		//step6 close driver
		//driver.close();
		//driver.quit();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

	}

}
