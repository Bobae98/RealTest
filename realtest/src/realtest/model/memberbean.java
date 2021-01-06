package realtest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch11.logon.LogonDBBean;
import ch11.logon.LogonDataBean;

@Controller
@RequestMapping("/member/")
public class memberbean {
	
	@Autowired
	private LogonDBBean memberDAO = null;
	
	@RequestMapping("main.do")
	public String main() {
		return"member/main";
	}
	@RequestMapping("inputForm.do")
	public String inputForm() {
		return "member/inputForm";
	}
	
	@RequestMapping(value="inputPro.do", method=RequestMethod.POST)
	public String inputPro(LogonDataBean dto) throws Exception{
		
		memberDAO.insertMember(dto);
		
		return"member/inputPro";
	}

}
