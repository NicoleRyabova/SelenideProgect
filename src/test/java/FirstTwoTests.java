import base.BaseClass;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
//1 task
// Напишите тест, в котором:
//-  открывается страница
//-  проверяется, что перешли на страницу LoginPage
//   (отображается элемент с заголовком и содержит верный текст "Swag Labs")
//
//2 task
//Напишите тест, в котором:
////-  открывается страница LoginPage
////-  вводится логин/пароль (standard_user) и нажимается кнопка Login
////-  проверяется, что перешли на страницу ProductPage
////  (перешли на страницу с нужным адресом
////  и есть плашка с текстом Products)
////-  проверяется, что отображается "бургер"
////-  нажимаете на "бургер"
////-  проверяется, что отображается кнопка "Logout"
////-  нажимаете на кнопку "Logout"
////-  проверяется, что перешли на страницу LoginPage
////  (перешли на страницу с нужным адресом
////  и есть лого с текстом "Swag Labs")
public class FirstTwoTests extends BaseClass {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open(loginPage.getAddress());

    }
    @Test
    public void test() {
        loginPage.logo.shouldBe(Condition.visible);
        loginPage.logo.shouldHave(Condition.exactText("Swag Labs"));
    }

    @Test
    public void secondTest() {
        loginPage.username.setValue("standard_user");
        loginPage.password.setValue("secret_sauce");
        loginPage.loginButton.click();
        webdriver().shouldHave(url("https://www.saucedemo.com/inventory.html"));
        productPage.products.shouldHave(Condition.exactText("Products"));
        productPage.burger.shouldBe(Condition.visible);
        productPage.burger.click();
        productPage.logout.shouldBe(Condition.visible);
        productPage.logout.click();
        webdriver().shouldHave(url("https://www.saucedemo.com/"));
        loginPage.logo.shouldHave(Condition.exactText("Swag Labs"));
    }
}
