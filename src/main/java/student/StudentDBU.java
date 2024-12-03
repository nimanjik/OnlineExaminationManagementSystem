package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDBU {
		
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Student> validate(String username, String password) {
		
		ArrayList<Student> st = new ArrayList<>();
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String user = rs.getString(5);
				String pass = rs.getString(6);
				
				Student stud = new Student(id,name,email,phone,user,pass);
     			st.add(stud);
     			
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return st;
		}
	public static List<Student> getStudent(String userName) {

		ArrayList<Student> student = new ArrayList<>();
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where id='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Student stud = new Student(id,name,email,phone,username,password);
				student.add(stud);


			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return student;
	}	

	public static boolean insertuser(String name, String email, String phone, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "insert into student values(0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	public static boolean updateuser(String id, String name, String email, String phone, String username, String password ) {
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "update student set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'" + "where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	public static List<Student> getStudentDetails(String Id){
		
    	int convertedID = Integer.parseInt(Id);

	
		
		ArrayList<Student> stu = new ArrayList<>();
		
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Student s = new Student(id,name,email,phone,username,password);
				stu.add(s);


			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return stu;
	}
	
    public static boolean deleteStudent(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnection.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from student where id='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

}
