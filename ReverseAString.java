package AppsNa;

public class ReverseAString {
	
	public static void main(String[] args) {
		String str="backspace";
		str.chars().mapToObj(c->(char)c).map(i->i.toString()).reduce((s1,s2)->s2+s1).ifPresent(System.out::println);
	}

}
