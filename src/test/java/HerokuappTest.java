import base.BaseClass;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuappTest extends BaseClass {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open(herokuappPage.getAddress());

    }
    @Test
    public void test(){
        herokuappPage.helloWorldText.shouldNotBe(Condition.visible);
        herokuappPage.button.click();
        Selenide.sleep(5000);
        herokuappPage.helloWorldText.shouldBe(Condition.visible, Duration.ofSeconds(5));
    }
}
