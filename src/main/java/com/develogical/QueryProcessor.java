package com.develogical;
import java.lang.*;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("oikawa")) {
            return "deserves better";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "ASA";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest")) {

            String[] parts = input.replace(",", " ");
            parts = input.replace(":", " ");
            parts = input.split(" ");

            Int[] int_array = new int[parts.length];
            int index = 0;
            for (int i=parts.length-1; i < parts.length; i--){
                try {
                    int num = Integer.parseInt(parts[i]);
                    int_array[index] = num;
                    index++;
                }
                catch (NumberFormatException e){
                    break;
                }
            return Math.max(int_array);
            }
        }
        return "";
    }
}
