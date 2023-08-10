package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class MainApp {
    static WebDriver driver;
    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        CartPage cartPage = new CartPage();
        cartPage.addToCart();

        driver.quit();

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}