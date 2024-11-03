package demo.leaky_springs.injectionvariants;

import demo.leaky_springs.casestudy.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static demo.leaky_springs.Util.leakThroughPrint;
import static demo.leaky_springs.Util.leakThroughResponse;

@RestController
@RequestMapping("/autowired/singleton")
public class AutowiredSingletonController {

    @Autowired
    private SecretService secretService;

    @GetMapping("/leak")
    public ResponseEntity<String> onAutowiredSingletonLeak() {
        String result = secretService.getSecrets();
        leakThroughPrint(result);
        return leakThroughResponse(result);
    }

}
