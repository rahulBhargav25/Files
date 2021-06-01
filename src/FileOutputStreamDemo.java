import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream("filewrite", true);
			String str = "modi gandu he";
			byte[] b = str.getBytes();
			stream.write(b);
			System.out.println("Data written in file " + stream);
			System.out.println("");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
