import java.sql.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// Connection conn = null;
		// Statement stmt = null;
		// ResultSet rs = null;
		// try {
		// // new com.mysql.jdbc.Driver();
		// Class.forName("com.mysql.jdbc.Driver").newInstance();
		// // conn =
		// //
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase?user=testuser&password=testpassword");
		// String connectionUrl = "jdbc:mysql://localhost:3306/API";
		// String connectionUser = "root";
		// String connectionPassword = "root";
		// conn = DriverManager.getConnection(connectionUrl, connectionUser,
		// connectionPassword);
		// stmt = conn.createStatement();
		// rs = stmt.executeQuery("SELECT * FROM Users");
		//
		// while (rs.next()) {
		// String id = rs.getString("id");
		// String firstName = rs.getString("firstName");
		// String lastName = rs.getString("Lastname");
		// System.out.println("ID: " + id + ", First Name: " + firstName
		// + ", Last Name: " + lastName);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (rs != null)
		// rs.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// try {
		// if (stmt != null)
		// stmt.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// try {
		// if (conn != null)
		// conn.close();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// }
		// System.out.println("yes");
		APICont obj = new APICont();
		Map<String, String> Data = new HashMap<String, String>();
		Data.put("email", "mohammed.shane94@gmail.com");
		Data.put("password", "123456");
//		Data.put("first_name", "Mohammeda");
//		Data.put("last_name", "Ashraf1");
//		Data.put("gender", "male");
//		Data.put("type", "premuim");
//		Data.put("credit_card", "12345678912345");
		obj.login(Data);

//		Map<String, String> Data1 = new HashMap<String, String>();

	}

}
