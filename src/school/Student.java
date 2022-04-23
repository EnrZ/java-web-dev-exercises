package school;

import java.util.Objects;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    /* getters and setters omitted - IntelliJ fills in getter method when starting to type*/
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    //3 more sets of getter/setter

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public String getGradeLevel() {
        if (this.getNumberOfCredits() >= 0 && this.getNumberOfCredits() < 30) {
            return "Freshman";
        } else if (this.getNumberOfCredits() >= 30 && this.getNumberOfCredits() < 60) {
            return "Sophomore";
        } else if (this.getNumberOfCredits() >= 60 && this.getNumberOfCredits() < 90) {
            return "Junior";
        } else if (this.getNumberOfCredits() > 90) {
            return "Senior";
        } else
            return "No Major";

    }
    public void addGrade(int courseCredits, double grade){
        double qualityScore, totalQualityScore, newGpa;

        totalQualityScore = this.getGpa() * this.numberOfCredits;
        this.setNumberOfCredits(this.numberOfCredits + courseCredits);
        qualityScore = grade * courseCredits;
        totalQualityScore +=qualityScore;
        newGpa = totalQualityScore / this.getNumberOfCredits();
        setGpa(newGpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }
}
