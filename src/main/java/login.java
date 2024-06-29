import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) {	
		PrintWriter pw=null;
		try {
			pw = res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username=req.getParameter("username");
			String password=req.getParameter("password");
			RequestDispatcher rd=req.getRequestDispatcher("general.html");
			try {
				rd.include(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(username.equals("saravanan")&&password.equals("123456")) {
				HttpSession sc=req.getSession();
				sc.setAttribute("un", username);
			
				
				
				
	}else {
				RequestDispatcher rs=req.getRequestDispatcher("/login.html");
				try {
					rs.forward(req, res);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
		
		
	}
}
