package com.Lab_Tuto.Tuto_from_snr.Tuto_2;

public class Tester {

    public static void main(String[] args) {
//        Integer[] num = {3, 2, 5, 0, 1};
//        Character[] letter = {'P', 'I', 'V', 'C', 'D'};
//        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
//        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
//        System.out.println(a.toString());
//        System.out.println(b.toString());

        System.out.println();

        ArrayDice dice_1 = new ArrayDice(5);
        System.out.println(dice_1.toString());
        ArrayDice dice_2 = new ArrayDice(4);
        System.out.println(dice_2.toString());

        LinkedListDice dice_3 = new LinkedListDice(3);
        System.out.println(dice_3.toString());
        LinkedListDice dice_4 = new LinkedListDice(3);
        System.out.println(dice_4.toString());
    }
}
