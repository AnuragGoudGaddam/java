//package jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCCrud {
//	private static Connection connection = null;
//	private static Scanner sc = new Scanner(System.in);
//	
//	private void insert() throws SQLException {
//		String query1 = "INSERT INTO DEMO (id, name, price, quantity) VALUES (?, ?, ?, ?)";
//		PreparedStatement preparedStatement = connection.prepareStatement(query1);
//		System.out.println("Enter ID");
//		preparedStatement.setInt(1, sc.nextInt());
//		System.out.println("Enter name"); 
//		preparedStatement.setString(2, sc.nextLine());
//		System.out.println("Enter price");
//		preparedStatement.setInt(3, sc.nextInt());
//		System.out.println("Enter quantity");
//		preparedStatement.setDouble(4, sc.nextDouble());  
//		 int row = preparedStatement.executeUpdate();
//		 
//		 if(row > 0) {
//			 System.out.println("Inserted Successfully");
//		 }
//	}
//	public static void main(String[] args) throws ClassNotFoundException  {
//		
//		JDBCCrud jdbcCrud = new JDBCCrud();
//		
////		String url = "jdbc:mysql://localhost:3306/productdata";
////		String userName = "anurag";
////		String password = "Anurag";
////		String driverName="com.mysql.cj.jdbc.Driver";
//		
////		String query1= "SELECT * FROM DEMO ";
//		
//		//String query1 = "INSERT INTO DEMO (id, name, price, quantity) VALUES (?, ?, ?, ?)";
//
//		
////		String query1= "UPDATE DEMO SET price=125 WHERE name ='Abhiraj' ";
//		
//        try {
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//    		String url = "jdbc:mysql://localhost:3306/productdata";
//    		String userName = "anurag";
//    		String password = "Anurag";
//    		connection = DriverManager.getConnection(url, userName, password);
//    		
//    		System.out.println("Choice");
//    		System.out.println("1. insert record");
//    		int choice = Integer.parseInt(sc.nextLine());
//    		
//    		switch (choice) {
//			case 1: {
//				
//				jdbcCrud.insert();
//				break;
//			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + choice);
//			}
////        	Class.forName(driverName);
//                                                                  
////			 st.executeUpdate(query1);
//			 
////			 ResultSet rs = st.executeQuery(query1);
////
////			
////			while(rs.next()) {
////				System.out.println(rs.getString("name")+" price"+rs.getString("price"));
////			}
//        } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//}   

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class JDBCCrud {
	private static Connection connection = null;
	private static Scanner sc = new Scanner(System.in);

	private void insert() throws SQLException {
		String query1 = "INSERT INTO DEMO (id, name, price, quantity) VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query1);

		System.out.println("Enter ID");
		int id = sc.nextInt(); // Read integer input
		sc.nextLine(); // Consume newline left-over

		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter price");
		double price = sc.nextDouble();

		System.out.println("Enter quantity");
		int quantity = sc.nextInt();

		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, price);
		preparedStatement.setInt(4, quantity);

		int row = preparedStatement.executeUpdate();
		if (row > 0) {
			System.out.println("Inserted Successfully");

		}
	}

	private void updateData() throws SQLException {
		String query = "UPDATE DEMO SET price= ? WHERE name = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		System.out.println("Enter the price ");
		double price = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter the Name");
		String name = sc.next();

		preparedStatement.setDouble(1, price);
		preparedStatement.setString(2, name);

		int update = preparedStatement.executeUpdate();
		if (update > 0) {
			System.out.println("Updated SucessFully");

		}
	}

	private void showData() throws SQLException {
		String query = "SELECT * FROM DEMO";
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(query);

		while (rs.next()) {
			System.out.println("(ID :" + rs.getInt("id"));
			System.out.println("(Name : " + rs.getString("name"));
			System.out.println("(Price : " + rs.getDouble("price"));
			System.out.println("(Quantity : " + rs.getInt("quantity"));

		}

	}

	public static void main(String[] args) {
        JDBCCrud jdbcCrud = new JDBCCrud();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productdata";
            String userName = "anurag";
            String password = "Anurag";
            connection = DriverManager.getConnection(url, userName, password);
            boolean running = true;
            while (running) {
                System.out.println("Choice");
                System.out.println("1. Get Complete records");
                System.out.println("2. Insert record");
                System.out.println("3. Upadte the records");
                System.out.println("0. Exit");

                String choiceLine = sc.nextLine().trim();
                if (choiceLine.isEmpty()) {
                    continue;
                }

                int choice;
                try {
                    choice = Integer.parseInt(choiceLine);
                } catch (NumberFormatException e) {
                    continue;
                }

                switch (choice) {
				case 1:
					jdbcCrud.showData();
					break;
				case 2:
					jdbcCrud.insert();
					break;

				case 3:
					jdbcCrud.updateData();
					break;
				case 0:
					running = false;
					break;
				default:
					System.out.println("Unexpected value: " + choice);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (sc != null) {
                    sc.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }        
}
