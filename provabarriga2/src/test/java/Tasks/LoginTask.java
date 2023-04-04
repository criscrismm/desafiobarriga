package Tasks;
    
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;

    public class LoginTask {
        
        private WebDriver driver;
        private LoginPage loginPage;
        
       public LoginTask(WebDriver driver) {
            
            this.driver= driver;
            loginPage = new LoginPage(this.driver);
            
        }
        
           
        
        public void fazerLogin() {
           
            loginPage.getEmailInput().sendKeys("fulanodasilva@mail.com");
            loginPage.getPasswordInput().sendKeys("123");
            loginPage.getEnterButtom().click();
            
        }            

}
