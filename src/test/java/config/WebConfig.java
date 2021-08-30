package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources(
        "classpath:${testType}.properties"
)
public interface WebConfig extends Config {

    String browser();
    String browserVersion();
    String remoteDriverUrl();

}
