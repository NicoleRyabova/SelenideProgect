package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
//1task
// Проверка открытия страницы www.saucedemo.com.
//Добавьте класс LoginPage, представляющий проверяемую страницу.
//У класса есть следующие параметры:
//-  адрес страницы
//-  веб-элемент лого страницы с текстом "Swag Labs"

//2 task
//Проверка логина и выхода.
//В ранее созданном классе LoginPage добавьте следующие параметры:
//-  веб-элемент поля username
//-  веб-элемент поля password
//-  веб-элемент кнопки Login
//Также добавьте класс для страницы с продуктами, ProductsPage,
//которая открывается после успешного логина.
//У класса есть следующие параметры:
//-  веб-элемент плашки с текстом "Products"
//-  веб-элемент "бургер" (три горизонтальные черты)
//  в левом верхнем углу страницы,
//  который используется для открытия бокового меню
//-  веб-элемент кнопки "Logout" в боковом меню
//
//Напишите тест, в котором:
//-  открывается страница LoginPage
//-  вводится логин/пароль (standard_user) и нажимается кнопка Login
//-  проверяется, что перешли на страницу ProductPage
//  (перешли на страницу с нужным адресом
//  и есть плашка с текстом Products)
//-  проверяется, что отображается "бургер"
//-  нажимаете на "бургер"
//-  проверяется, что отображается кнопка "Logout"
//-  нажимаете на кнопку "Logout"
//-  проверяется, что перешли на страницу LoginPage
//  (перешли на страницу с нужным адресом
//  и есть лого с текстом "Swag Labs")


public class LoginPage {
    private final String address = "https://www.saucedemo.com";
    @FindBy(xpath = "//div[@class='login_logo']")
    public SelenideElement logo;
    @FindBy(xpath = "//input[@id='user-name']")
    public SelenideElement username;
    @FindBy(xpath = "//input[@id = 'password']")
    public SelenideElement password;
    @FindBy(xpath = "//input[@id = 'login-button']")
    public SelenideElement loginButton;

    public String getAddress() {
        return address;
    }
}
