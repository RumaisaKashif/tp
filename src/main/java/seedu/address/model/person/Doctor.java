package seedu.address.model.person;

/**
 * Represents a doctor in the app.
 * Extends {@code Person} to support the new 'adddoc' command.
 */
public class Doctor extends Person {
    public Doctor(Name name, Phone phone, Email email, Address address) {
        super(name, phone, email, address);
    }

    // Override toString() to reflect the name as Dr. ...
}
