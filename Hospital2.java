package Hospital2;

public class Hospital2 {

	public static void main(String[] args) {
		Nurse2 nurse = new Nurse2("Sonny", 789, 6);
        Doctor2 doctor = new Doctor2("Michael", 234, "Heart");
        Surgeon2 surgeon = new Surgeon2("Vincent", 645, "Brain", true);
        HospitalEmployee2 employee = new HospitalEmployee2("Vito", 123);

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