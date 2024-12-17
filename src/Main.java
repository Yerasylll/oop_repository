import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Candidate p1 = new Candidate();
        p1.firstName = sc.nextLine();
        p1.lastName = sc.nextLine();
        p1.barcode = sc.nextInt();

        System.out.println("Your name: " + p1.getFirstName() + '\n'
        + "Your last name: " + p1.getLastName() + '\n'
        + "Your barcode: " + p1.getBarcode());
    }
}