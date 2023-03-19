package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static <getConnection> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver loadl
		//conn establish
		
		try {
			String url = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String password = "Testmode@11222";
			
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			String query ="create database jdbr";
			stm.execute(query);
			System.out.println("Database create Successfully");
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	//statement  create
		//excute -query
		//coon close
		
	}

}
