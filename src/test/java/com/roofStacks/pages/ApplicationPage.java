package com.roofStacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class ApplicationPage extends BasePage{
    @FindBy(id = "input-candidate.cv-3")
    public WebElement sendCv;

    @FindBy(id = "input-candidate.name-6")
    public WebElement userName;

    @FindBy(id = "input-candidate.email-7")
    public WebElement email;

    @FindBy(css = ".PhoneInputInput")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendButton;

    @FindBy(css = ".hmVXnl")
    public WebElement allDone;


}
