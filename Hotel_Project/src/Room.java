import java.util.*;

public class Room{
	
	private int roomNum;
	private String bedType;
	private double rate;
	private String occupantName;
	private char smoking;
	private boolean occupied; 
	
	public Room(int roomNum, String bedType, char smoking, double rate) {
		this.roomNum = roomNum;
		this.bedType = bedType;
		this.smoking = smoking;
		this.rate = rate;
		
	}
	
	
	//get method 
	public  String getBedType() {
		return bedType;
	}
	
	public char getSmoking() {
		return smoking;
	}
	
	public  int getRoomNum() {
		return roomNum;
	}
	
	public double getRoomRate() {
		return rate;
		
	}

	public String getOccupant() {
		return occupantName;
	}
	
	//set method 
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public void setOccupant(String name) {
		this.occupantName = name;
	}
	
	public void setRoomNum(int num) {
		this.roomNum = num;
	}
	
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void setSmoking(char s) {
		this.smoking = s;
	}
	
	public boolean  isOccupied() {
		return this.occupied;
	}
	
	public String toString() {
		String result;
		String print = this.occupantName;
		if(occupied) {
			print = this.occupantName;
		} else {
			print = "Not Occupied";
		}
		result = "roomNum:  " + this.roomNum + "\n" + 
				"Occupant name:  "+ print + "\n" + 
				"Smoking room:  " + smoking + "\n" + 
				"bedType:  "+ this.bedType   + "\n" + 
				"rate: " +  this.rate;

		
		return result;
	}
	

}