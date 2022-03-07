import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {

		String sql1 = "insert into citizen values(912, 'Kimi Raikkonen', 41, 'Assam')";
		String sql2 = "update citizen set age = 30 where id = 101";
		String sql3 = "update citizen set name = 'Jack' where id = 105";
		String sql4 = "update citizen set name = 'Crack' where id = 106";
		String sql5 = "delete from citizen where id = 104";
		String sql6 = "delete from citizen where id = 911";

		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();

			Statement stmt = conn.createStatement();
			// Adding batch of queries to execute in one go
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.addBatch(sql4);
			stmt.addBatch(sql5);
			stmt.addBatch(sql6);

			conn.setAutoCommit(false); // Setting the auto-commit to false

			stmt.executeBatch(); // Executing all queries in a batch

			conn.commit(); // Commit transactions after all three are completed successfully
		} catch (SQLException e) {
			try {
				conn.rollback(); // Roll back if any of the transaction fails
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
