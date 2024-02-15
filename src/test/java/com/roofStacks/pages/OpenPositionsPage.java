package com.roofStacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpenPositionsPage extends BasePage{

    @FindBy(xpath = "//label")
    public List<WebElement> departments;

    @FindBy(css = ".sc-6exb5d-1")
    public List<WebElement> openPositions;


}
