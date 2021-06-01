import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	public static void main(String[] args) {
		DataInputStream stream = null;
		try {
			stream = new DataInputStream(new FileInputStream("dataio"));
			System.out.println(stream.readInt());
			System.out.println(stream.readFloat());
			System.out.println(stream.readBoolean());
			System.out.println(stream.readChar());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
