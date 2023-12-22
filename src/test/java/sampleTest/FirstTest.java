package sampleTest;

import factory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    public static void main(String args[]) {
        WebDriver driver= DriverFactory.initializeDriver("edge");
        driver.get("https://www.automationzone.in");
        driver.quit();
    }
    //the commit feature2
}

