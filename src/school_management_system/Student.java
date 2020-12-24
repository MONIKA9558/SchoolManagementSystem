package school_management_system;

public class Student {

   private int ID;
   private String STUDENT_NAME;
   private int GRADE;
   private int PAID_FEES;
   private int TOTAL_FEES;

    /**
     *
     * @param ID---id of student
     * @param STUDENT_NAME---name of student
     * @param GRADE---grade of student
     *
     * total fees of student is 20k per year
     *
     */

    public Student(int ID, String STUDENT_NAME, int GRADE) {
        this.ID = ID;
        this.STUDENT_NAME = STUDENT_NAME;
        this.GRADE = GRADE;
        this.TOTAL_FEES=20000;
        this.PAID_FEES=0;

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String STUDENT_NAME) {
        this.STUDENT_NAME = STUDENT_NAME;
    }

    public int getGRADE() {
        return GRADE;
    }

    public void setGRADE(int GRADE) {
        this.GRADE = GRADE;
    }

    public void updatePAID_FEES(int FEES){
        PAID_FEES+=FEES;
        School.updateTOTAL_COLLECTED_FEES(PAID_FEES);
    }
    public int getPAID_FEES(){
        return PAID_FEES;
    }
    public int getTOTAL_FEES(){
        return TOTAL_FEES;
    }

    //to print student details by its object
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", STUDENT_NAME='" + STUDENT_NAME + '\'' +
                ", GRADE=" + GRADE +
                ", PAID_FEES=" + PAID_FEES +
                ", TOTAL_FEES=" + TOTAL_FEES +
                '}';
    }
}
