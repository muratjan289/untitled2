package tests.base;

import common.Common;
import common.CommonAction;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.TTturk.Basket;
//import pages.TTturk.FirstStep;
//import pages.TTturk.FirstStep;
import pages.TTturk.FirstStep;
import pages.TTturk.Localizaciya;
import pages.TTturk.TTturkMain;
import pages.base.Base2;
import pages.base.BasePage;
import pages.listing.RealListingPage;
import pages.realthome.RealthomePage;

public class BaseTest {


     WebDriver driver = CommonAction.createDriver();
     WebDriver driver2 = Common.createDriver();

    protected BasePage basePage = new BasePage(driver);

    protected RealthomePage realthomePage = new RealthomePage(driver);
    protected RealListingPage realListingPage = new RealListingPage(driver);

    protected TTturkMain tTturkMain = new TTturkMain(driver);
    protected Localizaciya localizaciya = new Localizaciya(driver);
    protected Basket basket = new Basket(driver);

    protected Base2 base2 = new Base2(driver2);
   protected FirstStep firstStep = new FirstStep(driver2);




//    @AfterClass(alwaysRun = true)
//    public void quite(){                 // Обязательное закрытие окна браузереа после всех тестов
//        driver.close();
//        driver2 = new ChromeDriver();
//    }




//    @BeforeClass
//    public void testMethodInitialize() {
//if(driver == null && driver2 ==null) {
//        //initialize your driver(webdriver or RemoteWebdriver)
//        driver2 = new ChromeDriver();
//    }  }
//    @BeforeMethod
  //  public void checkLogin() {
      //  driver.get("https://accounts.lambdatest.com/login");
    //}


//    WebDriverWait wait = new WebDriverWait(driver,10);
//      protected void switchWindow() {
//         Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//         driver.switchTo().alert();
//         alert.accept();
//      }
//  protected void switchWindow(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String window1 = driver.getWindowHandle();
//        js.executeScript("window.open()");
//        Set <String> currentWindows = driver.getWindowHandles();
//
//        String window2 = null;
//
//        for(String window : currentWindows){
//            if(!window.equals(window1)){
//                window2 = window;
//                break;
//            }
//        }
//
//        driver.switchTo().window(window2);
//
//    }
}
