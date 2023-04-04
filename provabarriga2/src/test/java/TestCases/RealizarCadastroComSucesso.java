package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CadastroTask;
import Tasks.CriarContaTask;
import Tasks.LoginTask;

public class RealizarCadastroComSucesso extends TestBase {
    
    private WebDriver driver = getDriverManager();
        
    CadastroTask cadastroTask = new CadastroTask(driver);
    LoginTask loginTask = new LoginTask(driver);
    CriarContaTask criarConta = new CriarContaTask(driver);
        
    
    @Test
    public void realizarCadastro() {
    	
    	cadastroTask.criarCadastro();
    	loginTask.fazerLogin();
    	criarConta.criarNovaConta();
   
        
    }
   
    

}