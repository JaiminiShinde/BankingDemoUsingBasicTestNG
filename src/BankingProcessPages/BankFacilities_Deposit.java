package BankingProcessPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankFacilities_Deposit {
	public static void Deposit(WebDriver driver) throws InterruptedException {
		// DEPOSIT
				System.out.println("Deposit Initiated");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(.,'Deposit')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("10000");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Deposit')]")).click();
				Thread.sleep(2000);

				// MESSAGE & INFORMATION
				String DepositMsg = driver.findElement(By.xpath("//span[contains(.,'Deposit Successful')]")).getText();
				Thread.sleep(2000);
				System.out.println("" + DepositMsg);
				Thread.sleep(2000);
				String AccountInfo = driver.findElement(By.xpath("(//div[contains(@ng-hide,'noAccount')])[1]")).getText();
				Thread.sleep(2000);
				System.out.println("" + AccountInfo);
				Thread.sleep(2000);
				System.out.println("................................................");

	}

}
