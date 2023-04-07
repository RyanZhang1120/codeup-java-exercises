package grades;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Ryan");
        student1.addGrade(90);
        student1.addGrade(80);

        Student student2 = new Student("Niki");
        student2.addGrade(80);
        student2.addGrade(70);

        Student student3 = new Student("John");
        student3.addGrade(70);
        student3.addGrade(60);

        Student student4 = new Student("Lucy");
        student4.addGrade(60);
        student4.addGrade(50);

        students.put("github_ryan", student1);
        students.put("github_niki", student2);
        students.put("github_john", student3);
        students.put("github_lucy", student4);

//        for(String githubUsername : students.keySet()){
//            Student student = students.get(githubUsername);
//            System.out.println(githubUsername + ": " + student.getName() +" - " + "Average grade: " + student.getGradeAverage());
//        }
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for(String githubUsername : students.keySet()){
            System.out.print("|" + githubUsername + "| ");
        }
        System.out.println("");
        boolean running = true;
        while(running){
            System.out.println("What student would you like to see more information on?");
            findStudent();
            System.out.println("Would you like to see another student? y/n");
            String goOn = scanner.nextLine();
            if(goOn.equalsIgnoreCase("no") || goOn.equalsIgnoreCase("n")){
                running = false;
            } else if (goOn.equalsIgnoreCase("yes") || goOn.equalsIgnoreCase("y")) {
                running = true;
            } else {
                System.out.println("Invalid input");
                running = false;
            }
        }
    }
    public static void findStudent(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.println("Name: " + student.getName() + " - GitHub Username: " + userInput );
            System.out.println("Current Average: " + student.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + userInput);
        }

    }
}
