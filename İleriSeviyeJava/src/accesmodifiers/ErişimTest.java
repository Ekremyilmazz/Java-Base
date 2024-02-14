package accesmodifiers;

public class ErişimTest {
     public static void main(String[] args) {
    	 test testObjesi =new test();
    	 System.out.println("Erişebildiğim değişkenler:" +
    	 testObjesi.düz +" "+ testObjesi.herkese +" "+ testObjesi.korumalı);
     }
}
