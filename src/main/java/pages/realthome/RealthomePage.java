package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealthomePage extends BasePage {

    public RealthomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By option2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealthomePage enterCountfRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;
    }

    public RealthomePage clickToFind() {
        driver.findElement(findBtn).click();

        return this;
    }


}
