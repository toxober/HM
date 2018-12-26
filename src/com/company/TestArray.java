package com.company;

import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TestArray {
    public static void main(String args[]) throws IOException {
        byte guests[] = new byte[10];
        Scanner diskScanner = new Scanner(new File("D:/GuestList.txt"));

        for(byte roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextByte();
        }
        out.println("room\tnumbers");
        for(int numGuest : guests){ //Альтернативный способ записи цикла: Тип_переменной Имя_переменной : Диапазон_значений (указал что roomNum = 0 и при выводе добавить ++) И ещё, при использовании "расширенного" цикла for в каждой итерации в переменной цикла numGuest сохраняется копия одного из значений диапазона guests и переменная numGuest не указывает ни на диапазон, ни на его текущее значение.
            int roomNum= 0;
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuest);
        }
        diskScanner.close();
    }
}
