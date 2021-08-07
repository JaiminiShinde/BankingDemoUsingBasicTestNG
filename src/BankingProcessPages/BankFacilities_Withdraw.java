package BankingProcessPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankFacilities_Withdraw {
	public static void Withdraw(WebDriver driver) throws InterruptedException {
		// WITHDRAW
				System.out.println("Withdrawal Initiated");
				driver.findElement(By.xpath("//button[contains(.,'Withdrawl')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@ng-model='amount']")).sendKeys("2000");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);

				// MESSAGE & INFORMATION
				String WithdrawMsg = driver.findElement(By.xpath("//span[contains(.,'Transaction successful')]")).getText();
				Thread.sleep(2000);
				System.out.println("" + WithdrawMsg);
				Thread.sleep(2000);
				String AccountInfoW = driver.findElement(By.xpath("(//div[contains(@ng-hide,'noAccount')])[1]")).getText();
				Thread.sleep(2000);
				System.out.println("" + AccountInfoW);
				Thread.sleep(2000);
				System.out.println(".................................................");

	}

}
