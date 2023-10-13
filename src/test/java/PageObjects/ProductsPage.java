package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BaseClass {

    private By sel_sort=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");

    private By btn_backpack=By.id("add-to-cart-sauce-labs-backpack");

    Select select;

    public void select_Name_A_to_Z(){
        select =new Select(driver.findElement(sel_sort));
        select.selectByVisibleText("Name (A to Z)");
    }

    public void select_Name_Z_to_A(){
        select =new Select(driver.findElement(sel_sort));
        select.selectByVisibleText("Name (Z to A)");
    }

    public void select_price_low_to_high(){
        select =new Select(driver.findElement(sel_sort));
        select.selectByVisibleText("Price (low to high)");
    }

    public void select_price_high_to_low(){
        select =new Select(driver.findElement(sel_sort));
        select.selectByVisibleText("Price (high to low)");
    }

    public void backpack_add_to_cart(){
        driver.findElement(btn_backpack).click();
    }



}
