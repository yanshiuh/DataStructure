package com.Lab_Tuto.Lab_from_snr.Lab_2;

import java.util.Random;

public class Array_List_UNO {
    private String player;

    public Array_List_UNO(String player) {
        this.player = player;
    }

    public String[] draw() {
        Random r = new Random();
        String[] cards = new String[7];
        for (int i = 0; i < 7; i++) {
            int color_no = r.nextInt(3) + 1;
            String color = "";
            switch (color_no) {
                case 1:
                    color = "Red";
                    break;
                case 2:
                    color = "Yellow";
                    break;
                case 3:
                    color = "Green";
                    break;
                case 4:
                    color = "Blue";
                    break;
            }
            int type_card = r.nextInt(2); // 0 = no card, 1 = function card
            if (type_card == 0) {
                int no = r.nextInt(10); // 0 - 9
                String number = "";
                if (no == 0) number = "Zero";
                else if (no == 1) number = "One";
                else if (no == 2) number = "Two";
                else if (no == 3) number = "Three";
                else if (no == 4) number = "Four";
                else if (no == 5) number = "Five";
                else if (no == 6) number = "Six";
                else if (no == 7) number = "Seven";
                else if (no == 8) number = "Eight";
                else if (no == 9) number = "Nine";

                cards[i] = color + " " + number + " :: ";
            }
            else if (type_card == 1) {
                int special = r.nextInt(4); // 0 - 3
                String special_card = "";
                if (special == 0) special_card = "Skip";
                else if (special == 1) special_card = "Reverse";
                else if (special == 2) special_card = "Draw Two";
                else if (special == 3) special_card = "Draw Four";

                cards[i] = color + " " + special_card + " :: ";
            }
        }

        return cards;
    }

    @Override
    public String toString() {
        String result = "Array Implementation\n" + player + " draws 7 times\n";
        for (String card: draw())
            result += card;

        return result;
    }
}
