public class SalariedEmployee extends Employee{
    // Class fields
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    //Salaried employees get paid every other week. So salary / 26 weeks.
    //@Overriding the collectPay() method, customizing it for the salaried employees.
    @Override
    public double collectPay(){
        // normal salary
        double payCheck = annualSalary / 26;
        // retirement pension
        double pension = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) pension;
    }

    // retirement compensation method.
    public void retire(){
        terminate("03/03/2037");
        isRetired = true;
    }
}
