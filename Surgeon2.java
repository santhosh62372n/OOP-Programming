package Hospital2;

public class Surgeon2 extends Doctor2 {
    private boolean operating;

    public Surgeon2(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }
    @Override
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " +
                super.getName() + " is " + (operating ? "operating now." : "not operating now."));
    }
    @Override
    public String toString() {
        return super.toString() + " Operating: " + operating;
    }
}
