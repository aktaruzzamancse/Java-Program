
public class Program {
	private String name;
	private int age;
	private int mobilenumber;
	Program(String name,int age,int mobilenumber){
		this.name = name;
		this.age = age;
		this.mobilenumber = mobilenumber;
	}
	void display(){
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Mobile Number "+mobilenumber);
	}  
	public static void main(String[] args) {
		Program obj = new Program("Masum Mina",24,020202);
		obj.display();

	}

}
