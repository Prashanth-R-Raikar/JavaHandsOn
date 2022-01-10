
public class TestWelcome {

	public static void main(String[] args) {
		int count=5;
		WelcomeMessage message=new WelcomeMessage();
		do{
			message.printMessage();
			count--;
		}
		while(count>0);
	}

}
