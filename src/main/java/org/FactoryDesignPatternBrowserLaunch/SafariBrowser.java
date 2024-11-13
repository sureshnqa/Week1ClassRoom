package org.FactoryDesignPatternBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.logging.Logger;

public class SafariBrowser implements Browser{

    private static final Logger logger = Logger.getLogger(SafariBrowser.class.getName());
    @Override
    public WebDriver launchBrowser() {
        logger.info("Launching Safari Browser");
        WebDriver driver = new SafariDriver();
        return driver;
    }
}
