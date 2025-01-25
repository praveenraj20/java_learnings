package interviewqs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    String name;
    int age;
    int rollno;

    public Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static  void  main(String[] lt){
        Student s1 = new Student("praveen",25,101);
        Student s2 = new Student("raj",15,102);
        Student s3 = new Student("arun",20,103);
        Student s4 = new Student("anu",18,104);

        List<Student> studentList = Arrays.asList(s1,s2,s3,s4);

        List<Student> filterstd = studentList.stream().filter(student -> student.getAge() < 20).collect(Collectors.toList());
//        studentList.stream().
        List<Student> res = studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).toList();

        res.forEach(student -> System.out.println(student.getName()));

        filterstd.forEach(student -> System.out.println(student.getName()));

    }
}
