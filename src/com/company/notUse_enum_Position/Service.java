package com.company.notUse_enum_Position;


import java.util.List;

/**
 * this class will be have methods to calculate salary instances Employee
 */
public class Service {


    /**
     * this method calculate salary of month
     * @param emp instance class Employee
     * @return
     */
    public double calculateSalary(Employee emp) {
        double salary = emp.getRate() * emp.getHourOfMonth();
        return salary;
    }

    /**
     * this method calculate rate(bonus) to salary of month
      * @param emp instance class Employee
     * @return
     */
    public double changeRate(Employee emp){
        double changeBonus = 0;
        if(emp.getHourOfMonth() > 150) {
            changeBonus = calculateSalary(emp) * 0.1;
//            newRate += changeBonus;
        } else if(emp.getHourOfMonth() > 180) {
            changeBonus = calculateSalary(emp) * 0.2;
//            newRate += changeBonus;
        }else if(emp.getHourOfMonth() > 200) {
            changeBonus = calculateSalary(emp) * 0.25;
        }else{
            changeBonus = 0;
        }
        return changeBonus;
    }

    /**
     * this method calculate salary  + rate(bonus)
     * @param emp instance class Employee
     * @return
     */
    public double sumSalary(Employee emp) {
        double sumSalary = calculateSalary(emp) + changeRate(emp);
        return  sumSalary;
    }

    /**
     * this method calculate total salary all Employee in List<Employee>
     * @param employees - collection List<Employee>
     * @return
     */
    public double totalSalary(List<Employee> employees) {
        double sumSalary = 0;
        System.out.print("total salary employee = ");
/*        for(Employee emp : employees) {
            sumSalary += sumSalary();
//            System.out.print(emp.sumSalary() + " " + "+" + " ");
            System.out.printf("%,.3f + ", sumSalary());
        }*/
        for(int i = 0; i < employees.size(); i++) {
            sumSalary += sumSalary(employees.get(i));
            System.out.printf("%,.3f + ", sumSalary(employees.get(i)));
        }

/*        @Override
        public String toString() {
            return String.format("Employee name: %1$s!\t\tID-%5$d\n\t\tyour salary: %2$,.3f$,\t" +
                            "bonus: %3$,.3f$\n\t\tand your all salary with bonus = %4$,.3f$\n",
                    getName(), Service.calculateSalary(Employee emp), changeRate(), sumSalary(), getEmployeeID());
        }*/


        System.out.println();
        return sumSalary;
    }

    public void showTotalSalary(double totalSumSalary) {
        System.out.printf("total salary employee = %,.3f$\n", totalSumSalary);
    }

    public void show( ){

    }
}
