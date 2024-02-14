
public class Vehicle implements Engine {
    int numberOfSeats;
    int numberOfWheels;
    
    public void start() {
    	System.out.println("Araç Çalışıyor...");
    }

	@Override
	public void stop() {
	     System.out.println("Araç durdu...");
		
	}
}
