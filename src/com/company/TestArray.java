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
        out.println("room\tnumbers");
        for(int numGuest : guests){ //Альтернативный способ записи цикла: Тип_переменной Имя_переменной : Диапазон_значений (указал что roomNum = 0 и при выводе добавить ++)
            int roomNum= 0;
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuest);
        }
        diskScanner.close();
    }
}
