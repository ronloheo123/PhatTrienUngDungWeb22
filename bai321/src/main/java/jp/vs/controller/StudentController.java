package jp.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import till.edu.beans.Student;

@Controller
public class StudentController {
	@RequestMapping("edit")
	public String suaSinhVien(ModelMap model) {
		Student sv=new Student("Trường",9.0,"Web2");
		//chú ý rằng thực tế thì sv này được lấy từ csdl, theo một định danh
		//đưa sang view
		model.addAttribute("student",sv);
		
		return "edit";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String capnhapSinhVien(@ModelAttribute("student") Student sinhvien,ModelMap model) {
		//ở trên , dữ liệu từ form, được dổ vào biến sinh vien rồi, thông qua chú thích @ModelAttribute("student")
		//ta sẽ xử lý cập nhập ở đây
		//.......
		// return 1 view nào đó,ví dụ studentUpdatedData
		model.addAttribute("svCapNhat",sinhvien);
		return "studentUpdatedData";
	}
}
