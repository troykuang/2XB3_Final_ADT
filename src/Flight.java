import java.util.ArrayList;

public class Flight implements FlightAPI{
	private String origin;
	private String destination;
	private int dep_delay;
	private int arr_delay;
	private ArrayList<String[]> a; 
	
	public Flight(String[] FlightInfo){
		this.origin = FlightInfo[0];
		this.destination = FlightInfo[3];
		this.dep_delay = Integer.parseInt(FlightInfo[7]);
		this.arr_delay = Integer.parseInt(FlightInfo[9]);		
	}

	public String getOrigin(){
		return origin;	
	}
	
	public String getDest(){
		return destination;	
	}
	
	public int getDep_Delay(){
		return dep_delay;		
	}
	
	public int getArr_Delay(){
		return arr_delay;	
	}
	
	public String toString()
	{
		return String.format("%s,%.1f",origin,destination,dep_delay,arr_delay);
	}
	
	public static void main(String[] args) {
		ArrayList<String[]> a = new ArrayList<String[]>();
		ArrayList<Flight> flightLists = new ArrayList<Flight>();
		
		int length = a.size();
		for (int i=0;i<length;i++){
			Flight current = new Flight(a.get(i));
			flightLists.add(current);
		}
		
		
	}

}