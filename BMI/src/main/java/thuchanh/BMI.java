package thuchanh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
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
		response.setCharacterEncoding("UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>Tính chỉ số BMI</title></head><body>");
	    out.println("<h1>Tính chỉ số BMI</h1>");
	    out.println("<form method=\"post\" action=\"bmi\">");
	    out.println("<p>Cân nặng: <input type=\"text\" name=\"weight\"> kg</p>");
	    out.println("<p>Chiều cao: <input type=\"text\" name=\"height\"> m</p>");
	    out.println("<p><input type=\"submit\" value=\"Tính BMI\"></p>");
	    out.println("</form>");
	    out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// Lấy giá trị cân nặng và chiều cao từ form đăng nhập
	    float weight = Float.parseFloat(request.getParameter("weight"));
	    float height = Float.parseFloat(request.getParameter("height"));
	    
	    // Tính toán chỉ số BMI
	    float bmi = weight / (height * height);
	    
	    // Chuẩn bị nội dung phản hồi
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>Kết quả BMI</title></head><body>");
	    out.println("<h1>Kết quả BMI</h1>");
	    out.println("<p>Cân nặng: " + weight + "kg</p>");
	    out.println("<p>Chiều cao: " + height + "m</p>");
	    out.println("<p>Chỉ số BMI: " + bmi + "</p>");
	    out.println("</body></html>");
	}

}
