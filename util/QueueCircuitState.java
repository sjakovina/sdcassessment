package circuitbreaker.util;

/**
 * Enumeration to represent the status of circuit.
 *
 */
public enum QueueCircuitState {
    CLOSED, OPEN, HALF_OPEN;

    /**
     * Returns the enum QueueCircuitState which matches the specified String value.
     *
     * @param state The state as String
     * @param defaultReturnValue The QueueCircuitState to return when nothing matches (or null was provided)
     * @return The matching QueueCircuitState or the provided default value if none matches.
     */
    public static QueueCircuitState fromString(String state, QueueCircuitState defaultReturnValue) {
        for (QueueCircuitState queueCircuitState : values()) {
            if (queueCircuitState.name().equalsIgnoreCase(state)) {
                return queueCircuitState;
            }
        }
        return defaultReturnValue;
    }
}
