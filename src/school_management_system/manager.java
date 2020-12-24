package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class manager {

    public static void main(String[] args) {


        Teacher RK = new Teacher(1, "RAMESHBHAI", 10000);
        Teacher CK = new Teacher(2, "CHETANBHAI", 15000);
        Teacher GK = new Teacher(3, "GAURIKHAN", 12000);

        Student mp = new Student(1, "MONIKA PATEL", 10);
        Student ap = new Student(2, "AEKANKI PATEL", 12);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(RK);
        teacherList.add(CK);
        teacherList.add(GK);

        List<Student> studentList= new ArrayList<>();
        studentList.add(mp);
        studentList.add(ap);

        School MANIBA_SCHOOL= new School(teacherList,studentList);
//        System.out.println(MANIBA_SCHOOL.getTOTAL_GIVEN_SALARY());
//        System.out.println(MANIBA_SCHOOL.getTOTAL_COLLECTED_FEES());

        mp.updatePAID_FEES(1200);
//        System.out.format(mp.getSTUDENT_NAME()+" has paid "+mp.getPAID_FEES()+" out of "+mp.getTOTAL_FEES());

        mp.updatePAID_FEES(300);
        mp.updatePAID_FEES(500);
        System.out.format(mp.getSTUDENT_NAME()+" has paid "+mp.getPAID_FEES()+" out of "+mp.getTOTAL_FEES());

        RK.updatePAID_SALARY(9000);
        System.out.println("\n"+RK.getTEACHER_NAME()+" has received "+RK.getPAID_SALARY());

        System.out.println(MANIBA_SCHOOL.getTOTAL_COLLECTED_FEES());
        System.out.println(MANIBA_SCHOOL.getTOTAL_GIVEN_SALARY());

        System.out.println(mp);
    }
}
