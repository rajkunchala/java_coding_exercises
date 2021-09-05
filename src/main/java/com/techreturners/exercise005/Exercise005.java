package com.techreturners.exercise005;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Exercise005 {
    
    public boolean isPangram(String input) {

        String inputLowerCase = input.toLowerCase(Locale.ROOT);

        List<String> inputCharList = new ArrayList<>();

        // reference list for alphabets
        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        //convert input to a list, so we can search the list
        for (int i = 0; i < inputLowerCase.length() ; i++) {
            
            inputCharList.add(inputLowerCase.charAt(i)+"");

        }

        boolean isPangram = true;
        //now search the input for the alphabets
        for (int i = 0; i <alphabets.length() ; i++) {

            if (!inputCharList.contains( alphabets.charAt(i)+"")){
                isPangram = false;
                break;
            }
        }
        return isPangram;

    }

}
