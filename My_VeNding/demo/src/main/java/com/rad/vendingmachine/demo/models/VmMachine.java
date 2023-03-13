package com.rad.vendingmachine.demo.models;

public interface VmMachine {
    abstract void  displayAllItems();

    void setSelectItem(int item);

    void setSelectType(int type);
    
    void Balance(double balance);

    void Notes(double valueOfNotes);

    void displayMessageCardOrCoins();

    void displayMessageForCard();

    void displaySecondMessageForCard();

    void displayMessageForCoins();

    void enterCoins(int[] coins);

    void displayMessageForChange();
    
}
