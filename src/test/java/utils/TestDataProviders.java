package utils;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
    @DataProvider(name = "Incoming data for Amount")
    public Object[][] inputForAmountTest(){
        return new Object[][]{
                {5, 10},
                {10, 5},
                {0, 15},
                {0, -15},
                {-5, 20}
        };
    }
    @DataProvider(name = "Incoming data for multiplication")
    public Object[][] inputForMultiplicationTest(){
        return new Object[][]{
                {5, 3},
                {3, 5},
                {1, 15},
                {0, 15},
                {-5, 3}
        };
    }
    @DataProvider(name = "Incoming data for division")
    public Object[][] inputForDivisionTest(){
        return new Object[][]{
                {8, 4},
                {20, 10},
                {10, 20},
                {0, 15},
                {20, 0}
        };
    }
}
