import java.util.Scanner;

public class Prostoe {
    public static void main(String[] args){

        //Для введенного целого числа определить
        //является ли это число простым

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();

        for (int i=2; i<number; i++){

            if (number%i == 0){
                System.out.println("Число " + number + " не является простым");
                return;
            }
        }
        System.out.println("Число " + number + " простое");
    }
}
