package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		//Learn single DDL
		WebElement CourseDDL = driver.findElement(By.id("course"));
		Select dd= new Select(CourseDDL);
		
		//way01 by index
		//dd.selectByIndex(1);
		
		//way02 by value
		//dd.selectByValue("python");
		
		//way03 by text
		dd.selectByVisibleText("Dot Net");
		
		//Learn Multi DDL
		WebElement MultiDDL = driver.findElement(By.id("ide"));
		Select ide= new Select(MultiDDL);
		
		ide.selectByIndex(0);
		ide.selectByIndex(1);
		ide.selectByIndex(2);
		ide.deselectByIndex(2);
		
		

	}

}
