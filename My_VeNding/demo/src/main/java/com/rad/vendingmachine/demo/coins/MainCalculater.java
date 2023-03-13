package com.rad.vendingmachine.demo.coins;

import java.text.BreakIterator;

import com.rad.vendingmachine.demo.controller.AnewBought;

public abstract class MainCalculater {
    public abstract  CoinEntered calculateChange(AnewBought newBought) ;
    public abstract CoinEntered calculateChange(int allChange);
}