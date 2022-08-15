package Selenium_Website_API_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_cases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Mac\\Users\\hp\\Downloads\\Selenium\\EXE\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String e = "amir.sarfraz18@gmail.com";
		String p = "12345678";
			
		
		driver.get("https://www.gartner.com/account/signin/");
		driver.findElement(By.className("gSignInInput")).sendKeys(e);
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.id("gSignInButton")).click();
		
		//Strings for test case 1
		String at = driver.getTitle();
		String et = "Gartner Login";
		
		
		
		driver.close();

		//Test Case (Returns the name of the Web Page!)
		if(at.equalsIgnoreCase(et)){
			
			System.out.println("Test Success");
		}
		else {
			System.out.println("Test Failure");
		}

	}

}