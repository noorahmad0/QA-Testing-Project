package day06;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Try it Yourself »")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		
	//	getWindowHandle: Return current active windows ref and its return
	//	getWindowHandleIs: return all windows ref
		
	//  SwitchWindows
		Set<String> allwindow = driver.getWindowHandles();
	//	System.out.println(allwindow);
		List<String> wind= new ArrayList(allwindow);
		driver.switchTo().window(wind.get(1));
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		

	}

}
