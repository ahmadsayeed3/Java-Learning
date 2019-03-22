class Swift extends Vehicle {

	String color;
	int noOfSeats;
	Swift(String color, int noOfSeats){
		this.color = color;
		this.noOfSeats = noOfSeats;
		this.wheels = 6;
	}
	
	public static void main(String...a){
		Swift s = new Swift("red", 5);
		System.out.println("Vehicle Configuration");
		System.out.println("Wheels = " + s.wheels );
		System.out.println("Color = " + s.color );
		System.out.println("No Of Seats = " + s.noOfSeats );
	}
}


class Vehicle{	
	int wheels = 4;
}