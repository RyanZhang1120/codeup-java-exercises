package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    String getString(){
        return scanner.nextLine();
    }

    String getString(String prompt){
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        return scanner.nextLine();
    }
    boolean yesNo(){
        String input = scanner.next().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    boolean yesNo(String prompt){
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        String input = scanner.next().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
    int getInt(int min, int max){
        int input = scanner.nextInt();
        if(input > min && input < max){
            return input;
        } else {
            return getInt(min, max);
        }
    }
    int getInt(int min, int max, String prompt){
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        int input = scanner.nextInt();
        if(input > min && input < max){
            return input;
        } else {
            return getInt(min, max, prompt);
        }
    }
    int getInt(){
        return scanner.nextInt();
    }
    double getDouble(double min, double max, String prompt){
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        double input = scanner.nextDouble();
        if(input > min && input < max){
            return input;
        } else {
            return getDouble(min, max, prompt);
        }
    }
    double getDouble(String prompt){
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }
}
