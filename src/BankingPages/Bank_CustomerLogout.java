package BankingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bank_CustomerLogout {
	public static void Logout(WebDriver driver) throws InterruptedException {
		// LOGOUT
		driver.findElement(By.xpath("//button[contains(.,'Logout')]")).click();
		Thread.sleep(2000);
		
	}

}
