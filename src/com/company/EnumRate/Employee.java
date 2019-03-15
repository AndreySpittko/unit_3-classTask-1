package com.company.EnumRate;


public class Employee extends Person {

    private long employeeID;
    private Position position;
//    private int rate; /* del field*/
protected int hourOfMonth;

    private static double totalRate = 0;    // total salary all Employee

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

    public Employee(String name, long employeeID/*, int rate*/, Position position, int hourOfMonth) {
        super(name);
        this.employeeID = employeeID;
//        this.rate = rate; /* del field*/
        this.position = position;
        this.hourOfMonth = hourOfMonth;

    }

    // getters and setters

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }


/*
    public int getRate() {  //  delete this method
        return rate;
    }

    public void setRate(int rate) {  //  delete this method
        this.rate = rate;
    }
*/

    public int getHourOfMonth() {
        return hourOfMonth;
    }

    public void setHourOfMonth(int hourOfMonth) {
        this.hourOfMonth = hourOfMonth;
    }

    public Position getPosition() {
        return  position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    // Methods class
    public static void setTotalRate(double totalRate) {
        Employee.totalRate = totalRate;
//        totalRate += sumSalary();
    }


    /**
     * this method calculate salary of month
     * @return
     */
    public /*static*/ double calculateSalary() {
        double salary = position.getRageOfHour() * getHourOfMonth();
        return salary;
    }

    /**
     * this method calculate rate(bonus) to salary
     * @return
     */
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

    /**
     * this method calculate salary  + rate(bonus)
     * @return
     */
    public /*static*/ double sumSalary() {
        double sumSalary = calculateSalary() + changeRate();
        return  sumSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                getName(), calculateSalary(), changeRate(), sumSalary(), getEmployeeID());
    }

    /**
     * this method show info about Employee
     */
    public void show() {
        System.out.println(toString());
    }

    /**
     * this method calculate amount Employee
     */
    protected void totalCounter() {
        String s = String.format("Total employee: %d\n", counter.getCounter());
        System.out.print(s);
    }
}
