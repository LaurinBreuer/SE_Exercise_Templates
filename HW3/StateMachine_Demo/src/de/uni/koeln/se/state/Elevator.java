package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		arrive_atFloor();
	}

	// The current floor equals the destination floor
	private void arrive_atFloor() {
		// Set the state
		State.Current_State = State.Idle;
		System.out.println("Current state: " + State.Current_State + " | Current floor: "+ current_Floor );

		if (current_Floor < dest_Floor){ // The destination floor is above the current floor
			go_up();
		}

		else if (current_Floor > dest_Floor){ // The destination floor is below the current floor
			go_down();
		}

		else if (current_Floor == dest_Floor){ // Arrived at the destination floor
			System.out.println("Exit. You have arrived at your destination floor");
		}
	}

	private void go_up(){
		State.Current_State = State.Moving_up;
		current_Floor++;
		System.out.println("Current state: " + State.Current_State + " | Current floor: "+ current_Floor );

		if (current_Floor < dest_Floor){
			go_up();

		}

		else if (current_Floor == dest_Floor){
			arrive_atFloor();
		}
	}

	private void go_down(){
		State.Current_State = State.Moving_down;
		current_Floor--;
		System.out.println("Current state: " + State.Current_State + " | Current floor: "+ current_Floor );

		if (current_Floor > dest_Floor){

			go_down();
		}

		else if (current_Floor == dest_Floor){
			arrive_atFloor();
		}
	}

	
}
