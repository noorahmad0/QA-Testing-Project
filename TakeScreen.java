package day05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		
		
		// Take a Screenshot
		// Take a snap
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\pc\\OneDrive\\Desktop\\Automation noor\\AutomationProject\\images\\1.png");
		//File des = new File ("./images/1.png");  // . >> current project
		FileUtils.copyFile(src, des);
		
		
		
		
	


	}

}
