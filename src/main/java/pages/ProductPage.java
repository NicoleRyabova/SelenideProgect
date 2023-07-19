package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//проверяется, что перешли на страницу ProductPage
////  (перешли на страницу с нужным адресом
////  и есть плашка с текстом Products)
////-  проверяется, что отображается "бургер"
////-  нажимаете на "бургер"
////-  проверяется, что отображается кнопка "Logout"
////-  нажимаете на кнопку "Logout"
////-  проверяется, что перешли на страницу LoginPage
public class ProductPage {
    @FindBy(xpath = "//span[@class = 'title']")
    public SelenideElement products;
    @FindBy(xpath = "//div[@class = 'bm-burger-button']")
    public SelenideElement burger;
    @FindBy(xpath = "//a[@id = 'logout_sidebar_link']")
    public SelenideElement logout;

}
