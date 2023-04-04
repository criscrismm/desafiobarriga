package Tasks;

import org.openqa.selenium.WebDriver;
import PageObjects.CriarContaPage;

public class CriarContaTask {
	
	private WebDriver driver;
	private CriarContaPage criarContaPage;
	
    public CriarContaTask(WebDriver driver) {
        
        this.driver= driver;
        criarContaPage = new CriarContaPage(this.driver);
        
    }
    
    public void criarNovaConta() {
       
    	criarContaPage.getMenuAccountsButtom().click();
    	criarContaPage.getAddAccountLink().click();
    	criarContaPage.NameAccountInput().sendKeys("Receita1");
    	criarContaPage.SaveAccountButton().click();
    	
        
    }
	
	

}
