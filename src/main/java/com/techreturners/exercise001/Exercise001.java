package com.techreturners.exercise001;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0,1).toUpperCase()+word.substring(1,word.length()) ;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double totalPrice = originalPrice + ((originalPrice/100)*vatRate);
        BigDecimal bd = new BigDecimal(totalPrice).setScale(2, RoundingMode.DOWN);

        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        // Add your code here
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        long linuxUsers = users.stream()
                                 .filter(u-> u.getType().equals("Linux"))
                                 .count();

        return (int)linuxUsers;
    }
}
