import java.util.Scanner;

public class TestBinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = BinaryConverter.bin2Dec(binary);
            System.out.print("Decimal equivalent: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println("Not a binary number");
        }

        input.close();
    }
}