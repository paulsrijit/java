package designpattern.structural.facade.example1;

public class MainClass {

	public static void main(String[] args) {
		//DbHelperFacade.generateDbReport(DbType.MYSQL, ReportType.HTML, "Student");
		DbHelperFacade.generateDbReport(DbType.ORACLE, ReportType.PDF, "Teacher");
	}

}
