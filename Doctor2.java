package Hospital2;

public class Doctor2 extends HospitalEmployee2 {
    private String specialty;

    public Doctor2(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " +
                super.getName() + " is a " + specialty + " doctor.");
    }

    @Override
    public String toString() {
        return super.toString() + " " + specialty;
    }
}
