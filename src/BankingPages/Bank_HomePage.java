package BankingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bank_HomePage {
	public static void HomePage(WebDriver driver) throws InterruptedException {
		// HOMEPAGE
				driver.findElement(By.xpath("//button[contains(.,'Home')]")).click();
				Thread.sleep(2000);

		
	}

}
