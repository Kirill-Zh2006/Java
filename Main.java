//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Вывести последнюю цифру числа
        int lastnumber = 176;
        System.out.println( "Последняя цифра = " + lastnumber%10);

        //Найти сумму цифр ab + cd числа abcd
        int number = 2456;
        int ab = number/100;
        int cd = number%100;
        System.out.println( "Сумма цифр ab+cd числа abcd = " + (ab + cd)) ;

        //Вывести 3юю цифру 5ти-значного числа
        int chislo = 34214;
        int promezhchislo = chislo/100;
        int tretyacifra = promezhchislo%10;
        System.out.println("Третья цифра пятизначного числа = " + tretyacifra);

        //Вывести длину отрезка, проходящей через две точки AC и DB
        int ac = 9 ;
        int db = 6;
        if (ac > db) {
            System.out.println("Длинна отрезка, проходящая через 2 точки = " + (ac - db));
        }
        else if (ac < db){
            System.out.println("Длинна отрезка, проходящая через 2 точки = " + (db - ac));
        }
        else{
            System.out.println("2 точки одинаковы и длинна отрезка = 0" );
        }

    }
}