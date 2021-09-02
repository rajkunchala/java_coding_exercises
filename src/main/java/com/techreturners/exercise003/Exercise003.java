package com.techreturners.exercise003;
import java.util.Arrays;
import java.util.List;

public class Exercise003 {

    String[] iceCreamFlavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

    List<String> flavourList = Arrays.asList(iceCreamFlavours);

    int getIceCreamCode(String iceCreamFlavour) {

        return flavourList.indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
