package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		driver.manage().window().maximize();
		
		//step2 click on make appointement
		driver.findElement(By.id("btn-make-appointment")).click();
		
		//step3 fill the username
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		
		//step4 fill the password
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		
		//step5 click login
		driver.findElement(By.id("btn-login")).click();
		
		//step6 check the Apply for hospital readmission
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		
		
		//choose from the ddl
		WebElement CCDDL = driver.findElement(By.id("combo_facility"));
		Select dd =new Select(CCDDL);
		
		//way01 by index
		//dd.selectByIndex(1);
		
		//way02 by value
		//dd.selectByValue("Tokyo CURA HealthCare center");
		
		//way03 by text
		dd.deselectByVisibleText("Tokyo CURA HealthCare center");
		
		//step7 chose a Healthcare Program button and click
		//driver.findElement(By.id("radio_program_medicaid")).click();
		
		//step8 fill the Visit Date
		//driver.findElement(By.id("txt_visit_date")).sendKeys("25/05/2026");
		
		//fill the comment box
	    //driver.findElement(By.id("txt_comment")).sendKeys("This is a test comment");
		
		//click on Book Appointement
		//driver.findElement(By.id("btn-book-appointment")).click();
		
	

	}

}
