package com.rad.vendingmachine.demo.controller;

import com.rad.vendingmachine.demo.coins.ChangeCalculater;
import com.rad.vendingmachine.demo.coins.CoinEntered;
import com.rad.vendingmachine.demo.coins.MainCalculater;
import com.rad.vendingmachine.demo.models.Item;
import com.rad.vendingmachine.demo.models.VmMachine;

public class MyVmMachine implements VmMachine {
    private int selectedItem;
    private int selectedType;
    private CoinEntered change;

    @Override
    public void displayAllItems() {
        int counter = 1;
        System.out.println("                                    *********************************************");
        System.out.println("                                           WELCOME TO THE VENDING MACHINE           ");
        System.out.println("                                    *********************************************");
        System.out.println("                                           Note : Pricies is in Cents");
        for (Item item : Item.values()) {
            if (!Item.NotExist.equals(item)) {
                if (counter % 5 == 0 && counter != 1) {
                    System.out.println(item.getNumberOfItem() + " " + item.name() + "- Price:" + item.getPrice() + " |");
                } else {
                    System.out.print(item.getNumberOfItem() + " " + item.name() + "- Price:" + item.getPrice()  + "| ");
                }
                counter++;
            }
        }
        System.out.println("  ");
        System.out.println("Please select your Item : ");

    }

    @Override
    public void displayMessageCardOrCoins() {
        System.out.print("  Your Item is Available and its price in cents =  ");
        System.out.println(Item.valueOf(selectedItem).getPrice());
        System.out
                .println("  Please select your Using Card or Coins , Choose 1 for Card 2 Coins or any number for Notes");
    }

    @Override
    public void displayMessageForCard() {
        System.out.println("   Please Enter Your card Number (8 digits)");
    }

    @Override
    public void displaySecondMessageForCard() {
        System.out.println("   Please Enter Your Card Balance in $");
    }

    @Override
    public void setSelectItem(int item) {
        this.selectedItem = item;
    }

    @Override
    public void setSelectType(int type) {
        this.selectedType = type;
    }

    @Override
    public void Balance(double Balance) {
        double p = Item.valueOf(selectedItem).getPrice();
        System.out.println("Your Balance now : ");
        System.out.println(Balance - (p/100));

    }
    @Override
    public void Notes(double valueOfNotes ){
        double p = Item.valueOf(selectedItem).getPrice();
        System.out.println("Your Change : ");
        System.out.println(valueOfNotes - (p/100));
    }
    
    @Override
    public void displayMessageForCoins() {
        System.out.println(" Please enter coins as follows: ");
        System.out
                .println(" num of 10 cents coins,num of 25 cents coins,num of 50 cents coins,num of 100 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 10 cents then 200 cents => coins: 1,0,0,2");
        System.out.println("Please enter your coins:");

    }

    @Override
    public void enterCoins(int[] coins) {
        AnewBought newBought = new AnewBought(selectedItem, coins);
        MainCalculater yourChange = new ChangeCalculater();
        this.change = yourChange.calculateChange(newBought);
    }

    @Override
    public void displayMessageForChange() {
        System.out.println("                                              ");
        System.out.println("Your change is : " + (this.change.CalculateTotal()) + "cents split as follows: ");
        System.out.println("    100 cents coins: " + this.change.getHundredCents());
        System.out.println("    50 cents coins: " + this.change.getFiftyCents());
        System.out.println("    25 cents coins: " + this.change.getTwentyFiveCents());
        System.out.println("    10 cents coins: " + this.change.getTenCents());

    }

}
