package accesmodifiers;

public class test {
      public String herkese="public değişken";
      protected String korumalı="protected değişken";
      String düz="default değişken";
      private String gizli="private değişken";
      
      public static void main(String[] args) {
  		test testObjesi =new test();
  		
  		System.out.println("Erişebildiğim değişkenler:" +testObjesi.düz+" "+
  		testObjesi.gizli +" "+ testObjesi.herkese +" "+ testObjesi.korumalı );
          
  		
  	}
}
