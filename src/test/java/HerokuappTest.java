import base.BaseClass;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuappTest extends BaseClass {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open(app.herokuappPage().getAddress());

    }
    @Test
    public void test(){
        app.herokuappPage().helloWorldText.shouldNotBe(Condition.visible);
        app.herokuappPage().button.click();
        Selenide.sleep(5000);
        app.herokuappPage().helloWorldText.shouldBe(Condition.visible);
    }
}
