package com.javatest.springboot.SignInWebApplication.sigin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SigninController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("SayBye")
	@ResponseBody
	public String SayBye() {
		return "Bye team going for lunch";
	}

	@RequestMapping("SayByeHtml")
	@ResponseBody
	public String SayByeHTML() {
		StringBuffer sb= new StringBuffer();
		sb.append("<HTML>");
		sb.append("<HEAD>");
		sb.append("<TITLE>");
		sb.append("MY FIRST PAGE TITLE");
		sb.append("</TITLE>");
		sb.append("</HEAD>");
		sb.append("<BODY>");
		sb.append("tHIS IS AN BODY OF HTML PAGE");
		sb.append("</BODY>");
		sb.append("</HTML>");
		return sb.toString();
	}
	
	
	@RequestMapping("sayHellojsp")
	public String SayByejsp() {
		return "sayHello";
	}
	
//	http://localhost:8080/signin?name=chandu
	@RequestMapping("signin")
	public String Signin(@RequestParam String name, ModelMap Model)
	{
		Model.put("name", name);
		logger.error("name is "+name);
		return "signin";
	}

}
