<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%//Lấy code java ở đây
	// lấy dữ liệu
	String tenDangNhap;
	String matKhau;
	tenDangNhap=request.getParameter("loginName");
	matKhau=request.getParameter("loginPass");
	//In thử dữ liệu nhập có đúng ko
	//out.append(tenDangNhap + "<br>");
	//out.append(matKhau+"<br>");
	if(tenDangNhap.equals("ABC")&&matKhau.equals("MNK"))
			{
				//Chuyển hướng đến trang	userprofile
				response.sendRedirect("/Bai2_3/UserProfile.html");
				
			}
	else
	{
		//Chuyển đến trang Login.html
		response.sendRedirect("/Bai2_3/Login.html");
	}
	
	%>
</body>
</html>