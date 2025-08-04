import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Найдите сумму и произведение цифр числа,
        //введенного с клавиатуры

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

        int modul = Math.abs(number);
        int sum = 0;
        int multipl = 1;
        //т.к. не сказано про не учтение нуля при произведении, проверку не сделал
        while (modul != 0) {
            int ostatok = modul%10;
            sum += ostatok;
            multipl *= ostatok;
            modul /= 10;
        }
        System.out.println("сумма цифр = " + sum);
        System.out.println("Произведение цифр = " + multipl);
        scanner.close();
    }
}