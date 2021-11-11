
//import package.Room;
import java.util.*;

public class Hotel{
	private ArrayList<Room> theRooms;
	private String name;
	private String location;
	private	int occupiedCnt;
	private	 int numOfRooms;
	private static final int NOT_FOUND = -1;
	
	public Hotel() {
		this.theRooms = new ArrayList<Room>();
		this.numOfRooms = 10;
		for (int i = 0; i<10; i++) {
			theRooms.add(null);
		}
		
	}
	
	public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
		this.numOfRooms = 0;
		this.occupiedCnt = 0;
		this.theRooms = new ArrayList<Room>(10);
		
	}
	
	public boolean isFull() {
		if(occupiedCnt == numOfRooms) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(occupiedCnt == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void addRoom(int roomNum, String bedType, char smoking, double rate) {
		Room newRoom = new Room(roomNum, bedType, smoking, rate);
		newRoom.setOccupied(false);
		theRooms.add(newRoom);
		this.numOfRooms++;
	}
	

	
	public void addReservation(String name, char smoking, String bedType) {
		Boolean booked = false;
		for(int i = 0; i< numOfRooms; i++) {
			Room room = theRooms.get(i);
			if(room.getSmoking() == smoking && room.getBedType() == bedType) {
				booked = true;
				room.setOccupant(name);
				room.setOccupied(true);
				this.occupiedCnt ++;
				System.out.println("Room is booked for " + 
				name + "\n" + "Room information: " + "\n" + room.toString());
				break;
			}
			
			
		}
		if (booked ==  false) {
			System.out.println("No available room");
		}
		
	}
	
	public void cancelReservation(String name) {
		int index = findReservation(name);
		if(index != -1) {
			theRooms.get(index).setOccupant(null);
			theRooms.get(index).setOccupied(false);
			this.occupiedCnt--;
			System.out.println("Reservation for " + name + " is sucessfully cancelled!");
		}else {
			System.out.println("There is no reservation for " + name);
		}
	}
	
	public int findReservation(String name) {
		
		for (int i = 0; i<this.numOfRooms; i ++) {
			Room room = theRooms.get(i);
			if(room.getOccupant() == name ) {
				return i;
			}
		}
		
		return NOT_FOUND;
	}
	
	public void printReservationList() {
		for (int i = 0; i<this.numOfRooms; i++) {
			Room room = theRooms.get(i);
			if(room.isOccupied()) {
				String result = room.toString();
				System.out.println(result);
			}
			System.out.println("\n");
		}
	}
	
	public double getDailySales() {
		double result = 0;
		for (int i = 0; i < this.numOfRooms; i++) {
			Room room = theRooms.get(i);
			if(room.isOccupied()) {
				result = result + room.getRoomRate();
			}
		}
		return result;
	}
	
	public double OccupancyPercentage() {
		return (double)this.occupiedCnt/(double)this.numOfRooms;
	}
	
	public String toString() {
		String result = " ";
		for (int i = 0; i< this.numOfRooms; i++) {
			result = result + "\n" + "\n";
			result = result + theRooms.get(i).toString();
		}
		return result;
	}
}



