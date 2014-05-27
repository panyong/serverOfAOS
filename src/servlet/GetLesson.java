package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import enty.CourseInfo;
import enty.CoursesForClient;
import entyDao.CourseDao;
import entyDao.CourseTransform;

/**
 * Servlet implementation class GetLesson
 */
@WebServlet("/GetLesson")
public class GetLesson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CourseDao courseDao = new CourseDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetLesson() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("get方法被调用");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HashMap<String, CoursesForClient> courses = new HashMap<>();

		// request.setCharacterEncoding("gb2312");

		String weekDay = request.getParameter("weekDay");

		String lessons = request.getParameter("lessons");

		System.out.println(weekDay + "  " + lessons);

		weekDay = tranWeekDay(weekDay);

		try {
			courses = courseDao.queryCourseInfoByTime(weekDay, lessons);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!courses.isEmpty()) {

			HashMap<String, CoursesForClient> maps = new HashMap<>();
			for (int j = 1; j < 4; j++) {
				int i = 1 + (new Random()).nextInt(courses.size());
				CoursesForClient course = courses.get("第" + i + "节");
				System.out.println("第" + i + "节");
				maps.put("第"+j+"节", course);
			}

			JSONObject jsonCourse = JSONObject.fromObject(maps);
		
			response.setContentType("text/html;charset = UTF-8");
			
			PrintWriter writer = response.getWriter();
			
			writer.print(jsonCourse);
			
			writer.close();

		} else {
			PrintWriter writer = response.getWriter();

			writer.print("当前没有课程");

			writer.close();
		}

	}

	// 将1，2，3。。。转换为一，二，三、、、
	private String tranWeekDay(String weekDay) {
		switch (weekDay) {
		case "1":
			weekDay = "一";
			break;

		case "2":
			weekDay = "二";
			break;
		case "3":
			weekDay = "三";
			break;
		case "4":
			weekDay = "四";
			break;
		case "5":
			weekDay = "五";
			break;
		default:
			break;
		}
		return weekDay;
	}

}
