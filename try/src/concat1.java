
public class concat1 {
    
	public static String concatenation() {
		   String result="";
		   String arr[]= {"Ali","Veli","Veli"};
		   
		   for(int i=0;i<arr.length;i++) {
			   result+=arr[i];
		   }
		   return result;
	   }
	public static String sb() {
		String arr[]= {"Ali","Veli","Veli"};
		StringBuilder b=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			b.append(arr[i]);
		}
		return b.toString();
	}
	
	
	public static void main(String[] args) {
	    long start=System.nanoTime();
	    sb();
	    long finish=System.nanoTime();
	    long timeElapsed=finish-start;
		
	    System.out.println(timeElapsed);
		System.out.println(concatenation());
        System.err.println(sb());
	}

}
