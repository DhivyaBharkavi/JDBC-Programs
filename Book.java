package exercise12aug19;

public class Book {
	private int bookNo,price;
	private String bookName,authorName,branch,status;
	public Book(int bookNo, String bookName, String authorName, String branch,String status,int price) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.authorName = authorName;
		this.branch = branch;
		this.status=status;
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}
