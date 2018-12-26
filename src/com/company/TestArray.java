package com.company;

import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TestArray {
    public static void main(String args[]) throws IOException {
        int guests[] = new int[10];
        Scanner diskScanner = new Scanner(new File("D:/GuestList.txt"));

        for(int roomNum = 0; roomNum < guests.length; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }
        out.println("room\tnubmer");
        for(int numGuests : guests){ //Альтернативная запись цикла: Тип_переменной имя_переменной : Диапазон_значений
            int roomNum=0;
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuests);
        }
        diskScanner.close();
    }
}
