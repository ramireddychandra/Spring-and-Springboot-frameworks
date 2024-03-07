package com.javatest.springboot.SignInWebApplication.sigin;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authentication(String username, String password)
	{
		boolean isvalidUsername = username.equalsIgnoreCase("ramireddy.reddy@gmail.com");
		boolean isvalidPassword = password.equalsIgnoreCase("Reddy@9959");
		return isvalidUsername && isvalidPassword ;
	}

}
