package com.company;

import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TestArray {
    public static void main(String args[]) throws IOException {
        int guests[] = new int[10];
        Scanner diskScanner = new Scanner(new File("D:/GuestList.txt"));

        for(int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }
        out.println("комната\tколичество");
        for(int roomNum = 0; roomNum < 10; roomNum++){
            out.println(roomNum);
            out.println("\t");
            out.println(guests[roomNum]);
        }
        diskScanner.close();
    }
}
