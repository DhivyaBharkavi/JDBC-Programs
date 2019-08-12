package exercise12aug19;

public class Student {
private int regNo,yearOfPassing;
private long mobNo;
private String name,address,qualifiUG,qualifiPG,mailId,courseName,dob,gender,dateOfJoining;

public int getRegNo() {
	return regNo;
}
public void setRegNo(int regNo) {
	this.regNo = regNo;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public int getYearOfPassing() {
	return yearOfPassing;
}
public void setYearOfPassing(int yearOfPassing) {
	this.yearOfPassing = yearOfPassing;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getQualifiUG() {
	return qualifiUG;
}
public void setQualifiUG(String qualifiUG) {
	this.qualifiUG = qualifiUG;
}
public String getQualifiPG() {
	return qualifiPG;
}
public void setQualifiPG(String qualifiPG) {
	this.qualifiPG = qualifiPG;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Student() {
	super();

}
public Student(int regNo, String name, String address,String gender,String dob, 
		String mailId,String qualifiUG, String qualifiPG,  
		String courseName, long mobNo,int yearOfPassing, String dateOfJoining ) {
	super();
	this.regNo = regNo;
	this.mobNo = mobNo;
	this.yearOfPassing = yearOfPassing;
	this.dateOfJoining = dateOfJoining;
	this.name = name;
	this.address = address;
	this.qualifiUG = qualifiUG;
	this.qualifiPG = qualifiPG;
	this.mailId = mailId;
	this.courseName = courseName;
	this.dob = dob;
	this.gender = gender;
}
}
