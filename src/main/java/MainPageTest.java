import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageTest {
    public static void main(String[] args){
        WebDriver driver = new SafariDriver();

        String URL = "http://livescore.com";
        driver.get(URL);

        WebElement el = driver.findElement(By.name("q"));

        el.sendKeys("Cheese!");
        el.submit();

        System.out.println("Title of the page: " + driver.getTitle());
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>(){

            @NullableDecl
            public Boolean apply(@NullableDecl WebDriver webDriver) {
                return webDriver.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
        driver.close();

        AnotherTest.printLine();
        // yes

    }
}
