package com.rad.vendingmachine.demo.coins;

public enum Coin {
    Dime(10), Quarter(25), Half(50), Dollar(100);

    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }
    public int getDenomination() {
        return this.denomination;
    }
  
    public static int[] parseCoins(String coins) { //   Converting input Array from String to Integers ! 
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for (int index = 0; index < numberCoinsInText.length; index++) {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }

}
