
import java.sql.*;
public class Gradation {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
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
		Gradation c = new Gradation();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("delete from tb_stu where id = 4");
			sql.executeUpdate();
			sql = con.prepareStatement("select * from tb_stu");
			res = sql.executeQuery();
			while(res.next()) {
				String id = res.getString("id");
				String name = res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				System.out.print("编号：" + id);
				System.out.print(" 姓名：" + name);
				System.out.print(" 性别：" + sex);
				System.out.println(" 生日：" + birthday);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
