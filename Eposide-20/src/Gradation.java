
import java.sql.*;
public class Gradation {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
			System.out.println("���ݿ����ӳɹ�");
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
				System.out.print("��ţ�" + id);
				System.out.print(" ������" + name);
				System.out.print(" �Ա�" + sex);
				System.out.println(" ���գ�" + birthday);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
