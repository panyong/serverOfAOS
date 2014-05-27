package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import enty.CourseInfo;
import enty.CoursesForClient;
import entyDao.CourseDao;
import remoteDatabaseDao.DatabaseDao;

/**
 * Servlet implementation class GetCourses
 */
@WebServlet("/GetCourses")


public class GetCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CourseDao courseDao = new CourseDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCourses() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Get方法被调用");
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("post方法被调用");
		String major = new String(request.getParameter("major").getBytes("ISO8859_1"),"GB2312");
        //String major = request.getParameter("major");//new String(request.getParameter("major").getBytes("ISO8859_1"),"GB2312");
		
	    System.out.println(major);
	    
		HashMap<String, CoursesForClient> courses = null;
		
		try {
			courses = courseDao.queryCourseInfoByMajor(major);
			
			JSONObject jsonOfCourses = JSONObject.fromObject(courses);
			
			response.setContentType("text/html;charset = UTF-8");
			
			PrintWriter writer = response.getWriter();

			writer.print(jsonOfCourses);
			
			writer.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
