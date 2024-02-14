
public class StarbucksBuilder {
   private String kahveBoyutu;
   private String laktozsuzSütMiktarı;
   private String yumuşatıcı;
   
   public static class Builder{
	   private String kahveBoyutu;
	   private String laktozsuzSütMiktarı;
	   private String yumuşatıcı;
	public Builder(String kahveBoyutu) {
		super();
		this.kahveBoyutu = kahveBoyutu;
	}
	   
	public Builder laktozsuzTayfa (String laktozsuzSüt) {
		laktozsuzSütMiktarı=laktozsuzSüt;
		return this;
	}

	public Builder yumuşakİçenler(String yumuşakDeğer) {
		yumuşatıcı=yumuşakDeğer;
		return this;
	}
	
	public StarbucksBuilder build() {
		return new StarbucksBuilder(this);
	}
	
   }
   
   public StarbucksBuilder(Builder builder) {
	   kahveBoyutu=builder.kahveBoyutu;
	   laktozsuzSütMiktarı=builder.laktozsuzSütMiktarı;
	   yumuşatıcı=builder.yumuşatıcı;
   }
}
