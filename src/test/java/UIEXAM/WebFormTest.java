package UIEXAM;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.seleniumdev.WebFormPage;

public class WebFormTest extends BaseTest {

    private WebFormPage webFormPage;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up before class in WebFormTest");
        webFormPage = new WebFormPage(driver);
    }

    @Test
    public void step_01() {
        webFormPage.openWebFormPage();

        WebElement userTextInput = driver.findElement(By.xpath("//input[@name='my-text']"));
        userTextInput.sendKeys("Легин Степан Владимирович");

        WebElement userPassword = driver.findElement(By.xpath("//input[@name='my-password']"));
        userPassword.sendKeys("12345");

        WebElement userTextArea = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
        userTextArea.sendKeys("Лига");


    }

    @Test
    public void step_02() {
        webFormPage.selectDrop();
        webFormPage.clickDatalist();
        webFormPage.selectCheckedCheckbox();
        webFormPage.selectDefaultCheckbox();

    }

    @Test
    public void step_03() {
        webFormPage.selectDefaultRadio();

    }

    public void step_04() {
        webFormPage.clicSubmitButton();
    }
}
