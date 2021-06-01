import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("CharReadWrite", true)) {
			String str = "This will be written to the file";
			writer.write(str);
			System.out.println("string written in file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
