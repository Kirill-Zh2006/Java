package main;

import by.itacademy.room.Bed;
import by.itacademy.room.Room;
import by.itacademy.room.Table;
import by.itacademy.room.Wardrobe;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Room room = new Room();

        room.setLight("включен");
        room.setHeight(3);
        room.setDoor("открыта");

        Bed bed = new Bed();

        bed.setWidth(2);
        bed.setMadeUp(true);
        room.setBed(bed);

        Wardrobe wardrobe = new Wardrobe(2, 10, 2);
        room.setWardrobe(wardrobe);

        System.out.println(room.printInfoAboutMe());
        Table.turnComputer();
        Table.shelfBook();
    }
}