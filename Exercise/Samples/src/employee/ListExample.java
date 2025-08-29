package employee;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String [] args){
        List<Employee>employeeList=new ArrayList<>();

        Employee employee_1 = new Employee(1,"Gopinath",2000);
        Employee employee_2 = new Employee(2,"Gurusamy",2000);
        Employee employee_3 = new Employee(3,"Nagaraj",2000);
        Employee employee_4 = new Employee(4,"Navya",2000);
        Employee employee_5 = new Employee(5,"Deepa",2000);
        Employee employee_6 = new Employee(6,"Nylah",2000);
        Employee employee_7 = new Employee(7,"Naveen",2000);


        employeeList.add(employee_1);
        employeeList.add(employee_2);
        employeeList.add(employee_3);
        employeeList.add(employee_4);
        employeeList.add(employee_5);
        employeeList.add(employee_6);


        employeeList.add(0,employee_7);


        System.out.println("Size of the list...." + employeeList.size());

        for (Employee employee:employeeList){
            System.out.println(employee);
        }


    }
}