package Semester1.Lesson9.Ex2;

public class HotelMain {
    public static void main(String[] args) {
        Room room = new Room(1304, 2, true);
        System.out.println(room.calculatePrice());
    }
}
