import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebConfigurationTest {

    @BeforeAll
    static void setup() {
        WebConfig config = ConfigFactory.create(WebConfig.class);
        Configuration.baseUrl = "https://github.com";
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.startMaximized = true;
        Configuration.remote = config.remoteDriverUrl();
    }

    @Test
    void checkPageWithExampleJUnitCode() {
        //Открыть страницу Selenide в Github
        open("/selenide/selenide");


    }
}