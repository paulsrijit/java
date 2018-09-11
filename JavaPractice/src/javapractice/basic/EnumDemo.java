package javapractice.basic;

public class EnumDemo {

	public static void main(String[] args) {
		for(MonthsOfYear moy : MonthsOfYear.values()) {
			System.out.println(moy.getDays());
			System.out.println(moy.name());
			System.out.println(moy.ordinal());
			//System.out.println(moy.toString());
		}

	}

}

enum MonthsOfYear {
	
	JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
	
	private int days;
	
	MonthsOfYear(int days){
		this.days = days;
	}

	public int getDays() {
		return days;
	}
}
