package base;

import pages.HerokuappPage;
import pages.LoginPage;
import pages.ProductPage;

import static com.codeborne.selenide.Selenide.page;

//поможет инициализировать страницу
public class ScreenManager {
    public LoginPage loginPage() {
        return page(LoginPage.class);
    }

    public ProductPage productPage() {
        return page(ProductPage.class);
    }

    public HerokuappPage herokuappPage() {
        return page(HerokuappPage.class);
    }
}
