package realtest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String test(Dto dto, String name, int num) {
		System.out.println(name);
		System.out.println(num);
		
		System.out.println(dto.getName());
		System.out.println(dto.getNum());
		
		return"/WEB-INF/view/0106/pro.jsp";
	}

}
