import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseManager {
	Connection conn;
	PreparedStatement pstmt;

	public static void main(String[] args) {
		DataBaseManager databasemansger = new DataBaseManager();
		databasemansger.connect();
//		databasemansger.select("1");
		databasemansger.insert("3", "멍멍이", 10, "1313", "2022-02-24");
		databasemansger.selectAll();
	}

	public DataBaseManager() {
		connect();
	}

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL - java connector할 클래스를 찾아주는거
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb", "root", "1234"); // 내 mysql에 있는 DB랑
																										// 연결 (gymdb)

			System.out.println("DB연결완료!");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 클래스를 찾을 수 없습니다. " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 오류 !" + e.getMessage());
		}
	}

	public void select(String id) {
		try {
//			stmt = conn.createStatement();
			String query = "select * from member where id =?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			ResultSet srs = pstmt.executeQuery();
//			printData(srs);
			if (srs.next()) {
				System.out.println("id : " + srs.getString("id"));
				System.out.println("name : " + srs.getString("name"));
				System.out.println("age : " + srs.getInt("age"));
				System.out.println("phon_number : " + srs.getString("phon_number"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectAll() {
		try {
//			stmt = conn.createStatement();
			String query = "select * from member";
			pstmt = conn.prepareStatement(query);
			ResultSet srs = pstmt.executeQuery();
			printData(srs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void printData(ResultSet srs) throws SQLException {
		while (srs.next()) {
			String id = srs.getString("id");
			String name = srs.getString("name");
			int age = srs.getInt("age");
			String phon_number = srs.getString("phon_number");
			System.out.println("id : " + id);
			System.out.println("name : " + name);
			System.out.println("age : " + age);
			System.out.println("phon_number : " + phon_number);
		}
	}

	public void insert(String id, String name, int age, String phon_number, String date) {
		try {
			String query = "insert into member values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, phon_number);
			pstmt.setString(5, date);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
