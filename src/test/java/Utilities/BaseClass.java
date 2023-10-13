package Utilities;

import PageObjects.ProductsPage;
import PageObjects.UserLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static FileInputStream fi;
    public static Properties prop;

    public static UserLoginPage userLoginPage;

    public static ProductsPage productsPage;

    public static void setUpDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
            driver=new ChromeDriver();
//            WebDriverManager.chromedriver().setup();
//            System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
//            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait=new WebDriverWait(driver,30);
        }
    }

    public static void tearDownDriver(){
        if(driver!=null){
            driver=null;
        }
    }

    public static void setupPropertiesFiles() throws IOException {
        fi=new FileInputStream("src/test/resources/testData.properties");
        prop=new Properties();
        prop.load(fi);

    }


}
