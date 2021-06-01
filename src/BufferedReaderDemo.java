import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try (FileReader fileReader = new FileReader("CharReadWrite"); BufferedReader reader = new BufferedReader(fileReader)) {
			int data;
			while((data=reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
