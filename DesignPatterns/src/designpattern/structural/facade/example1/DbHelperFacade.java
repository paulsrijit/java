package designpattern.structural.facade.example1;

import java.sql.Connection;

public class DbHelperFacade {
	public static void generateDbReport(DbType dbType, ReportType reportType, String tableName) {
		Connection con = null;

		switch (dbType) {
		case MYSQL:
			MySqlHelper mySqlHelper = new MySqlHelper();
			con = MySqlHelper.getMySqlConnection();
			switch (reportType) {
			case HTML:
				mySqlHelper.generateMySqlHtmlReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPdfReport(tableName, con);
				break;
			}
			break;
		case ORACLE:
			OracleHelper oracleHelper = new OracleHelper();
			con = OracleHelper.getOracleConnection();
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHtmlReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePdfReport(tableName, con);
			}
			break;
		}
	}
}

enum DbType {
	MYSQL, ORACLE;
}

enum ReportType {
	PDF, HTML;
}
