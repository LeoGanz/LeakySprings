package demo.leaky_springs;

import java.util.HashMap;
import java.util.Map;

public class SecretPrototypePOJO {
    private final Map<String, String> json = new HashMap<>();

    public String getSecrets() {
        return json.get(Util.SENSITIVE_STRING);
    }
}
