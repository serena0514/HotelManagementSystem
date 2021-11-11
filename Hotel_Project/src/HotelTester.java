
import java.util.*;
import java.lang.*;

public class HotelTester{
	public static void main(String[] args) {
		Room test1 = new Room(1, "twin", 's', 100.2);
		String result = test1.toString();
		System.out.println(result);
		
		Hotel hotel1 = new Hotel("hotel1", "Seattle");
		hotel1.addRoom(101,"quenn",'s', 100);
		hotel1.addRoom(102,"king",'n', 110);
		hotel1.addRoom(103,"king",'n', 88);
		hotel1.addRoom(104,"twin",'s', 100);
		hotel1.addRoom(102,"queen",'n', 99);
		
		hotel1.addReservation("serena", 's', "twin");
		hotel1.addReservation("nick", 's', "queen");
		hotel1.addReservation("Jane", 'n', "king");
		
		
		int i = hotel1.findReservation("serena");
		System.out.println(i);
		hotel1.printReservationList();
		
		hotel1.cancelReservation("nick");
		hotel1.printReservationList();
		
		System.out.println(hotel1.getDailySales());
		System.out.println(hotel1.OccupancyPercentage());
		System.out.println(hotel1.toString());
	}
}