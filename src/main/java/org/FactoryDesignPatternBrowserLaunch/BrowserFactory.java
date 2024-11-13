package org.FactoryDesignPatternBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {


    public static WebDriver driver;

    public static void createBrowser(BrowserTypes browserName){

       // prepareBrowser();
        switch (browserName){
            case Chrome:
                driver = new ChromeBrowser().launchBrowser();
                break;
            case Edge:
                driver = new EdgeBrowser().launchBrowser();
                break;
            default:
                throw new IllegalArgumentException("Invalid Browser");

        }
        prepareBrowser();
    }

    public static void prepareBrowser(){
        BrowserHelper bh = new BrowserHelper(driver);
        BrowserHelper.maximizeBrowsser();
        BrowserHelper.setImplicitWait();
        BrowserHelper.loadURL();
    }
}
