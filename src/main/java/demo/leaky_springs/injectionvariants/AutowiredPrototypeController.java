package demo.leaky_springs.injectionvariants;

import demo.leaky_springs.SecretPrototypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static demo.leaky_springs.Util.leakThroughPrint;
import static demo.leaky_springs.Util.leakThroughResponse;

@RestController
@RequestMapping("/autowired/prototype")
public class AutowiredPrototypeController {

    @Autowired
    private SecretPrototypeService secretPrototypeService;

    @GetMapping("/leak")
    public ResponseEntity<String> onAutowiredPrototypeLeak() {
        String result = secretPrototypeService.getSecrets();
        leakThroughPrint(result);
        return leakThroughResponse(result);
    }

}
