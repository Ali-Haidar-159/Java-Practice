package lab_6;

public class Student {

    String studentName;
    int studentId;
    double CGPA;

    public Student() {

    }

    public Student(String studentName, int studentId, double CGPA
    ) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "\nName :" + studentName + "\nID : " + studentId + "\nCGPA : " + CGPA;
    }

}
