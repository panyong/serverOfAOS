package entyDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import remoteDatabaseDao.DatabaseDao;
import enty.Student;

public class StudentDao {

	//插入学生信息
	public int insertStudent(Student student) {
	
		String sql = "insert into students values('" + student.getStuEmail() + "','" + student.getStuPwd() + "','"
				+ student.getStuName() +  "','" + student.getStuNo() + "','" + student.getStuClassNo() +"','" +
				student.getSchoolTime() + "')";
		
		int i = DatabaseDao.executeUpdate(sql);
		
		DatabaseDao.closeConnection();
		
		return i;
	}
	
	//通过email获取学生信息
	public Student queryStudentByEamil(String eamil) {
		
		Student student = null;
		
		String sql = "select * from students where stuEmail = '" + eamil + "'";
		
		ResultSet rs = DatabaseDao.executeQuery(sql);
		
		try {
			student = new Student(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),
					rs.getString(5),rs.getString(6));
			DatabaseDao.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}
	
}
