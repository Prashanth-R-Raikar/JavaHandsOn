
public class StaticDemo {
	private static int x=0;
	private int y=3;
	
	public StaticDemo(){
		x++;
		y+=5;
		System.out.println("X is " + x +" and Y is " + y);
		
	}
	public static void main(String[] args) {
		StaticDemo S1=new StaticDemo();
		StaticDemo S2=new StaticDemo();
		StaticDemo S3=new StaticDemo();
	}
}
