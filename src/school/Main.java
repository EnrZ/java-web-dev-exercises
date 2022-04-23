package school;

public class Main {
    public static void main(String[] args) {


        Course c1 = new Course();

        //adding students to course
        c1.studentArrayList.add(new Student("EZ",1,50,4.0));
        c1.studentArrayList.add(new Student("AJ",1,20,4.0));

        Course c2 = new Course();

        c2.studentArrayList.add(new Student("EZ",1,50,4.0));
        c2.studentArrayList.add(new Student("AJ",1,20,4.0));

        //IntelliJ generated equals function works. If course2 is same as course1, it prints true. Otherwise false.
        System.out.println(c2.equals(c1));

        c1.studentArrayList.get(0).addGrade(3,3);

        System.out.println(c1.studentArrayList.get(0).getGpa());
        //print list of students
        for(Student any: c1.studentArrayList) {
            System.out.println(any.getName());
            System.out.println(any.getGradeLevel());
        }

    }
}
