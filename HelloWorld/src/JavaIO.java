import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class JavaIO {

	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.println(s.next());
		s.close();
		
		File myFile=new File("file.txt");
		myFile.createNewFile();
		
		Scanner fileReader =new Scanner(myFile);
		
		FileWriter fileWriter =new FileWriter(myFile);
		
		fileWriter.write("Merhaba");
		fileWriter.write("\nBen Ekrem");
		
		while(fileReader.hasNext())
			System.out.println(fileReader.next());
		
		fileReader.close();
		fileWriter.close();
		
		bufferedWriterAndReader();
		
	}
	
	private static void bufferedWriterAndReader() throws Exception{
		File mySecondFile =new File("buffer.txt");
		FileWriter buffer=new FileWriter(mySecondFile);
		BufferedWriter bufferedWriter=new BufferedWriter(buffer);
		
		FileReader read = new FileReader(mySecondFile);
		BufferedReader bufferReader =new BufferReader(read);
	}

}
