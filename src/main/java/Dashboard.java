

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
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
		
		HttpSession sd = req.getSession();
		String name =(String) sd.getAttribute("un");
		pw.print("Welcome"+" "+name);
	}
}

