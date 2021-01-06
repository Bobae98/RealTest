package realtest.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean {
	
	//@Autowired
	//private Dto dto = null;

	//@Autowired
	//private Dto dto2 = null;
	
	//@Autowired
	//private Dto dto3 = null;
	
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("bean실행!");
		//System.out.println(dto3.getName());
		//System.out.println(dto3.getNum());
		return"/WEB-INF/view/0106/Hello.jsp";
	}
	
	@RequestMapping("/pro.do")
	public String test(Dto dto, String name, int num,
			HttpServletRequest request,
			HttpSession session,
			HttpServletResponse response,
			Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("dto", dto);
		return"/WEB-INF/view/0106/pro.jsp";
	}
	


}
