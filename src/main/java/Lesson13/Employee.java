package Lesson13;

public class Employee {
    private final String FIO;
    private final int tN;
    private final int workAge;

    public Employee(String FIO, int tN, int workAge) {
        this.FIO = FIO;
        this.tN = tN;
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getFIO() {
        return FIO;
    }

    public int getWorkAge() {
        return workAge;
    }
}
