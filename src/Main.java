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
        Worker worker5 = new Worker("Tom", 2500, 1, "2022-02-28", "Senior Developer");
        Worker worker6 = new Worker("Sophia", 2100, 6, "2023-04-15", "Junior Tester");

        Manager manager1 = new Manager("Michael", 5000, 5, "2017-07-01", "Senior Manager");
        Manager manager2 = new Manager("Laura", 4800, 2, "2019-10-10", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total Salary of all employees: " + totalSalary);
        System.out.println("Total Salary of all Managers: " + totalManagerSalary);
        System.out.println("Total Salary of all Workers: " + totalWorkerSalary);

        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).hashCode() == employees.get(j).hashCode()) {
                    System.out.println("Duplicate found: " + employees.get(i).getName() + " and " + employees.get(j).getName());
                }
            }
        }
    }
}
