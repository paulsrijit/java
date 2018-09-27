package javapractice.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println(new ExceptionHandlingDemo().m1());

	}

	private String m1() {
		String ret = "";
		File f = null;
		try {
			f = new File("c:\\temp\\a.txt");
			if (f.isFile()) {
				ret = "It's File";
			} else if (f.isDirectory()) {
				ret = "It's Directory";
			}
			return ret;
		} catch (SecurityException se) {
			ret = "SecurityException";
			return ret;
		} finally {
			System.out.println("finally reached");
			ret = "finally reached";
			return ret;
		}
	}

}
