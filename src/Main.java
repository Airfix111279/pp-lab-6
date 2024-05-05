import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2020-01-01", "Developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2019-05-15", "Tester");
        Worker worker3 = new Worker("Bob", 2200, 3, "2021-03-10", "Designer");
        Worker worker4 = new Worker("Emily", 1900, 4, "2018-11-20", "Project Manager");

        Manager manager = new Manager("Michael", 5000, 5, "2017-07-01", "Senior Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}
