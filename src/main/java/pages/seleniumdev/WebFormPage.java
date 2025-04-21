package pages.seleniumdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class WebFormPage extends BasePage {

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL_WEB_FORM = "https://www.selenium.dev/selenium/web/web-form.html";

    private static final String DROPDOWN_SELECT_XPATH = "//select[@name='my-select']";
    private static final String SELECT_DROP_XPATH = "//option[@value='2']";

    private static final String DATALIST_SELECT_XPATH = "//input[@name='my-datalist']";
    private static final String SELECT_DATALIST_XPATH = "//option[@value='Seattle']";

    private static final String CHECKED_CHECKBOX_XPATH = "//input[@id='my-check-1']";
    private static final String DEFAULT_CHECKBOX_XPATH = "//input[@id='my-check-2']";

    private static final String DEFAULT_RADIO_XPATH = "//input[@id='my-radio-2']";

    private static final String SUBMIT_BUTTON_XPATH = "//button[@type='submit']";

    public void openWebFormPage(){openUrl(URL_WEB_FORM);}

   public void clickDropdown(){
        click(By.xpath(DROPDOWN_SELECT_XPATH));
    }

    public void selectDrop() {
        click(By.xpath(SELECT_DROP_XPATH));
    }

    public void clickDatalist(){
        click(By.xpath(DATALIST_SELECT_XPATH));
    }

    public void selectDatalist(){
        click(By.xpath(SELECT_DATALIST_XPATH));
    }

    public void selectCheckedCheckbox(){
        click(By.xpath(CHECKED_CHECKBOX_XPATH));
    }

    public void selectDefaultCheckbox(){
        click(By.xpath(DEFAULT_CHECKBOX_XPATH));
    }

    public void selectDefaultRadio(){
        click(By.xpath(DEFAULT_RADIO_XPATH));
    }

    public void clicSubmitButton(){
        click(By.xpath(SUBMIT_BUTTON_XPATH));
    }

}

