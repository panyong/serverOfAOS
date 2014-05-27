package enty;

public class Student {
    private String stuEmail;
    private String stuPwd;
    private String stuNo;
    private String stuClassNo;
    private String stuName;
    private String schoolTime;
    
    
    
	public Student() {
		super();
	}
	public Student(String stuEmail, String stuPwd, String stuName,
			String stuNo, String stuClassNo, String schoolTime) {
		super();
		this.stuEmail = stuEmail;
		this.stuPwd = stuPwd;
		this.stuNo = stuNo;
		this.stuClassNo = stuClassNo;
		this.stuName = stuName;
		this.schoolTime = schoolTime;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuClassNo() {
		return stuClassNo;
	}
	public void setStuClassNo(String stuClassNo) {
		this.stuClassNo = stuClassNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSchoolTime() {
		return schoolTime;
	}
	public void setSchoolTime(String schoolTime) {
		this.schoolTime = schoolTime;
	}
    
    
	
    
}
