package demo;

import demo.leaky_springs.SecretPrototypeService;
import demo.leaky_springs.SecretService;

public class IocContainerModel {
    private static final SecretService SECRET_SERVICE;

    static {
        SECRET_SERVICE = new SecretService();
    }

    public static SecretService getSecretService() {
        return SECRET_SERVICE;
    }

    public static SecretPrototypeService getSecretPrototypeService() {
        return new SecretPrototypeService();
    }
}
