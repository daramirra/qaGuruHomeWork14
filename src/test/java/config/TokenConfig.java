package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@LoadPolicy(MERGE)
@Sources({
        "system:properties",
        "file:/tmp/token.properties",
        "classpath:token-config.properties"
})
public interface TokenConfig extends Config {
    String token();
}


