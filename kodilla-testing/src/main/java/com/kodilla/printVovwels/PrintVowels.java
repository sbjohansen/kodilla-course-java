package com.kodilla.printVovwels;

public class PrintVowels {
    public String printVowels(String text) {
        String vowels = "aeiouy";
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(text.substring(i, i + 1))) {
                result += text.substring(i, i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PrintVowels printVowels = new PrintVowels();
        System.out.println(printVowels.printVowels("Ala ma kota, a kot ma Ale"));
    }
}

