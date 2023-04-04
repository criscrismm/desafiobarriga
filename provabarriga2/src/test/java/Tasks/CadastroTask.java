package Tasks;

   
    import org.openqa.selenium.WebDriver;

import PageObjects.CadastroPage;
import PageObjects.LoginPage;

    public class CadastroTask {
        
        private WebDriver driver;
        private CadastroPage cadastroPage;
        private LoginPage loginPage;
        
        
        public CadastroTask(WebDriver driver) {
            
            this.driver= driver;
            cadastroPage = new CadastroPage(this.driver);
            loginPage = new LoginPage(this.driver);
        }
        
        public void criarCadastro() {
            
           loginPage.getNewUserLink().click();
           cadastroPage.getNewNameInput().sendKeys("fulano da silva");
           cadastroPage.getNewEmailInput().sendKeys("fulanodasilva@mail.com");
           cadastroPage.getNewSenhaInput().sendKeys("123");
           cadastroPage.getRegisterButton().click();
           
        }     
    

}