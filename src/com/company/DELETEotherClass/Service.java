package com.company.DELETEotherClass;

public class Service {


    public /*static*/ double calculateSalary(Employee e) {
        double salary = e.getRate() * e.getHourOfMonth();
        return salary;
    }

    public /*static*/ double calculateBonus(Employee e, double newRate) {
        double changeBonus = 0;
        if(e.getHourOfMonth() > 150) {
            changeBonus = newRate * 0.1;
//            newRate += changeBonus;
        } else if(e.getHourOfMonth() > 200) {
            changeBonus = newRate * 0.2;
//            newRate += changeBonus;
        } else{
//            newRate += changeBonus;
        }
//        return newRate;
        return changeBonus;
    }

    public /*static*/ double rateSalary() {

        return 0;
    }

    public void createEmployeeInfoFile(FileType type, Employee emp){

    }

}
