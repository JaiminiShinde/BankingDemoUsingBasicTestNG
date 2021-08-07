package BankingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bank_customerLogin {
	public static void CutomerLogin(WebDriver driver) throws InterruptedException {

		// CUSTOMER LOGIN BUTTON
		driver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
		Thread.sleep(3000);

		// USER SELECTION
		WebElement userSelect = driver.findElement(By.id("userSelect"));
		Thread.sleep(2000);
		userSelect.click();
		Thread.sleep(2000);
		userSelect.sendKeys(Keys.ARROW_DOWN,"Harry Potter");
		Thread.sleep(2000);
		userSelect.click();
		Thread.sleep(2000);

		// CLICK LOGIN
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(3000);
		String WelcomeUser = driver.findElement(By.xpath("//div//div/div[2]//div//div[1]//strong")).getText();
		Thread.sleep(2000);
		System.out.println("" + WelcomeUser);
		System.out.println("................................................");

		// ACCOUNT SELECTION
		WebElement accountSelect = driver.findElement(By.id("accountSelect"));
		accountSelect.click();
		Thread.sleep(2000);
		accountSelect.sendKeys(Keys.ARROW_DOWN,"1005");
		Thread.sleep(2000);
		accountSelect.click();
		Thread.sleep(2000);

	}

}
