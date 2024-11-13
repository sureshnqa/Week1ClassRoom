package org.FactoryDesignPatternBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class ChromeBrowser implements Browser{

    private static final Logger logger = Logger.getLogger(ChromeBrowser.class.getName());
    @Override
    public WebDriver launchBrowser() {
        logger.info("Launching Chrome Browser");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
