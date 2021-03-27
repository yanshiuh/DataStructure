package com.Lab_Tuto.Lab_from_snr.Lab_4.Q4;

import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        LinkedList<String> p1 = new LinkedList<>();
        LinkedList<String> p2 = new LinkedList<>();

        Random r = new Random();
        int dice_1, dice_2;
        int score_1 = 0, score_2 = 0;

        int turn = r.nextInt(2) + 1;
        if (turn == 1)
            System.out.println("Player 1 start first");
        else
            System.out.println("Player 2 start first");
        while (score_1 < 20 && score_2 < 20) {
            dice_1 = r.nextInt(5) + 1;
            dice_2 = r.nextInt(5) + 1;

            for (int i = 0; i < dice_1; i++) {
                p1.insert("*");
            }
            for (int i = 0; i < dice_2; i++) {
                p2.insert("*");
            }

            score_1 += dice_1;
            score_2 += dice_2;

            if (turn == 1) {
                System.out.print("\nPlayer 1:");
                p1.showList();

                System.out.print("\nPlayer 2:");
                p2.showList();
            } else {
                System.out.print("\nPlayer 2:");
                p2.showList();

                System.out.print("\nPlayer 1:");
                p1.showList();
            }

            if (score_1 >= 20)
                System.out.println("\nPlayer 1 win the game");
            else if (score_2 >= 20)
                System.out.println("\nPlayer 2 win the game");
        }
    }
}
