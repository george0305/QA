
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class homePage {
    private static WebDriver driver;


    public homePage(WebDriver driver){
        this.driver = driver;
    }
    public void addtoCart(){
        WebElement cart = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[2]/ul/li[1]/div/a[2]"));
        cart.click();
        WebElement cart2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[2]/ul/li[2]/div/a[2]"));
        cart2.click();
        WebElement cart3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[2]/ul/li[3]/div/a[2]"));
        cart3.click();
        WebElement cart4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div[2]/ul/li[4]/div/a[2]"));
        cart4.click();
    }


}
