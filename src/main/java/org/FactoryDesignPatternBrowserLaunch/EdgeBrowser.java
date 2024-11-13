package org.FactoryDesignPatternBrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.logging.Logger;

public class EdgeBrowser implements Browser{

    private static final Logger logger = Logger.getLogger(EdgeBrowser.class.getName());
    @Override
    public WebDriver launchBrowser() {
        logger.info("Launching Edge Browser");
        WebDriver driver = new EdgeDriver();
        return driver;
    }
}
