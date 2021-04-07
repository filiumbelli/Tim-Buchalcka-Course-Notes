package PredicatesSuppliersLambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    private static Scanner scanner;


    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Insert the age to start categorization: ");
//        scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
        int age = 30;
        ArrayList<Employee> employees = new ArrayList();

        employees.add(new Employee("Karan bulut", 25));
        employees.add(new Employee("Burak turuk", 31));
        employees.add(new Employee("Tuğrul cunub", 45));
        employees.add(new Employee("Ali uğrak", 33));
        String text = "Older than " + age;
        // Predicates
//        printEmployeeByAge(employees,text,employee -> employee.getAge()>= age);
        Predicate<Integer> greaterThan15 = i -> i > 15;
        Predicate<Integer> lessThan100 = i -> i < 100;
//        System.out.println("Test is " + greaterThan15.and(lessThan100).test(25));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }


        // lambda
        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println("Last name from lambda expression is: " + lastName);
        });

        // lambda functions
        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(" ") + 1);
        };
        // lambda functions
        Function<Employee, String> getFirstName = (employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(" "));
        };
        System.out.println("---------------------------------------");
        employees.forEach(employee -> {
            System.out.println("Last name from Lambda function is: " + getLastName.apply(employee));
        });
        System.out.println("---------------------------------------");
        employees.forEach(employee -> {
            System.out.println("Name: " + getFirstName.apply(employee));
        });
        System.out.println("---------------------------------------");

        employees.forEach(employee->{
            System.out.println("From static function: " + getName(getFirstName,employee));
        });
        Function<Employee,String> upperCase = (employee) ->{
            return employee.getName().toUpperCase();
        };
        Function<String,String> firstName = (name) -> name.substring(0,name.indexOf(" "));
        Function nameUpperCased = upperCase.andThen(firstName);
        employees.forEach(employee ->{
            System.out.println(nameUpperCased.apply(employee));
        });


    }
    private static String getName (Function<Employee,String> getFirstName,Employee employee){
        return getFirstName.apply(employee);
    }

    private static void printEmployeeByAge(List<Employee> employees, String text, Predicate<Employee> condition) {
        System.out.println(text);
        for (Employee emp : employees) {
            if (condition.test(emp))
                System.out.println(emp.getName());
        }
    }
}
