import java.sql.*;
public class Conn {
	Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
			System.out.println("数据库连接成功");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conn c = new Conn();
		c.getConnection();
	}

}
