package circuitbreaker.util;

/**
 * Enumeration to represent the possible result of queued request response.
 *
 */
public enum QueueResponseType {
    SUCCESS(":success"), FAILURE(":failure");

    private String keySuffix;

    QueueResponseType(String keySuffix){
        this.keySuffix = keySuffix;
    }

    public String getKeySuffix() {
        return keySuffix;
    }
}
