package ejemplos;

public class Regex {

	public static void main(String[] args) {
		String s1 = "abc1decfghic212jkl";
		String s2 = s1.replaceAll("c\\d{1,2}", "*");
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
