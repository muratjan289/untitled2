package pages.TTturk;

//import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static common.Config.EXPLICIT_WAIT;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static otherProgramms.LinkForAssert.LINK_MAIN_PAGE_UA;
import static otherProgramms.LinkForAssert.LINK_SHOP_CART_UA;

public class Basket extends BasePage {


    public Basket(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
    private final static By BUTTON_MAIN_LOGO = By.xpath("//div[@class='header__logo']");
    private final static By BUTTON_SELECT_FIRST_PRODUCT_IN_ADVERTISING = By.xpath("//div[@class='scroll-list__wrap product__list-wrap']//ul//li//a[1]");
    private final static By BUTTON_SELECT_SECOND_PRODUCT_IN_POPULAR_ITEMS = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[2]");
    private final static By BUTTON_SELECT_THIRD_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[3]");
    private final static By BUTTON_SELECT_FOURTH_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[4]");
    private final static By BUTTON_SELECT_FIVE_PRODUCT_IN_ADVERTISING = By.xpath("//section[@class='product__section product__section-w-promo product__popular-main-page']//ul[@class='p-cards__inner scroll-list']//li[5]");

    private final static By BUTTON_ADD_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']");
    private final static By INFO_HOW_PRODUCTS_IN_BASKET = By.xpath("//a[@class='header__user-nav-link']//span[contains(text(),'3')]");
    private final static By BUTTON_LOGO_GO_TO_CART = By.xpath("//div[@class='header__user-nav']//a//div[@class='header__user-nav-ico header__user-nav-ico-wrap']");
    private final static By BUTTON_GO_TO_CART = By.xpath("//div[@class='product-d__shop']//div[@class='product-d__buy-btn-wrap']//span[2]");
    private final static By BUTTON_CHECKOUT = By.xpath("//div[@class='shop__container']//a[@class='button button--s-large button--c-primary shop__order-btn']");
    private final static By BUTTON_CHECKOUT_FINALLY = By.xpath("//a[@class='button button--s-large button--c-primary']");
    private final static By BUTTON_ON_POPUP = By.xpath("//div[@class='popup popup--shop-cart']//a[@class='button button--s-small button--c-primary shop__popup-btn']");

    private final static By SELECT_ALL_IN_CARD = By.xpath("//div[@class='shop']//input[@id='all']");
    private final static By INPUT_CREDIT_CARD_NUMBER = By.xpath("//div[1]//div[1]//div[1]//input[@id='pan']");
    private final static By BUTTON_MONTH_ON_CARD = By.xpath("//div//select[1]//option[@value='12']");
    private final static By BUTTON_YEAR_ON_CARD = By.xpath("//div//select[1]//option[@value='26']");
    private final static By INPUT_CVC_CODE = By.xpath("//div//div//input[@id='cv2']");
    private final static By BUTTON_SUBMIT_CARD = By.xpath("//div//div//input[@id='btnSbmt']");
    private final static By BUTTON_YES_ACCEPT_PAY = By.xpath("//form//button[@id='yes']");
    private final static By BUTTON_CAMPANYA_1 = By.xpath("//div[@class='i2mp-row']//div//input[@value='000001']");
    private final static By INFO_YOUR_ORDER_SUCCESS = By.xpath("//div//h2[@class='modal__title t-center orders__success-title']");
    private final static By INFO_YOUR_ORDER_UNSUCCESSFUL = By.xpath("//div//h2[@class='modal__title t-center modal__title--red']");
    private final static By CATEGORY_HOME_IMPROVEMENT = By.xpath("//div[@class='nav__categories nav__categories--active nav_categories--landing']//span[contains(text(),'Домогосподарство')]");
    private final static By CATEGORY_PAINTING = By.xpath("//div[@class]//span[contains(text(),'Живопис')]");
    private final static By CATEGORY_WALLPAPERS = By.xpath("//div[@class]//span[contains(text(),'Шпалери')]");
    private final static By ITEM_DISCOUNT = By.xpath("//div//ul//li//a[@href='/ua/product/8c56276f-9419-4302-a89f-5c324cd429b5?skuId=981661']");
    private final static By ITEM_WITH_DISCOUNT_WITH_WHOLESALE = By.xpath("//div//ul//li//a[@href='/ua/product/7ffaabef-8a51-46a6-a19c-7178d5b08c15?skuId=981663']");
    private final static By ITEM_WITH_WHOLESALE = By.xpath("//div//ul//li//a[@href='/ua/product/502574a6-42d6-4ef7-8389-e0b90cfc5ab3?skuId=981662']");
    private final static By ITEM_NOT_WHOLESALE_NOT_DISCOUNT =By.xpath("//div//ul//li//a[@href='/ua/product/03d113d1-ffa2-4cf0-ab5b-28efc06800eb?skuId=981664']");




    public Basket addToBasketDiscountWithWholesaleItem(){
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_DISCOUNT_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        return this;
    }

    public Basket addToBasketDiscountItem(){
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        return this;
    }

    public Basket addToBasketEmptyItem(){
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_NOT_WHOLESALE_NOT_DISCOUNT).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        return this;
    }
    public Basket addToBasketWholesaleItem(){
        driver.findElement(CATEGORY_HOME_IMPROVEMENT).click();
        driver.findElement(CATEGORY_PAINTING).click();
        driver.findElement(CATEGORY_WALLPAPERS).click();
        driver.findElement(ITEM_WITH_WHOLESALE).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        return this;
    }
    public Basket addToBasketOneItem() {
        driver.findElement(BUTTON_SELECT_FIRST_PRODUCT_IN_ADVERTISING).click();
        driver.findElement(BUTTON_ADD_TO_CART).click();
        driver.findElement(BUTTON_GO_TO_CART).click();
        return this;
    }

