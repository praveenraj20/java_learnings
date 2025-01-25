package interviewqs;

abstract class Students {
    protected int marksObtained;
    protected int totalMarks;

    // Constructor for initializing marks
    public Students(int marksObtained, int totalMarks) {
        this.marksObtained = marksObtained;
        this.totalMarks = totalMarks;
    }

    // Abstract method for percentage calculation
    public abstract double calculatePercentage();
}

class Student1 extends Students {

    public Student1(int marksObtained, int totalMarks) {
        super(marksObtained, totalMarks);
    }

    // Implementing the abstract method
    @Override
    public double calculatePercentage() {
        return ((double) marksObtained / totalMarks) * 100;
    }
}

class Student2 extends Students {

    public Student2(int marksObtained, int totalMarks) {
        super(marksObtained, totalMarks);
    }

    // Implementing the abstract method
    @Override
    public double calculatePercentage() {
        return ((double) marksObtained / totalMarks) * 100;
    }
}

public class StudentAbstractClass {
    public static void main(String[] args) {
        // Creating objects of Student1 and Student2
        Students student1 = new Student1(450, 500);
        Students student2 = new Student2(380, 500);

        // Calculating and displaying percentages
        System.out.println("Percentage of Student1: " + student1.calculatePercentage() + "%");
        System.out.println("Percentage of Student2: " + student2.calculatePercentage() + "%");
    }
}

