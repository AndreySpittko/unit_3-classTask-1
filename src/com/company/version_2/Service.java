package com.company.version_2;


/**
 * this class will be have methods to calculate salary instances Employee
 */
public class Service {


    /**
     * this method calculate salary of month
     * @return
     */
    public /*static*/ double calculateSalary(Employee emp) {
        double salary = emp.getRate() * emp.getHourOfMonth();
        return salary;
    }

    /**
     * this method calculate rate(bonus) to salary
     * @return
     */
    public /*static*/ double changeRate(Employee emp){
        double changeBonus = 0;
        if(emp.getHourOfMonth() > 150) {
            changeBonus = calculateSalary(emp) * 0.1;
//            newRate += changeBonus;
        } else if(emp.getHourOfMonth() > 200) {
            changeBonus = calculateSalary(emp) * 0.2;
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
    public /*static*/ double sumSalary(Employee emp) {
        double sumSalary = calculateSalary(emp) + changeRate(emp);
        return  sumSalary;
    }




}
