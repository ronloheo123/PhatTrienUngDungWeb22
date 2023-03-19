package jp.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import till.edu.beans.User;


@Controller
public class User3Controller {
	//Tra ve cho user trang de dang nhap 
			@RequestMapping(value = "login3", method = RequestMethod.GET)
			public String loginGet()
			{
				return "login3"; //view login3.jsp
			}
			//Xu ly khi user nhan submit
			@RequestMapping(value = "login3", method = RequestMethod.POST)
			public String loginPost(ModelMap model, User usr)
			{
				if(usr.getId().equals("admin") && usr.getPwd().equals("62cnttclc")) 
				{//dang nhap thanh cong thi do something
					//Dieu huong den trang chu quan tri.
					return "redirect: admincp/index.html";
					
				}else//Dang nhap khong duoc
				{
					//gui bao loi ra trang dang nhap , thong qua model
					//??
					model.addAttribute("thongbaoloi","Thong tin dang nhap khong dung");
					return "login3";
				}
				
			}
/////Test tra ve mot chuoi
			@ResponseBody
			@RequestMapping("/xinChuoi")
			public String testChuoi() {
				return "Đây là chuỗi tui cho bạn";
			}
}