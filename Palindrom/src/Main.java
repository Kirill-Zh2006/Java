import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число не является палиндромом");
            return;
        }

        int originalNumber = number;
        int reversed = 0;

        do {
            int izvlech = number % 10;
            reversed = reversed * 10 + izvlech;
            number /= 10;
        } while (number != 0);

        if (reversed == originalNumber) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}