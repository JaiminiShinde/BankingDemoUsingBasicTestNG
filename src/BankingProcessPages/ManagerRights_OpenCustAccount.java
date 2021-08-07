package BankingProcessPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerRights_OpenCustAccount {
	public static void OpenAccount(WebDriver driver) throws InterruptedException {
		// OPEN ACCOUNT TAB
				driver.findElement(By.xpath("//button[contains(.,'Open Account')]")).click();
				Thread.sleep(5000);
				WebElement userAccountSelect = driver.findElement(By.id("userSelect"));
				Thread.sleep(3000);
				userAccountSelect.click();
				Thread.sleep(3000);
				userAccountSelect.sendKeys(Keys.ARROW_DOWN, "John Doe");
				Thread.sleep(3000);
		        WebElement selectCurrency = driver.findElement(By.id("currency"));
				Thread.sleep(3000);
				selectCurrency.click();
				Thread.sleep(3000);
				selectCurrency.sendKeys(Keys.ARROW_DOWN, "Rupee");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Process')]")).click();
				Thread.sleep(3000);
				Alert alert=driver.switchTo().alert();
				alert.accept();
				Thread.sleep(2000);
	}

}
