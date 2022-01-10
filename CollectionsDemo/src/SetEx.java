import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public Set getCountries(String c1,String c2,String c3,String c4,String c5){
		Set countries=new HashSet();
		countries.add(c1);
		countries.add(c2);
		countries.add(c3);
		countries.add(c4);
		countries.add(c5);
		return countries;
	}
	public Set get1To10(){
		Set numSet= new HashSet();
		for(int i=0;i<=10;i++){
			numSet.add(i);
		}
		return numSet;
	}
	public Set get11To115(){
		Set numSet2= new HashSet();
		numSet2.addAll(numSet2);
		for(int i=11;i<=15;i++){
			numSet2.add(i);
		}
		return numSet2;
	}
}

