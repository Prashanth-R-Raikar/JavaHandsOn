
public class Calculator {
	int num1;
	int num2;

	void addition(){
		int num3=num1+num2;
		System.out.println("The sum is:" +num3);
	}
	void subtraction(){
		int num3=num1-num2;
		System.out.println("The subtraction result is:" +num3);
	}
	void printSmaller(){
		int num3=(num1<num2) ? num1:num2;
		System.out.println("The smaller number is:" +num3);
	}
	
}	
