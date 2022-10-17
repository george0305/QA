import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class checkNoOfItems {
    private static WebDriver driver;

    public checkNoOfItems(WebDriver driver){
        this.driver = driver;
    }

    public void checkItems() {

        WebElement cartBtn = driver.findElement(By.xpath("/html/body/div/div/div[1]/header/nav/div/ul/li[1]/a"));
        cartBtn.click();
        driver.navigate().refresh();

        List<WebElement> itemList = driver.findElements(By.className("cart_item"));
        System.out.println("Items in cart: "+itemList.size());

        if(itemList.size() == 4){
            LowestPrice.priceSort();
        }

    }
}
