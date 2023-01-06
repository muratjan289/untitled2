package pages.TTturk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;

import static common.Config.EXPLICIT_WAIT;

public class Localizaciya extends BasePage {

    public Localizaciya(WebDriver driver){super(driver);}

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));






    public static final By step1 = By.xpath("//a[.//span[@class='header__top-i18n-toggler']]");
   public static final By step2 = By.xpath("//div[@class='vs__selected-options'][.//input[@aria-controls='vs2__listbox']]");
   public static final By step3 = By.xpath("/ul/li[2]");
    public static final By step4 = By.xpath("//button[contains(@class, 'button--s-medium')]");



    public Localizaciya popitochka (){

        driver.findElement(step1).click();
        driver.findElement(step2).click();
        driver.findElement(step3).click();
        driver.findElement(step4).click();


        return this;
    }

}
