package example.thritytwo_demo1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class Demo1 {

	private String url = "jdbc:mysql://localhost:3306/day17";
	// jdbcЭ�飺mysql://���ݿ��ַ�����ݿ�˿ں�/��������ݿ���

	private String user = "root"; // �û���
	private String password = "root"; // ����

	@Test
	public void test1() throws Exception {

		//1  ����JDBC�����������
		Driver driver = new com.mysql.jdbc.Driver();

		// ����û���������
		Properties props = new Properties();
		props.setProperty("user", user);
		props.setProperty("password", password);

		//2  �������ݿ⣬�������Ӷ���
		Connection con = driver.connect(url, props);
		System.out.println(con);

	}
	@Test
	public void test2() throws Exception {
		Driver driver = new com.mysql.jdbc.Driver();
		//ע����������
		DriverManager.registerDriver(driver);
		//����
		Connection connection=DriverManager.getConnection(url, user, password);
		
		System.out.println(connection);
	}
	//������һ��
	@Test
	public void test3() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, user, password);
		
		System.out.println(connection);
	}
}
