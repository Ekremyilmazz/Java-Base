
public class Main {

	public static void main(String[] args) {
		//Nested sınıflar (iç içe sınıflar)
		//  -Inner Class (iç sınıflar)
		//  -Static
		//  -Local Class(Yerel Sınıflar)
		//  -Anonymous Class (Anonim Sınıflar)
		
		NonStatic n=new NonStatic();
		NonStatic.Inner inner= n.new Inner();
	//	inner.run();
		
		Static.Inner s=new Static.Inner();
	//	s.run();
		Local l=new Local();
	//	l.run();
		Anonim a=new Anonim() {
			public void run() {
				System.out.println("Anonim sınıfına ait metod");
			}
			public void print() {
				
			}
		};
		a.run();
		a.print();
	
	}

}
