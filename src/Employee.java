public class Employee extends Worker{

    // Employee class fields
    private long employeeId;
    private String hireDate;

    private static int employeeNumber = 1;

    // Constructor
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        // The line below will set the first employee that gets added to 1, and will automatically increment as more get added.
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    // toString() built in method, including the super.toString()
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
