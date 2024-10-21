package demo.leaky_springs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/leak")
public class LeakyController {
    private final Map<String, String> json = new HashMap<>();

    @GetMapping("/path/{data}")
    public ResponseEntity<String> onLeakPathVariable(@PathVariable(name = "data") String data) {
        Util.leakThroughPrint(data);
        return Util.leakThroughResponse(data);
    }

    @GetMapping("/jsonmap")
    public ResponseEntity<String> onLeakJsonMap() {
        String result = json.get("field_oauth_token");
        System.out.println("Handling data: " + result);
        return ResponseEntity.ok("Leaky response leaking data: " + result);
    }
}