    public Basket addToBasketFiveItem() {
        for (int i = 0; i <= 0; i++) {
            String mainpage = driver.getCurrentUrl();
            if (!mainpage.equals(LINK_MAIN_PAGE_UA)) {
                driver.findElement(BUTTON_MAIN_LOGO).click();
            }
            driver.findElement(BUTTON_SELECT_FIRST_PRODUCT_IN_ADVERTISING).click();
            System.out.println("BUTTON_SELECT_FIRST_PRODUCT  " + i);



        }
        return this;
    }

    public Basket Checkout() {
        System.out.println("ЗАходит");
        String shopCartPage = driver.getCurrentUrl();
        System.out.println(shopCartPage);
        driver.findElement(BUTTON_LOGO_GO_TO_CART).click();
        String inCart = driver.getCurrentUrl();
        System.out.println(inCart);
        driver.findElement(SELECT_ALL_IN_CARD).click();
        System.out.println("galochka");
        driver.findElement(BUTTON_CHECKOUT).click();
        String button_checkout = driver.getCurrentUrl();
        System.out.println(button_checkout);
        driver.findElement(BUTTON_CHECKOUT_FINALLY).click();
        String ButtoncheckoutFinal = driver.getCurrentUrl();
        System.out.println(ButtoncheckoutFinal);
        return this;
    }


    //Добавление карты  и нажатие на оплату
    public Basket addCardForPay() throws InterruptedException {
        driver.findElement(INPUT_CREDIT_CARD_NUMBER).sendKeys("4508034508034509");
        driver.findElement(BUTTON_MONTH_ON_CARD).click();
        driver.findElement(BUTTON_YEAR_ON_CARD).click();
        driver.findElement(INPUT_CVC_CODE).sendKeys("000");
            driver.findElement(BUTTON_SUBMIT_CARD).click();
          try {
              driver.findElement(BUTTON_CAMPANYA_1).click();
          }catch (NoSuchElementException e){
              System.out.println("BUTTON_CAMPANYA_1 не нашелся");
          }

      try {
          driver.findElement(BUTTON_SUBMIT_CARD).click();
      }catch (NoSuchElementException e){
          System.out.println("BUTTON_SUBMIT_CARD не нашелся");
      }

        try {
            driver.findElement(BUTTON_YES_ACCEPT_PAY).click();
        }
        catch (NoSuchElementException e) {
            System.out.println("No such BUTTON_CAMPANYA_1 ");
        }
        for (int i = 12; i > 0; i--) {

            Thread.sleep(1000);
        }
        try {
            driver.findElement(INFO_YOUR_ORDER_SUCCESS);
            System.out.println("ВАША ПОКУПКА ОПЛАЧЕНА ПОЗДРАВЛЯЕМ");
        }
        catch (NoSuchElementException e) {
            System.out.println(" НЕ ПОЛУЧИЛАСЬ  ПЕРВАЯ ПОПЫТКА ");
        }
        try {
            driver.findElement(INFO_YOUR_ORDER_UNSUCCESSFUL);
            System.out.println("ПРОИЗОШЛА ОШИБКА ПРИ ОПЛАТЕ");
        }
        catch (NoSuchElementException e) {
            System.out.println(" ПОКУПКА СКОРЕЕ ВСЕГО ПОЛУЧИЛАСЬ ");
        }
        return this;
    }

}
