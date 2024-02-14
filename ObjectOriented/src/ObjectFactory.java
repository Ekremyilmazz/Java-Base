
public class ObjectFactory {

	public static void main(String[] args) {
		Pen firstPen=new Pen();
		firstPen.setColor("red");
		firstPen.setHeight(10);
		String message="ilk kalem üretildi";
		
		firstPen.writeMessage(message);
		
		Pen secondPen=new Pen();
		secondPen.setColor("blue");
		secondPen.setHeight(8);
		secondPen.writeMessage(secondPen.getColor() +" " + secondPen.getHeight());
        
		Car car =new Car();
		car.numberOfSeats=5;
		car.numberOfWheels=4;
		
		Bicycle bicycle=new Bicycle();
		bicycle.numberOfSeats=1;
		bicycle.numberOfWheels=2;
		
		Vehicle car2 =new Car();
		car2.numberOfSeats=5;
		
		car2.stop();
		
        car.start();
        bicycle.start();
        car2.start();
         Vehicle [] vehicles =new Vehicle[10];
         vehicles[0]=car;
         vehicles[1]=bicycle;
         vehicles[2]=car2;
         
        
	}

}
