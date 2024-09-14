package lab_6;

public class Course {

    private String courseID;
    private String courseTittle;
    private double credit;
    private Faculty faculty;

    public Course() {

    }

    public Course(String courseID, String courseTittle, double credit, Faculty faculty) {
        this.courseID = courseID;
        this.courseTittle = courseTittle;
        this.credit = credit;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "\nCourse Id :" + courseID + "\nCourse Tittle : " + courseTittle + "\nCredit : " + credit + "\nFaculty : " + faculty;
    }

}

class Faculty {

    int facultyId;
    String facultyName;
    String position;

    public Faculty(int facultyId) {
        this.facultyId = facultyId;
    }

    public Faculty(int facultyId, String facultyName, String position) {
        this(facultyId);
        this.facultyName = facultyName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Faculty{" + "facultyId=" + facultyId + ", facultyName=" + facultyName + ", position=" + position + '}';
    }

}
