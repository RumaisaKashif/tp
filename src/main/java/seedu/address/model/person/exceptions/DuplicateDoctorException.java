package seedu.address.model.person.exceptions;

/**
 * Signals that the operation will result in duplicate Doctors (Doctors are considered duplicates if they have the
 * same name).
 */
public class DuplicateDoctorException extends RuntimeException {
    public DuplicateDoctorException() {
        super("The doctor already exists in the address book");
    }
}
