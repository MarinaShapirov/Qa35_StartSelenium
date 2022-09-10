import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTest {
    WebDriver wd;
    @Test
    public void PhoneBookLogin(){
        wd = new ChromeDriver();
        //config
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //login
        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href = '/login']"));
        loginTab.click();
        //fill email
        WebElement inpEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inpEmail.click();
        inpEmail.clear();
        inpEmail.sendKeys("MarinaShp@gmail.com");

        WebElement inpPsw = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inpPsw.click();
        inpPsw.click();
        inpPsw.sendKeys("Mmarina12345$");

        //login submit
        WebElement loginBtn = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginBtn.click();

        wd.quit();
    }
}
