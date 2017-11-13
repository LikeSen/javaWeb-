package example.thritytwo_demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class Demo2 {
	private String url = "jdbc:mysql://localhost:3306/day17";
	private String user = "root";
	private String password = "root";

	@Test
	public void test1() throws Exception {
		// 注册驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		// 连接数据库
		Connection connection = DriverManager.getConnection(url, user, password);
		// 创建语句
		Statement statement = connection.createStatement();
		// 执行语句
		String sql = "create table employee(id int primary key auto_increment,name varchar(20),"
				+ "gender varchar(2),age int,deptname varchar(30),email varchar(30), telephone varchar(20))";
		statement.executeUpdate(sql);

		statement.executeUpdate("INSERT INTO employee VALUES(1,'张三','男',20 ,'软件工程师','56543@qq.com','12345678910')");
	 int count=	statement.executeUpdate("update employee set gender='女' where id=1");
		ResultSet result = statement.executeQuery("select *from employee");
		System.out.println(count);
		while(result.next()){
		System.out.println(result.getInt(1)+result.getString(2)+result.getString(3)+
				result.getInt(4)+result.getString(5)+result.getString(6)+result.getString(7));
		}
	}
}
