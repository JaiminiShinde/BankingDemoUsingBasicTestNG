package BankingProcessPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerRights_Customer {
	public static void CustomerTab(WebDriver driver) throws InterruptedException {
		//CUSTOMERS TAB
				driver.findElement(By.xpath("//button[contains(.,'Customers')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harry");
				Thread.sleep(4000);
				WebDriverWait Delete =new WebDriverWait(driver,20);
				Delete.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='deleteCust(cust)'][contains(.,'Delete')]")));
				driver.findElement(By.xpath("//button[@ng-click='deleteCust(cust)'][contains(.,'Delete')]")).click();
				Thread.sleep(3000);
				System.out.println("Customer deleted successfully");
				driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).clear();
				Thread.sleep(3000);
				String CustomerInfo=driver.findElement(By.xpath("//div//table")).getText();
				Thread.sleep(3000);
				System.out.println(""+CustomerInfo);
				Thread.sleep(3000);

	}

}
