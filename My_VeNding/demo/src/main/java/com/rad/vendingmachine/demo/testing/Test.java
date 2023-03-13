package com.rad.vendingmachine.demo.testing;

import com.rad.vendingmachine.demo.coins.Coin;
import com.rad.vendingmachine.demo.controller.*;
import com.rad.vendingmachine.demo.models.VmMachine;
import com.rad.vendingmachine.demo.models.Item;
import java.util.Scanner;
import org.apache.el.util.Validation;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VmMachine Vm = new MyVmMachine();
        Vm.displayAllItems();
        String selectedItem = scanner.nextLine();
        Vm.setSelectItem(Integer.parseInt(selectedItem));
        if (Integer.parseInt(selectedItem) > 25 || Integer.parseInt(selectedItem) < 1) {
            System.out.println("   Please Choose Correct Number");
            System.exit(0);
        } else {
            Vm.displayMessageCardOrCoins();
        }
        String selectedType = scanner.nextLine();
        Vm.setSelectType(Integer.parseInt(selectedType));

        if (selectedType.equals("1")) { // Validation for Card Number 
            Vm.displayMessageForCard();
            String cardNumber = scanner.nextLine();
            if (cardNumber.length() != 8) {
                System.out.println("Your Card Number is inncorrect");
                System.exit(0);
            }
            else{
                Vm.displaySecondMessageForCard();
                String Balance = scanner.nextLine();
                Vm.Balance(Double.parseDouble(Balance)); // parseDouble to convert from string to duoble
            }

            }

         else if (selectedType.equals("2"))
             {
                Vm.displayMessageForCoins();
                String amountOfCoins = scanner.nextLine();
                int[] arrCoins = Coin.parseCoins(amountOfCoins); // Converting to array of Integers !
                Vm.enterCoins(arrCoins);
                Vm.displayMessageForChange();
                
            }
        else{
                System.out.println("Please Insert 20 or 50 $Notes ONLY");
                String valueOfNotes = scanner.nextLine();
                if(valueOfNotes.equals("20")||(valueOfNotes.equals("50"))){
                    Vm.Notes(Double.parseDouble(valueOfNotes));
                }
                else{
                    System.out.println("Here is your Notes Please Insert 20 or 50 $Notes Only !");
                    System.exit(0);
                }
                
      

    }

}}
