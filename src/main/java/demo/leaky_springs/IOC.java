package demo.leaky_springs;

public class IOC {

    private static final SecretPOJO secretPOJO = new SecretPOJO();
    private static final OtherPojo otherPojo = new OtherPojo();

    public static SecretPOJO getSecretPOJO() {
        return secretPOJO;
    }

    public static SecretPrototypePOJO getSecretPrototypePOJO() {
        return new SecretPrototypePOJO();
    }

    public static OtherPojo getOtherPojo() {
        return otherPojo;
    }
}
