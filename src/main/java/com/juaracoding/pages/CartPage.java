package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;
    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "login")
    WebElement btnLogin;

    @FindBy(className = "custom-logo")
    WebElement productPage;

    @FindBy(linkText = "TOKYO TALKIES")
    WebElement product;

    @FindBy(className = "single_add_to_cart_button")
    WebElement btnAddToCart;

    @FindBy(className = "icon_bag_alt")
    WebElement btnCart;


    // Custom Method
    public void addToCart(){
//        username.sendKeys("putri");
//        password.sendKeys("999Putri!");
//        btnLogin.click();
//
//        if (driver.findElements(By.className("woocommerce-error")).isEmpty()) {
//            System.out.println("Login successful!");
//        } else {
//            System.out.println("Login failed!");
//        }

        productPage.click();
        product.click();
        btnAddToCart.click();
        btnCart.click();

        // Buat assert menggunakan if
        // Cek apakah ada elemen dengan class "cart-empty"
        if (driver.findElements(By.className("cart-empty")).isEmpty()) {
            System.out.println("Add to Cart Berhasil");
        } else {
            System.out.println("Add to Cart Gagal");
        }



    }

}

