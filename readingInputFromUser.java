import java.util.Scanner;

public class readingInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.print("Enter your gender: ");
        char gender = scanner.nextLine().charAt(0);

        System.out.print("Enter your contact number: ");
        double contactNumber = scanner.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(contactNumber);
    }
}
