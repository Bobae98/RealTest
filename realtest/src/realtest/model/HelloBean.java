package realtest.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean {
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("bean실행!");
		return"/WEB-INF/view/0106/Hello.jsp";
	}

}
