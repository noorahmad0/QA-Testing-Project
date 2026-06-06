package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeAppointement4 {

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
				
				//step6 check the Apply for hospital readmission
				driver.findElement(By.id("chk_hospotal_readmission")).click();
				
				//step7 chose a Healthcare Program button and click
				driver.findElement(By.id("radio_program_medicaid")).click();
				
				//step8 fill the Visit Date
				driver.findElement(By.id("txt_visit_date")).sendKeys("25/05/2026");
				
				//fill the comment box
				driver.findElement(By.id("txt_comment")).sendKeys("This is a test comment");
				
				//click on Book Appointement
				driver.findElement(By.id("btn-book-appointment")).click();
				
				String text = driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
	}

}
