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


/*String databaseName = "onHuPLvcrLmoLAwWLATd"; //云端数据库名称

String host = "sqld.duapp.com";//云端主机名称

String port = "4050";                //云端数据库监听端口

String userName = "jHtBIKu4zX8M5BTadXQCS6wZ";//云端数据库的用户名 AK

String userPwd = "wtrkicRPIERy4MC1PGPa1R6ViFcKBVDS";//云端数据库的密码 AK

String driverName = "com.mysql.jdbc.Driver";  //驱动名称

String dbUrl = "jdbc:mysql://";            //云端数据库链接地址

String serverName = host + ":" + port + "/";  //服务器名称

String connName = dbUrl + serverName + databaseName;   //连接名称


try {
	
	Class.forName(driverName);//连接驱动
	
	connection = DriverManager.getConnection(connName, userName, userPwd);
	
	if (connection == null) {
		System.out.println("连接远程数据库失败!");
	}else {
		System.out.println("连接远程数据库成功!");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}*/