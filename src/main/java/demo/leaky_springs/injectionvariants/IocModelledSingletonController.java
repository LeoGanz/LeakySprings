package demo.leaky_springs.injectionvariants;

import demo.leaky_springs.IOC;
import demo.leaky_springs.casestudy.SecretPOJO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static demo.leaky_springs.Util.leakThroughPrint;
import static demo.leaky_springs.Util.leakThroughResponse;

@RestController
@RequestMapping("/ioc/singleton")
public class IocModelledSingletonController {

    private SecretPOJO secretPOJO = IOC.getSecretPOJO();

    @GetMapping("/leak")
    public ResponseEntity<String> onIocSingletonLeak() {
        String result = secretPOJO.getSecrets();
        leakThroughPrint(result);
        return leakThroughResponse(result);
    }

}
