package com.Lab_Tuto.Tuto.Tuto_1;

public class Q1_Telephone {
    private String areaCode, number;

    static int numberOfTelephone;

    public Q1_Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephone++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static int getNumberOfTelephone() {
        return numberOfTelephone;
    }

    public static void setNumberOfTelephone(int numberOfTelephone) {
        Q1_Telephone.numberOfTelephone = numberOfTelephone;
    }

    public String makeFullNumber() {
        return areaCode + "-" + number;
    }

    public static void main(String[] args) {
        Q1_Telephone[] t = new Q1_Telephone[5];
        t[0] = new Q1_Telephone("03", "79676300");
        t[1] = new Q1_Telephone("03", "79676301");
        t[2] = new Q1_Telephone("03", "79676302");
        t[3] = new Q1_Telephone("03", "79676303");
        t[4] = new Q1_Telephone("03", "79676304");

        for (int i = 0; i < t.length; i++)
            System.out.println(t[i].makeFullNumber());
    }
}
