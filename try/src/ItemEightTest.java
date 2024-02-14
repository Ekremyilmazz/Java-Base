import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ItemEightTest {
     
	private static final int BUFFER_SIZE=0;
	
	static String firstLineOfFile(String path) throws IOException{
		BufferedReader br =new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		}
		finally {
			br.close();
		}
	}
	
	static String firstLineofFileWell(String path,String defaultVal) {
		try(BufferedReader br=new BufferedReader(new FileReader(path))){
			return br.readLine();
		}
		catch (IOException e){
			return defaultVal;
		}
	}
	
	static void copy(String src,String dst) throws IOException{
		try(InputStream ın=new FileInputStream(src)) {
			
			
		}
	}
}
