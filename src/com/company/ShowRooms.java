package com.company;

import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.IOException;

public class ShowRooms {
    public static void main(String[] args) throws IOException{
        Room[] rooms;
        rooms = new Room[10];
        Scanner diskScanner = new Scanner(new File("D:/roomlist.txt"));
        for (int roomNum = 0; roomNum < 10; roomNum++){
            rooms[roomNum] = new Room();
            rooms[roomNum].readRoom(diskScanner);
        }
        out.println("R\tQ\tRate\t\t" + "For Smoker");
        for (int roomNum = 0; roomNum < 10; roomNum++){
            out.print(roomNum);
            out.print("\t");
            rooms[roomNum].writeRoom();
        }
        diskScanner.close();
    }
}
