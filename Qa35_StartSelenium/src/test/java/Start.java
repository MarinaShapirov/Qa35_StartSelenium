import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
        // open browser
        wd=new ChromeDriver();
        //go to phonebook
        //  wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //whiout history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //with history

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        //close browser
        wd.close();
        //  wd.quit();
    }

    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/marin/Downloads/index.html");

        // find items
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("a[href='#item4']"));
        WebElement item4_1 = wd.findElement(By.cssSelector("a[href='#item4']"));
        //find element of form
        //name
        WebElement name = wd.findElement(By.cssSelector("[name = 'name']"));
        //surname
        WebElement surename = wd.findElement(By.cssSelector("[name = 'surename']"));;
        //send
        WebElement send = wd.findElement(By.cssSelector(".btn"));
        WebElement send2 = wd.findElement(By.className("btn"));

        // ****** find from table
        List<WebElement> list = wd.findElements(By.cssSelector("tbody :last-child"));
        WebElement poland = list.get(1);
        String text = poland.getText();
        System.out.println(text);

        wd.quit();



    }

}
