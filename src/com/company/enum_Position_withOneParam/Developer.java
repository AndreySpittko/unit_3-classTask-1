package com.company.enum_Position_withOneParam;


public class Developer extends Employee {

    // Constructors
    public Developer() {
    }

    public Developer(String name) {
        super(name);
    }

    public Developer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Developer(String name, long employeeID, int rate, int hourOfMonth) {
        super(name, employeeID, rate, hourOfMonth);
    }

    @Override
    public String toString() {
        return String.format("Developer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    protected void totalCounter() {
        String s = String.format("Total developer: %d\n", counter.getCounter());
        System.out.print(s);
    }
}
