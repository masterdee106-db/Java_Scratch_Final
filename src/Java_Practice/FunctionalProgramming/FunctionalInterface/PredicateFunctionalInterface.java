package Java_Practice.FunctionalProgramming.FunctionalInterface;

import java.util.function.Predicate;

class Employee{
    String name;
    int age;
    double Salary;

    Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.Salary=salary;
    }
}
public class PredicateFunctionalInterface {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Deepan", 24, 30000.00);
        // Withuot Predicate FI
        Predicate<Employee> isEligible = new Predicate<Employee>() {
            @Override
            public boolean test(Employee e) {
                return e.age > 18;
            }
        };

//        Predicate<Employee> isEligible = e->e.age>18;

        if (isEligible.test(emp1)){
            System.out.println("Employee is eligible...");
        }
        else {
            System.out.println("Employee is not eligible...");
        }

        Predicate<Employee> checkSalary= emp->emp.Salary>50000.00;
        if (checkSalary.test(emp1)){
            System.out.println("Employees is coming under middle class category...");
        }
        else {
            System.out.println("Employee is coming under low class category.");
        }
    }
}


