public class Doctor {
    private String fullName;
    private String specialization;
    private String phoneNumber;
    private String email;


    public Doctor(String fullName, String specialization, String phoneNumber, String email){
        this.fullName = fullName;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Doctor " + fullName + " treats " + patient.getName());
    }
}
