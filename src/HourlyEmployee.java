public class HourlyEmployee extends Employee{
    // Class fields
    private double hourPayRate;

    // Constructor
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourPayRate) {
        super(name, birthDate, hireDate);
        this.hourPayRate = hourPayRate;
    }

    //@Overriding the collectPay() method, customizing it for the hourly worker.
    @Override
    public double collectPay(){
        return 40 * hourPayRate;
    }

    // Calculating overtime pay rate for the hourly worker.
    public double overTimePay(){
        return 2 * collectPay();
    }
}
