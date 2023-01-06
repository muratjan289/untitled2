package tests.searchAppartments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import  pages.TTturk.Localizaciya;
public class SearchAppartTest extends BaseTest {

    @Test(priority = 1,description = "Test 1")
    public void checkIsRedrectToListing() throws InterruptedException {
       basePage.open("https://k8s-staging.tt-turk.com/ua");
        tTturkMain
//                .enterBanner()
//                .selectCategory()
//                .sortedCategory()
                .createTrueAccount()
                .Authorization_After_Registration();
//
//        basket
//                .addToBasketDiscountWithWholesaleItem()
//                .Checkout().addCardForPay();

//        for (int i = 12; i > 0; i--) {
//
//            Thread.sleep(1000);
//        }
       //switchWindow();
//       realthomePage
//               .enterCountfRooms()
//               .clickToFind();
//
//       realListingPage
//               .checkCountCards();

    }


}
