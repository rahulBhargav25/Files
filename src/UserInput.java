import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {
		try (BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("enter your name");
			String name = fromUser.readLine();
			System.out.println("hello " + name);
			System.out.println("enter num: ");
			int num1 = Integer.parseInt(fromUser.readLine());
			System.out.println("Enter num2 :");
			int num2 = Integer.parseInt(fromUser.readLine());
			int result = num1+num2;
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("enter numeric value");
		}
	}
}
