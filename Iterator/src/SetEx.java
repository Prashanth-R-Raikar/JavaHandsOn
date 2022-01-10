
public class SetEx {
	
	public static void main(String[] args) {
		Set<Integer> num1To10=ex1.get1To10();
		int sum=0;
		for(Integer number: num1To10){
			sum=sum+number;
		}
		System.out.println("Sum:"+ sum);
}
