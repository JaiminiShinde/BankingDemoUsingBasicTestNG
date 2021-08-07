package BankingProcessPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerRights_AddCustomer {
	public static void AddCustomer(WebDriver driver) throws InterruptedException {
		// ADD CUSTOMER TAB
				driver.findElement(By.xpath("//button[contains(.,'Add Customer')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("390021");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Add Customer')]")).click();
				Thread.sleep(3000);
				// CUSTOMER ADDED ALERT BOX
				Alert alert = driver.switchTo().alert();
				Thread.sleep(3000);
				alert.accept();
				Thread.sleep(3000);
	}

}
