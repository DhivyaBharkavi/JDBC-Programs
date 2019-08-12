package exercise12aug19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public interface BookIn {
public abstract int insertBook(Statement s,Book b) throws SQLException;
public ArrayList displayBook(Statement s) throws SQLException;
public ResultSet findstatus(Statement s,String ss);
}
