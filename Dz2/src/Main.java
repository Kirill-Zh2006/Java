import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 2: Калькулятор с проверкой деления
        //Создайте калькулятор, который запрашивает два числа и операцию (+, -, *, /).
        // Перед выполнением деления убедитесь,
        // что делитель не равен нулю. Если делитель равен нулю при делении — выведите сообщение об ошибке.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите chislo а");
        int a = sc.nextInt();
        System.out.println("Введите chislo b");
        int b = sc.nextInt();
        System.out.println("Введите operaciu : - + * /");
        String c = sc.next();
        int result = 0;
        boolean error = false;

        if(c.equals("-")) {
            result = a-b;
        }else if(c.equals("*")){
            result = a*b;
        }else if(c.equals("+")){
            result = a+b;
        }else if(c.equals("/")){
            if(b!=0){
                result = a/b;
            }else{
                System.out.println("ne delim na 0");
                error = true;
            }
        }else{
            System.out.println("neizvestnaya operaciya");
            error = true;
        }

        if(!error){
            System.out.println(result);
        }


    }
}