import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LowestPrice {
    private static WebDriver driver;


    public LowestPrice(WebDriver driver) {
        this.driver = driver;
    }

    public static void priceSort() {


        WebElement itemList1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/table/tbody/tr[1]/td[4]/span"));
        String item1 = itemList1.getText();
        WebElement itemList2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/table/tbody/tr[2]/td[4]/span"));
        String item2 = itemList2.getText();
        WebElement itemList3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/table/tbody/tr[3]/td[4]/span"));
        String item3 = itemList3.getText();
        WebElement itemList4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form/table/tbody/tr[4]/td[4]/span"));
        String item4 = itemList4.getText();

        List<String> prices = new ArrayList<>();
        prices.add(item1);
        prices.add(item2);
        prices.add(item3);
        prices.add(item4);

        float[] ar = new float[4];


        for (int i = 0; i < 4; i++) {
            String replace = prices.get(i).replace("$", " ").replace(",", "").replaceAll("\\s", "");
            System.out.println(replace);


            ar[i] = Math.round(Float.parseFloat(replace));

        }
        float min = ar[0];
            for (int i = 1; i < prices.size(); i++) {
                if (Math.round(ar[i]) < min) {
                    min = ar[i];
                }
            }
            System.out.println("min e :"+min);
        }
    }

