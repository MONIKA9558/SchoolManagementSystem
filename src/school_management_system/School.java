package school_management_system;

import java.util.List;

public class School {

    /**
     * many teachers many students
     * here introduce Arraylist<></>
     * List<class_name>
     */

    private List<Teacher> teachers;
    private List<Student> students;
    private static double TOTAL_COLLECTED_FEES;
    private static double TOTAL_GIVEN_SALARY;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        TOTAL_COLLECTED_FEES=0;
        TOTAL_GIVEN_SALARY=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getTOTAL_COLLECTED_FEES() {
        System.out.println("Total collected fees are: ");
        return TOTAL_COLLECTED_FEES;
    }

    public static void updateTOTAL_COLLECTED_FEES(int COLLECTED_FEES) {
        TOTAL_COLLECTED_FEES += COLLECTED_FEES;
    }

    public static double getTOTAL_GIVEN_SALARY() {
        System.out.println("Total given salary is: ");
        return TOTAL_GIVEN_SALARY;
    }

    public static void update_TOTAL_GIVEN_SALARY(int GIVEN_SALARY) {
        TOTAL_GIVEN_SALARY += GIVEN_SALARY;
    }

    public void addTEACHER(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTEACHER(Teacher teacher){
        teachers.remove(teacher);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);

    }


}
