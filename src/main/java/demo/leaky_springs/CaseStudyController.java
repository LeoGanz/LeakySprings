package demo.leaky_springs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case-study")
public class CaseStudyController {

    @Autowired
    private SecretService secretService;

    private SecretPOJO secretPOJO = new SecretPOJO();

    @GetMapping("/service")
    public ResponseEntity<String> onLeakVariantService() {
        String result = secretService.getSecrets();
        System.out.println("Handling data: " + result);
        return ResponseEntity.ok("");
    }

    @GetMapping("/pojo")
    public ResponseEntity<String> onLeakVariantPojo() {
        String result = secretPOJO.getSecrets();
        System.out.println("Handling data: " + result);
        return ResponseEntity.ok("");
    }
}
