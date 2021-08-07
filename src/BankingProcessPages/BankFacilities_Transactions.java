package BankingProcessPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankFacilities_Transactions {
	public static void printTransactions(WebDriver driver) throws InterruptedException {
		// PRINT TRANSACTIONS
				driver.findElement(By.xpath("//button[contains(.,'Transactions')]")).click();
				Thread.sleep(2000);
				String Transactions = driver.findElement(By.xpath("//div//div//div[2]//div//div[2]//table[1]")).getText();
				Thread.sleep(2000);
				System.out.println("" + Transactions + "");
				Thread.sleep(2000);
				System.out.println("................................................");

		
	}

}
