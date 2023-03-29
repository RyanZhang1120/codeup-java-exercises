import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What you want to say to Bob?");
            String you = scanner.nextLine();

            if(you.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (you.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (you.trim().isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
        }
    }
}
