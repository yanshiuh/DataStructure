package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class Sentence {
    private String sentence;
    private int length, number_of_vowels, number_of_words;

    public Sentence(String sentence) {
        this.sentence = sentence;
        number_of_vowels = 0;
        number_of_words = 0;
    }

    public int getLength() {
        return sentence.trim().length();
    }

    public int getNumber_of_vowels() {
        return number_of_vowels;
    }

    public int count_vowels() {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A' ||
                    sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E' ||
                    sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I' ||
                    sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O' ||
                    sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U')
                number_of_vowels++;
        }
        return number_of_vowels;
    }

    public int count_words() {
        sentence = sentence.trim();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                number_of_words++;
            }
        }
        return number_of_words + 1;
    }

    @Override
    public String toString() {
        return "The sentence is : " + sentence +
                "\nThe length of sentence : " + getLength() +
                "\nThe number of vowels : " + count_vowels() +
                "\nThe number of words : " + count_words();
    }
}
