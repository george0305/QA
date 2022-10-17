
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {




  public static void main(String[] args){
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("website");

     homePage home = new homePage(driver);

     checkNoOfItems items = new checkNoOfItems(driver);

     LowestPrice price = new LowestPrice(driver);

     home.addtoCart();

     items.checkItems();



  }

}
