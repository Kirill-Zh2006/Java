package by.itacademy.text;

import java.util.Arrays;

public class Ui {
    private String testName;
    private String description;

    public Ui(String testName, String description){
        this.testName = testName;
        this.description = description;
    }

    public void runTest(String text) {
        System.out.println("   " + testName + "   ");
        System.out.println("Описание: " + description);

        Functions functions = new Functions(text);

        // Последовательный вызов всех методов
        OriginalText(functions);
        SortedIgnoreCase(functions);
        WithoutDuplicates(functions);
        JavaCount(functions);
        LetterACount(functions);
        LowerCaseArray(functions);
        UpperCaseArray(functions);
        ReversedArray(functions);

    }

    private void OriginalText(Functions functions) {
        System.out.println("1. Исходный массив слов:");
        System.out.println("   " + Arrays.toString(functions.getWords()));
        System.out.println("   Количество слов: " + functions.getWords().length);
        System.out.println();
    }

    private void SortedIgnoreCase(Functions functions) {
        System.out.println("2. Сортировка (игнорируя регистр):");
        System.out.println("   " + Arrays.toString(functions.sortIgnoreCase()));
        System.out.println();
    }

    private void WithoutDuplicates(Functions functions) {
        System.out.println("3. Без повторяющихся слов:");
        String[] unique = functions.deleteDuplicate();
        System.out.println("   " + Arrays.toString(unique));
        System.out.println("   Уникальных слов: " + unique.length);
        System.out.println();
    }

    private void JavaCount(Functions functions) {
        System.out.println("4. Количество слова 'java':");
        System.out.println("   " + functions.javaCount());
        System.out.println();
    }

    private void LetterACount(Functions functions) {
        System.out.println("5. Сумма всех букв 'a' в массиве:");
        System.out.println("   " + functions.countA());
        System.out.println();
    }

    private void LowerCaseArray(Functions functions) {
        System.out.println("6. Все элементы в нижнем регистре:");
        System.out.println("   " + Arrays.toString(functions.lowerCase()));
        System.out.println();
    }

    private void UpperCaseArray(Functions functions) {
        System.out.println("7. Все элементы в верхнем регистре:");
        System.out.println("   " + Arrays.toString(functions.upperCase()));
        System.out.println();
    }

    private void ReversedArray(Functions functions) {
        System.out.println("8. Reverse массива и элементов:");
        String[] reversed = functions.reverse();
        System.out.println("   Исходный: " + Arrays.toString(functions.getWords()));
        System.out.println("   Reverse:  " + Arrays.toString(reversed));
        System.out.println();
    }
}
