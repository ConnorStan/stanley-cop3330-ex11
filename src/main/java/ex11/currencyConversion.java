package ex11;


import java.util.Scanner;
import java.lang.Math;

public class currencyConversion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("How many euros are you exchanging? ");
        String amountEuros = in.nextLine();
        System.out.print("What is the exchange rate? ");
        String exchangeRate = in.nextLine();


        // Numerical Conversions and new variable declaration
        double euros = Double.parseDouble(amountEuros);
        double rate = Double.parseDouble(exchangeRate);
        double preciseDollarAmount = euros * rate;

        // Creating a specific dollar amount for the final amount.
        double dollars = Math.floor(preciseDollarAmount*100)/100;



        // Single Output
        System.out.print(euros + " Euros at an exchange rate of " + rate + " is \n" + dollars + " U.S. Dollars.");


    }
}