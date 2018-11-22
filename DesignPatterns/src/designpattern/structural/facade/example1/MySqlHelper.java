package designpattern.structural.facade.example1;

import java.sql.Connection;

public class MySqlHelper {
	public static Connection getMySqlConnection() {
		System.out.println("MySqlConnection created");
		return null;
	}
	
	public void generateMySqlPdfReport(String tableName, Connection con) {
		System.out.println("MySqlPdfReport created for " + tableName + " table");
	}
	
	public void generateMySqlHtmlReport(String tableName, Connection con) {
		System.out.println("MySqlHtmlReport created for " + tableName + " table");
	}
}
