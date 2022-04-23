package school;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    //three fields(what class variables are called)
    private String location, relatedMajor;
    //One field should be an arraylist or hashmap, im thinking list of students
    ArrayList<Student> studentArrayList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(location, course.location) && Objects.equals(relatedMajor, course.relatedMajor) && Objects.equals(studentArrayList, course.studentArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, relatedMajor, studentArrayList);
    }

    @Override
    public String toString() {
        return "Course{" +
                "location='" + location + '\'' +
                ", relatedMajor='" + relatedMajor + '\'' +
                ", studentArrayList=" + studentArrayList +
                '}';
    }
}
