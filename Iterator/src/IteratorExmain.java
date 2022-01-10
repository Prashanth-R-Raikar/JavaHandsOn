import java.util.Iterator;
import java.util.Set;

public class IteratorExmain {

	public static void main(String[] args) {
		SetEx ex1=new SetEx();
		Set<String> countrySet = ex1.getCountries("India","Australia","England","South Africa", "England","New Zealand");
		Iterator<String> iterator=countrySet.iterator();
		while(iterator.hasNext()){
			String string= iterator.next();
			System.out.println(string);
		}
		
	}

}
