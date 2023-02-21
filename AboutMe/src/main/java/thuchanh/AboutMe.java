package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet(description = "Intro Myself", urlPatterns = { "/AboutMe" })
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		 PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Table Example</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<table>");
	        out.println("<tr>");
	        out.println("<td>Họ Và Tên: </td>");
	        out.println("<td>Phạm Ngọc Trường </td>");
	        out.println("</tr>");
	        out.println("<tr>");
	        out.println("<td>Số Điện Thoại: </td>");
	        out.println("<td>0932058317</td>");
	        out.println("</tr>");
	        out.println("<tr>");
	        out.println("<td>Lớp: </td>");
	        out.println("<td>62CNTT-CLC</td>");
	        out.println("</tr>");
	        out.println("</table>");
	        out.println("</body>");
	        out.println("</html>");
		
	}

}
