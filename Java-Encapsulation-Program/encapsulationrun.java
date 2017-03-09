package encapsulation;
import java.util.Scanner;
public class encapsulationrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		encapsulationclass obj = new encapsulationclass();
		System.out.println("Please Input Your Name");
		obj.setName(input.nextLine());
		System.out.println("Please Input Your Age");
		obj.setAge(input.nextInt());
		System.out.println("Please Input Your Mobile Number");
		obj.setMobilenumber(input.nextInt());
		
		
		System.out.println("Your Name is "+obj.getName());
		System.out.println("Your Age is "+obj.getAge());
		System.out.println("Your Mobile number is "+obj.getMobilenumber());
		

	}

}
