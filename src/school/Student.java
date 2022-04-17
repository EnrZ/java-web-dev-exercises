package school;

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
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    //3 more sets of getter/setter

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }
}
