package demo.leaky_springs;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("prototype")
public class SecretPrototypeService {

    private final Map<String, String> json = new HashMap<>();

    public String getSecrets() {
        return json.get(Util.SENSITIVE_STRING);
    }
}
