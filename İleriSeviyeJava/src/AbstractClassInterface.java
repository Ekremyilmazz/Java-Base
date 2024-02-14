
public class AbstractClassInterface {

	public static void main(String[] args) {
		//Hayvan a=new İnsan(182,95);
		Bina a=new Bina();
        System.out.println(a.boyMetre());
        System.out.println(a.boySantimetre());
        System.out.println(a.boyKilometre());
	}
}

interface Boy{
	int değişken=0;
	static String tanım() {
		return "Bu interface implement eden class için" +
	            "boy bilgileri dönülmesini garanti eder.";
	}
	int boySantimetre();
	double boyMetre();
	default double boyKilometre() {
		return 0;
	}
}

abstract class Hayvan implements Boy{
	private int boy;
	private int kilo;
	public abstract boolean canlıMı();

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
}

class İnsan extends Hayvan{
	public İnsan (int boy,int kilo) {
		this.setBoy(boy);
		this.setKilo(kilo);
	}
	
	public boolean canlıMı() {
		return true;
	}
	
	public int boySantimetre() {
		return this.getBoy();
	}
	
	public double boyMetre() {
		return this.getBoy()/100.0;
	}
}

class Bina implements Boy{
	public int boySantimetre() {
		return 2000;
	}
	public double boyMetre() {
		return 20;
	}
	public double boyKilometre() {
		return 0.02;
	}
}



