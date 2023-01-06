package variables;

import org.openqa.selenium.By;

public class variablesXpathRu {
    private final static By BANNER = By.xpath("//div[@class='site-container']//div[@class='hero__slider-wrapper']");
    private final static By CHAPTER_HOME_IMPROVMENT_RU = By.xpath("//div[@class='site-container']//span[text()='Обустройство дома']");
    private final static By CATEGORY_HARDWARE_RU = By.xpath("//div[@class='site-container']//a[@href='/ru/categories/hardware-1270']");
    private final static By SORT_PRICE_DESCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Цена по убыванию')]");
    private final static By SORT_BY_DATE_ASCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Новые поступления')]");
    private final static By SORT_B_DATE_DESCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Ранее поступившие')]");
    private final static By SORT_PRICE_ASCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Цена по возрастанию')]");


}
