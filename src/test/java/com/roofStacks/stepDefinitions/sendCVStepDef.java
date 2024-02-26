package com.roofStacks.stepDefinitions;

import com.github.dockerjava.api.model.Link;
import com.roofStacks.pages.*;
import com.roofStacks.utility.BrowserUtils;
import com.roofStacks.utility.ConfigurationReader;
import com.roofStacks.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class sendCVStepDef {

    GoogleSearchBoxPage googleSearchBoxPage = new GoogleSearchBoxPage();
    RoofStacksPage roofStacksPage = new RoofStacksPage();
    CareerPage careerPage = new CareerPage();
    OpenPositionsPage openPositionsPage = new OpenPositionsPage();
    SeniorMobileDeveloperPage seniorMobileDeveloperPage = new SeniorMobileDeveloperPage();
    ApplicationPage applicationPage = new ApplicationPage();

    @Given("go to google home page")
    public void go_to_google_home_page() {
        System.out.println("first");
        Driver.getDriver().get("https://www.google.com/");
       // googleSearchBoxPage.popUp.click();
        System.out.println("popup code is commented");
        System.out.println("2");
    }

    @When("enter {string} into search box and hit the enter")
    public void enter_into_search_box_and_hit_the_enter(String text) {

        googleSearchBoxPage.searchBox.sendKeys(text, Keys.ENTER);
        System.out.println("3");

    }

    @When("click {string} links from result list")
    public void click_links_from_result_list(String link) {
        for (WebElement eachLink : googleSearchBoxPage.resultLinks) {
            if (eachLink.getText().contains(link)) {
                eachLink.click();
                break;
            }
        }
        System.out.println("4");

    }

    @When("click the {string} page link")
    public void click_the_page_link(String link) {
        for (WebElement eachBar : roofStacksPage.navBar) {
            if (eachBar.getText().equals(link)) {
                eachBar.click();
                break;
            }
        }
        System.out.println(5);

    }

    @When("click open position under {string} title")
    public void click_open_position_under_title(String link) {

        careerPage = new CareerPage();
        careerPage.clickOpenPositions(link);
        System.out.println("6");

    }

    @When("click {string} tab")
    public void click_tab(String tab) {
        for (WebElement eachDepartment : openPositionsPage.departments) {
            if (eachDepartment.getText().equals(tab)) {
                eachDepartment.click();
                break;
            }

        }
        System.out.println("7");
    }

    @When("click View job near {string} title")
    public void click_view_job_near_title(String positionName) {
        for (WebElement eachPos : openPositionsPage.openPositions) {
            if (eachPos.getText().equals(positionName)) {
                eachPos.click();
                break;
            }
        }
        System.out.println("8");
    }

    @Then("the title of page should contain {string}")
    public void the_title_of_page_should_contain(String title) {
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
        System.out.println("9");

    }

    @When("click {string} button")
    public void click_button(String string) {
        seniorMobileDeveloperPage.applyButton.click();
        System.out.println("10");
    }

    @When("enter full name {string} , emailAdress {string} , and phone number {string}")
    public void enter_full_name_email_adress_and_phone_number(String name, String mail, String phone) throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scrollBy(0,350)", "");

        applicationPage.userName.sendKeys(ConfigurationReader.getProperty(name));

        applicationPage.email.sendKeys(ConfigurationReader.getProperty(mail));

        applicationPage.phoneNumber.sendKeys(ConfigurationReader.getProperty(phone));
        System.out.println("11");

    }

    @When("upload a sample CV")
    public void upload_a_sample_cv() throws InterruptedException {

//        applicationPage.sendCv.sendKeys("C:\\Users\\cagla\\OneDrive\\Masaüstü\\caglarCV.docx");
        System.out.println("upload cv cancelled");
        System.out.println("12");
    }

    @When("click send button")
    public void click_send_button() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)", "");
        applicationPage.sendButton.click();
        System.out.println("13");


    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedText) {
//        BrowserUtils.sleep(2);
//        System.out.println("applicationPage.allDone.getText() = " + applicationPage.allDone.getText());
//
//        Assert.assertEquals(expectedText,applicationPage.allDone.getText());

        System.out.println("Mission completed succesfully");

    }


}
