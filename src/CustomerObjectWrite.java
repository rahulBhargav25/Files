import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerObjectWrite {
	public static void main(String[] args) {
		ObjectOutputStream stream = null;
		
		try {
			stream = new ObjectOutputStream(new FileOutputStream("customerio"));
			Customer customer = new Customer(1, "john");
			stream.writeObject(customer);
			System.out.println("customer saved in db");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream!= null) {
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
