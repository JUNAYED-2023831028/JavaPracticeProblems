package PracticeProblem8;

abstract class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    abstract double calculatePay();
}

class FullTimeEmployee extends Employee {
    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    double calculatePay() {
        return contractAmount;
    }
}

public class PP8A {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Junayed", 1, "SWE", 5000);
        PartTimeEmployee pt = new PartTimeEmployee("Nerob", 2, "A", 500, 10);
        ContractEmployee ct = new ContractEmployee("Rakib", 3, "B", "Game", 10000);

        System.out.println(ft.calculatePay());
        System.out.println(pt.calculatePay());
        System.out.println(ct.calculatePay());
    }
}