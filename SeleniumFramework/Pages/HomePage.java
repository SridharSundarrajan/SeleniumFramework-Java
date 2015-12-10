package com.outhreeit.quickrbooks.SeleniumFramework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ddelaney on 12/9/2015.
 */
public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        goTo("http://localhost:8080");
    }

}
