package com.rad.vendingmachine.demo.coins;

public class CoinEntered {
    private int TenCents;
    private int TwentyFiveCents;
    private int FiftyCents;
    private int HundredCents;

    public CoinEntered(int... allCoins) {
        // System.out.println(allCoins.length);
        this.TenCents = allCoins[0];
        this.TwentyFiveCents = allCoins[1];
        this.FiftyCents = allCoins[2];
        this.HundredCents = allCoins[3];
    }
    
    public int getTenCents(){
        return this.TenCents ;
    }
    public int getTwentyFiveCents(){
        return this.TwentyFiveCents ;
    }
    public int getFiftyCents(){
        return this.FiftyCents ;
    }
    public int getHundredCents(){
        return this.HundredCents ;
    }
    public void setTenCents(int a){
        this.TenCents=a;
     
    }
    public void setTwentyFiveCents(int a){
       this.TwentyFiveCents=a;
    }
    public void setFiftyCents(int a){
        this.FiftyCents=a;
        
    }
    public void setHundredCents(int a){
        this.HundredCents=a;
        
    }


    public int CalculateTotal() {
        int totalCoins = 0;
        totalCoins = totalCoins + this.TenCents * Coin.Dime.getDenomination();
        totalCoins = totalCoins + this.TwentyFiveCents * Coin.Quarter.getDenomination();
        totalCoins = totalCoins + this.FiftyCents * Coin.Half.getDenomination();
        totalCoins = totalCoins + this.HundredCents * Coin.Dollar.getDenomination();
        return totalCoins;
    }

}