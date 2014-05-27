package enty;

public class CourseInfo {
	
	private String courseNO;
	private String courseName;
	private String teacherName;
	private String classroom;
	private String weekDay;
	private String lesson;
	private String state;
	private String major;
	
	public CourseInfo(String courseNO, String courseName, String teacherName,
			String classroom, String weekDay, String lesson, String state,
			String major) {
		super();
		this.courseNO = courseNO;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.classroom = classroom;
		this.weekDay = weekDay;
		this.lesson = lesson;
		this.state = state;
		this.major = major;
	}
	
	public String getCourseNO() {
		return courseNO;
	}
	public void setCourseNO(String courseNO) {
		this.courseNO = courseNO;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "CourseInfo [courseNO=" + courseNO + ", courseName="
				+ courseName + ", teacherName=" + teacherName + ", classroom="
				+ classroom + ", weekDay=" + weekDay + ", lesson=" + lesson
				+ ", state=" + state + ", major=" + major + "]";
	}
	
	

}
