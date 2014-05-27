package enty;

public class CoursesForClient {
    private String courseNo;
    private String courseName;
    private String teacherName;
    private String classroom;
    private String weekDay;
    private String lessonBegin;
    private String lessonEnd;
    private String state;
    
    
    
	public CoursesForClient() {
		super();
	}
	public CoursesForClient(String courseNo, String courseName,
			String teacherName, String classroom, String weekDay,
			String lessonBegin, String lessonEnd, String state) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.classroom = classroom;
		this.weekDay = weekDay;
		this.lessonBegin = lessonBegin;
		this.lessonEnd = lessonEnd;
		this.state = state;
	}
	
	
	
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
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
	public String getLessonBegin() {
		return lessonBegin;
	}
	public void setLessonBegin(String lessonBegin) {
		this.lessonBegin = lessonBegin;
	}
	public String getLessonEnd() {
		return lessonEnd;
	}
	public void setLessonEnd(String lessonEnd) {
		this.lessonEnd = lessonEnd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
    
    
}
