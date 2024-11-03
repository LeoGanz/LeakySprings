package demo.leaky_springs.casestudy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SecretService {
    private final Map<String, String> json = new HashMap<>();

    public String getSecrets() {
        return json.get("field_oauth_token");
    }
}
