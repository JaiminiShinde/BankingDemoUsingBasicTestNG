package BankingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bank_managerLogin {
	public static void ManagerLogin(WebDriver driver) throws InterruptedException {
		// MANAGER LOGIN
		driver.findElement(By.xpath("//button[contains(.,'Bank Manager Login')]")).click();
		Thread.sleep(3000);

	}

}
