package demo.leaky_springs;

import org.springframework.http.ResponseEntity;

public class Util {
    public static final String SENSITIVE_STRING = "oauth token";

    public static ResponseEntity<String> leakThroughResponse(String result) {
        return ResponseEntity.ok("Leaky response leaking data: " + result);
    }

    public static void leakThroughPrint(String data) {
        System.out.println("Handling data: " + data);
    }
}
