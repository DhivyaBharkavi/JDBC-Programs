package exercise12aug19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public interface StudentDAO {
public abstract int insertDetails(Statement s,Student ss)throws SQLException;
public ArrayList displayAllStudents(Statement s);
//public Student displayStudentregNo(Statement s,int r) throws SQLException;
public ResultSet displayStudentregNo(Statement s,int r) throws SQLException;
public int updateStudentregNo(Statement s,String name,String dob) throws SQLException;
public int deleteStudentregNo(Statement s,int r) throws SQLException;
}
