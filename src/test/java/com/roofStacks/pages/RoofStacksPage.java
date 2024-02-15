package com.roofStacks.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;
import java.util.List;

public class RoofStacksPage extends BasePage{

    @FindBy(linkText = "Career")
    public WebElement careerLink;

    @FindBy(css = ".nav-link")
    public List<WebElement> navBar;





}
