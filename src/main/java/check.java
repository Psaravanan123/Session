import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class check  {
	public static boolean check1(String username,String password ){
		try {
			String str1="select * from employee where username=? and password=?";
			Connection cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/company","root","123456");
			PreparedStatement ps=cn.prepareStatement(str1);
			ps.setString(1, username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String c_username=rs.getString(1);
				String c_password=rs.getString(2);
				System.out.print(c_username);
				System.out.print(c_password);
				
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}
		return true;
	}
}
