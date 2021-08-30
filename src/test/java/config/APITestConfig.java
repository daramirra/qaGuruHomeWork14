package config;

import org.aeonbits.owner.ConfigFactory;

public class APITestConfig {
    private String baseURL = "https://testurl.com";

    public String getBaseURL() {
        return baseURL;
    }

    public String getToken() {
        TokenConfig config = ConfigFactory.create(TokenConfig.class);
        return config.token();
    }
}
