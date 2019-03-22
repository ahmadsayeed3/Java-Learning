// abstract method in method.

enum Day{
	
	// public int y; It is an error, the first thing must be here is constants declaration anything else is compile time error.
	
	MONDAY(1){  
		public Day next(){ return TUESDAY; }
	},
	
	TUESDAY(2){
		public Day next(){	return WEDNESDAY;	}
	},
	
	WEDNESDAY(3){
		public Day next(){	return THURSDAY;	}
	},
	
	THURSDAY(4){
		public Day next(){	return FRIDAY;  }
	},
	
	FRIDAY(5){
		public Day next(){	return SATURDAY;	}
	},
	
	SATURDAY(6){
		public Day next(){  return SUNDAY;	}
	},
	
	SUNDAY(7){
		public Day next(){	return MONDAY; }
	};
	
	// Data Member
	private final int dayNumber;
	
	// Constructor
	Day(int d){
		this.dayNumber = d;
	}
	
	//method
	int getDayNumber(){
		return dayNumber;
	}
	
	// Abstract method. needs to override for all constants.
	public abstract Day next();

}

// Implementation class

public class MyClass{
 
	public static void main(String...a){
		System.out.printf("Current Day is %s  that comes in %sth place in the week" + 
		" and next day is %s", Day.TUESDAY, Day.TUESDAY.getDayNumber(), Day.TUESDAY.next()
		);
		
		System.out.println();
		// Let's access all constants
			for(Day d: Day.values()){
				System.out.printf("%s %d, next is  %s\n", d, d.getDayNumber(), d.next());
			}
   
	}
}
