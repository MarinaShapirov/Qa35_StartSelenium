import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Tables {
    WebDriver wd;
    @Test
    public void w3schoolsTables(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        List<WebElement> list = wd.findElements(By.cssSelector("#customers tr"));

        System.out.println(" Row Count" + list.size());
        Assert.assertEquals(list.size(), 7);

        //last row
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println("Last row" + lastRow.getText());

        //print text Canada
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println("Element Canada: " + canada.getText());

        //col count
        List<WebElement> colList = wd.findElements(By.cssSelector("#customers tr:first-child th")); //'#customers th' is the same
        Assert.assertEquals(colList.size(), 3);
        wd.quit();







    }
}
