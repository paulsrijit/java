package designpattern.structural.facade.example1;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getOracleConnection() {
		System.out.println("OracleConnection created");
		return null;
	}
	
	public void generateOraclePdfReport(String tableName, Connection con) {
		System.out.println("OraclePdfReport created for " + tableName + " table");
	}
	
	public void generateOracleHtmlReport(String tableName, Connection con) {
		System.out.println("OracleHtmlReport created for " + tableName + " table");
	}
}
