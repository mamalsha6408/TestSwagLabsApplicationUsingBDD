package StepDefinitions;

import PageObjects.ProductsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;

public class productPageSteps extends BaseClass {

    @Then("user select price low to high from sort list")
    public void user_select_price_low_to_high_from_sort_list() {
        productsPage=new ProductsPage();
        productsPage.select_price_low_to_high();
    }

    @Then("user select add to cart button of backpack")
    public void user_select_add_to_cart_button_of_backpack() {
        productsPage.backpack_add_to_cart();
    }

}
