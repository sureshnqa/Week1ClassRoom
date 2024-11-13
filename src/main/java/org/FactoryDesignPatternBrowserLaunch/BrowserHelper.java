package org.FactoryDesignPatternBrowserLaunch;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserHelper {

    public static WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void maximizeBrowsser(){
        driver.manage().window().maximize();
    }

    public static void setImplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void loadURL(){
        driver.get("https://www.google.com");
    }
}
