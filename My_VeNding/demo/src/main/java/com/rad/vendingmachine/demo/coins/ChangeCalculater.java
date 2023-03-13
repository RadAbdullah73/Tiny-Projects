package com.rad.vendingmachine.demo.coins;

import com.rad.vendingmachine.demo.controller.AnewBought;

public class ChangeCalculater extends MainCalculater {

    public  CoinEntered calculateChange(AnewBought newBought) {
        int total = newBought.getCoinEntered().CalculateTotal();
        if (total<newBought.getItem().getPrice()){
            System.out.print("Money is not Enough , please put more , here is your money ! : ");
            System.out.print(newBought.getCoinEntered().CalculateTotal());
            System.out.println(" Cents");
            System.out.print("While Item Price is : ");
            System.out.print(newBought.getItem().getPrice());
            // Exit the Terminal when the condition is true ! 
            System.exit(0);
        }
        int totalChange = total - newBought.getItem().getPrice();
        return calculateChange(totalChange);
    }
    public CoinEntered calculateChange(int allChange) {
        CoinEntered change = new CoinEntered(new int[4]);
        int ChangeForEach = allChange;

        change.setHundredCents(ChangeForEach / Coin.Dollar.getDenomination());
        ChangeForEach = ChangeForEach % Coin.Dollar.getDenomination();

        change.setFiftyCents(ChangeForEach / Coin.Half.getDenomination());
        ChangeForEach = ChangeForEach % Coin.Half.getDenomination();

        change.setTwentyFiveCents(ChangeForEach / Coin.Quarter.getDenomination());
        ChangeForEach = ChangeForEach % Coin.Quarter.getDenomination();

        change.setTenCents(ChangeForEach / Coin.Dime.getDenomination());
        // System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

        return change;

    }
}
