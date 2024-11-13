package org.FactoryDesignPatternBrowserLaunch;

public class TestBrowser {
    public static void main(String[] args) {
        BrowserFactory.createBrowser(BrowserTypes.Chrome);
    }
}
