
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(toplama(1,2));
		System.out.println(Merhaba("Ekrem"));
        System.out.println(yilbul(20));
	}
    
	public static int toplama(int a, int b) {
		int cevap;
		cevap=a+b;
		return cevap;
	}
	public static String Merhaba(String ad) {
		return "Merhaba" + ad;
	}
	
	public static String yilbul (int yas) {
		int yıl=2022-yas;
		return yıl + " yilinda doğdunuz.";
	}
}
