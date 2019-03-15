package com.company.enum_Position_withOneParam;


public class Designer extends Employee {

    public Designer() {
        super();
    }

    public Designer(String name) {
        super(name);
    }

    public Designer(String name, long employeeID) {
        super(name, employeeID);
    }

    public Designer(String name, long employeeID, int rate, int hourOfMonth) {
        super(name, employeeID, rate, hourOfMonth);
    }


    @Override
    public String toString() {
        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
//        return String.format("Designer name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\tbonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n", super());   // Can  I call this  method use super????

    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    protected void totalCounter() {
        super.totalCounter();
    }
}
