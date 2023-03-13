package com.rad.vendingmachine.demo.controller;

import com.rad.vendingmachine.demo.coins.CoinEntered;
import com.rad.vendingmachine.demo.models.Item;

public class AnewBought {
    private Item item;
    private CoinEntered allCoins;

    public AnewBought(int item, int... allCoins) {
        // Turning number of item to it's name ! .
        this.item = Item.valueOf(item);
        this.allCoins = new CoinEntered(allCoins);
    }

    public Item getItem(){
        return this.item;
    }
    public CoinEntered getCoinEntered(){
        return this.allCoins;
    }

}
