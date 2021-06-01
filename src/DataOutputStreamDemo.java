import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataOutputStreamDemo {
	public static void main(String[] args) {
		DataOutputStream stream = null;
		try {
			stream = new DataOutputStream(new FileOutputStream("dataio"));
			stream.writeInt(10);
			stream.writeFloat(12.24f);
			stream.writeBoolean(true);
			stream.writeChar('A');
			System.out.println("data is written " + stream);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			if(stream!=null) {
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
