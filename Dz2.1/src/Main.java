import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Проверка треугольника
        //равносторонний равнбедренный разносторонний
        //существует ли такой треугольник

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону а ");
        int a = sc.nextInt();
        System.out.println("Введите сторону b ");
        int b = sc.nextInt();
        System.out.println("Введите сторону c ");
        int c = sc.nextInt();

        if ((a+b<=c) || (a+c<=b) || (c+b<=a)) {
            System.out.println("Треугольника не существует");
        } else if (a == b && a == c) {
            System.out.println("Равносторонний");
        } else if (a == b || c == b || a == c) {
            System.out.println("Равнобедренный");
        } else {
            System.out.println("Разносторонний");
        }
    }
}