package com.company.DELETEotherClass;


public class Employee extends Person {

    private long employeeID;
    private int rate;
    private int hourOfMonth;

    private static double totalRate = 0;
//    Position position;

    {
        totalRate += sumSalary();
    }

    // Constructors
    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, long employeeID) {
        super(name);
        this.employeeID = employeeID;
    }

    public Employee(String name, long employeeID, int rate, int hourOfMonth) {
        super(name);
        this.employeeID = employeeID;
        this.rate = rate;
        this.hourOfMonth = hourOfMonth;
        totalRate = sumSalary();

    }
/*
    public Employee(String name, long employeeID, Position position, int hourOfMonth) {
        super(name);
        this.employeeID = employeeID;
//        this.rate = rate;
        this.position = position;
        this.hourOfMonth = hourOfMonth;
    }
*/

    // getters and setters


    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHourOfMonth() {
        return hourOfMonth;
    }

    public void setHourOfMonth(int hourOfMonth) {
        this.hourOfMonth = hourOfMonth;
    }

/*
    public */
/*static*//*
 double getTotalRate() {
        totalRate += Employee.sumSalary();
        return totalRate;
    }
*/

    public static void setTotalRate(double totalRate) {
        Employee.totalRate = totalRate;
    }

    public double salary(int rate, int hour){
        double salary = rate * hour;
        return  salary;
    }

    public /*static*/ double calculateSalary() {
        double salary = getRate() * getHourOfMonth();
        return salary;
    }
    public /*static*/ double changeRate(){
            double changeBonus = 0;
        if(getHourOfMonth() > 150) {
            changeBonus = calculateSalary() * 0.1;
//            newRate += changeBonus;
        } else if(getHourOfMonth() > 200) {
            changeBonus = calculateSalary() * 0.2;
//            newRate += changeBonus;
        } else{
//            newRate += changeBonus;
        }
//        return newRate;
        return changeBonus;
    }
    public /*static*/ double sumSalary() {
        double sumSalary = calculateSalary() + changeRate();
        return  sumSalary;
    }

    @Override
    public String toString() {
        return String.format("name: %s!\n\t\tyour salary: %,.3f$,\tbonus: %,.3f$\n\t\tand your all salary with bonus = %,.3f$\n", getName(), calculateSalary(), changeRate(), sumSalary());
    }
    public void show() {
        System.out.println(toString());
    }


}
