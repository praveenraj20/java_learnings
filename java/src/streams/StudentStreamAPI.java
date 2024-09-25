package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamAPI {
    private int id;
    private String name;

    public StudentStreamAPI(int id, String name, int cgpa, String place) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.place = place;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", place='" + place + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    private int cgpa;
    private String place;

    public static void main(String[] args ){

        List<StudentStreamAPI> studentList = Arrays.asList(
                new StudentStreamAPI(1, "Praveen", 5, "Salem"),
                new StudentStreamAPI(2, "Raj", 6, "salem"),
                new StudentStreamAPI(3, "Arun", 7, "Ariyalur"),
                new StudentStreamAPI(4, "Asoke", 8, "Thanjur"),
                new StudentStreamAPI(5, "Abi", 8, "Thanjur")

        );

        StudentStreamAPI topStudentInSalem = studentList.stream()
                .filter(s->"salem".equals(s.getPlace()))
                .max(Comparator.comparing(StudentStreamAPI::getCgpa))
                .orElse(null);

        if (topStudentInSalem !=null){
            System.out.println("topStudentInSalem: "+topStudentInSalem.getName());
        }
        else {
            System.out.println("No student in Erode");
        }


       List <StudentStreamAPI> topTwoStudent = studentList.stream()
                .sorted(Comparator.comparing(StudentStreamAPI::getCgpa).reversed())
                .limit(2)
                .collect(Collectors.toList());
        topTwoStudent.forEach(s-> System.out.println(s.getName()));

    }


}
