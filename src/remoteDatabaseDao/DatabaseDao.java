package remoteDatabaseDao;

import java.sql.*;

public class DatabaseDao{
	private static String driver="com.mysql.jdbc.Driver";
	  private static String url="jdbc:mysql://127.0.0.1:3306/shiepTest";
	  private static String user="root",pwd="543033";
	  private static Connection con=null;
	  static{
		  try {
			Class.forName(driver);
		  } catch (ClassNotFoundException e) {
			e.printStackTrace();
		 }
	  }
	  public static void closeConnection(){
		  try {
				if(con!=null&& !con.isClosed())
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	  public static ResultSet executeQuery(String sql){
		  ResultSet rs=null;
		  try {
				con=DriverManager.getConnection(url,user,pwd);
				Statement cmd=con.createStatement();
				rs=cmd.executeQuery(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return rs;
	  }
	  public static int executeUpdate(String sql){
		  int x=0;
		  try {
				Connection con=DriverManager.getConnection(url,user,pwd);
				Statement cmd=con.createStatement();
				x=cmd.executeUpdate(sql);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return x;
	  }
}


/*String databaseName = "onHuPLvcrLmoLAwWLATd"; //�ƶ����ݿ�����

String host = "sqld.duapp.com";//�ƶ���������

String port = "4050";                //�ƶ����ݿ�����˿�

String userName = "jHtBIKu4zX8M5BTadXQCS6wZ";//�ƶ����ݿ���û��� AK

String userPwd = "wtrkicRPIERy4MC1PGPa1R6ViFcKBVDS";//�ƶ����ݿ������ AK

String driverName = "com.mysql.jdbc.Driver";  //��������

String dbUrl = "jdbc:mysql://";            //�ƶ����ݿ����ӵ�ַ

String serverName = host + ":" + port + "/";  //����������

String connName = dbUrl + serverName + databaseName;   //��������


try {
	
	Class.forName(driverName);//��������
	
	connection = DriverManager.getConnection(connName, userName, userPwd);
	
	if (connection == null) {
		System.out.println("����Զ�����ݿ�ʧ��!");
	}else {
		System.out.println("����Զ�����ݿ�ɹ�!");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}*/