package seedu.address.model.person.exceptions;

/**
 * Signals that the operation will result in duplicate Patients (Patients are considered duplicates if they have the
 * same name).
 */
public class DuplicatePatientException extends RuntimeException {
    public DuplicatePatientException() {
        super("The patient already exists in the address book");
    }
}
