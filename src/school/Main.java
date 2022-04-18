package school;

public class Main {
    public static void main(String[] args) {


        Course c1 = new Course();

        //adding students to course
        c1.studentArrayList.add(new Student("EZ",1,50,4.0));
        c1.studentArrayList.add(new Student("AJ",1,50,4.0));

        //print list of students
        for(Student any: c1.studentArrayList) {
            System.out.println(any.getName());
        }
    }
}
