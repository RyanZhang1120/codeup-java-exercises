package oop_lecture;

public class Student {
    //What would a student "have": email name Program? Web dev / cloud / data Cohort? grade

    //Field < property, a data point, belonging to the class
    //Instanced.. fields and non-instanced.. fields

    //Three instanced fields: of a class "Student"
    String firstName;
    String lastName;
    public String cohort;

    public int grade;

    public String doExercise(){
        return String.format("Hey, this is %s %s, and I'm working on my exercise!", firstName, lastName);
    }

    public String rollCall(){
        return String.format("%s %s - Cohort: %s", firstName, lastName, cohort);
    }

    //Haven't used STATIC yet - the time's we've seen static, what did it look like?
    //Math.PI . . .
    //Math.random()

    //This is not UNIQUE to "one student"
    //This is a data point UNIVERSAL to studentS
    public static int classSize = 22;

    //Travis said: hey, do we always have to use dot notation? Is there a cleaner process - a way to assign firstName and lastName?
    //Let's look at CONSTRUCTOR methods

    //'Default' constructor, 'blank' constructor
    public Student(){
        System.out.println("A student joined the class!");
    }

    //First overloaded constructor - situation: student has name but no cohort yet
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        //Assign THIS instance of a Student the parameter of 'firstName'
        this.lastName = lastName;
        this.cohort = "unassigned";
    }

    //Second overloaded constructor - situation: student has name and cohort assigned
    public Student(String firstNameInput, String lastName, String cohortName){
        //this < need it when parameter and field match
        //not needed when different parameter and field
        firstName = firstNameInput;
        this.lastName = lastName;
        this.cohort = cohortName;
    }

    public Student(String firstNameInput, String lastName, String cohortName, int grade){
        //this < need it when parameter and field match
        //not needed when different parameter and field
        firstName = firstNameInput;
        this.lastName = lastName;
        this.cohort = cohortName;
        this.grade = grade;
    }


    public static void main(String[] args) {
        //Instance of a 'Student':
//        Student firstStudent = new Student();
        //Instance of a 'Student':
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        //Each instance.. can have their own values for their instance fields
//        firstStudent.firstName = "David";
//        firstStudent.lastName = "Renteria";

//

        secondStudent.firstName = "Gage";
        secondStudent.lastName = "Jackson";

//        System.out.printf("%s %s is this student's name! %n", firstStudent.firstName, firstStudent.lastName);

        System.out.printf("%s %s is this student's name! %n", secondStudent.firstName, secondStudent.lastName);

//        System.out.println(firstStudent.doExercise());

        System.out.println(secondStudent.doExercise());

        thirdStudent.lastName = "Frankenstein";
        //Null below - no firstName provided :(
        System.out.println(thirdStudent.doExercise());

        //Static vs instanced:
//       System.out.println(firstStudent.firstName);
//       Error: I need an OBJECT.firstName < a firstname is OWNED, is a FIELD of an instance of Student
//        System.out.println(firstName);

        System.out.println(Math.PI);
        //classSize doesn't belong to ONE student
        //classSize is static. . belongs to the "class", not an instance or construct from the class
        System.out.println(Student.classSize);

        //rollCall < one student made with constructor with 3 parameters (fName, lName, cName), the other with 2 (fName, lName)

        Student firstStudent = new Student("David", "Renteria", "Azeban");

        Student unassignedStudent = new Student("Kevin", "Powell");

        System.out.println(firstStudent.rollCall());

        System.out.println(unassignedStudent.rollCall());

        Student pretendStudent = new Student("Johnny", "Doe", "ExCohort", 88);

        System.out.println("pretendStudent.grade = " + pretendStudent.grade);
    }
}