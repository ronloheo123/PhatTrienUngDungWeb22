package Bai1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bai1BaiTap
 */
@WebServlet("/Bai1BaiTap")
public class Bai1BaiTap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai1BaiTap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String value1=request.getParameter("param1") ;
		String value2=request.getParameter("param2");
		PrintWriter traVe=response.getWriter();
		traVe.append("Giá trị tham số param1 =");
		traVe.append(value1);
		traVe.append("\nGiá trị tham sô param2 =");
		traVe.append(value2);
				
	}

}
