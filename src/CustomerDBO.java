
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBO {
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		String sql = "SELECT * FROM CUSTOMER";
		
		try(Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				Customer customer = new Customer(
						rs.getInt("ACCID"),
						rs.getString("FNAME"),
						rs.getString("LNAME"),
						rs.getString("PHONENUM"),
						rs.getString("PAYMENTINFO"),
						rs.getDouble("LOYALTYDISCOUNT")
						);
				customers.add(customer);
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	// add customers functionality maybe
	// general todo: match the tables and dataset. create a simple menu
	// figure out where the complex queries could be used.
	
}
