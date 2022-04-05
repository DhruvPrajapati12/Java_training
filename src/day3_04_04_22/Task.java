package day3_04_04_22;

class Member
{
    String name;
    int age;
    String number;
    String address;
    int salary;

    void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Employeee extends Member
{
    String specialization;
}

class Manager extends Member
{
    String department;
}

public class Task {
    public static void main(String[] args) {
        Employeee emp = new Employeee();
        Manager man = new Manager();

        emp.name = "Om";
        emp.age = 100;
        emp.number = "8200258254";
        emp.address = "Ahmedabad";
        emp.salary = 1; 
        emp.specialization = "Java";

        man.name = "Het";
        man.age = 51;
        man.number = "8200123456";
        man.address = "Mumbai";
        man.salary = 66666; 
        man.department = "Embedded";

        System.out.println("Employee: ");
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.number);
        System.out.println(emp.address);
        System.out.println(emp.salary);
        System.out.println(emp.specialization);
        
        System.out.println();

        System.out.println("Manager: ");
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.number);
        System.out.println(man.address);
        System.out.println(man.salary);
        System.out.println(man.department);
    }
}

