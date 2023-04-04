package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriarMovimentacaoPage {
    
    
 private WebDriver driver;
    
    public CriarMovimentacaoPage(WebDriver driver) {
      
      this.driver = driver;        
  }
    public WebElement getMovementCreateLink() {
    	return driver.findElement(By.xpath("//a[@href='/movimentacao']"));
    }
    
    public WebElement getTypeMovement() {
    	return driver.findElement(By.id("tipo"));
    }
    
    
    public WebElement getMovementDateInput() {
        return driver.findElement(By.id("data_transacao"));
    }
    
    public WebElement getPaymentDateInput() {
        return driver.findElement(By.id("data_pagamento"));
    }

    public WebElement getDescriptionInput() {
        return driver.findElement(By.id("descricao"));
    }
    
    public WebElement getInterestedInput() {
        return driver.findElement(By.id("interessado"));
    }
    
    public WebElement getValueInput() {
        return driver.findElement(By.id("valor"));
    }
    
    public WebElement getSituationChoose() {
        return driver.findElement(By.id("status_pago"));
    }
    
    
    public WebElement getSaveButton() {
        return driver.findElement(By.className("btn btn-primary"));
    } 
    
}