import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomerObjectRead {
	public static void main(String[] args) {
		ObjectInputStream stream = null;
		try {
			stream = new ObjectInputStream(new FileInputStream("customerio"));
			Customer customer = (Customer) stream.readObject();
			System.out.println(customer);
		} catch (IOException | ClassNotFoundException e){
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
