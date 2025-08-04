public class Fibonachi {
    public static void main(String[] args) {

        //Выведите на экран первые 10 членов
        //последовательности Фибоначчи

        int a = 0;
        int b = 1;

        System.out.println("Первые 10 членов последовательности Фибоначчи: ");

        for (int i=1; i<=10; i++){
            int sum = a + b;
            System.out.print(a + " ");
            a = b;
            b = sum;
        }
    }
}
