package base;

import org.testng.annotations.BeforeSuite;
import pages.HerokuappPage;
import pages.LoginPage;
import pages.ProductPage;

import static com.codeborne.selenide.Selenide.page;

public class BaseClass {
    protected HerokuappPage herokuappPage;
    protected LoginPage loginPage;
    protected ProductPage productPage;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuit() {
        herokuappPage = page(HerokuappPage.class);
        loginPage = page(LoginPage.class);
        productPage = page(ProductPage.class);
    }
}
