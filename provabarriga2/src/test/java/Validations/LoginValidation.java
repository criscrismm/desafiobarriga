
package Validations;


import org.openqa.selenium.WebDriver;



import PageObjects.LoginPage;


public class LoginValidation {

	private WebDriver driver;
	private LoginPage loginPage;

	public LoginValidation(WebDriver driver) {

		this.driver = driver;
		loginPage = new LoginPage(this.driver);
	}

}
