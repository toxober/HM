package com.company;
import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class hotelRoom {
    private int guestn;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
public void readRoom(Scanner diskScanner) {
    guestn = diskScanner.nextInt();
    rate = diskScanner.nextDouble();
    smoking = diskScanner.nextBoolean();
    }
    public void writeRoom(){
    out.print(guestn);
    out.print("/t");
    out.print(currency.format(rate));
    out.print("/t/t");
    out.print(smoking ? "yes" : "no");
    }
}