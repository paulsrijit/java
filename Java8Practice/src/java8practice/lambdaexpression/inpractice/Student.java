package java8practice.lambdaexpression.inpractice;

public class Student {

	private String sName;
	private int sAge;
	private String sStd;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsStd() {
		return sStd;
	}

	public void setsStd(String sStd) {
		this.sStd = sStd;
	}

	@Override
	public String toString() {
		return "Student [Name=" + sName + ", Age=" + sAge + ", Std=" + sStd + "]";
	}

}
