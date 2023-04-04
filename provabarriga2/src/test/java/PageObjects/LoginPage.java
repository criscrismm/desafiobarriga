package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    
    private WebDriver driver;
    
    public LoginPage(WebDriver driver) {
      
      this.driver = driver;        
  }
    
	public WebElement getLogoText() {
		return driver.findElement(By.className("navbar-brand"));
	}	
	    
    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));     
    } 

    public WebElement getPasswordInput() {
    	return driver.findElement(By.id("senha"));
    }
    
    public WebElement getEnterButtom() {
        return driver.findElement(By.className("btn-primary"));
    }
    
	public WebElement getNewUserLink() {
		return driver.findElement(By.xpath("//a[@href='/cadastro']"));
	}
    
    
}
