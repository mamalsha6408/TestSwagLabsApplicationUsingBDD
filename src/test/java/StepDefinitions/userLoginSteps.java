package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userLoginSteps {

    @Given("user in user login page")
    public void user_in_user_login_page() {
        System.out.println("Inside step - user in user login page");
    }

    @Given("user enter username")
    public void user_enter_username() {
        System.out.println("Inside step - user enter username");
    }

    @Given("user enter password")
    public void user_enter_password() {
        System.out.println("Inside step - user enter password");
    }

    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("Inside step - user click login button");
    }

    @Then("user navigated to products page")
    public void user_navigated_to_products_page() {
        System.out.println("Inside step - user navigated to products page");
    }


}
