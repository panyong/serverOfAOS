package entyDao;

import enty.CourseInfo;
import enty.CoursesForClient;

public class CourseTransform {
	public static CoursesForClient transform(CourseInfo course) {
		
		String courseNo = course.getCourseNO();
		
	    String courseName = course.getCourseName();
	    
	    String teacherName = course.getTeacherName();
	    
	    String classroom = course.getClassroom();
	    
	    String weekDay = tranWeekDay(course.getWeekDay());
	    
	    String lessonBegin = tranLessonBegin(course.getLesson());
	    
	    String lessonEnd = tranLessonEnd(course.getLesson());
	    
	    String state = tranState(course.getState());
	    
	    CoursesForClient cc = new CoursesForClient(courseNo, courseName, teacherName,
	    		classroom, weekDay, lessonBegin, lessonEnd, state);
	    
		return cc;
		
		
	}

	private static String tranState(String state) {
		String state1 = null;
		
		if (state.equals("s")) {
			state1 = "1";
		}
		
		if (state.equals("d")) {
			state1 = "0";
		}
		
		if (state.equals("q")) {
			state1 = "2";
		}
		
		return state1;
	}

	private static String tranLessonEnd(String lesson) {
		
		String[] s = lesson.split(",");
		
		return s[1];
	}

	private static String tranLessonBegin(String lesson) {
		
		String[] s = lesson.split(",");
		
		return s[0];
	}

	private static String tranWeekDay(String weekDay) {
		
		String weekDay1 = null;
		
		if (weekDay.equals("一")) {
			weekDay1 = "1";
		}
		
		if (weekDay.equals("二")) {
			weekDay1 = "2";
		}
		
		if (weekDay.equals("三")) {
			weekDay1 = "3";
		}
		
		if (weekDay.equals("四")) {
			weekDay1 = "4";
		}
		
		if (weekDay.equals("五")) {
			weekDay1 = "5";
		}
		
		if (weekDay.equals("六")) {
			weekDay1 = "6";
		}
		
		if (weekDay.equals("日")) {
			weekDay1 = "7";
		}
		
		return weekDay1;
	}
}
