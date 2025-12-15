package model.taxReturn;

/**
 * Enumeration representing the lifecycle states of a Tax Return.
 * <p>
 * Tracks the progress of the return from creation (DRAFT) to calculation (PROCESSING)
 * and final submission (FILED).
 * </p>
 */
public enum TaxReturnEstatus {
    DRAFT,
    PROCESSING,
    FILED
}
