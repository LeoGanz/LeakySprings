package demo.leaky_springs.injectionvariants;

import demo.leaky_springs.IOC;
import demo.leaky_springs.SecretPrototypePOJO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static demo.leaky_springs.Util.leakThroughPrint;
import static demo.leaky_springs.Util.leakThroughResponse;

@RestController
@RequestMapping("/ioc/prototype")
public class IocModelledPrototypeController {

    private SecretPrototypePOJO secretPrototypePOJO = IOC.getSecretPrototypePOJO();

    @GetMapping("/leak")
    public ResponseEntity<String> onIocPrototypeLeak() {
        String result = secretPrototypePOJO.getSecrets();
        leakThroughPrint(result);
        return leakThroughResponse(result);
    }

}
