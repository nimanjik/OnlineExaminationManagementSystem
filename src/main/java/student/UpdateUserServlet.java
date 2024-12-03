package student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;


public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String id = request.getParameter("userid");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String username = request.getParameter("uname");
	String password = request.getParameter("pass");
	
	boolean isTrue;
	
	isTrue = StudentDBU.updateuser(id, name, email, phone, username, password);
	
	if(isTrue == true) {
		
		List<Student> user1Details = StudentDBU.getStudentDetails(id);
		request.setAttribute("studentDetails" , user1Details);
		
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
	}
	else {
		
		List<Student> cusDetails = StudentDBU.getStudentDetails(id);
		request.setAttribute("cusDetails", cusDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
		dis.forward(request, response);
		
		
	}
		
  }

}
