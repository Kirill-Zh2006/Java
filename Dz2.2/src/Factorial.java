import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //Создайте программу, вычисляющую факториал
        //натурального числа п, которое пользователь
        //введёт с клавиатуры

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число ");
        int number = scanner.nextInt();

        long num = 1;
        for (long i=1; i<=number; i++){
            num *= i;
        }
        System.out.println("Факториал числа " + number + " = " + num);
    }
}
