package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;

public class UserLoginPage extends BaseClass {

    private By tf_username=By.id("user-name");
    private By tf_password=By.id("password");
    private By btn_login=By.id("login-button");

    public void enterUsername(String username){
        driver.findElement(tf_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(tf_password).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(btn_login).click();
    }

    public void oneStepLogin(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

}
