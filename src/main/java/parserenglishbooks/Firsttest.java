package parserenglishbooks;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class  Firsttest {

    public static final String TT_TURK_RU = "https://staging.tt-turk.com/ru";
    public static final String TT_TURK_DEASHBOARD_SIGN_IN ="https://dashboard.staging.tt-turk.com/welcome";
    public static final String TT_TURK_VIEW_ALL_CATEGORY = "https://staging.tt-turk.com/ru/categories";

    @Test
    public void testSearch()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.navigate().to(TT_TURK_RU);
//        driver.findElement(By.linkText("Продать на TTTurk")).click();
        driver.findElement(By.linkText("Помощь")).click(); //Открытие панели помощь
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,TT_TURK_RU);

        driver.findElement(By.cssSelector("[class=\"nav__categories-header-link\"]")).click();
        String ViewAll = driver.getCurrentUrl();  // Переход на посмотреть все категории
        Assert.assertEquals(ViewAll,TT_TURK_VIEW_ALL_CATEGORY);


        driver.findElement(By.cssSelector("[class=\"header__logo-tagline\"]")).click();
        String tt_turk = driver.getCurrentUrl();  //Переход на главную по логотипу
        Assert.assertEquals(currentUrl,TT_TURK_RU);





//        driver.findElement(By.xpath( *[@class='/hero__slider-wrapper\"]")).click();
//      WebElement banner =  driver.findElement(By.cssSelector("div[class='hero__collections-item-cover']"));
      WebElement slider = driver.findElement(By.cssSelector("button[class='slider__arrow-btn slider__arrow-btn--prev arrow arrow--left']"));
        System.out.println("Vipolneno");
        WebElement banner2 = driver.findElement(By.cssSelector("span[class='hero__collections-item-button--text']"));
        WebElement movers = driver.findElement(By.cssSelector("[class='slider__arrow-btn slider__arrow-btn--next arrow arrow--right']"));



        WebElement banner = driver.findElement(By.cssSelector("[class='hero__slider-wrapper']"));
        banner.click();                         //Переход по баннеру
//        String bannerTouch = driver.getCurrentUrl();
//        Assert.assertEquals(bannerTouch,TT_TURK_VIEW_ALL_CATEGORY);

//        WebElement  category1315 = driver.findElement(By.partialLinkText("href=\"/ru/categories/home-textile-1315\""));









        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        System.out.println(windows);




//        driver.switchTo().window(TT_TURK_DESHBOARD_SIGN_IN);
//        driver.close();

//        driver.findElement()

//        Set<String> oldWindow = driver.getWindowHandles();
//        System.out.println("oldWindow->" + oldWindow);
//
//        ((JavascriptExecutor)driver).executeScript("window.open()");
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        driver.switchTo().window(tabs.get(1));
//        driver.get("https://tt-turk.com");
//
//        Set<String> newWindow = driver.getWindowHandles();
//        System.out.println("newWindow->"  + newWindow);
//
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys(("putinHuilo"));
//        searchBox.submit();
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println("currentURL->" + currentUrl);  //Проверка  совпадает ожидание ссылки с реальностью
//        Assert.assertEquals(currentUrl,"http://www.google.com/");

//        String currentTitle = driver.getTitle();
//        System.out.println("currentTitle->" + currentTitle);
//        Assert.assertEquals(currentTitle,"putinHuilo - Поиск в Google"); //сравнение title;

//        String pageSource = driver.getPageSource();
//        System.out.println("pageSouce->" + pageSource);
//

//driver.quit();
     //   driver.close();
    }
}
