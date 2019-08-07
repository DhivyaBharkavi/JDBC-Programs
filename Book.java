package exercise7aug19;

public class Book {
private int bId;
private String bName;
private String brName;
private String auName;
Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public String getBrName() {
	return brName;
}
public void setBrName(String brName) {
	this.brName = brName;
}
public String getAuName() {
	return auName;
}
public void setAuName(String auName) {
	this.auName = auName;
}
public Book(int bId, String bName, String auName, String brName) {
	super();
	this.bId = bId;
	this.bName = bName;
	this.auName = auName;
	this.brName = brName;
}

}
