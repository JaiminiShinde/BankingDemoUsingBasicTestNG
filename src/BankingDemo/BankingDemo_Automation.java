package BankingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BankingPages.Bank_CustomerLogout;
import BankingPages.Bank_HomePage;
import BankingPages.Bank_customerLogin;
import BankingPages.Bank_managerLogin;
import BankingProcessPages.BankFacilities_Deposit;
import BankingProcessPages.BankFacilities_Transactions;
import BankingProcessPages.BankFacilities_Withdraw;
import BankingProcessPages.ManagerRights_AddCustomer;
import BankingProcessPages.ManagerRights_Customer;
import BankingProcessPages.ManagerRights_OpenCustAccount;

public class BankingDemo_Automation {

	public String baseUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	String driverPath = "./Drivers/chromedriver.exe";
	public WebDriver driver;
	String selectLoginType = "Customer Login";
	String selectBankFacility = "Deposit";

	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(baseUrl);
		Thread.sleep(3000);
	}

	@Test
	public void BankingDemo() throws InterruptedException {
		switch (selectLoginType) {
		// CUSTOMER SWITCH CASE
		case "Customer Login":
			System.out.println("Customer Login Initiated...");
			Bank_customerLogin.CutomerLogin(driver);
			switch (selectBankFacility) {
			case "Deposit":
				System.out.println("Deposit facility Initiated...");
				BankFacilities_Deposit.Deposit(driver);
				Bank_CustomerLogout.Logout(driver);
				Bank_HomePage.HomePage(driver);
				break;
			case "Withdraw":
				System.out.println("Withdraw facility Initiated...");
				BankFacilities_Withdraw.Withdraw(driver);
				Bank_CustomerLogout.Logout(driver);
				Bank_HomePage.HomePage(driver);
				break;
			case "Transaction":
				System.out.println("Transaction print facility Initiated...");
				BankFacilities_Transactions.printTransactions(driver);
				Bank_CustomerLogout.Logout(driver);
				Bank_HomePage.HomePage(driver);
				break;

			}
			break;

		// MANAGER SWITCH CASE
		case "Manager Login":
			System.out.println("Manager Login Initiated...");
			Bank_managerLogin.ManagerLogin(driver);
			switch (selectBankFacility) {
			case "Add Customer":
				System.out.println("Add Customer Initiated...");
				ManagerRights_AddCustomer.AddCustomer(driver);
				Bank_HomePage.HomePage(driver);
				break;
			case "Open Account":
				System.out.println("Opening New Account Initiated...");
				ManagerRights_OpenCustAccount.OpenAccount(driver);
				Bank_HomePage.HomePage(driver);
				break;
			case "Customer Details":
				System.out.println("Customer Tab Initiated...");
				ManagerRights_Customer.CustomerTab(driver);
				Bank_HomePage.HomePage(driver);
				break;

			}
			break;

		}

	}

	@AfterTest
	public void CloseBrowser() {
		if (selectLoginType == "Customer Login") {
			System.out.println("Customer Test Complete");

		} else {
			System.out.println("Manager Test Complete");
		}

		driver.quit();
	}

}
