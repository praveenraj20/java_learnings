package basicPrograms;

class Student {
    int rollNo;
    String name;
    int marks;
}

public class CoreJava {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "raj";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Neeraj";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Ahmed";
        s3.marks = 88;

        //Array of an Object;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " :" + students[i].marks);
        }

        // enhanced For Loop
        for (Student std : students) {
            System.out.println(std.name);
        }
    }
}
