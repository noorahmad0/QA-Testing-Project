package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement Item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement Item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		Actions Builder =  new Actions(driver);
		Builder.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item5).click(Item6).keyUp(Keys.CONTROL).perform();

	}

}
