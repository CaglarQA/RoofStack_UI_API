package com.roofStacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchBoxPage extends BasePage{
    @FindBy(id = "APjFqb")
    public WebElement searchBox;

    @FindBy(className = "sy4vM")
    public WebElement popUp;

    @FindBy(xpath = "//cite")
    public List<WebElement> resultLinks;


}
