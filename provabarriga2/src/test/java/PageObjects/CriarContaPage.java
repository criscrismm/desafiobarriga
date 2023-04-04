package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CriarContaPage {
    
private WebDriver driver;
    
    public CriarContaPage(WebDriver driver) {
       this.driver = driver;        
    }
    
    
    public WebElement getLogadoText() {
        return driver.findElement(By.className("alert alert-success"));
    }
    
    public WebElement getMenuAccountsButtom() {

        return driver.findElement(By.className("dropdown-toggle"));
    }    
        
    public WebElement getAddAccountLink() {

         return driver.findElement(By.xpath("//a[@href='/addConta'"));
     }   
        
        
   public WebElement NameAccountInput() {   
       return driver.findElement(By.className("form-control"));
   } 

   
   public WebElement SaveAccountButton() {
       return driver.findElement(By.className("btn-primary"));
     
   }
   
   
   
}

