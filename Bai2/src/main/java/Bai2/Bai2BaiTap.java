package Bai2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bai2BaiTap
 */
@WebServlet("/Bai2BaiTap")
public class Bai2BaiTap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai2BaiTap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF8");
		PrintWriter traVe =response.getWriter();
		traVe.append("Bạn vừa gửi yêu vầu dạng GET, đây là đáp ứng của tôi");
		String noidungHTML="<form method = POST action=\"/Bai2/Bai2BaiTap\">"
				+ "				<label  >Họ:</label>"
				+ " 			<input type=\"text\" name=\"fname\"><br>\r\n"
				+ "				<label >Tên:</label>"
				+ "				<input type=\"text\" name=\"lname\"><br>"
				+ "				<input type=\"submit\" value=\"Gửi đi\">"
				+ "	</form>";
		traVe.append(noidungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF8");
		String value1=request.getParameter("fname");
		String value2=request.getParameter("lname");
		PrintWriter traVe=response.getWriter();
		traVe.append("Bạn vừa gửi yêu cầu dạng POST,đây là đáp ứng của tôi");
		traVe.append("Giá trị tham số fname =");
		traVe.append(value1);
		traVe.append("\n giá trị tham số lname =");
		traVe.append(value2);
	}

}
