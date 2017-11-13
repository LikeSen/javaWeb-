package example.thritytwo_demo1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class Demo1 {

	private String url = "jdbc:mysql://localhost:3306/day17";
	// jdbc协议：mysql://数据库地址：数据库端口号/具体的数据库名

	private String user = "root"; // 用户名
	private String password = "root"; // 密码

	@Test
	public void test1() throws Exception {

		//1  创建JDBC驱动程序对象
		Driver driver = new com.mysql.jdbc.Driver();

		// 添加用户名和密码
		Properties props = new Properties();
		props.setProperty("user", user);
		props.setProperty("password", password);

		//2  连接数据库，返回连接对象
		Connection con = driver.connect(url, props);
		System.out.println(con);

	}
	@Test
	public void test2() throws Exception {
		Driver driver = new com.mysql.jdbc.Driver();
		//注册驱动程序
		DriverManager.registerDriver(driver);
		//连接
		Connection connection=DriverManager.getConnection(url, user, password);
		
		System.out.println(connection);
	}
	//常用这一种
	@Test
	public void test3() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, user, password);
		
		System.out.println(connection);
	}
}
