import config.APITestConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class APIConfigurationTest {
    private APITestConfig config = new APITestConfig();
    @Test
    void simpleAPITest(){
        String baseURL = config.getBaseURL();
        String token = config.getToken();
        assertEquals("https://testurl.com",baseURL);
        assertEquals("testtoken1",token);
    }
}
