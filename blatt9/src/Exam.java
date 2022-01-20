import java.util.ArrayList;
import java.util.List;

public class Exam {
    private String name;
    private int year;
    private List questions;
    private ArrayList<String> qustion;


    public Exam(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public List getQuestions(){
        return questions;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getNumberOfQuestion(){
        return questions.size();
    }
    public int getSumOfPoints(){
        int sum;
       return 0;
    }

    public void AddQuestion(String text, int points) {


    }

}


