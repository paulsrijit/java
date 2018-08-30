package regex;

import java.util.regex.*;

public class RegexTest {
	public static void main(String args[]) {
		// 1st way
		Pattern p = Pattern.compile("^(B|C|E).*$");// . represents single character
		Matcher m = p.matcher("D998");
		boolean b = m.matches();
		System.out.println(b);

		/*// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);*/
	}
}
