package Item1;

public class Futbol {

	public String takımAdi;
	public int takımOyuncuSayısı;
	
	public Futbol(String takımAdi, int takımOyuncuSayısı) {
		super();
		this.takımAdi = takımAdi;
		this.takımOyuncuSayısı = takımOyuncuSayısı;
	}
	
	public String getTakımAdi() {
		return takımAdi;
	}
	public void setTakımAdi(String takımAdi) {
		this.takımAdi = takımAdi;
	}
	public int getTakımOyuncuSayısı() {
		return takımOyuncuSayısı;
	}
	public void setTakımOyuncuSayısı(int takımOyuncuSayısı) {
		if(takımOyuncuSayısı<0) {
			System.out.println("Olmaz");
		}
		this.takımOyuncuSayısı = takımOyuncuSayısı;
	}
	
	
}
