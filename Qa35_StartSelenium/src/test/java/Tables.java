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

    @Test
    public void homeWorkTable(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/marin/Downloads/index.html");

        // print count rows in table
        //List<WebElement> list = wd.findElements(By.cssSelector("#country-table>tbody>tr"));
        List<WebElement> list = wd.findElements(By.cssSelector("tr"));
        System.out.println("Rows Count:" + list.size());
        Assert.assertEquals(list.size(), 4);

        List<WebElement> list_xph = wd.findElements(By.xpath("//tr"));
        System.out.println("xPath: Rows Count:" + list_xph.size());
        Assert.assertEquals(list_xph.size(), 4);



        //print last row
        //WebElement lastRow = wd.findElement(By.cssSelector("#country-table>tbody>tr:last-child"));
        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        System.out.println("Last row:" + lastRow.getText());

        WebElement lastRow_xph = wd.findElement(By.xpath("//tr[last()]"));
        System.out.println("xPath: Last row:" + lastRow_xph.getText());



        // print count of columns
        //List<WebElement> colList = wd.findElements(By.cssSelector("tbody>tr:first-child td"));
        List<WebElement> colList = wd.findElements(By.cssSelector("tr:first-child td"));
        System.out.println("Col Count:" + colList.size());
        Assert.assertEquals(colList.size(), 3);

        List<WebElement> colList_xph = wd.findElements(By.xpath("//tr[1]/td"));
        System.out.println("xPath: Col Count:" + colList_xph.size());
        Assert.assertEquals(colList_xph.size(), 3);



        // print text Israel
        //WebElement textEl = wd.findElement(By.cssSelector("tbody>tr:nth-child(2)>td:nth-child(2)"));
        WebElement textEl = wd.findElement(By.cssSelector("tr:nth-child(2)>td:nth-child(2)"));
        System.out.println("Text:" + textEl.getText());

        WebElement textEl_xph = wd.findElement(By.xpath("//*[text()='Israel']"));
        System.out.println("xPath: Text:" + textEl_xph.getText());

        wd.quit();
    }
}