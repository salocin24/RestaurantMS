import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RestaurantDAO {
	public ArrayList<Restaurant> getAllRestaurants() {
		ArrayList<Restaurant> list = new ArrayList<>();
		String sql = "select storeID, address, phoneNum, areaCode from RESTAURANT order by storeID";
		
		try(Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				list.add(new Restaurant(
						rs.getInt("storeID"),
						rs.getString("address"),
						rs.getString("phoneNum"),
						rs.getString("areaCode")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
