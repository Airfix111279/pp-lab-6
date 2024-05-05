import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1);
        Worker worker2 = new Worker("Alice", 1800, 2);
        Worker worker3 = new Worker("Bob", 2200, 3);
        Worker worker4 = new Worker("Emily", 1900, 4);

        Manager manager = new Manager("Michael", 5000, 5);

        System.out.println("Manager's Salary: " + manager.getSalary());
        manager.work();

        System.out.println("Worker 1's Salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2's Salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3's Salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4's Salary: " + worker4.getSalary());
        worker4.work();
    }
}
