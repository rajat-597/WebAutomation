package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingControls {

	public static WebDriver driver;

	@Test(priority = 0)
	public void profile() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(1000);

//       login credential to open login page
		
		WebElement userNmae = driver.findElement(By.id("si_popup_email"));
		Thread.sleep(2000);
		userNmae.sendKeys("rksahoome140063@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("si_popup_passwd"));
		password.sendKeys("rksahoome140063@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_optim\"]/div/div/div[2]/div[3]/form/button")).click();
		
//		click on profile
		
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		

	}

}
