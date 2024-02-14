
public class ItemThreeTest {

	public static void main(String[] args) {
		DefineSingleton ds=DefineSingleton.ds;
		DefineSingleton ds2=DefineSingleton.getInstance();
		
		System.out.println(ds.hashCode());
		System.out.println(ds2.hashCode());

	}

}
