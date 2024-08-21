import org.testng.annotations.Test;

public class SortTest extends BaseTest {

    @Test(testName = "Сортировка Name (A to Z)")
    public void nameSortAZ()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.selectSort("Name (A to Z)");
    }

    @Test(testName = "Сортировка Name (Z to A)")
    public void nameSortZA()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.selectSort("Name (Z to A)");
    }

    @Test(testName = "Сортировка Price (low to high)")
    public void priceSortLowToHigh()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.selectSort("Price (low to high)");
    }

    @Test(testName = "Сортировка Price (high to low)")
    public void priceSortHighToLow()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.selectSort("Price (high to low)");
    }


}

