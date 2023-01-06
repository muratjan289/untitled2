package tests.searchAppartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.base.DataProviderClass;

public class TestSOUT extends BaseTest{

    @Test(priority = 2,description = "Test 2")
    public void two() throws InterruptedException {
        for (int i = 3; i > 0; i--) {

            Thread.sleep(1000);
        }
        base2.rop("https://k8s-staging.tt-turk.com/ua");
     firstStep.createTrueAccount().Authorization_After_Registration();
    }
//    @Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderClass.class)
//    public void testSOUT(String number, String string){
//        System.out.println("Test sout!!!" + number + string);
//    }
}
