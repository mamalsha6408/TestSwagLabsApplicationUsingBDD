package StepDefinitions;

import PageObjects.UserLoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class userLoginSteps extends BaseClass {

    @Given("user in user login page")
    public void user_in_user_login_page() {
        System.out.println("Inside step - user in user login page");

        userLoginPage=new UserLoginPage();
        driver.get(prop.getProperty("login_url"));
        Assert.assertEquals(prop.getProperty("user_login_title"),driver.getTitle());

    }

    @Given("user enter username")
    public void user_enter_username() {
        System.out.println("Inside step - user enter username");

        userLoginPage.enterUsername(prop.getProperty("user_name"));

    }

    @Given("user enter password")
    public void user_enter_password() {
        System.out.println("Inside step - user enter password");

        userLoginPage.enterPassword(prop.getProperty("user_password"));

    }

    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("Inside step - user click login button");

        userLoginPage.clickLoginButton();

    }

    @Then("user navigated to products page")
    public void user_navigated_to_products_page() {
        System.out.println("Inside step - user navigated to products page");

        driver.getPageSource().contains("Products");

    }


}
