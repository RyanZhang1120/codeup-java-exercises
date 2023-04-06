package grades;
import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;
    private String name;
    public  Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    };

}
