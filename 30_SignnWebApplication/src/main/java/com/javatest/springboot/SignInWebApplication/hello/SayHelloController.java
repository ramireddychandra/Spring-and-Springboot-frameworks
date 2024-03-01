package com.javatest.springboot.SignInWebApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
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

}
