package entyDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import remoteDatabaseDao.DatabaseDao;
import enty.CourseInfo;
import enty.CoursesForClient;

public class CourseDao {
	
	
	//蹭课
public HashMap<String, CoursesForClient> queryCourseInfoByTime(String weekDay,String lessons) throws SQLException {
		
	    HashMap<String, CoursesForClient> coursesHashMap = new HashMap<>();
		
		ResultSet rs = null;
		
		String sql = "select * from shiepLessons where weekDay like '%" + weekDay +
				"%' and lesson like '%" + lessons + "%'";

		rs = DatabaseDao.executeQuery(sql);
		
		if (rs == null) {
			System.out.println("查询失败");
		}
		
		int i = 1;
		while (rs.next()) {
			
			CourseInfo course = new CourseInfo(rs.getString(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), 
					rs.getString(8));
            CoursesForClient course1 = CourseTransform.transform(course);
			
			System.out.println(course1.toString());
			
			coursesHashMap.put("第"+i+"节", course1);
			
			i++;
		}
		
		DatabaseDao.closeConnection();
		
		return coursesHashMap;
		
	}
	
//根据班级号来获取本学期课程表
public HashMap<String, CoursesForClient> queryCourseInfoByMajor(String major) throws SQLException {
		
		HashMap<String, CoursesForClient> coursesHashMap = new HashMap<>();
		
		ResultSet rs = null;
		
		String sql = "select * from shiepLessons where major like '%" + major + "%'";

		rs = DatabaseDao.executeQuery(sql);
		
		if (rs == null) {
			System.out.println("查询失败");
		}
		
		int i = 1;
		while (rs.next()) {
			
			CourseInfo course = new CourseInfo(rs.getString(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), 
					rs.getString(8));
			//System.out.println(course.toString());

			CoursesForClient course1 = CourseTransform.transform(course);
			
			System.out.println(course1.toString());
			
			coursesHashMap.put("第"+i+"节", course1);
			
			i++;
		}
		
		DatabaseDao.closeConnection();
		
		return coursesHashMap;
		
	}

	
}
