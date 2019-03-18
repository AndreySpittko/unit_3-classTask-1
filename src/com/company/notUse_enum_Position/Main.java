package com.company.notUse_enum_Position;

//import Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    private static Service service = new Service();

    public static void main(String[] args) {


/*
        Employee emp1 = new Employee("Volodimir", 1245569, 5, 210);
        Employee emp2 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp3 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp4 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp5 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp6 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp7 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp8 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp9 = new Employee("Oleh", 1240069, 11, 150);
        Employee emp10 = new Employee("Oleh", 1240069, 11, 150);

        Service sv = new Service();
        emp1.show();
        emp2.show();

        System.out.println(Employee.setTotalRate(););
        employee.totalCounter();
*/


        // Create collection List<Employee>
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ivan", 1246662, 5, 220));
        employees.add(new Employee("Petro", 1246663, 7, 110));
        employees.add(new Employee("Karl", 1246664, 11, 30));
        employees.add(new Employee("Lola", 1246665, 3, 142));
        employees.add(new Employee("Bendhamin", 1246666, 8, 167));
        employees.add(new Employee("Bob", 1246667, 2, 218));
        employees.add(new Employee("Olha", 1246668, 45, 219));
        employees.add(new Employee("Katerina", 1246679, 19, 231));
        employees.add(new Employee("Viktoria", 1246649, 15, 195));
        employees.add(new Employee("Marharita", 1246659, 25, 64));
        Collections.shuffle(employees); //
        for(Employee emp : employees) {
            emp.show();
        }

        service.showTotalSalary(service.totalSalary(employees));

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
    }
}
