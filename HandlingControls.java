package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
//		 update personal details		
		
		driver.findElement(By.id("personal_details")).click();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("fullName"));
		name.clear();
		Thread.sleep(1000);
		name.sendKeys("Rajat Kumar");
		Thread.sleep(2000);

		
		WebElement year = driver.findElement(By.className("ngx-dropdown-button"));
		year.click();
		WebElement act = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[1]/div[2]/ngx-select-dropdown/div/div/div/input"));
		act.sendKeys("0-2 years");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		
		WebElement yoe= driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[1]/div[3]/ngx-select-dropdown/div/button"));
		yoe.click();
		WebElement des = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[1]/div[3]/ngx-select-dropdown/div/div/div/input"));
		des.sendKeys("IT-Software / Software Services");
		Thread.sleep(2000);
		des.sendKeys(Keys.ARROW_DOWN);
		des.sendKeys(Keys.ENTER);
		
		WebElement position = driver.findElement(By.name("designation"));
		position.clear();
		Thread.sleep(1000);
		position.sendKeys("Analyst");
		Thread.sleep(2000);

		
//      time to contact for weekdays and weekend
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[1]/ngx-select-dropdown/div/button")).click();
		WebElement timezone = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[1]/ngx-select-dropdown/div/div/div/input"));
		timezone.sendKeys("India-IST-Asia/Kolkata");
		Thread.sleep(2000);
		timezone.sendKeys(Keys.ARROW_DOWN);
		timezone.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/ngx-select-dropdown/div/button")).click();
		WebElement weekdaysfm = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/ngx-select-dropdown/div/div/div/input"));
		weekdaysfm.sendKeys("10:00 AM");
		Thread.sleep(2000);
		weekdaysfm.sendKeys(Keys.ARROW_DOWN);
		weekdaysfm.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/ngx-select-dropdown/div/button")).click();
		WebElement weekdaysto = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/ngx-select-dropdown/div/div/div/input"));
		weekdaysto.sendKeys("01:00 PM");
		Thread.sleep(2000);
		weekdaysto.sendKeys(Keys.ARROW_DOWN);
		weekdaysto.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[3]/div[1]/ngx-select-dropdown/div/button")).click();
		WebElement weekendfr = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[3]/div[1]/ngx-select-dropdown/div/div/div/input"));
		weekendfr.sendKeys("11:00 AM");
		Thread.sleep(2000);
		weekendfr.sendKeys(Keys.ARROW_DOWN);
		weekendfr.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/ngx-select-dropdown/div/button")).click();
		WebElement weekendto = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/ngx-select-dropdown/div/div/div/input"));
		weekendto.sendKeys("01:00 PM");
		Thread.sleep(2000);
		weekendto.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		weekendto.sendKeys(Keys.ENTER);
	}

}
