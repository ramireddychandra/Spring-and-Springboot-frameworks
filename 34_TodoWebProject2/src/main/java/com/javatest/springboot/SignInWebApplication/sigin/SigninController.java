package com.javatest.springboot.SignInWebApplication.sigin;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller@SessionAttributes("email")
public class SigninController {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	private AuthenticationService authenticationService;
	

	public SigninController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="signin",method = RequestMethod.GET)
	public String Signin()
	{
		return "signin";
	}
	
	
	
	@RequestMapping(value="signin",method = RequestMethod.POST)
	
	public String Welcome(@RequestParam String email, @RequestParam String pwd, ModelMap Model)
	{
		if(authenticationService.authentication(email, pwd))
		{
		Model.put("email", email);
		Model.put("password", pwd);

		return "Welcome";
		}
		Model.put("ErrorMessage", "Invalid Login");
		return "signin";
	}
	

}
