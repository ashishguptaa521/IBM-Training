import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) throws IOException {

		String sql = "insert into citizen values(106, ',Jack', 25, 'Delhi')";

		try {
			Connection conn = JdbcFactory.getConnection();

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql); // DML Operation

			System.out.println("Records updated.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
