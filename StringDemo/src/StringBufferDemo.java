
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strbuf = new StringBuffer("Hello");
		System.out.println(strbuf.length());
		strbuf.append("World");
		System.out.println(strbuf);
		strbuf.insert(5, "_java");
		System.out.println(strbuf);
		strbuf.setCharAt(5, ' ');
		System.out.println(strbuf);
		System.out.println("Character at 6th position: ");
		System.out.println(strbuf.charAt(6));
		strbuf.deleteCharAt(3);
		System.out.println(strbuf);
		System.out.println("Capacity of String Buffer object: ");
		System.out.println(strbuf.capacity());
		strbuf.reverse();
		System.out.println("Reversed string: ");
		System.out.println(strbuf);
	}

}
