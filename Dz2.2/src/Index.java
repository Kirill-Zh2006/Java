import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        //Найдите самую большую цифру числа,
        // введенного с клавиатуры, а также ее индекс

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner1.nextInt();

        int modul = Math.abs(number);

        int num = number;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        int Index = 0;
        int maxDigit = 0;
        long div = (int) Math.pow(10, count - 1); // для извлечения цифры
        for (int i=1; i<count+1; i++){
            int digit = (int) (modul/div);
            modul %= div; // удалить проверенную цифру
            div /= 10;

            if(digit>maxDigit){ // сравнение с текущим максимумом
                maxDigit=digit; // обновление макс. значения
                Index = i;
            }
        }
        System.out.println("Max цифра " + maxDigit);
        System.out.println("Её индекс " + Index);
    }
}
