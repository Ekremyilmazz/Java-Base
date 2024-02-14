
public class NonStatic {
     private int a=10;
     
     public class Inner{
    	 int a=1;
    	 
    	 public void run() {
    		 System.out.println(a);
    		 System.out.println(this.a);
    		 System.out.println(NonStatic.this.a);
    	 }
     }
     public void run() {
    	 System.out.println(a);
    	 System.out.println(this.a);
    	 Inner i=new Inner(); //Inner sınıfının bilgilerini kullanmak için Inner clasından nesne türetilmesi gerekir.
    	 System.out.println(i.a);
     }
}
