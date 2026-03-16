public class Main {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("City Hospital", "Shevchenko St.");
        hospital1.showHospital();

        //inner class
        Hospital.Administrator admin1 = hospital1.new Administrator("Anna Sasaha", "0988868686", "as@gmail.com");
        admin1.manageHospital();

        //static nested class
        Hospital.Department department1 = new Hospital.Department("Surgery", 3);
        department1.showDepartment();

        //association
        Doctor doctor1 = new Doctor("A A", "Cardiologist", "0988868686", "aa@gmail.com");
        Patient patient1 = new Patient("B B", "female", "0988818888", "Shevchenko St.", " bb@gmail.com");

        doctor1.treatPatient(patient1);

        //local class
        class Reception{
            void createReception() {
                System.out.println("Reception created for patient.");
            }
        }

        Reception reception1 = new Reception();
        reception1.createReception();


    }
}
