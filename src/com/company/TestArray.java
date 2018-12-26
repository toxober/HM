package com.company;

import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class TestArray {
    public static void main(String args[]) throws IOException {
        byte guests[] = new byte[10];
        byte roomNum;
        Scanner diskScanner = new Scanner(new File("D:/GuestList.txt"));

        for(roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextByte();
        }diskScanner.close();
        out.println("room\tnumbers");

        for(roomNum = 0; roomNum<10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guests[roomNum]);
        }
        roomNum=0;
            while (roomNum < 10 && guests[roomNum] != 0) {
                roomNum++;
            }
            if (roomNum == 10){
                out.println("Sorryamba, mest net.");
            }else {
                out.print("How many pizdykov poselyatsa ");
                out.print(roomNum);
                out.print("? ");
                Scanner keyboard = new Scanner(System.in);
                guests[roomNum] = keyboard.nextByte();
                keyboard.close();
                PrintStream listOut = new PrintStream("D:/GuestList.txt");
                for (roomNum = 0; roomNum < 10; roomNum++) {
                    listOut.print(guests[roomNum]);
                    listOut.print(" ");
                }
                listOut.close();
            }
        }
}

