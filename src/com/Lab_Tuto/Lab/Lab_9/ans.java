package com.Lab_Tuto.Lab.Lab_9;

public class ans {

    //Q1
    private static String substituteAI(String input) {
        if (input.isEmpty())
            return input;
        else {
            if (input.charAt(0) == 'a')
                return 'i' + substituteAI(input.substring(1));
            else
                return input.charAt(0) + substituteAI(input.substring(1));
        }
    }

    //Q2
    private static void permuteString(char[] list,int index){
        if (index==list.length-1) {
            System.out.println(String.valueOf(list));
        }
        for (int i=index;i<list.length;i++) {
            swap(list,index,i);
            permuteString(list,index+1);
            swap(list,index,i);
        }
    }

    private static void swap(char[] list,int i,int j){
        char hold = list[i];
        list[i] = list[j];
        list[j] = hold;
    }

    // Q3
    public static long exponent(int x, int m) {
        if (m == 1)
            return x;
        else {
            return x * exponent(x, m - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(exponent(5, 2));

        char[] q2 = {'A', 'B', 'C'};
        permuteString(q2, 0);
    }
}
