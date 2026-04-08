package seedu.address.model.appointment;

/**
 * Creates an Appointment object
 */
public class Appointment {
    /**
     * Sentinel value for appointments that have not been persisted/assigned an ID yet.
     * ID assignment is handled by {@code seedu.address.storage.AppointmentManager}.
     */
    public static final int UNASSIGNED_ID = -1;

    private String patientName;
    private String doctorName;
    private String date;
    private String time;
    private int apptID;

    /**
     * Initialises an Appointment object with the doctorname, patient name, and the date and time
     * @param doctorName
     * @param patientName
     * @param date
     * @param time
     */
    public Appointment(String doctorName, String patientName, String date, String time) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.date = date;
        this.time = time;
        this.apptID = UNASSIGNED_ID;

    }

    /**
     * initialises an appointment with the ID inputted by the user
     * @param doctorName
     * @param patientName
     * @param date
     * @param time
     * @param apptID
     */
    public Appointment(String doctorName, String patientName, String date, String time, int apptID) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.date = date;
        this.time = time;
        this.apptID = apptID;
    }

    public String getPatName() {
        return this.patientName;
    }

    public String getDocName() {
        return this.doctorName;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public int getApptID() {
        return this.apptID;
    }

    public void setApptID(int apptID) {
        this.apptID = apptID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Appointment) {
            return (this.patientName.equals(((Appointment) obj).getPatName())
                    && this.date.equals(((Appointment) obj).getDate())
                    && this.time.equals(((Appointment) obj).getTime()));
        } else {
            return false;
        }
    }

}
