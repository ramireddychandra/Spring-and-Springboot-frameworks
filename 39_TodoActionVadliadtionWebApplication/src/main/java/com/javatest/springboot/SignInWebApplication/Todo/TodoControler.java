package com.javatest.springboot.SignInWebApplication.Todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("email")

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
	
	@RequestMapping(value = "add-todo",method = RequestMethod.GET)
	public String AddTodo()
	{
		return "Addtodo"; 
	}
	
	@RequestMapping(value = "add-todo",method = RequestMethod.POST)
	public String RedirctTOTodo(@RequestParam String description,ModelMap model)
	{
		todoServices.addTodo((String) model.get("email"), description, LocalDate.now(), false);;
		return "redirect:list-todos";
	}

}
