import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        addition(3,2);
//        subtraction(3, 2);
//        multiplication(3, 2);
//        division(3, 2);
//        multiplicationWithPlus(3, 5);
//        System.out.println(multiplicationRecursion(3, 5));
//        int userInput = getInteger(1, 10);
//        System.out.printf("Yes!, %d is in the range.%n", userInput);
//        boolean keepGoing;
//        do {
//            int userInput = getInteger(1, 10);
//            System.out.printf("The factorial of %d is ",userInput);
//            System.out.println(factorial(userInput));
//            System.out.print("Do you want to continue? ");
//            String response = scanner.next();
//            keepGoing = response.equalsIgnoreCase("yes");
//        } while(keepGoing);
        //dice();
        guessing();


    }
    public static void addition(int a, int b){
        System.out.println(a + b);
    }

    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }

    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }

    public static void division(int a, int b){
        double c = (double) a / b;
        if(b == 0){
            System.out.println("The divisor can't be 0");
        } else {
            System.out.println(c);
        }
    }

    public static void multiplicationWithPlus(int a, int b){
        int c = a;
        for(int i = 1; i < b; i++) {
            a += c;
        }
        System.out.println(a);
    }

    public static int multiplicationRecursion(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + multiplicationRecursion(a, b - 1);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number between %d and %d: ", min, max);
        int input = scanner.nextInt();
        if (input <= max && input >= min) {
            return input;
        } else {
            System.out.printf("Please re-enter a number between %d and %d: ", min, max);
            return getInteger( min,  max);
        }
    }

    public static long factorial(int input) {
        long factor = 1;
        for(int i = 1; i <= input; i++){
            factor *= i;
        }
        return factor;
    }

    public static void dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for a pair of dice: ");
        int side = scanner.nextInt();
        int dice1 = (int)(Math.random() * side) + 1;
        System.out.printf("The first dice show %d after roll\n", dice1);
        int dice2 = (int)(Math.random() * side) + 1;
        System.out.printf("The second dice show %d after roll", dice2);
    }

    public static void guessing() {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int count = 0;
        while(true){
            System.out.print("Give a guessing number: ");
            count++;
            int guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("HIGHER");
            } else if (guess > number) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS");
                break;
            }
            if(count > 5) {
                System.out.println("GAME OVER");
                break;
            }
        }
        System.out.println("Number of attempts: " + count);
    }
}
