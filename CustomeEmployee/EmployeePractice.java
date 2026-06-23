package CustomeEmployee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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


        //Average Salary by Department

        Map<String,Double>averageSal = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSal);

        //Find Employees Earning More Than 80000

        Optional<Employee>EarningMoreThan = employees.stream().filter(e -> e.getSalary()>80000).findFirst();
        System.out.println(EarningMoreThan);

        //Sort Employees by Salary Descending

        List<Employee>sortEmployee = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortEmployee);


        //Find Second Highest Salary Employee

        Optional<Employee>secondHighest = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).skip(1).findFirst();
        System.out.println(secondHighest);

        //Department Having Highest Number of Employees
        String department = employees.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting())).entrySet()
                            .stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(department);
        
        //Find Employees Above Average Salary
        double avgSal = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

        Optional<Employee>avgSalEmp = employees.stream().filter(avg -> avg.getSalary() > avgSal).findFirst();
        System.out.println(avgSalEmp);

        //partition of Employee based on age > 30

        Map<Boolean,List<Employee>>partition_age = employees.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        System.out.println(partition_age);

        //Convert List into Map

        Map<Integer,String>IdandName = employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println(IdandName);


    }
    
}
