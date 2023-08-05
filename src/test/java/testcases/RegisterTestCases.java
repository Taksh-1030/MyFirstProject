package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObject;
import resources.BaseClass;

public class RegisterTestCases extends BaseClass {

	@Test
	public void verifyRegister() throws IOException {

		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");


		RegisterPageObject obj=new RegisterPageObject(driver);

		driver.manage().window().maximize();

		obj.NavigatetoMyAccount().click();
		obj.NevigatetoRegister().click();
		obj.FirstName().sendKeys("Taksh");
		obj.LastName().sendKeys("Chouhan");
		obj.Email().sendKeys("tashu.1030@gmail.com");
		obj.telephone().sendKeys("7249185773");
		obj.password().sendKeys("taksh1030");
		obj.Confirmpassword().sendKeys("taksh1030");
		obj.RadioBtn().click();
		obj.checkbox().click();
		obj.submit().click();


	}
	}
