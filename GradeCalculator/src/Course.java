public class Course {

    public static final int CREDIT_GENERAL = 2;
    public static final int CREDIT_MAJOR = 3;
    private final String name;
    private final String grade;
    private final int credit;

    public Course(String name, int credit, String grade) {
        this.name = name;
        this.grade = grade;
        this.credit = credit;
    }

    public String getGrade() {
        return grade;
    }

    public int getCredit() {
        if (credit == CREDIT_MAJOR) {
            return CREDIT_MAJOR;
        } else {
            return CREDIT_GENERAL;
        }
    }


}
