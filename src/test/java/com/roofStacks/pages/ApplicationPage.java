package com.roofStacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class ApplicationPage extends BasePage{
    @FindBy(id = "3")
    public WebElement sendCv;

    @FindBy(id = "6")
    public WebElement userName;

    @FindBy(id = "7")
    public WebElement password;

    @FindBy(css = ".PhoneInputInput")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendButton;


}
