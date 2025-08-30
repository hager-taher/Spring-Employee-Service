package com.example.Employee;
import com.example.Service.*;
import com.example.Employee.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config/Configuration.xml");

        EmployeeService service = (EmployeeService)  applicationContext.getBean("empService");

        service.create(new Employee(1L, "Hager", 10000));
        service.create(new Employee(2L, "Taher", 8000));
        service.create(new Employee(3L, "Galal", 50000));
        service.create(new Employee(4L, "Mohamed", 1000));

        System.out.println("---------------------------------------------------");
        System.out.println("All Employees: " + service.list());

        System.out.println("---------------------------------------------------");
        service.delete(3L);

        System.out.println("---------------------------------------------------");
        System.out.println("All Employees: " + service.list());









    }
}

