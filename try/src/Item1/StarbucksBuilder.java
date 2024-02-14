package Item1;

public class StarbucksBuilder {

	   private final String kahveBoyutu = "";
	   
	   private String laktozsuzSütMiktarı;
	   private String yumuşatıcı;
	   
	   
	   public static class Builder{
		   
		private String kahveBoyutu;
		public Builder(String kahveBoyutu) {
			super();
			this.kahveBoyutu = kahveBoyutu;
		}
		   public Builder laktozsuzTayfa(String laktozsuzSüt) {
			   laktozsuzSütMiktarı=laktozsuzSüt;
			   return this;
		   }
		   
		   
		   
		   
	   }
}
