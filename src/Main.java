public class Main {
    public static void main (String[] args){
        //Adding a new employee
        Employee Alex = new Employee("Alex", "09/27/1996", "02/02/2021");
        System.out.println(Alex);
        // Gets Alex's current age
        System.out.println("Age " + Alex.getAge());
        //Gets ALex's pay
        System.out.println("Pay " + Alex.collectPay());

        // Adding a second employee - salaried
        SalariedEmployee Jason = new SalariedEmployee("Jason", "03/03/2005", "03/03/2023", 45000);
        System.out.println(Jason);
        System.out.println("Jason's paycheck = $" + Jason.collectPay());
        // Getting Jason's retirement pension compensation.
        Jason.retire();
        System.out.println("Jason's pension paycheck = $" + Jason.collectPay());

        // Adding a third employee - hourly worker
        HourlyEmployee Jen = new HourlyEmployee("Jen", "04/04/1999", "04/04/2023", 20);
        System.out.println(Jen);
        System.out.println("Jen's paycheck = $" + Jen.collectPay());
        System.out.println("Jen's over time paycheck = $" + Jen.overTimePay());
    }
}
