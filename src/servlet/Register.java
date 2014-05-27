package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enty.Student;
import entyDao.StudentDao;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudentDao studentDao = new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int i = 0;
		
		String stuEmail = request.getParameter("stuEmail");
		
		String stuPwd = request.getParameter("stuPwd");
		
		String stuName = request.getParameter("stuName");
		
		String stuNo = request.getParameter("stuNo");
		
		String stuClassNo = request.getParameter("stuClassNo");
		
		String stuSchoolTime = request.getParameter("stuSchoolTime");
		
		if ("".equals(stuEmail) || "".equals(stuPwd)|| "".equals(stuNo)|| "".equals(stuClassNo)|| 
				"".equals(stuSchoolTime)) {
			System.out.println(stuEmail+" "+stuPwd+" "+stuName+" "+stuNo+" "+stuClassNo+" "+stuSchoolTime);
			PrintWriter writer = response.getWriter();
			writer.print("false");
			System.out.println("×¢²áÊ§°Ü");
		}else {
			
			System.out.println(stuEmail+" "+stuPwd+" "+stuName+" "+stuNo+" "+stuClassNo+" "+stuSchoolTime);
			
			Student student = new Student(stuEmail,stuPwd,stuName,stuNo,stuClassNo,stuSchoolTime);
			
			i = studentDao.insertStudent(student);
			
			PrintWriter writer = response.getWriter();
			
			if (i>0) {
				writer.print("true");
				System.out.println("×¢²á³É¹¦");
			}else {
				writer.print("false");
				System.out.println("×¢²áÊ§°Ü");
			}
			
			writer.close();
		}
		
		
		
		
	}

}
