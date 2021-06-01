import java.io.Serializable;
public class Customer implements Serializable {
	private int CustomerId;
	private String customerName;
	public Customer(int customerId, String customerName) {
		super();
		CustomerId = customerId;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", customerName=" + customerName + "]";
	}
}
