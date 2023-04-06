package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ryan");
        Student student2 = new Student("Niki");

        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);

        student2.addGrade(80);
        student2.addGrade(70);
        student2.addGrade(60);

        System.out.printf("The average of %s's is %.1f%n",student1.getName(), student1.getGradeAverage());
        System.out.printf("The average of %s's grade is %.1f%n",student2.getName(), student2.getGradeAverage());
    }
}
