package basicProgram;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;


class Employee{
    public Employee(int id, String name, String dept, int salary) {
        Id = id;
        this.name = name;
        Dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int Id;
    String name;
    String Dept;
    int salary;


}

public class EmployeeList{
    public static void main(String[] args ){
        List<Employee> employee = Stream.of(
                new Employee(1,"Praveen","dev",800000),
                new Employee(2,"Raj","dev",400000),
                new Employee(3,"Raja","qa",500000),
                new Employee(4,"Arun","qa",600000),
                new Employee(5,"Anu","ops",700000)).toList();
        Map<String, List<Employee>> a = employee.stream().collect(groupingBy(Employee::getDept));
        System.out.println(a);
    }


}
