import java.util.Scanner;//*Importing scanner class for input from keyboard.*//
public class Calculator { //Declare Calculator class

	 public static void main(String[] args) {// Java main method java application execution from here
		double nub1; //Declare Variable
		double nub2; //Declare Variable
		Calculator cal = new Calculator(); // Object create 
		Scanner keyinput = new Scanner(System.in); 
		System.out.println("Please input two number for Calculation.");
		nub1 =keyinput.nextDouble(); 
		nub2 =keyinput.nextDouble();
		double add_result = cal.addition(nub1,nub2);
		System.out.println("Addition Result = "+add_result);//For display output with return value
		double subtract_result = cal.subtract(nub1,nub2);
		System.out.println("Subtract Result = "+subtract_result);//For display output with return value
		double multiply_result = cal.multiply(nub1,nub2);
		System.out.println("Multiply Result = "+multiply_result);//For display output with return value
		double divide_result = cal.divide(nub1,nub2);
		System.out.println("Divide Result = "+divide_result);//For display output with return value
	}//End main method
	 public double addition (double a,double b){
		double addition;
		addition = a+b;
		//System.out.println("Addition Result = "+addition);
		return addition;
	}
	public double subtract (double a,double b){
			double subtract;
			subtract = a-b;
			//System.out.println("Addition Result = "+addition);
			return subtract;
	}
	public double multiply (double a,double b){
		double multiply;
		multiply = a*b;
		//System.out.println("Addition Result = "+addition);
		return multiply;
	}
	public double divide (double a,double b){
		double divide;
		divide = a/b;
		//System.out.println("Addition Result = "+addition);
		return divide;
	}

}
