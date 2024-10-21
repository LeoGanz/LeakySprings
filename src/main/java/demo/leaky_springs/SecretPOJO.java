package demo.leaky_springs;

import java.util.HashMap;
import java.util.Map;

public class SecretPOJO {
    private final Map<String, String> json = new HashMap<>();

    public String getSecrets() {
        return json.get("field_oauth_token");
    }
}
