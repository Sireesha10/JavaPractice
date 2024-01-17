package AppsNa;

public class ToogleCase {
	public static void main(String[] args) {
		String str="Smart Insert";
		String result="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				char ch=(char) (str.charAt(i)+32);
				result+=ch;
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				char ch=(char) (str.charAt(i)-32);
				result+=ch;
			}else if(str.charAt(i)==32) {
				result+=str.charAt(i);
			}
		}
		System.out.println("Original: "+str);		
		System.out.println("Toggled: "+result);
		
		System.out.println("using java 8");
		str.chars().mapToObj(c->(char)c).map(i->Character.isLowerCase(i)?Character.toUpperCase(i):Character.toLowerCase(i)).forEach(System.out::println);

		
//		char i=120;
//		System.out.println(i);
//		char x=(char)(i-10);
//		System.out.println(x);
		
	}

}
