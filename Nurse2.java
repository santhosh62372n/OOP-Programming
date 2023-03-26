package Hospital2;

public class Nurse2 extends HospitalEmployee2 {
    private int numOfPatients;

    public Nurse2(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " +
                super.getName() + " is a nurse with " + numOfPatients + " patients.");
    }
    @Override
    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }
}
