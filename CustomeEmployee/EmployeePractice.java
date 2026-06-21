package CustomeEmployee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeePractice {

    public static void main(String[] args) {
        

        List<Employee> employees = Arrays.asList(
        new Employee(1, "Rakesh", "IT", 80000, 27),
        new Employee(2, "Amit", "HR", 50000, 30),
        new Employee(3, "Rahul", "IT", 90000, 28),
        new Employee(4, "Priya", "Finance", 70000, 26),
        new Employee(5, "Neha", "HR", 55000, 31),
        new Employee(6, "Ankit", "IT", 95000, 29),
        new Employee(7, "Pooja", "Finance", 85000, 32),
        new Employee(8, "Rohit", "IT", 60000, 25)
    );

        //Get All Employee Name

        List<String>empName = employees.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(empName);

        //Find Employees Belonging to IT Department

        List<Employee>ItDepartment = employees.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.toList());

        System.out.println(ItDepartment);

        //Find Employee with Highest Salary
        Optional<Employee>HighestSal = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();

        System.out.println("Highest Salary -> "+HighestSal.get());

        //Find Employee with Lowest Salary
        Optional<Employee>LowestSal = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
        System.out.println("Lowest Salary ->"+LowestSal);

        //Count Employees in Each Department

        Map<String,Long>CountEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(CountEmployee);


        //Find Highest Salary Employee in Each Department

        Map<String,Optional<Employee>>HighestInEachDep = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(HighestInEachDep);


        

    }
    
}
