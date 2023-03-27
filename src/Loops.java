import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while(i <= 10) {
//            System.out.println(i);
//            i++;
//        }
//        long a = 2;
//        do{
//            System.out.println(a);
//            a *= a;
//        }while(a < 1000000);
//
//        for(long c = 2; c < 1000000; c *= c) {
//            System.out.println(c);
//        }

//        for(int i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }

//        boolean keepGoing;
//        do{
//            System.out.print("What number would you like to go up to? ");;
//            int input = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= input; i++){
//                System.out.printf("%-6d | %-7d | %-5d\n", i, i * i, i * i * i);
//            }
//
//            System.out.print("Try another number? ");
//            String response = scanner.next();
//            keepGoing = response.equalsIgnoreCase("yes");
//        }while(keepGoing);
        boolean keepGoing;
        do{
            System.out.print("Please enter your numerical grade: ");
            int numerical = scanner.nextInt();
            if(numerical > 87) {
                System.out.println("Your letter grade is A");
            } else if (numerical > 79) {
                System.out.println("Your letter grade is B");
            } else if (numerical > 66) {
                System.out.println("Your letter grade is C");
            } else if (numerical > 60) {
                System.out.println("Your letter grade is D");
            } else {
                System.out.println("Your letter grade is F");
            }
            System.out.print("Do you want to try another numerical grade? ");
            String response = scanner.next();
            keepGoing = response.equalsIgnoreCase("yes");
        }while (keepGoing);
    }
}
