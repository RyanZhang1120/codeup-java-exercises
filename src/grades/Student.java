package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private ArrayList<Integer> grades;
    private String name;
    private HashMap<String, String> attendance;
    public  Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public void recordAttendance(String date, String value) {
        if(value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
            attendance.put(date, value.toUpperCase());
        } else {
            System.out.println("Invalid value for attendance. Please use 'A' for Absent or 'P' for Present.");
        }
    }
    public double attendancePercentage() {
        double totalDays = attendance.size();
        double absences = 0;
        for (String status : attendance.values()) {
            if (status.equalsIgnoreCase("A")) {
                absences++;
            }
        }
        return ((totalDays - absences) / totalDays) * 100;
    }
    public List<String> absentDays() {
        List<String> absentDates = new ArrayList<>();
        for (String date : attendance.keySet()) {
            if (attendance.get(date).equalsIgnoreCase("A")) {
                absentDates.add(date);
            }
        }
        return absentDates;
    }
}
