package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumExample {

    private SeleniumConfig config;

    private String url = "http://www.google.com";

    public SeleniumExample(){
        config = new SeleniumConfig();
        config.getDriver().get(url);
    }

    public void closeWindow(){
        config.getDriver().close();
    }

    public String getTitle(){
        return config.getDriver().getTitle();
    }

    public void query(String search){
        WebElement searchWindow = config.getDriver().findElement(By.name("q"));
        searchWindow.sendKeys("Cheese!");
        searchWindow.submit();
    }

    public WebDriver getDriver() {
        return this.config.getDriver();
    }

    public List<WebElement> collectResults(){
        List<WebElement> results = getDriver().findElements(By.cssSelector("h3 .r"));
        if(results.isEmpty()){
            return null;
        } else {
            return results;
        }
    }
}
