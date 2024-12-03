package student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;


public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("userid");
		boolean isTrue;
		
		isTrue = StudentDBU.deleteStudent(id);
		
		if(isTrue == true) {
			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<Student> studentDetails = StudentDBU.getStudentDetails(id);
			request.setAttribute("studentDetails", studentDetails);
			
			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request,response);
		}
		
	}

}
