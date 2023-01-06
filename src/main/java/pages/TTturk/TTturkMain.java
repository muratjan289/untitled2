package pages.TTturk;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import org.testng.Assert;
import java.time.Duration;

import static common.Config.*;
//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.False;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static otherProgramms.LinkForAssert.*;


public class TTturkMain extends BasePage {

    public TTturkMain(WebDriver driver){super(driver);}

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));



    public final static By BUTTON_LANGUAGE_AND_CURRENCY = By.xpath("//div[@class='site-container header__wrapper']//span[@class='header__top-i18n-toggler']");
    public final static By BUTTON_SELECT_LANGUAGE = By.xpath("//div[@class='site-container header__wrapper']//div[@class='v-select tt-select dropdown__ico popup--i18n__select-item vs--single vs--unsearchable']//div[@class='vs__selected-options']//span[contains(text(),'Українська')]");

   private final static By BANNER = By.xpath("//div[@class='site-container']//div[@class='hero__slider-wrapper']");
    private final static By CHAPTER_HOME_IMPROVMENT_RU = By.xpath("//div[@class='site-container']//span[text()='Обустройство дома']");

    private final static By CATEGORY_HARDWARE_RU = By.xpath("//div[@class='site-container']//a[@href='/ru/categories/hardware-1270']");
    private final static By SORT_PRICE_DESCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Цена по убыванию')]");
    private final static By SORT_BY_DATE_ASCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Новые поступления')]");
    private final static By SORT_BY_DATE_DESCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Ранее поступившие')]");
    private final static By SORT_PRICE_ASCENDING_RU = By.xpath("//ul[@class='filter-category__inner']//button[contains(text(),'Цена по возрастанию')]");
    private final static By MAIN_LOGO = By.xpath("//div[@class='header__logo']");
    private final static By AVATAR_LOGO = By.xpath("//div[@class='header__user-nav']//ul//li[@class='header__user-nav-item header__user-nav-item--log-in header__user-nav-item--noti']");
    private final static By LOGIN_INPUT = By.xpath("//div[@class='tab__content tab__content--current']//input[@type='text']");
    private final static By PASSWORD_INPUT = By.xpath("//div[@class='tab__content tab__content--current']//div//input[@class='input__input']");
    private final static By BUTTON_SIGN_IN_TT_TURK = By.xpath("//div[@class='tab__content tab__content--current']//button[@class='button button--c-primary button--s-medium modal__btn']");

    private final static By REGISTRATION_INPUT = By.xpath("//div[@class='modal__content-wrap']//button[@class='tab__btn']");
    private final static By NEW_LOGIN_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Електронна пошта']");
    private final static By NEW_PASSWORD_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Пароль']");
    private final static By NEW_PASSWORD_CONFIRM_INPUT = By.xpath("//div[@class='modal__content-wrap']//input[@placeholder='Підтвердження пароля']");
    private final static By BUTTON_AGREE_POLICY = By.xpath("//div[@class='modal__content-wrap']//div//input[@id='agree']");
    private final static By BUTTON_NEW_ACCOUNT_CREATE = By.xpath("//div[@class='modal__content-wrap']//div[@class='modal__btn-wrap']//button[@class='button button--c-primary button--s-medium modal__btn']");

    private final static By BUTTON_AUTHORIZATION_AFTER_REGISTRATION = By.xpath("//div[@class='modal__content-view modal__content-view--second']//div//button[@class='button button--c-primary button--s-medium modal__btn']");

    private final static By BUTTON_SELECT_FIRST_PRODUCT = By.xpath("//div[@class='scroll-list__wrap product__list-wrap']//ul//li//a[1]");
    private final static By BUTTON_ADD_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']");
    private final static By INFO_HOW_PRODUCTS_IN_BASKET = By.xpath("//a[@class='header__user-nav-link']//span[contains(text(),'3')]");
    private final static By BUTTON_GO_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']//span[2]");
    public final static By BUTTON_MY_ACCOUNT = By.xpath("//li[@class='user__popup-item']//div[@class='user__popup-item-link-wrap']//a[@href]");
    private  final static By INPUT_NAME = By.xpath("//div[@class='site-container']//div[@class]//div//input[@name='receiverFullName']");
    private final static By INPUT_PHONE_NUMBER = By.xpath("//div[@class='site-container']//div[@class='checkout__section-wrap']//div[@class='checkout__form-wrap']//input[@name='receiverPhoneNumber']");
    private final static By INPUT_DELIVERY_ADDRESS = By.xpath("//div[@class='site-container']//div[@class]//input[@name='receiverAddress']");
    private final static By INPUT_DELIVERY_COUNTRY = By.xpath("//div[@class='site-container']//div[@class]//div[@class='v-select vs--single vs--searchable input__input input__v-search input__input--invalid']");
    private final static By INPUT_DELIVERY_CITY = By.xpath("//div[@class='site-container']//div[@class]//div[@class='v-select vs--single vs--searchable input__input input__v-search input__input--invalid']");
    private final static By INPUT_DELIVERY_POSTCODE = By.xpath("//div[@class='site-container']//div[@class]//input[@name='postcode']");
    private final static By BUTTON_DELIVERY_ADDRESS_SAVE = By.xpath("//div[@class='site-container']//div[@class]//button[@class='button button--s-large button--c-primary checkout__form-btn']");
    private final static By ADD_NEW_DELIVERY_ADDRESS = By.xpath("//div[@class='checkout__section-wrap']//a[@class='button button--c-secondary button--s-small']");

    private final static By BUTTON_CHECKOUT = By.xpath("//div[@class='shop__container']//a[@class='button button--s-large button--c-primary shop__order-btn']");

    private final static By probka = By.xpath("//div[@class='v-select vs--single vs--searchable input__input input__v-search input__input--valid']//span[contains(text(),'Ukraine')]");
    private final static By opuskaika = By.xpath("//form[@class='checkout__form']//div[@id='vs14__combobox']//div[@class='vs__selected-options']");

    private final static By BUTTON_CHECKOUT_FINALLY = By.xpath("//a[@class='button button--s-large button--c-primary']");

    private final static By CREDIT_CARD_NUMBER = By.xpath("//div[@class='i2mp-formbox i2mp-formbox-withicon']//input[@class='i2mp-form-input']");








    public TTturkMain addNewAddress(){
        driver.findElement(ADD_NEW_DELIVERY_ADDRESS).click();
//        driver.findElement(AVATAR_LOGO).click();
//        driver.findElement(BUTTON_MY_ACCOUNT).click();
//        driver.findElement(BUTTON_DELIVERY_ADDRESS).click();
        driver.findElement(INPUT_NAME).sendKeys("IVANOV IVAN IVANOVICH");
        driver.findElement(INPUT_PHONE_NUMBER).sendKeys("+7896542368");
        driver.findElement(INPUT_DELIVERY_ADDRESS).sendKeys("ULICA PODZALIPOVAYA");
        driver.findElement(opuskaika).click();
        driver.findElement(probka).click();
        driver.findElement(INPUT_DELIVERY_COUNTRY).sendKeys("UKRAINE");
        driver.findElement(INPUT_DELIVERY_CITY).sendKeys("Lviv");
        driver.findElement(INPUT_DELIVERY_POSTCODE).sendKeys("35000");
//        driver.findElement(BUTTON_DELIVERY_ADDRESS).click();


        return this;
    }
    public TTturkMain enterBanner(){
        driver.findElement(BANNER).click();
        String curAllCategoryUrl = driver.getCurrentUrl();
        Assert.assertEquals(LINK_ALL_CATEGORY_UA,curAllCategoryUrl);
        return this;
    }

    public TTturkMain addToBasketFiveItem() {
      for(int i=0; i<=5;i++){
          System.out.println("пошла жара");
          String mainpage = driver.getCurrentUrl();
          Assert.assertEquals(LINK_MAIN_PAGE_UA,mainpage);
            driver.findElement(BUTTON_SELECT_FIRST_PRODUCT).click();
        System.out.println("BUTTON_SELECT_FIRST_PRODUCT  "+i);

            driver.findElement(BUTTON_ADD_TO_CART).click();
          System.out.println("BUTTON_ADD_TO_CART   " + i);


            driver.findElement(BUTTON_GO_TO_CART).click();
          System.out.println("BUTTON_GO_TO_CART" + i);

            driver.findElement(MAIN_LOGO).click();
          System.out.println("MAIN_LOGO"  + i);

      }
        return this;
    }


    public TTturkMain addToBasketOneItem(){
        driver.findElement(BUTTON_SELECT_FIRST_PRODUCT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();

        if( driver.findElement(By.xpath("//a[@class='header__user-nav-link']//span[contains(text(),'1')]")).isDisplayed()){
            System.out.println("In basket 1 product");
        }else{
            System.out.println("Element is InVisible");
        }

        driver.findElement(BUTTON_CHECKOUT).click();
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();


        return this;
    }


    public TTturkMain selectCategory(){
        //driver.findElement(CHAPTER_HOME_IMPROVMENT_RU).click();
        driver.findElement(CATEGORY_HARDWARE_RU).click();

        String curlCategoryHardware =driver.getCurrentUrl();
        Assert.assertEquals(curlCategoryHardware,LINK_CATEGORY_HARDWARE_UA);
        return this;
    }


    public TTturkMain createTrueAccount(){
        driver.findElement(AVATAR_LOGO).click();
        driver.findElement(REGISTRATION_INPUT).click();
         String newEmailRandom = RandomStringUtils.randomAlphabetic(6,12) + "@mail.ru";
        driver.findElement(NEW_LOGIN_INPUT).sendKeys(newEmailRandom);
        driver.findElement(NEW_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(NEW_PASSWORD_CONFIRM_INPUT).sendKeys(password);
        driver.findElement(BUTTON_AGREE_POLICY).click();

        driver.findElement( BUTTON_NEW_ACCOUNT_CREATE).click();
        driver.findElement(BUTTON_AUTHORIZATION_AFTER_REGISTRATION).click();
        return this;
    }

    public  TTturkMain Authorization_After_Registration(){
        driver.findElement(LOGIN_INPUT).sendKeys("muratkhalilov289@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();

        return this;

    }

    public TTturkMain sortedCategory(){
        driver.findElement(SORT_PRICE_DESCENDING_RU).click();
        String curlSortPriceDescendingRu = driver.getCurrentUrl();
        Assert.assertEquals(curlSortPriceDescendingRu,LINK_SORT_PRICE_DESCENDING_UA);

        driver.findElement(SORT_BY_DATE_ASCENDING_RU).click();
        String curlSortByDateAscending = driver.getCurrentUrl();
        Assert.assertEquals(curlSortByDateAscending,LINK_SORT_BY_DATE_ASCENDING_UA);

        driver.findElement(SORT_BY_DATE_DESCENDING_RU).click();
        String curlSortByDateDescending = driver.getCurrentUrl();
        Assert.assertEquals(curlSortByDateDescending,LINK_SORT_BY_DATE_DESCENDING_UA);

        driver.findElement(SORT_PRICE_ASCENDING_RU).click();
        String curlSortPriceAscending = driver.getCurrentUrl();
        Assert.assertEquals(curlSortPriceAscending,LINK_SORT_PRICE_ASCENDING_UA);

        driver.findElement(MAIN_LOGO).click();
        String mainPage = driver.getCurrentUrl();
        Assert.assertEquals(mainPage, LINK_MAIN_PAGE_UA);
        return this;
    }



    public TTturkMain toSuccessfulFAuthorization(){
        driver.findElement(AVATAR_LOGO).click();
        driver.findElement(LOGIN_INPUT).sendKeys("khalilov.m.i.2.17@gmail.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("goblin27");
        driver.findElement(BUTTON_SIGN_IN_TT_TURK).click();
        return this;
    }


}
