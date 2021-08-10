package mypack;

public class Train {

	private int tno;
	private String tcode;
	private String station;
	private String arrival;
	private String departure;
	
	public Train(int tno, String tcode, String station,String arrival, String departure) {
		this.tno = tno;
		this.tcode = tcode;
		this.station = station;
		this.arrival = arrival;
		this.departure = departure;
	}
	
	public void printTrainDetails() {
		System.out.printf("%d %4s   %-17s %6s %9s\n",tno,tcode,station,arrival,departure);
	}
	
	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("-----------------------------------------------");
		System.out.println("#  code    station          Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		
		Train[] trainInfo = {
				new Train(1,"YPR","Yasvantpur Jn"," ","23:40"),
				new Train(2,"GTL","Guntakal Jn","03:45","03:50"),
				new Train(3,"YPR","Sekandrabad Jn","08:55","09:00"),
				new Train(4,"YPR","Balharshah","13:30","13:35"),
				new Train(5,"YPR","Habibganj","21:20","23:40"),
				new Train(6,"YPR","Jhansi Jn","01:15","23:40"),
				new Train(7,"DEE","Delhi S Rohilla","07:00"," ")
		};
		
		for(Train details:trainInfo) {
			details.printTrainDetails();
		}
		
		System.out.println("-----------------------------------------------");
	}

}
