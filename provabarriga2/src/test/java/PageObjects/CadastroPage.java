package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {

	private WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}


	
	public WebElement getNewNameInput() {
		return driver.findElement(By.id("nome"));
	}

	public WebElement getNewEmailInput() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getNewSenhaInput() {
		return driver.findElement(By.id("senha"));
	}

	public WebElement getRegisterButton() {
		return driver.findElement(By.className("btn-primary"));
	}

}
