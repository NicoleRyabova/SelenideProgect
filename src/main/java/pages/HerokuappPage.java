package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//4 task
//По аналогии с предыдущими заданиями, напишите тест для страницы
//the-internet.herokuapp.com/dynamic_loading/1,
//в котором:
//- отрывается страница
//- проверяется, что отсутсвует элемент с текстом "Hello World"
//- нажимается кнопка
//- через некоторое время  появляется элемент с текстом
public class HerokuappPage {
    private final String address = "https://the-internet.herokuapp.com/dynamic_loading/1";
    @FindBy(xpath = "//div[@id = 'start']/button")
    public SelenideElement button;

    @FindBy(xpath = "//div[@id = 'finish']")
    public SelenideElement helloWorldText;

    public String getAddress() {
        return address;
    }
}