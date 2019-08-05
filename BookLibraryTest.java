package exercise5aug19;

import java.sql.SQLException;

public class BookLibraryTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BooksLibrary bl = new BooksLibrary();
		
		bl.insert();
		bl.select();
		bl.connection();
	}

}
