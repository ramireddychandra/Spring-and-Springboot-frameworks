package com.javatest.springboot.SignInWebApplication.Todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoControler {
	
	private TodoServices todoServices;
	
	
	
	public TodoControler(TodoServices todoServices) {
		super();
		this.todoServices = todoServices;
	}

	


	@RequestMapping("list-todos")
	
	public String listofalltodos(ModelMap model) {
		List<Todo>todos = todoServices.GetbyUsernames("chandu");
		model.addAttribute("todos",todos);
		
		return "listOfTodos";
	}

}
