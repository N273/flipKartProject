package page_Element;

import com.test.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorHelper extends Hooks
{ WebDriver driver;
    public void SearchTest(String items){

        driver.findElements(By.xpath("//input[@placeholder='Search for products, brands and more']"));
    }
}
