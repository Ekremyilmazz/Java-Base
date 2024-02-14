import accesmodifiers.test;

public class outsideErişim extends test{

	public static void main(String[] args) {
		test testoblesi =new test();
		
		System.out.println("eriştiğim değişkenlerim: "+
		testoblesi.herkese);
        
		outsideErişim OutsideErişimobjesi = new outsideErişim();
		
		System.out.println("Eriştiğim değişkenler:" +
		OutsideErişimobjesi.herkese +" " +OutsideErişimobjesi.korumalı);
	}

}
