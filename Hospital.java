package Hospital1;

public class Hospital {

	public static void main(String[] args) {
		Nurse nurse = new Nurse("Sonny", 789, 6);
        Doctor doctor = new Doctor("Michael", 234, "Heart");
        Surgeon surgeon = new Surgeon("Vincent", 645, "Brain", true);
        HospitalEmployee employee = new HospitalEmployee("Vito", 123);

        System.out.println(employee);
        System.out.println(doctor);
        System.out.println(surgeon);
        System.out.println(nurse);

        employee.work();
        doctor.work();
        surgeon.work();
        nurse.work();
    }
}

   