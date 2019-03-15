package com.company.EnumRate;

//import Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * in this version project I use class enum Position for calculate salary Employee
 */
public class Main {

    public static void main(String[] args) {


/*
        Employee emp1 = new Employee("Volodimir", 1245569, 5, 210);
        Employee emp2 = new Employee("Oleh", 1240069, 11, 150);

//        emp1.
//        employeeService.

        Service sv = new Service();
        emp1.show();

        emp2.show();
//        System.out.println(Employee.setTotalRate(););
//        employee.totalCounter();
*/


//        Employee.setTotalRate();

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ivan", 1246662, Position.INTERMIDIATE_PRO, 220));
        employees.add(new Employee("Petro", 1246663, Position.JUNIOR_STRONG, 110));
        employees.add(new Employee("Karl", 1246664, Position.JUNIOR, 30));
        employees.add(new Employee("Lola", 1246665, Position.JUNIOR_PRO, 142));
        employees.add(new Employee("Bendhamin", 1246666, Position.INTERMIDIATE, 167));
        employees.add(new Employee("Bob", 1246667, Position.INTERMIDIATE_STRONG, 218));
        employees.add(new Employee("Olha", 1246668, Position.SENIOR, 219));
        employees.add(new Employee("Katerina", 1246679, Position.JUNIOR, 231));
        employees.add(new Employee("Viktoria", 1246649, Position.JUNIOR, 195));
        employees.add(new Employee("Marharita", 1246659, Position.JUNIOR_PRO, 64));
        Collections.shuffle(employees);
        for(Employee emp : employees) {
            emp.show();
        }

        System.out.println("!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!");

        for(int i = 0; i < employees.size(); i++) {
            String name = employees.get(i).getName();
            System.out.println(name);
        }

        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");

/*
        Collection<String> names;
//        Collection<String> names1 = Collections.singleton(employees.get(i).getName());

        for(int i = 0; i < employees.size(); i++) {
            names = Collections.singleton(employees.get(i).getName());
//            String name = employees.get(i).getName();
        }


*/
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(new Developer("Ivan1", 1246662, Position.INTERMIDIATE_STRONG, 220));
        developers.add(new Developer("Ivan2", 1246662, Position.INTERMIDIATE_STRONG, 120));
        for(Developer dev : developers) {
            dev.show();
        }
    }
}
