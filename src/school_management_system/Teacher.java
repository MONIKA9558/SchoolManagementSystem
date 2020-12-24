package school_management_system;

import javax.swing.*;

public class Teacher {
     private int ID;
     private String TEACHER_NAME;
     private int SALARY_TEACHER;
     private int PAID_SALARY;

    /**
     *
     * @param ID---id of teacher
     * @param TEACHER_NAME---name of teacher
     * @param SALARY_TEACHER---salary of teacher
     */

    public Teacher(int ID, String TEACHER_NAME, int SALARY_TEACHER) {
        this.ID = ID;
        this.TEACHER_NAME = TEACHER_NAME;
        this.SALARY_TEACHER = SALARY_TEACHER;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTEACHER_NAME() {
        return TEACHER_NAME;
    }

    public void setTEACHER_NAME(String TEACHER_NAME) {
        this.TEACHER_NAME = TEACHER_NAME;
    }
    public void updatePAID_SALARY(int SALARY){
        PAID_SALARY+=SALARY;
        School.update_TOTAL_GIVEN_SALARY(PAID_SALARY);
    }
    public int getPAID_SALARY(){
        return PAID_SALARY;
    }


    // to print teacher details by object
    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + ID +
                ", TEACHER_NAME='" + TEACHER_NAME + '\'' +
                ", SALARY_TEACHER=" + SALARY_TEACHER +
                ", PAID_SALARY=" + PAID_SALARY +
                '}';
    }
}
