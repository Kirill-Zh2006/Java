package by.itacademy.room;

import java.util.Scanner;

public class Table {
    private String computer;
    private static int[] shelf;
    private String[] books;

    public Table() {
    }

    public Table(String computer, int[] shelf, String[] books) {
        this.computer = computer;
        this.shelf = shelf;
        this.books = books;
    }

    public int[] getShelf() {
        return shelf;
    }

    public void setShelf(int[] shelf) {
        Table.shelf = shelf;
    }

    public String[] getBooks() {
        return this.books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public String getComputer() {
        return this.computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public static void turnComputer() throws InterruptedException {
        Table table = new Table();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы подошли к столу и видете на нем компьютер. Хотите включить? (да/нет)");
        String usInput = scanner.nextLine().toLowerCase();
        if (usInput.equals("да")) {
            table.setComputer("on");
            System.out.println("Ууаауауаауауауаа комп is " + table.getComputer() + "!! И вы играете. Ждемс...");
            Thread.sleep(1000L);
            System.out.println("Вы доиграли и видете на столе полки с книжками. ");
        } else if (usInput.equals("нет")) {
            table.setComputer("off");
            System.out.println("Соболезную, вы не поиграли в комп.");
            System.out.println("Вы видите полки и разглядываете книги на них.");
        } else {
            System.out.println("что-то пошло не так");
            System.exit(1);
        }

    }

    public static void shelfBook() {
        Table table = new Table();
        shelf = new int[]{1, 2, 3};
        table.books = new String[]{"5 книг художественных", "5 книг жанра фантастика", "4 научные книги"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы посмотреть книги на полке введите номер полки(1-3):");
        System.out.println("Чтобы отказаться введите 0.");
        int choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println("Вы отказались смотреть книги.");
        } else if (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Ошибка: введите целое число");
            System.exit(1);
        } else {
            boolean found = false;

            for(int i = 0; i < shelf.length; ++i) {
                if (shelf[i] == choice) {
                    System.out.println("Вы выбрали " + choice + " полку и на ней стоит " + table.books[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Ошибка: введите число от 1 до 3");
                System.exit(1);
            }
        }

        System.out.println("Вы отошли от стола и подошли к шкафу.");
    }
}
