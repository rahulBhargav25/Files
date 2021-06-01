import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("objectio"));
			String str = "teri mkcmkckmckmkdhkasbjhsdb skg ksdg jshgdj hsgj jhfdb ";
			stream.writeObject(str);
			System.out.println("data is written " + stream);
		} catch (IOException e) {
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
