public class GradeCalculator {

    private final String name;
    private final double score;
    private final int credits;
    private double totalScore;
    private double currentScore;
    private int totalCredits;


    public GradeCalculator(String name, double score, int credits) {
        this.name = name;
        this.score = score;
        this.credits = credits;
    }

    public void addCourse(Course course) {


        totalCredits += course.getCredit();
        totalScore = 0;

        switch (course.getGrade()) {

            case "A+":
                totalScore += 4.5;
                break;
            case "A":
                totalScore += 4;
                break;
            case "B+":
                totalScore += 3.5;
                break;
            case "B":
                totalScore += 3.0;
                break;
            case "C+":
                totalScore += 2.5;
                break;
            case "C":
                totalScore += 2.0;
                break;
            case "D+":
                totalScore += 1.5;
                break;
            case "D":
                totalScore += 1.0;
                break;
            case "F":
                totalScore += 0.0;
                break;

        }

        currentScore += totalScore * course.getCredit();


    }

    public void print() {
        System.out.println("직전 학기 성적: " + getScore() + " (총 " + getCredits() + "학점)\n" +
                "이번 학기 성적: " + getCurrentScore() + " (총 " + getTotalCredits() + "학점)\n" +
                "전체 예상 학점: " + getTotalScore() + " (총 " + (getCredits() + getTotalCredits()) + "학점)");

    }

    public double getScore() {
        return score;
    }

    public int getCredits() {
        return credits;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public double getCurrentScore() {
        return (currentScore) / getTotalCredits();
    }

    public double getTotalScore() {
        return ((score * credits) + currentScore) / (getTotalCredits() + credits);
    }
}
