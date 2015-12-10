package com.outhreeit.quickrbooks.SeleniumFramework;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ddelaney on 12/9/2015.
 */
public class SeleniumSettings {
    private WebDriver driver;

    //ToDo: Change the path to the drivers in your program.
    private String CHROME_MAC = "../Drivers/chromedrivermac";
    private String CHROME_WIN = "../Drivers/chromedriver.exe";
    private String CHROME_LNX = "..Drivers/chromedriverlinux";

    public SeleniumSettings(){
        if (SystemUtils.IS_OS_MAC)
            System.setProperty("webdriver.chrome.driver", CHROME_MAC);
        if (SystemUtils.IS_OS_WINDOWS)
            System.setProperty("webdriver.chrome.driver", CHROME_WIN);
        if (SystemUtils.IS_OS_LINUX)
            System.setProperty("webdriver.chrome.driver", CHROME_LNX);

        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }
}
