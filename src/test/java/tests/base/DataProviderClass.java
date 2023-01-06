package tests.base;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider
    public Object [][] dataProviderMethod(){
        return new Object[][]{
        {"1","string"},
        {"2","string"},
                {"1","string"}

    };
}
}
