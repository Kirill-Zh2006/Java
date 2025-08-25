package by.itacademy.text;

import java.util.Arrays;

public class Functions {
    private String[] words;

    public Functions(){
    }

    public Functions(String text){
        this.words = processText(text);
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    // текст в массив слов
    private String[] processText(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }
        return text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split("\\s+");
    }

    // сортировка пузырьком
    public String[] sortIgnoreCase(){
        String[] sorted = Arrays.copyOf(words, words.length);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j].compareToIgnoreCase(sorted[j + 1]) > 0){
                 String temp =  sorted[j];
                 sorted[j] = sorted[j + 1];
                 sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }

    //удаление повторений
    public String[] deleteDuplicate(){
        String[] temp = new String[words.length];
        int uniqueCount = 0;

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            boolean found = false;

            // поиск дубликатв в уже добавленных словах
            for (int i = 0; i < uniqueCount; i++) {
                if (temp[i].equals(lowerWord)) {
                    found = true;
                    break;
                }
            }
            if(!found){
                temp[uniqueCount++] = lowerWord;
            }
        }
        return Arrays.copyOf(temp, uniqueCount);
    }

    // подсчет Java
    public int javaCount(){
        int count = 0;
        for (String word : words){
            if(word.equalsIgnoreCase("java")){
                count++;
            }
        }
        return count;
    }

    // подсчет всех букв а
    public int countA(){
        int countA = 0;
        for (String word : words){
            for (char a : word.toCharArray()){
             if (a == 'a' || a == 'A'){
                 countA++;
             }
            }
        }
        return countA;
    }

    // к нижнему регистру
    public String[] lowerCase(){
        String[] lowerCase = new String[words.length];
        for (int i=0; i< words.length; i++){
            lowerCase[i] = words[i].toLowerCase();
        }
        return lowerCase;
    }

    // к верпхнему
    public String[] upperCase(){
        String[] upperCase = new String[words.length];
        for (int i = 0; i< words.length; i++){
            upperCase[i] = words[i].toLowerCase();
        }
        return upperCase;
    }

    // reverse
    public String[] reverse(){
        String[] reversed = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String original = words[words.length - 1 - i];
            reversed[i] = new StringBuilder(original).reverse().toString();
        }
        return reversed;
    }

}
